package Exercicio04;

public class Pessoa extends Exercicio04{
    protected static String nome;
    protected Integer idade;
    protected String cidadeNascimento;

    public Pessoa(String nome, Integer idade, String cidadeNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeNascimento = cidadeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }
}
