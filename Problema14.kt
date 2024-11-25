#Multiplicación de matrices grandes: Implementa un algoritmo para 
#multiplicar dos matrices dispersas eficientemente.

def multiplicacion_dispersa(A, B):
    filas_A, cols_A = len(A), len(A[0])
    filas_B, cols_B = len(B), len(B[0])
    
    if cols_A != filas_B:
        raise ValueError("No se pueden multiplicar las matrices: dimensiones incompatibles.")
    
    resultado = [[0] * cols_B for _ in range(filas_A)]
    
    for i in range(filas_A):
        for j in range(cols_B):
            suma = 0
            for k in range(cols_A):
                if A[i][k] != 0 and B[k][j] != 0:
                    suma += A[i][k] * B[k][j]
            resultado[i][j] = suma
    return resultado

# Ejemplo de uso:
A = [[0, 2, 0], [0, 0, 3], [4, 0, 0]]
B = [[5, 0, 0], [0, 0, 6], [7, 0, 0]]
print("Resultado de la multiplicación:")
for fila in multiplicacion_dispersa(A, B):
    print(fila)
