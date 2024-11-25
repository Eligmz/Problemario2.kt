#Derivadas simbólicas: Diseña una función que acepte una expresión 
#algebraica (por ejemplo, 3x^2 + 2x) y calcule su derivada simbólica. 

from sympy import symbols, diff

def derivada_simbolica(expr):
    x = symbols('x')
    derivada = diff(expr, x)
    return derivada

# Ejemplo de uso:
expr = "3*x**2 + 2*x"
print(derivada_simbolica(expr))
