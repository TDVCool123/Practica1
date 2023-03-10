package exercise7;

import java.util.List;
import java.util.Vector;

public class Empresa3 implements IEmpresa{
    private Vector<Empleado> empleados = new Vector<>();

    @Override
    public IIterator createIterator() {
        return new IteratorEmpresa3(empleados);
    }

    @Override
    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
}
