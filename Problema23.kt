 #Simulación de ondas: Dibuja la superposición de dos ondas.

def graficar_superposicion_ondas(amplitud1, frecuencia1, amplitud2, frecuencia2):
    x = np.linspace(0, 10, 1000)
    onda1 = amplitud1 * np.sin(2 * np.pi * frecuencia1 * x)
    onda2 = amplitud2 * np.sin(2 * np.pi * frecuencia2 * x)
    superposicion = onda1 + onda2
    
    plt.plot(x, onda1, label="Onda 1", linestyle='--', color='blue')
    plt.plot(x, onda2, label="Onda 2", linestyle='--', color='green')
    plt.plot(x, superposicion, label="Superposición", color='red')
    
    plt.title("Superposición de Ondas")
    plt.xlabel("Tiempo")
    plt.ylabel("Amplitud")
    plt.legend()
    plt.grid(True)
    plt.show()

# Ejemplo de uso:
graficar_superposicion_ondas(1, 1, 0.5, 2)
