package exercise2;

public class Persona {
    private String name;
    private String apellido;

    public Persona(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }

    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void showInfo(){
        System.out.println("Info>Persona name: "+ name);
        System.out.println("Info>Persona apellido: "+ apellido);
    }
}
