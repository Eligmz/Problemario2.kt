#Gráfica de Fibonacci acumulativo: Genera una gráfica de barras donde el 
#eje X representa los índices de la serie de Fibonacci y el eje Y la suma 
#acumulada de los términos hasta ese índice.

def grafica_fibonacci_acumulativo(n):
    fibonacci = [0, 1]
    suma_acumulada = [0, 1]
    for i in range(2, n):
        nuevo_fib = fibonacci[-1] + fibonacci[-2]
        fibonacci.append(nuevo_fib)
        suma_acumulada.append(suma_acumulada[-1] + nuevo_fib)
    
    plt.bar(range(n), suma_acumulada, color='skyblue')
    plt.title("Fibonacci Acumulativo")
    plt.xlabel("Índice")
    plt.ylabel("Suma Acumulada")
    plt.show()

# Ejemplo de uso:
grafica_fibonacci_acumulativo(10)
