#Determinante de una matriz: Crea una función que calcule el 
#determinante de matrices de hasta 4x4

def determinante(matriz):
    if len(matriz) == 2:
        # Determinante de 2x2
        return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0]
    else:
        det = 0
        for i in range(len(matriz)):
            submatriz = [fila[:i] + fila[i+1:] for fila in matriz[1:]]
            det += ((-1) ** i) * matriz[0][i] * determinante(submatriz)
        return det

# Ejemplo de uso:
matriz = [[4, 2, 3], [3, 1, 2], [2, 1, 1]]
print("Determinante:", determinante(matriz))
