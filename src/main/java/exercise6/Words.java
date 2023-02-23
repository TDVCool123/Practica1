package exercise6;

public class Words extends Gherkins{

    private String word;
    public Words(String word){
        this.word = word;
    }
    @Override
    public void interpreter(Context context) {
        context.output+=word+" ";
        context.input = context.input.substring(word.length());

    }

}
