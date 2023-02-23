package exercise6;

public class Quiero extends Gherkins{


    @Override
    public void interpreter(Context context) {

        context.input = context.input.substring(this.character);
        context.output += "When ";
    }
}
