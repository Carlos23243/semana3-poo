#Programación Tradicional (Estructurada)
#Este enfoque se basa en funciones que realizan tareas específicas
#El código se organiza de manera secuencial y lógica, separando la entrada de datos del cálculo

def ingresar_temperaturas_diarias():
    """
    Solicita al usuario las temperaturas de los 7 días de la semana.
    """
    temperaturas = []
    dias = ["lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"]
    for dia in dias:
        while True:
            try:
                temp = float(input(f"Ingrese la temperatura para el {dia}: "))
                temperaturas.append(temp)
                break
            except ValueError:
                print("Por favor, ingrese un número válido.")
    return temperaturas

def calcular_promedio_semanal(temperaturas):
    """
    Calcula el promedio de una lista de temperaturas.
    """
    if not temperaturas:
        return 0
    return sum(temperaturas) / len(temperaturas)

def main_tradicional():
    """
    Función principal que organiza la ejecución del programa.
    """
    print("--- Calculadora de Promedio del Clima (Tradicional) ---")
    temperaturas_semana = ingresar_temperaturas_diarias()
    promedio = calcular_promedio_semanal(temperaturas_semana)
    print("\n----------------------------------------------------")
    print(f"El promedio semanal de la temperatura es: {promedio:.2f}°C")
    print("----------------------------------------------------")

main_tradicional()