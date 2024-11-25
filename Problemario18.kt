#Factorización optimizada: Diseña una función para descomponer un 
#número en sus factores primos de forma eficiente. 

def factorizacion_prima(n):
    factores = []
    # Dividir por 2 hasta que no sea divisible
    while n % 2 == 0:
        factores.append(2)
        n //= 2
    # Dividir por números impares desde 3
    divisor = 3
    while divisor * divisor <= n:
        while n % divisor == 0:
            factores.append(divisor)
            n //= divisor
        divisor += 2
    # Si queda un factor primo mayor
    if n > 1:
        factores.append(n)
    return factores

# Ejemplo de uso:
n = 120
print(factorizacion_prima(n))  # [2, 2, 2, 3, 5]
