package Exercicio05;

public class Penamosquito implements InterfaceExerc {
    private String ehFeitoDe;
    private String escreveCom;

    public void escrever(){
        System.out.println("Escrevendo com " + escreveCom);
    }

    public Penamosquito(String ehFeitoDe, String escreveCom) {
        this.ehFeitoDe = ehFeitoDe;
        this.escreveCom = escreveCom;
    }

    public String getEhFeitoDe() { return ehFeitoDe; }
    public String getEscreveCom() { return escreveCom; }
}
