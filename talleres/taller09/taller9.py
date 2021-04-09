# Punto 1
import numpy as np

class HashTable():
    
    def __init__(self):
        tabla=np.zeros(10)
        
    def funcion_hash(self, k):
        return (int(k[0]))%10
    
    def get(self, k):
        return tabla[funcion_hash(k)]

    def put(self, k, v):
        tabla[funcion_hash(k)]=v
        
