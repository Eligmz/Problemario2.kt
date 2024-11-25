#Fibonacci y primos: Encuentra el número más cercano a un índice N en 
#la serie de Fibonacci que también sea primo. 

def es_primo(num):
    if num < 2:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

def fibonacci_primo_mas_cercano(n):
    a, b = 0, 1
    for _ in range(n - 1):
        a, b = b, a + b
    if es_primo(b):
        return b
    else:
        # Busca hacia adelante
        adelante = b + a
        while not es_primo(adelante):
            a, adelante = adelante, adelante + a
        return adelante

# Ejemplo de uso:
n = 10
print(fibonacci_primo_mas_cercano(n))
