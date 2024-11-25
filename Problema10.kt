#Cálculo numérico de integrales: Diseña una función para calcular la 
#integral definida de una función en un intervalo utilizando el método del 
#trapecio. 

def integral_trapecio(func, a, b, n=1000):
    h = (b - a) / n
    suma = 0.5 * (func(a) + func(b))
    for i in range(1, n):
        suma += func(a + i * h)
    return suma * h

# Ejemplo de uso:
func = lambda x: x**2
a, b = 0, 2
print(integral_trapecio(func, a, b))
