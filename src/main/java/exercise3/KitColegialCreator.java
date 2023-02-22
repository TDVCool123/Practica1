package exercise3;

public class KitColegialCreator extends CreatorKit{
    @Override
    public Kit_Colegial create() {
        Kit_Colegial kColegial = new Kit_Colegial();

        Mochila mochila = new Mochila();
        mochila.setNroBolsillos("5");
        mochila.setTamano("Mediano");
        kColegial.setMochila(mochila);

        Computadora computadora = new Computadora();
        computadora.setMarca("2");
        computadora.setOs("M");
        kColegial.setComputadora(computadora);

        Libros libros = new Libros();
        libros.setAutor("HP Lovecraft");
        libros.setTipo("Terror");
        kColegial.setLibros(libros);


        return kColegial;
    }
}
