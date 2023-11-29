package gestaoPessoa;

public class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private String genero;


    public Pessoa(String nome, String telefone, String email, String genero) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.genero = genero;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void setMatriculaFuncionario(int matriculaFuncionario) {
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
    }

    public void setCargoFuncionario(String cargoFuncionario) {
    }

    public void add(Pessoa funcionario) {
    }

    public void setEmpresa(String empresa) {
    }

    public void setId(int id) {
    }
}

