package exercise1;

import java.util.Scanner;

public class Client {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese su codigo: ");
        String cod = sc.next();
        System.out.println("Operacion a realizar");
        System.out.println("1: Pagos");
        System.out.println("2: Consultar ventanilla");
        while (!sc.hasNextInt()) {
            sc.next();
        }
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Codigo de empleado: " + cod);
                Estudiante e1 = new Estudiante("Pedro", 600);
                e1.pagar();

                Estudiante e2 = new Estudiante("Mario", 1000);
                e2.pagar();

                Estudiante e3 = new Estudiante("Pepe", 400);
                e3.pagar();

                Estudiante e4 = new Estudiante("Luis", 500);
                e4.pagar();

                Estudiante e5 = new Estudiante("Marcos", 500);
                e5.pagar();
                break;
            case 2:
                System.out.println("Codigo de empleado: " + cod);
                Ventanilla.getInstance().consultarVentanilla();
                break;
        }
    }
}
