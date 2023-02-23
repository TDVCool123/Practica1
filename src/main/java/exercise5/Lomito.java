package exercise5;

public class Lomito extends BuilderParrilla{
    @Override
    public void buildTipoCarne() {
        this.parrilla.setTipoDeCarne("Lomito > Lomo");
    }

    @Override
    public void buildSaborRefresco() {
        this.parrilla.setSaborRefresco("Lomito > Pepsi");
    }

    @Override
    public void buildGuarniciones() {
        this.parrilla.setGuarniciones("Lomito > Arroz");
    }
}
