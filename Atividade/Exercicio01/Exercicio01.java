package Exercicio01;

public class Exercicio01  {
    public static void main(String[] args){
        RD raiadrogasil = new RD("MedicamentoReferencia","MedicamentoGenerico", "Similares");
        RD localidades = new RD("sul","nordeste","sao paulo");
        RD escritorios = new RD("Butantã-Frei_Caneca","Butantã-Frei_Caneca","Paulista");


        raiadrogasil.venderEmLoja();
        raiadrogasil.venderOnline();
    }
}
