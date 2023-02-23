package exercise7;

public class IteratorEmpresa2 implements IIterator{

    private Empleado[] empleados;
    private int pos=0;
    public IteratorEmpresa2(Empleado[] empleados){
        this.empleados = empleados;
    }
    @Override
    public boolean hasNext() {
        return pos < empleados.length && empleados[pos]!=null;
    }

    @Override
    public Empleado next() {
        return empleados[pos++];
    }
}
