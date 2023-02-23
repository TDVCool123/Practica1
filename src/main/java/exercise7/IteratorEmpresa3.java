package exercise7;

import java.util.Vector;


public class IteratorEmpresa3 implements IIterator{

    private Vector<Empleado> empleados;
    private int pos=0;
    public IteratorEmpresa3(Vector<Empleado> empleados){
        this.empleados = empleados;
    }
    @Override
    public boolean hasNext() {
        return pos < empleados.size();
    }

    @Override
    public Empleado next() {
        return empleados.get(pos++);
    }
}
