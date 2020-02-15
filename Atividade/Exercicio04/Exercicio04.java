package Exercicio04;

public class Exercicio04 {
    public static void main (String[] args){

        Cliente cliente = new Cliente("Renato", 25,"São Roque","45453453344");
        Funcionario funcionario = new Funcionario("Felipe",38, "São Paulo",300866);

        cliente.exibirDados();
        funcionario.exibirDados();
    }
}
