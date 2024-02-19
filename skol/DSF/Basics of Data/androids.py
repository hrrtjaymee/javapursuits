import requests
import csv

params = {
    "q": "android",
    "apiKey": "aa2a5ed2a07c4c4bae1bff8594b52794",
    "pageSize": "20"
}

response = requests.get("https://newsapi.org/v2/everything", params)
articles = response.json()["articles"]

cleaned_articles = []

for article in articles:
    source = article["source"]["name"]
    author = article["author"]
    title = article["title"]
    url = article["url"]
    published_at = article["publishedAt"][0:10]

    # Clean author name
    if "(" in author:
        first = author.index("(") + 1
        second = author.index(")")
        author = author[first:second]

    cleaned_articles.append([source, author, title, url, published_at])

with open("articles.csv", "w", newline="") as csvFile:
    writer = csv.writer(csvFile)
    writer.writerow(["Source", "Author", "Title", "URL", "PublishedAt"])
    writer.writerows(cleaned_articles)
