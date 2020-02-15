package Exercicio02;

public class Triangulo extends Exercicio02 {
    protected double base;
    protected double altura;

    public void retornarValor(){
        var ret = (base * altura) / 2 ;
        System.out.println(ret);
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
