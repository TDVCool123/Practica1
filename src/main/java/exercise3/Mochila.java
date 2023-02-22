package exercise3;

public class Mochila {
    private String nroBolsillos;
    private String tamano;

    public String getNroBolsillos() {
        return nroBolsillos;
    }

    public void setNroBolsillos(String nroBolsillos) {
        this.nroBolsillos = nroBolsillos;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void showInfo(){
        System.out.println("Mochila > nroBolsillos " + nroBolsillos);
        System.out.println("Mochila > tamano " + tamano);
    }
}
