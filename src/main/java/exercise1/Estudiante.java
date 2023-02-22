package exercise1;

public class Estudiante {
    private String name;
    private int pago;

    public Estudiante(String name, int pago) {
        this.name = name;
        this.pago = pago;
    }

    public void pagar(){
        Ventanilla.getInstance().guardarDinero(pago);
    }
}
