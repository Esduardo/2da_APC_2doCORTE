import models.Persona;
import models.MostrarNumeroSuerte;
import models.Operaciones;

public class Main {
    //                                                                                             221214
    //                                                                         Esduardo Palomeque Roblero

    public static void main (String [] srgs){
        //pidiendo valores
        Persona persona = new Persona();
        persona.leerDatos();


        //Operaciones
        Operaciones operacion = new Operaciones();
        int diaSuerte = operacion.operacionNumSuerte(persona.getDia(), persona.getMes(), persona.getAnio());

        //mostrar
        MostrarNumeroSuerte mostrar = new MostrarNumeroSuerte();
        mostrar.mostrarNumeroSuerte(diaSuerte);
    }
}
