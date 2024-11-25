#Tangente a una curva: Dada una función y un punto, calcula la ecuación 
#de la recta tangente en ese punto.

def ecuacion_tangente(func, x0):
    h = 1e-5
    m = (func(x0 + h) - func(x0)) / h
    y0 = func(x0)
    return lambda x: m * (x - x0) + y0

# Ejemplo de uso:
func = lambda x: x**2
x0 = 1
tangente = ecuacion_tangente(func, x0)
print(f"Ecuación de la tangente en x = {x0}: y = {tangente.__code__.co_consts}")
