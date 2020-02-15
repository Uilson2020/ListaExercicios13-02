package Exercicio05;

public class Exercicio05 {
    public static void main (String[] args){

        Caneta can = new Caneta("plastico", "tinta");
        Lapis lap = new Lapis("madeira", "grafite");
        Penamosquito pen = new Penamosquito("metal","nanquim");

        can.escrever();
        lap.escrever();
        pen.escrever();
    }
}
