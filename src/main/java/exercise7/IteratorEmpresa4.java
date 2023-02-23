package exercise7;

import java.util.Stack;

public class IteratorEmpresa4 implements IIterator{

    private Stack<Empleado> empleados;
    public IteratorEmpresa4(Stack<Empleado> empleados){
        this.empleados = empleados;
    }
    @Override
    public boolean hasNext() {
        return !empleados.isEmpty();
    }

    @Override
    public Empleado next() {
        return empleados.pop();
    }
}
