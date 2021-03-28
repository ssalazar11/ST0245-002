import pandas as pd

dataVertices = pd.read_csv('Vertices.csv')
dataVertices.columns = ["ID","CoordenadaX","CoordenadaY","Nombre"]
print(dataVertices.head())

dataArcos = pd.read_csv('Arcos.csv')
dataArcos.columns = ["ID","ID1","Distancia","Nombre"]
print(dataArcos.head())

diccArcos={}
for i in :
    diccArcos[(dataArcos.iloc[i]['ID'], dataArcos.iloc[i]['ID1'])]=
print("El diccionario de los arcos es: "+diccArcos)

diccVert={}
for i in :
    diccVert[(dataVertices.iloc[i]['ID'])]=
print("El diccionario de los vertices es: "+diccVert)

