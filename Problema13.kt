#Autovalores y autovectores: Escribe un programa para calcular los 
#autovalores de una matriz 2x2. 

import numpy as np

def autovalores_autovectores(A):
    valores, vectores = np.linalg.eig(A)
    return valores, vectores

# Ejemplo de uso:
A = [[2, -1], [1, 4]]
valores, vectores = autovalores_autovectores(A)
print("Autovalores:", valores)
print("Autovectores:")
print(vectores)
