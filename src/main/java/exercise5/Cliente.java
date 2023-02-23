package exercise5;

public class Cliente {
    public static void main (String[]args){

        Parrillero parrillero = new Parrillero();

        Bife bife = new Bife();
        Lomito lomito = new Lomito();
        Tira tira = new Tira();

        parrillero.setParrilla(bife);
        parrillero.buildParrilla();

        parrillero.setParrilla(lomito);
        parrillero.buildParrilla();

        parrillero.setParrilla(tira);
        parrillero.buildParrilla();

        Parrilla p1 = parrillero.getParrilla();
        Parrilla p2 = parrillero.getParrilla();
        Parrilla p3 = parrillero.getParrilla();

        p1.showPlato();
        p2.showPlato();
        p3.showPlato();

    }
}
