package exercise5;

public class Parrillero {

    private BuilderParrilla builder;

    public Parrilla getParrilla(){
        return builder.getParrilla();
    }

    public void setParrilla(BuilderParrilla builder){
        this.builder = builder;
    }

    public void buildParrilla(){
        this.builder.prepararParrilla();
        this.builder.buildGuarniciones();
        this.builder.buildSaborRefresco();
        this.builder.buildTipoCarne();
    }
}
