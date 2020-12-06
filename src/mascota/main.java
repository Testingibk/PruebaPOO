package mascota;

import java.util.Scanner;

public class main {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre del perro");
        String nombrePerro = scan.nextLine();

        Perro perro1 = new Perro(nombrePerro);
                perro1.setEdad(5);
                perro1.setColor("Azul");
                perro1.setNumeroPatas(8);
                perro1.setRaza("Andaluz");
                perro1.setVacunado(true);

         //Obtendremos los atributos con el método get

        System.out.println(perro1.getNombre() + " tiene " + perro1.getEdad() + " años ");

        perro1.comer("camotes");
        perro1.dormir();
        perro1.ladrar();
        perro1.correr();

        System.out.println("Este es " + perro1.getNombre() + " es de raza " + perro1.getRaza());
        System.out.println(perro1.getNombre() + " es de color " + perro1.getColor());

    }

}
