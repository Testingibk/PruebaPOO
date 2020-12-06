package Ejercicio7;

public class Decimal {

    //Atributos
    float n1, n2;
    float suma;
    float resta;
    float multiplicacion;
    float division;

    //Metodo constructor
    public Decimal(){

    }
    public void setN1(float n1) {
        this.n1 = n1;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
    public void setSuma(){
        this.suma=n1+n2;
    }

    public float getSuma() {
        return suma;
    }

    public void setResta() {
        this.resta = n1-n2;
    }

    public float getResta() {
        return resta;
    }

    public float getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion() {
        this.multiplicacion = n1*n2;
    }

    public void setDivision() {
        this.division = (n1/n2);
    }
    public float getDivision() {
        return division;
    }
}
