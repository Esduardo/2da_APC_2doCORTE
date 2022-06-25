package models;

public class Operaciones {
    public int operacionNumSuerte(int dia, int mes, int año){
        int suma = (dia + mes + año);
        int suma1 = suma/1000;
        int suma2 = suma/100%10;
        int suma3 = suma/10%10;
        int suma4 = suma%10;
        int sumaSuerte = suma1 + suma2 + suma3 + suma4;
        return sumaSuerte;
    }
}
