package Exercicio04;

public class Funcionario extends Pessoa {
    protected Integer numeroMatricula;

    public void exibirDados (){
        System.out.println(nome + " " + idade + " " + cidadeNascimento + " " + numeroMatricula );
    }

    public Funcionario(String nome, Integer idade, String cidadeNascimento, Integer numeroMatricula) {
        super(nome, idade, cidadeNascimento);
        this.numeroMatricula = numeroMatricula;
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

}
