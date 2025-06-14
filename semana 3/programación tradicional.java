import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ClimaTradicional {

    /**
     * Solicita al usuario las temperaturas de los 7 días de la semana.
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     * @return Una lista de las temperaturas ingresadas.
     */
    public static List<Double> ingresarTemperaturasDiarias(Scanner scanner) {
        List<Double> temperaturas = new ArrayList<>();
        String[] dias = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};

        for (String dia : dias) {
            while (true) {
                try {
                    System.out.print("Ingrese la temperatura para el " + dia + ": ");
                    double temp = scanner.nextDouble();
                    temperaturas.add(temp);
                    break; // Sale del bucle si la entrada es válida
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, ingrese un número válido.");
                    scanner.next(); // Limpia el buffer del scanner
                }
            }
        }
        return temperaturas;
    }

    /**
     * Calcula el promedio de una lista de temperaturas.
     * @param temperaturas La lista de temperaturas.
     * @return El promedio calculado.
     */
    public static double calcularPromedioSemanal(List<Double> temperaturas) {
        if (temperaturas == null || temperaturas.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (double temp : temperaturas) {
            suma += temp;
        }
        return suma / temperaturas.size();
    }

    /**
     * Función principal que organiza la ejecución del programa.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de Promedio del Clima (Tradicional - Java) ---");
        List<Double> temperaturasSemana = ingresarTemperaturasDiarias(scanner);
        double promedio = calcularPromedioSemanal(temperaturasSemana);

        System.out.println("\n----------------------------------------------------");
        // Usamos printf para formatear la salida a dos decimales
        System.out.printf("El promedio semanal de la temperatura es: %.2f°C\n", promedio);
        System.out.println("----------------------------------------------------");

        scanner.close(); // Buena práctica cerrar el scanner
    }
}