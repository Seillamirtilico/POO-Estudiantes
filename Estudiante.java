import java.util.Date;

public class Estudiante {

    // Atributos privados
    private String nombre;
    private Date fechaNacimiento;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;

    // Constructor
    public Estudiante(String nombre, Date fechaNacimiento, double notaMateria1, double notaMateria2, double notaMateria3) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.notaMateria1 = notaMateria1;
        this.notaMateria2 = notaMateria2;
        this.notaMateria3 = notaMateria3;
    }

    // Métodos get y set

    // Método para obtener la edad actual del estudiante en años
    public int getEdad() {
        // Lógica para calcular la edad a partir de la fecha de nacimiento
        // En este ejemplo, simplemente se retorna un valor fijo (18)
        return 18; // Debes implementar la lógica real aquí
        // Complejidad: O(1) - constante, no depende del tamaño de ningún conjunto de datos
    }

    // Método para obtener el promedio de notas del estudiante
    public double getPromedio() {
        return (notaMateria1 + notaMateria2 + notaMateria3) / 3.0;
        // Complejidad: O(1) - constante, no depende del tamaño de ningún conjunto de datos
    }
}
