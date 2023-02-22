package exercise4;

public class Client {
    public static void main(String[] args) {
        FactoryClase fabrica = new FactoryClase();
        Estudiante e1 = new Estudiante("German Garmendia","54453", fabrica.make("qwerty"));
        Estudiante e2 = new Estudiante("AuronPlay","456453", fabrica.make("lenguaje"));
        Estudiante e3 = new Estudiante("Biyin","24527", fabrica.make("matematicas"));
        Estudiante e4 = new Estudiante("Ibai","45333", fabrica.make("historia"));
        Estudiante e5 = new Estudiante("Fernan","44444", fabrica.make("ingles"));

        e1.getMateria().inscribirse();
        e2.getMateria().inscribirse();
        e3.getMateria().inscribirse();
        e4.getMateria().inscribirse();
        e5.getMateria().inscribirse();
    }
}
