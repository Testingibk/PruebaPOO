package Ejercicio2;

import java.util.Scanner;

public class PruebaCoche {

    public static void main(String args[]) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();

        coche1.setColor("Azul");
        coche1.setPlaca("WE34566");
        coche1.setMarca("VolksWagen");
        coche1.setModelo("Escarabajo");
        coche1.setNumeroCaballos(500);
        coche1.setNumeroPuertas(2);

        coche2.setColor("Negro");
        coche2.setPlaca("BM");
        coche2.setMarca("HYUNDAI");
        coche2.setModelo("Elastico");
        coche2.setNumeroCaballos(1500);
        coche2.setNumeroPuertas(4);

        coche3.setColor("Verde");
        coche3.setPlaca("OP4221");
        coche3.setMarca("Falcon");
        coche3.setModelo("Trueno");
        coche3.setNumeroCaballos(2500);
        coche3.setNumeroPuertas(6);

        coche1.mostrarDatos();
        coche2.mostrarDatos();
        coche3.mostrarDatos();

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nuevo COLOR del carro ");
        String color = scan.nextLine();
        coche1.setColor(color);
        coche1.mostrarDatos();

        System.out.println("Ingrese el nuevo COLOR del carro ");
        color = scan.nextLine();
        coche1.setColor(color);
        coche1.mostrarDatos();

    }
}
