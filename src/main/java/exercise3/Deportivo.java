package exercise3;

public class Deportivo {
    private String talla;
    private String color;
    private String nroPrendas;

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNroPrendas() {
        return nroPrendas;
    }

    public void setNroPrendas(String nroPrendas) {
        this.nroPrendas = nroPrendas;
    }

    public void showInfo(){
        System.out.println("Deportivo > talla " + talla);
        System.out.println("Deportivo > color " + color);
        System.out.println("Deportivo > nroPrendas " + nroPrendas);
    }
}
