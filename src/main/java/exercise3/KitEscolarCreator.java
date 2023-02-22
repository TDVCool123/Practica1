package exercise3;

public class KitEscolarCreator extends CreatorKit{
    @Override
    public Kit_Escolar create() {
        Kit_Escolar kEscolar = new Kit_Escolar();

        Mochila mochila = new Mochila();
        mochila.setNroBolsillos("5");
        mochila.setTamano("Mediano");
        kEscolar.setMochila(mochila);

        Deportivo deportivo = new Deportivo();
        deportivo.setNroPrendas("2");
        deportivo.setColor("Azul");
        deportivo.setTalla("M");
        kEscolar.setDeportivo(deportivo);

        Cuadernos cuadernos = new Cuadernos();
        cuadernos.setNroHojas("100");
        cuadernos.setTipo("Carta");
        kEscolar.setCuadernos(cuadernos);



        return kEscolar;
    }
}
