package Exercicio04;

public class Cliente extends Pessoa {
    protected String cpf;


    public void exibirDados(){
        System.out.println( nome + " " + idade + " " + cidadeNascimento + " " + cpf);
    }

    public Cliente(String nome, Integer idade, String cidadeNascimento, String cpf) {
        super(nome, idade, cidadeNascimento);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
