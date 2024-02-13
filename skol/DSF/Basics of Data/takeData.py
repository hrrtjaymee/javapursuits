import csv
import os

dirName = os.path.dirname(os.path.realpath(__file__)) #scourse the location of the source code for data file
path = dirName + "\cars.csv"
with open(path, "r") as csvFile:
  csvReader = csv.DictReader(csvFile)
  cars = []
  for row in csvReader:
    cars.append(dict(row))
print(cars)
