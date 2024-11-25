#Pendiente y tangente: Grafica una función f(x)= x3 - 4x2 + 6x 
#como y, en el mismo gráfico, muestra la recta tangente en un punto dado. 

def graficar_funcion_y_tangente(x0):
    f = lambda x: x**3 - 4*x**2 + 6*x
    df = lambda x: 3*x**2 - 8*x + 6
    m = df(x0)  # Pendiente de la tangente
    y0 = f(x0)
    tangente = lambda x: m * (x - x0) + y0
    
    x = np.linspace(-1, 4, 100)
    plt.plot(x, f(x), label="f(x) = x³ - 4x² + 6x", color='blue')
    plt.plot(x, tangente(x), label=f"Tangente en x={x0}", linestyle='--', color='red')
    plt.scatter([x0], [y0], color='green', label=f"({x0}, {y0})")
    
    plt.title("Función y Recta Tangente")
    plt.xlabel("x")
    plt.ylabel("y")
    plt.legend()
    plt.grid(True)
    plt.show()

# Ejemplo de uso:
graficar_funcion_y_tangente(2)
