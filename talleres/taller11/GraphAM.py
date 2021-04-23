import numpy as np

class GraphAm:

    def __init__(self, size):
        self.size=size
        self.matriz=np.zeros(size,size)

    def getEdges(self):


    def getWeight(self, source, destination):
        return self.matriz[source][destination]


    def addArc(self, source, destination, weight):
        self.matriz[source][destination]=weight

    def getSuccessors(self, vertex):
        sucesor=[]
        for n, y in enumerate(self.matriz[vertex]):
            if y!=0:
                sucesor.append(n)
        return sucesor
        

    def __str__(self):
        return self.matriz

