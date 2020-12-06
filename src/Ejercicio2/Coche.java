package Ejercicio2;

public class Coche {

    String color;
    String marca;
    String modelo;
    int numeroCaballos;
    int numeroPuertas;
    String placa;

    public Coche(){
    }
    public void encender(){
        System.out.println("El coche esta encendido");
    }
    public void setColor(String color){ this.color=color; }

    public void setMarca(String marca) { this.marca = marca; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public void setPlaca(String placa) { this.placa = placa; }

    public void setNumeroCaballos(int numeroCaballos) { this.numeroCaballos = numeroCaballos; }

    public void setNumeroPuertas(int numeroPuertas) { this.numeroPuertas = numeroPuertas; }

    public void mostrarDatos(){
        System.out.println("El color del auto es:  " + color);
        System.out.println("La marca del auto es:  " + marca);
        System.out.println("El modelo del auto es: " + modelo);
        System.out.println("La placa del auto es:  " + placa);
        System.out.println("La potencia del auto es: " + numeroCaballos);
        System.out.println("Tiene " + numeroPuertas + " puertas.");
        System.out.println("===================================================");
    }


}
