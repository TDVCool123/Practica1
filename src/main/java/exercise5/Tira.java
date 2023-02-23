package exercise5;

public class Tira extends BuilderParrilla{
    @Override
    public void buildTipoCarne() {
        this.parrilla.setTipoDeCarne("Tira > Tira de carne");
    }

    @Override
    public void buildSaborRefresco() {
        this.parrilla.setSaborRefresco("Tira > CocaCola");
    }

    @Override
    public void buildGuarniciones() {
        this.parrilla.setGuarniciones("Tira > Fideo");
    }
}
