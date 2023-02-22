package exercise3;

public class Cliente {
    public static void main(String [] args) {
        Kit_Escolar k1 = new KitEscolarCreator().create();
        Kit_Colegial k2 = new KitColegialCreator().create();


        k1.showKit();
        k2.showKit();

    }
}
