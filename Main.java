import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los datos del estudiante
        System.out.println("Ingrese los datos del estudiante:");

        // Obtener datos
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Fecha de Nacimiento (dd/MM/yyyy): "\nEjemplo:15/05/2000);
        String fechaNacimientoStr = scanner.nextLine();
        Date fechaNacimiento = parseFecha(fechaNacimientoStr);

        System.out.print("Nota Materia 1: ");
        double notaMateria1 = scanner.nextDouble();

        System.out.print("Nota Materia 2: ");
        double notaMateria2 = scanner.nextDouble();

        System.out.print("Nota Materia 3: ");
        double notaMateria3 = scanner.nextDouble();

        // Crear una instancia de la clase Estudiante
        Estudiante estudiante = new Estudiante(nombre, fechaNacimiento, notaMateria1, notaMateria2, notaMateria3);

        // Mostrar información del estudiante
        mostrarInformacion(estudiante);
    }

    // Métodos de utilidad para convertir fecha y mostrar información
    private static Date parseFecha(String fechaStr) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return dateFormat.parse(fechaStr);
            // Complejidad: O(n) - lineal, depende de la longitud de la cadena de fecha
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha. Usando fecha actual.");
            return new Date();
            // Complejidad: O(1) - constante, no depende del tamaño de ningún conjunto de datos
        }
    }

    private static void mostrarInformacion(Estudiante estudiante) {
        System.out.println("\nInformación del Estudiante:");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Fecha de Nacimiento: " + formatDate(estudiante.getFechaNacimiento()));
        System.out.println("Edad: " + estudiante.getEdad() + " años");
        System.out.println("Nota Materia 1: " + estudiante.getNotaMateria1());
        System.out.println("Nota Materia 2: " + estudiante.getNotaMateria2());
        System.out.println("Nota Materia 3: " + estudiante.getNotaMateria3());
        System.out.println("Promedio de Notas: " + estudiante.getPromedio());
    }

    private static String formatDate(Date fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(fecha);
        // Complejidad: O(1) - constante, no depende del tamaño de ningún conjunto de datos
    }
}
