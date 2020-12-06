package mascota;

import java.sql.SQLOutput;

public class Perro {
        //Atributos
        private String nombre;
        private boolean vacunado;
        private int edad;
        private String raza;
        private String color;
        private int numeroPatas;

        public Perro(String nombre){
            this.nombre=nombre;
        }

        //Métodos: lo que puede hacer el objeto
        public void ladrar(){
            System.out.println(nombre + " está ladrando");
        }
        public void comer(String alimento){
            System.out.println(nombre + " está comiendo " + alimento);
        }
        public void correr(){
            System.out.println(nombre + " esta corriendo");
        }
        public void dormir(){
            System.out.println(nombre + " está durmiendo");
        }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}
