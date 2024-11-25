#Raíces de polinomios: Diseña un programa que encuentre todas las raíces 
#reales de un polinomio de tercer grado. 

import numpy as np

def raices_polinomio(coeficientes):
    return np.roots(coeficientes)

# Ejemplo de uso:
coeficientes = [1, -6, 11, -6]  # Representa x^3 - 6x^2 + 11x - 6
print("Raíces:", raices_polinomio(coeficientes))
