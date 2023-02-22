package exercise2;

public class Client {

    public static void main(String[]args) {
        Contrato prototypeC = new Contrato(
        );

        prototypeC.setSueldo(5000);
        prototypeC.setCarga_Horaria(80);
        prototypeC.setCurso_Educacion_Superior(true);
        prototypeC.setAccesoPlataforma(true);
        prototypeC.setMarcadoBiométrico(false);
        prototypeC.setHoraEntrada(8);
        prototypeC.setHoraSalida(18);
        prototypeC.setPersona(new Persona("",""));
        prototypeC.showInfo();

        Contrato c1 = prototypeC.clone();
        c1.setPersona(new Persona("Jose", "Vargas"));

        Contrato c2 = prototypeC.clone();
        c2.setPersona(new Persona("Sebastian", "Tapia"));

        Contrato c3 = prototypeC.clone();
        c3.setPersona(new Persona("Gabriel", "Flores"));

        Contrato c4 = prototypeC.clone();
        c4.setPersona(new Persona("Gerald", "Martinez"));

        Contrato c5 = prototypeC.clone();
        c5.setPersona(new Persona("Kevin", "Morales"));

        Contrato c6 = prototypeC.clone();
        c6.setPersona(new Persona("Carlos", "Barrios"));

        Contrato c7 = prototypeC.clone();
        c7.setPersona(new Persona("Ed", "Sheeran"));

        Contrato c8 = prototypeC.clone();
        c8.setPersona(new Persona("Eren", "Jeager"));

        Contrato c9 = prototypeC.clone();
        c9.setPersona(new Persona("Alexis", "Marechal"));

        Contrato c10 = prototypeC.clone();
        c10.setPersona(new Persona("Ariana", "Grande"));

        Contrato c11 = prototypeC.clone();
        c11.setPersona(new Persona("Navil", "Yujra"));

        Contrato c12 = prototypeC.clone();
        c12.setPersona(new Persona("Shaquile", "Oneall"));

        Contrato c13 = prototypeC.clone();
        c13.setPersona(new Persona("Michael", "Jordan"));

        Contrato c14 = prototypeC.clone();
        c14.setPersona(new Persona("Sebastian", "Yung"));

        Contrato c15 = prototypeC.clone();
        c15.setPersona(new Persona("Shinobu", "Kocho"));

        c1.showInfo();
        c2.showInfo();
        c3.showInfo();
        c4.showInfo();
        c5.showInfo();
        c6.showInfo();
        c7.showInfo();
        c8.showInfo();
        c9.showInfo();
        c10.showInfo();
        c11.showInfo();
        c12.showInfo();
        c13.showInfo();
        c14.showInfo();
        c15.showInfo();

    }

}
