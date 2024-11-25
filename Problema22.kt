#Visualización de raíces: Representa gráficamente un polinomio P(x) y 
#marca en la gráfica las raíces reales calculadas. 

def graficar_polinomio_y_raices(coeficientes):
    p = Polynomial(coeficientes)
    x = np.linspace(-10, 10, 1000)
    y = p(x)
    raices = p.roots()
    raices_reales = [r.real for r in raices if np.isreal(r)]
    
    plt.plot(x, y, label="P(x)", color='blue')
    plt.axhline(0, color='black', linestyle='--')
    plt.scatter(raices_reales, [0]*len(raices_reales), color='red', label="Raíces")
    
    plt.title("Polinomio y sus Raíces")
    plt.xlabel("x")
    plt.ylabel("P(x)")
    plt.legend()
    plt.grid(True)
    plt.show()

# Ejemplo de uso:
graficar_polinomio_y_raices([1, -4, 6, -4])
