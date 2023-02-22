package exercise4;

import java.util.Map;

public class FactoryClase {
    private static Map<String,Clase> materiasMap = Map.of(
            "matematicas",new Matematicas(),
            "lenguaje",new Lenguaje(),
            "historia",new Historia(),
            "ingles",new Ingles()
    );
    public Clase make(String type){
        return materiasMap.getOrDefault(type.toLowerCase(),new Matematicas());
    }
}
