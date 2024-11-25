#Sumas parciales de Fibonacci: Implementa un algoritmo para calcular la 
#suma de los primeros N términos de la serie de Fibonacci.

def suma_parcial_fibonacci(n):
    a, b = 0, 1
    suma = a
    for _ in range(n - 1):
        suma += b
        a, b = b, a + b
    return suma

# Ejemplo de uso:
n = 10
print(suma_parcial_fibonacci(n))
