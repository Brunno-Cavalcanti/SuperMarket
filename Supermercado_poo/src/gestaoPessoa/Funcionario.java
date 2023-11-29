package gestaoPessoa;

public class Funcionario extends Pessoa {
    private int matriculaFuncionario;
    private double salarioFuncionario;
    private String cargoFuncionario;

    public Funcionario(String nome, String telefone, String email, String genero, int matriculaFuncionario, double salarioFuncionario, String cargoFuncionario) {
        super(nome, telefone, email, genero);
        this.matriculaFuncionario = matriculaFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.cargoFuncionario = cargoFuncionario;
    }

    public int getMatriculaFuncionario() {   return matriculaFuncionario;    }

    public double getSalarioFuncionario() {   return salarioFuncionario;     }

    public String getCargoFuncionario() {     return cargoFuncionario;       }

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public void setCargoFuncionario(String cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }
}