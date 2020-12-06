package Ejercicios;

public class Rectangulo {

    private int base;
    private int altura;
    private int perimetro;
    private int area;

    //Metodo constructor sin parametros
    public Rectangulo() {}

    //Metodo para calcular el perimetro
    public void setPerimetro(){
        this.perimetro = 2*base + 2*altura;
    }
    public int getPerimetro() {
        return perimetro;
    }

    // Metodo para calcular el área
    public void setArea(){
        this.area = (base*altura);
    }
    public int getArea() {
        return area;
    }

    //Getters y Setters
    //public int getBase() { return base; }

    public void setBase(int base) {
        this.base = base;
    }

    //public int getAltura() { return altura; }

    public void setAltura(int altura) { this.altura = altura;}





}
