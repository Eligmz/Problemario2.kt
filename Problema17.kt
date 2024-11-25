#Números amigables: Escribe un programa para determinar si dos 
#números dados son amigables (la suma de los divisores de uno es igual al 
#otro y viceversa).

def suma_divisores_propios(n):
    suma = 0
    for i in range(1, n // 2 + 1):
        if n % i == 0:
            suma += i
    return suma

def son_numeros_amigables(a, b):
    return suma_divisores_propios(a) == b and suma_divisores_propios(b) == a

# Ejemplo de uso:
a, b = 220, 284
print(son_numeros_amigables(a, b))  # True
