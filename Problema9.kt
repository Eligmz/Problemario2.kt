#Optimización de funciones: Escribe un programa que encuentre el 
#mínimo o máximo de una función cuadrática mediante el cálculo de su
#derivada.

def optimizacion_cuadratica(a, b, c):
    x_opt = -b / (2 * a)
    valor_opt = a * x_opt**2 + b * x_opt + c
    tipo = "mínimo" if a > 0 else "máximo"
    return x_opt, valor_opt, tipo

# Ejemplo de uso:
a, b, c = 1, -3, 2
print(optimizacion_cuadratica(a, b, c))
