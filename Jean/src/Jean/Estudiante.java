package Jean;

public class Estudiante {
    private String nombre;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;

    public Estudiante(String nombre, double calificacionMateria1, double calificacionMateria2) {
        this.nombre = nombre;
        this.calificacionMateria1 = calificacionMateria1;
        this.calificacionMateria2 = calificacionMateria2;
        this.calificacionMateria3 = (calificacionMateria1 + calificacionMateria2) / 2;
    }

    public Estudiante(String nombre, double calificacionMateria1, double calificacionMateria2, double calificacionMateria3) {
        this.nombre = nombre;
        this.calificacionMateria1 = calificacionMateria1;
        this.calificacionMateria2 = calificacionMateria2;
        this.calificacionMateria3 = calificacionMateria3;
    }

    public double calcularPromedio() {
        return ((calificacionMateria1 + calificacionMateria2 + calificacionMateria3) / 3);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerCalifMateria1() {
        return calificacionMateria1;
    }

    public double obtenerCalifMateria2() {
        return calificacionMateria2;
    }

    public double obtenerCalifMateria3() {
        return calificacionMateria3;
    }
}
