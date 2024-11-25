#Posición en Fibonacci: Escribe una función que determine si un número 
#dado pertenece a la serie de Fibonacci. Si pertenece, devuelve su posición.

def posicion_en_fibonacci(num):
    a, b = 0, 1
    index = 0
    while a <= num:
        if a == num:
            return index
        a, b = b, a + b
        index += 1
    return -1  # Si no pertenece a la serie

# Ejemplo de uso:
num = 21
print(posicion_en_fibonacci(num))
