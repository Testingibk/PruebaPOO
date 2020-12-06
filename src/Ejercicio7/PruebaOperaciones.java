package Ejercicio7;

import java.util.Scanner;

public class PruebaOperaciones {

    public static void main(String args[]){

        Decimal Operaciones = new Decimal();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer número = ");
        float n1 = scan.nextFloat();
        Operaciones.setN1(n1);

        System.out.println("Ingrese el segundo número = ");
        float n2 = scan.nextFloat();
        Operaciones.setN2(n2);

        Operaciones.setSuma();
        Operaciones.setResta();
        Operaciones.setMultiplicacion();
        Operaciones.setDivision();

        System.out.println("La suma es = " + Operaciones.getSuma());
        System.out.println("La resta es = " + Operaciones.getResta());
        System.out.println("La multiplicacion es = " + Operaciones.getMultiplicacion());
        System.out.println("La division es = " + Operaciones.getDivision());

    }
}
