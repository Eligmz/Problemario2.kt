#Aproximación de derivadas: Implementa una función que calcule la 
#derivada de una función en un punto usando diferencias finitas. 

def aproximacion_derivada(func, x, h=1e-5):
    return (func(x + h) - func(x)) / h

# Ejemplo de uso:
func = lambda x: x**2 + 2*x
x = 1
print(aproximacion_derivada(func, x))
