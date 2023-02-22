package exercise3;

public class Cuadernos {
    private String tipo;
    private String nroHojas;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNroHojas() {
        return nroHojas;
    }

    public void setNroHojas(String nroHojas) {
        this.nroHojas = nroHojas;
    }

    public void showInfo(){
        System.out.println("Cuadernos > tipo " + tipo);
        System.out.println("Cuadernos > nroHojas " + nroHojas);
    }
}
