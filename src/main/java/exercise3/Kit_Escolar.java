package exercise3;

public class Kit_Escolar implements IKit{
    private Mochila mochila = new Mochila();
    private Deportivo deportivo = new Deportivo();
    private Cuadernos cuadernos = new Cuadernos();

    public Kit_Escolar(){}

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuadernos getCuadernos() {
        return cuadernos;
    }

    public void setCuadernos(Cuadernos cuadernos) {
        this.cuadernos = cuadernos;
    }

    @Override
    public void showKit() {
        System.out.println(" ** Kit Escolar**");
        mochila.showInfo();
        deportivo.showInfo();
        cuadernos.showInfo();
    }
}
