package exercise7;

import java.util.List;

public class IteratorEmpresa1 implements IIterator{

    private List<Empleado> empleados;
    private int pos=0;
    public IteratorEmpresa1(List<Empleado> empleados){
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
