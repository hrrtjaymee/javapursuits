import csv
import os

dirName = os.path.dirname(os.path.realpath(__file__)) #scours the location of the source code for data file
path = dirName + "\cars.csv"
with open(path, "r") as csvFile:
  csvReader = csv.DictReader(csvFile)  #csv.DictReader() different from csv.reader()
  cars = []
  for row in csvReader:
    cars.append(dict(row))
print(cars)

##OUTPUT##
#outputs a dictionary in a list
# [{'Year': '1997', 'Make': 'Ford', 'Model': 'E350', 'Price': '3200.00'}, {'Year': '1999', 'Make': 'Chevy', 'Model': 'Venture', 'Price': '4800.00'}, 
#  {'Year': '1996', 'Make': 'Jeep', 'Model': 'Grand Cherokee', 'Price': '4900.00'}]

#Column header in csv file becomes dictionary key per instance of a "car"

