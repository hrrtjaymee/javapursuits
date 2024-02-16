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
#print(len(myList))
myDict = {"source":[], "author":[], "title":[], "url":[], "publishedAt":[]}
for i in myList:
    if i == "source":
        myDict[source]= myList[i].values()

print(myDict)

'''with open("articles.csv", "w", newline="") as csvFile:
    fieldNames = ["Source", "Author", "Title", "URL", "PublishedAt"]
    writer = csv.DictWriter(csvFile, fieldnames = fieldNames)

    writer.writeheader()
    writer.writerow(dict(myList)
    for i in myList:
        writer.writerow(myList[i])'''

    
