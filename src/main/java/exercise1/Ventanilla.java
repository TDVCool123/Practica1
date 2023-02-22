package exercise1;

public class Ventanilla {
   private static Ventanilla instance = null;
   private int dinero;

   private Ventanilla(){
       dinero = 0;
       System.out.println("Dinero inicial:" + dinero);
   }

   public static Ventanilla getInstance(){
       if (instance == null){
           instance = new Ventanilla();
       }
       return instance;
   }


    public void guardarDinero(int amount){
        if(amount >= 0){
            dinero=dinero+amount;
            System.out.println("INFO> operacion exitosa. Cantidad guardada: "+ amount + ", actualizacion de caja: " + dinero);
        }else {
            System.out.println("ERROR> no se puede guardar cantidades negativas:" + "el saldo que tiene es: " + dinero);
        }
    }

    public void consultarVentanilla(){
       System.out.println("En la ventanilla hay: " + dinero);
    }
}
