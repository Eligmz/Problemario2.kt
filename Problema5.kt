#Factorial: Pedir por teclado N y calcular el Factorial de N  
#(N! = 1 * 2 * 3 * ... * N

def factorial(n):
    resultado = 1
    for i in range(1, n + 1):
        resultado *= i
    return resultado

# Ejemplo de uso:
n = 5
print(factorial(n))
