package exercise5;

public class Bife extends BuilderParrilla{
    @Override
    public void buildTipoCarne() {
        parrilla.setTipoDeCarne("Bife > bife");
    }

    @Override
    public void buildSaborRefresco() {
        parrilla.setSaborRefresco("Bife > CocaCola");
    }

    @Override
    public void buildGuarniciones() {
        parrilla.setGuarniciones("Bife > Papas Fritas");
    }
}
