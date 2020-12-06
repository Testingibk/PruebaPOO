package Ejercicio4;

public class Cuenta {

    String nombreTitular;
    int numeroCuenta;
    double saldo;
    double abono;
    double saldoDisponible;


    //Constructor por defecto
    public Cuenta(){

    }
    //Constructor con parámetros
    public Cuenta(double ingreso,double reintegro, double transferencia){

    }

    //Constructor copia


    //Cuenta con los métodos ingreso, reintegro y transferencia

    public void ingreso(){

    }
    public void reintegro(){

    }
    public void transferencia(){

    }

    //Getters y Setters

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
