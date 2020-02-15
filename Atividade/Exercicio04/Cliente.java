package Exercicio04;

public class Cliente extends Pessoa {
    protected String cpf;


    public void exibirDados(){
        System.out.println(getNome());
        System.out.println(getCpf());
    }

    public Cliente(String nome, Integer idade, String cidadeNascimento) {
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
