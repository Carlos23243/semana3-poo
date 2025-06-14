import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ClimaSemanal {
    // Atributo encapsulado (private) para almacenar las temperaturas
    private List<Double> temperaturas;

    /**
     * Constructor: Inicializa el objeto con una lista vacía para las temperaturas.
     */
    public ClimaSemanal() {
        this.temperaturas = new ArrayList<>();
    }

    /**
     * Método para solicitar al usuario las temperaturas de la semana.
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     */
    public void ingresarDatosDiarios(Scanner scanner) {
        String[] dias = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        for (String dia : dias) {
            while (true) {
                try {
                    System.out.print("Ingrese la temperatura para el " + dia + ": ");
                    double temp = scanner.nextDouble();
                    this.temperaturas.add(temp);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, ingrese un número válido.");
                    scanner.next(); // Limpia el buffer
                }
            }
        }
    }

    /**
     * Método para calcular el promedio semanal de las temperaturas almacenadas.
     * @return El promedio calculado.
     */
    public double calcularPromedio() {
        if (this.temperaturas.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (double temp : this.temperaturas) {
            suma += temp;
        }
        return suma / this.temperaturas.size();
    }

    /**
     * Muestra el resultado del promedio calculado.
     */
    public void mostrarResultado() {
        double promedio = this.calcularPromedio();
        System.out.println("\n-------------------------------------------------");
        System.out.printf("El promedio semanal de la temperatura es: %.2f°C\n", promedio);
        System.out.println("-------------------------------------------------");
    }
}