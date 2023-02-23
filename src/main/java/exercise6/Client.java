package exercise6;

public class Client {
    public static void main(String[] args) {
        String userStory = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        Traductor traductor = new Traductor(userStory);
        System.out.println(traductor.traducir());

    }
}
