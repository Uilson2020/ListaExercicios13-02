package Exercicio04;

public class Exercicio04 {
    public static void main (String[] args){

        Cliente cliente = new Cliente("Uilson", 25,"São Roque");
        Funcionario funcionario = new Funcionario("Rodrigo",38, "São Paulo");

        cliente.exibirDados();
        funcionario.exibirDados();



    }


}
