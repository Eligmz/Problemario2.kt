#Número de caminos: Calcula el número de caminos posibles en una 
#cuadrícula NxN, moviéndose solo hacia la derecha o hacia abajo. 

from math import factorial

def numero_caminos(n):
    return factorial(2 * n) // (factorial(n) * factorial(n))

# Ejemplo de uso:
n = 3
print(numero_caminos(n))  # 20
