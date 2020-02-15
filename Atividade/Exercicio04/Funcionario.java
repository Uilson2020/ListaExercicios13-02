package Exercicio04;

public class Funcionario extends Pessoa {
    protected Integer numeroMatricula;

    public void exibirDados (){
        System.out.println(getNumeroMatricula());
    }

    public Funcionario(String nome, Integer idade, String cidadeNascimento) {
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
