package exercise6;

import java.util.ArrayList;
import java.util.List;

public class Traductor{
    private List<Gherkins> oracion = new ArrayList<>();
    private Context context;

    private String word;


    public Traductor(String oracionOriginal){
        context = new Context(oracionOriginal.replace(" ",""));
        for (String msg:oracionOriginal.split(" ")){
            switch (msg){
                case "Como":
                oracion.add(new Como());
                    break;
                case "Quiero":
                    oracion.add(new Quiero());
                    break;
                case "Para":
                    oracion.add(new Para());
                    break;
                default:
                    oracion.add(new Words(msg));
            }
        }
    }

    public String traducir(){
        for(Gherkins g : oracion){
            g.interpreter(context);
        }
        return context.output;
    }
}
