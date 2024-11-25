#Fibonacci inverso: Implementa una función que calcule los primeros N 
#números de la serie de Fibonacci en orden inverso.

def fibonacci_inverso(n):
    fibonacci = [0, 1]
    for i in range(2, n):
        fibonacci.append(fibonacci[-1] + fibonacci[-2])
    return fibonacci[::-1]

# Ejemplo de uso:
n = 10
print(fibonacci_inverso(n))
