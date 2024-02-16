import requests
import json
import os
import csv

params = {
    "q": "android",
    "apiKey": "aa2a5ed2a07c4c4bae1bff8594b52794",
    "pageSize": "20"
    }
req = requests.get("https://newsapi.org/v2/everything", params)
articles = json.loads(req.text)
#print(articles)
myList = articles["articles"]
fields  = ["source", "author", "title", "url", "publishedAt"]
sources = []
authors = []
titles = []
urls = []
publishedAt = []

for i in range(0, len(myList)-1):
    sources.append(myList[i]["source"]["name"])
    authors.append(myList[i]["author"])
    titles.append(myList[i]["title"])
    urls.append(myList[i]["url"])
    publishedAt.append(myList[i]["publishedAt"])

##authors #get rid of email addresses
for i in authors:
    if "(" in i:
        first = i.index("(")
        second = i.index(")")
        i = i[first+1:second]
#formatting date
for i in publishedAt:
    i = i[0:10]

    
with open("articles.csv", "w", newline="") as csvFile:
    fieldNames = ["Source", "Author", "Title", "URL", "PublishedAt"]
    writer = csv.DictWriter(csvFile, fieldnames = fieldNames)

    writer.writeheader()
    for i in range(len(myList)-1):
        writer.writerow({fieldNames[0]:sources[i], fieldNames[1]:authors[i], fieldNames[2]:titles[i], 
                         fieldNames[3]:urls[i], fieldNames[4]:publishedAt[i]})

    
