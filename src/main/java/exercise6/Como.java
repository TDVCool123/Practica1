package exercise6;

public class Como extends Gherkins{
//
//    public nCharacter(int character){
//        this.character = character;
//    }


    @Override
    public void interpreter(Context context) {

        context.input = context.input.substring(this.character);
        context.output += "Given ";
    }
}
