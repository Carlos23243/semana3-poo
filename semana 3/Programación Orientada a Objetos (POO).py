#Este paradigma organiza el código en "objetos"
#Creamos una clase ClimaSemanal que encapsula tanto los datos (temperaturas)
#como las operaciones (métodos) que se pueden realizar con esos datos



class ClimaSemanal:
    """
    Una clase para representar y calcular el promedio del clima de una semana.
    """
    def __init__(self):
        """
        Inicializa el objeto con una lista vacía para las temperaturas.
        """
        self._temperaturas = []  # Atributo encapsulado

    def ingresar_datos_diarios(self):
        """
        Método para solicitar al usuario las temperaturas de la semana.
        """
        dias = ["lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"]
        for dia in dias:
            while True:
                try:
                    temp = float(input(f"Ingrese la temperatura para el {dia}: "))
                    self._temperaturas.append(temp)
                    break
                except ValueError:
                    print("Por favor, ingrese un número válido.")

    def calcular_promedio(self):
        """
        Método para calcular y devolver el promedio semanal de las temperaturas.
        """
        if not self._temperaturas:
            return 0
        return sum(self._temperaturas) / len(self._temperaturas)

    def mostrar_resultado(self):
        """
        Muestra el resultado del promedio calculado.
        """
        promedio = self.calcular_promedio()
        print("\n-------------------------------------------------")
        print(f"El promedio semanal de la temperatura es: {promedio:.2f}°C")
        print("-------------------------------------------------")


def main_poo():
    """
    Función principal que utiliza la clase ClimaSemanal.
    """
    print("\n--- Calculadora de Promedio del Clima (POO) ---")
    # Se crea una instancia (objeto) de la clase ClimaSemanal
    reporte_clima = ClimaSemanal()

    # Se utilizan los métodos del objeto
    reporte_clima.ingresar_datos_diarios()
    reporte_clima.mostrar_resultado()

main_poo()