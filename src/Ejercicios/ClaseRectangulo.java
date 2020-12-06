package Ejercicios;

public class ClaseRectangulo {

    public static void main(String args[]){

        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo();
        Rectangulo rectangulo3 = new Rectangulo();

        rectangulo1.setAltura(10);
        rectangulo1.setBase(20);
        rectangulo2.setAltura(5);
        rectangulo2.setBase(6);
        rectangulo3.setAltura(15);
        rectangulo3.setBase(10);

        rectangulo1.setArea();
        rectangulo1.setPerimetro();
        rectangulo2.setArea();
        rectangulo2.setPerimetro();
        rectangulo3.setArea();
        rectangulo3.setPerimetro();

        //System.out.println("El área del rectangulo1 es " + Area());

        System.out.println("El área del rectangulo1 es " + rectangulo1.getArea());
        System.out.println("El perímetro del rectangulo1 es " + rectangulo1.getPerimetro());
        System.out.println("====================================================");
        System.out.println("El área del rectangulo2 es " + rectangulo2.getArea());
        System.out.println("El perímetro del rectangulo2 es " + rectangulo2.getPerimetro());
        System.out.println("====================================================");
        System.out.println("El área del rectangulo3 es " + rectangulo3.getArea());
        System.out.println("El perímetro del rectangulo3 es " + rectangulo3.getPerimetro());
        System.out.println("====================================================");


    }


}
