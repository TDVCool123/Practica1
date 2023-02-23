package exercise7;

import java.util.HashMap;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        Empresa1 e1 = new Empresa1();
        e1.addEmpleado(new Empleado("Joseph"));
        e1.addEmpleado(new Empleado("Miriam"));
        e1.addEmpleado(new Empleado("Cielo"));

        Empresa2 e2 = new Empresa2();
        e2.addEmpleado(new Empleado("Leonardo"));
        e2.addEmpleado(new Empleado("Donatello"));
        e2.addEmpleado(new Empleado("Sofia"));

        Empresa3 e3 = new Empresa3();
        e3.addEmpleado(new Empleado("Pablo"));
        e3.addEmpleado(new Empleado("German"));
        e3.addEmpleado(new Empleado("Ariana"));

        Empresa4 e4 = new Empresa4();
        e4.addEmpleado(new Empleado("Carmen"));
        e4.addEmpleado(new Empleado("Bob"));
        e4.addEmpleado(new Empleado("Patricio"));

        HashMap<String,Empleado> nuevosEmpleados = new HashMap<>();

        IIterator iterador;
        iterador = e1.createIterator();
        while (iterador.hasNext()){
            Empleado empleado = iterador.next();
            nuevosEmpleados.put(empleado.getNombre(),empleado);
        }

        iterador = e2.createIterator();
        while (iterador.hasNext()){
            Empleado empleado = iterador.next();
            nuevosEmpleados.put(empleado.getNombre(), empleado);
        }

        iterador = e3.createIterator();
        while (iterador.hasNext()){
            Empleado empleado = iterador.next();
            nuevosEmpleados.put(empleado.getNombre(), empleado);
        }

        iterador = e4.createIterator();
        while (iterador.hasNext()){
            Empleado empleado = iterador.next();
            nuevosEmpleados.put(empleado.getNombre(), empleado);
        }

        System.out.println("Nuevos empleados:");
        for (String key: nuevosEmpleados.keySet()){
            System.out.println(nuevosEmpleados.get(key));
        }
    }
}
