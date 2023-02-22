package exercise3;

public class Kit_Colegial implements IKit{
    private Mochila mochila = new Mochila();
    private Libros libros = new Libros();
    private Computadora computadora = new Computadora();

    public Kit_Colegial(){}

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public void showKit() {
        System.out.println(" ** Kit Escolar**");
        mochila.showInfo();
        libros.showInfo();
        computadora.showInfo();
    }
}
