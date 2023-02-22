package exercise4;

public class Estudiante {
    private String ci;
    private String nombre;

    private Clase materia;

    public Estudiante(String nombre, String ci, Clase materia) {
        this.ci = ci;
        this.nombre = nombre;
        this.materia = materia;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clase getMateria() {
        return materia;
    }

    public void setMateria(Clase materia) {
        this.materia = materia;
    }
}
