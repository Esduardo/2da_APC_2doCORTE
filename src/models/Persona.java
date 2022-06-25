package models;

import java.util.Scanner;

public class Persona {
    private int dia;
    private int mes;
    private int anio;

    public void leerDatos(){
        Persona persona = new Persona();
        Scanner entrada = new Scanner(System.in);
        System.out.printf(">            Obten tu numero de la suerte            <");
        do {
            System.out.printf("\nDame el dia de tu nacimiento: ");
            dia = entrada.nextInt();
        }while (dia >= 32 || dia <=0);
        do {
            System.out.printf("Dame el mes de tu nacimiento: ");
            mes = entrada.nextInt();
        }while(mes > 13 || mes <= 0 );
        do {
            System.out.printf("Dame el año de tu nacimiento(1990 - 2002): ");
            anio = entrada.nextInt();
        }while(anio >= 2023 || anio <= 1989);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
}
