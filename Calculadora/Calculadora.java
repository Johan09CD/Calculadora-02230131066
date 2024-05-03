package Calculadora;


public class Calculadora {
    
    private double numero1;
    private double numero2;
    private String signo;
    
    public Calculadora (){
        numero1 = 0;
        numero2 = 0;
        signo = " ";
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public String getSigno() {
        return signo;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", signo=" + signo + '}';
    }
    
    public double getResultado(double numero1, double numero2, String signo) {
        switch (signo) {
            case "+":
                return numero1 + numero2;
            case "-":
                return numero1 - numero2;
            case "X":
                return numero1 * numero2;
            case "/":
                return numero1 / numero2;
            default:
                return 0;
            }
        }
    }
