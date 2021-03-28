#Laboratorio 3 Estructuras de datos y algortimos

#@authors Samuel Salazar salazar/Carla Sofía Rendon
#@version 1

import pandas as pd

dataVertices = pd.read_csv('Vertices.csv')
dataVertices.columns = ["ID","CoordenadaX","CoordenadaY","Nombre"]
print(dataVertices.head())

dataArcos = pd.read_csv('Arcos.csv')
dataArcos.columns = ["ID","ID1","Distancia","Nombre"]
print(dataArcos.head())

diccArcos={}
for i in dataArcos:
    diccArcos[(dataArcos.iloc[i]['ID'], dataArcos.iloc[i]['ID1'])]=diccArcos
print("El diccionario de los arcos es: "+diccArcos)

diccVert={}
for i in dataVertices:
    diccVert[(dataVertices.iloc[i]['ID'])]=diccVert
print("El diccionario de los vertices es: "+diccVert)

