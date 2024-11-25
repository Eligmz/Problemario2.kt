#Fibonacci generalizado: Crea una función que reciba dos números 
#iniciales y calcule una serie similar a Fibonacci, pero con estos números 
#como punto de partida. 

def fibonacci_generalizado(a, b, n):
    serie = [a, b]
    for i in range(2, n):
        serie.append(serie[-1] + serie[-2])
    return serie

# Ejemplo de uso:
a, b, n = 3, 5, 10
print(fibonacci_generalizado(a, b, n))
