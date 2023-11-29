package gestaoPessoa;

public class Gerente extends Pessoa {
    private int matriculaGerente;
    private double salarioGerente;

    public Gerente(String nome, String telefone, String email, String genero, int matriculaGerente, double salarioGerente) {
        super(nome, telefone, email, genero);
        this.matriculaGerente = matriculaGerente;
        this.salarioGerente = salarioGerente;
    }

    public int getMatriculaGerente() {
        return matriculaGerente;
    }

    public void setMatriculaGerente(int matriculaGerente) {
        this.matriculaGerente = matriculaGerente;
    }

    public double getSalarioGerente() {
        return salarioGerente;
    }

    public void setSalarioGerente(double salarioGerente) {
        this.salarioGerente = salarioGerente;
    }
}