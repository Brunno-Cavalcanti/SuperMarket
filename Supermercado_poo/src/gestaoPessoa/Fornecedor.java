package gestaoPessoa;

public class Fornecedor extends Pessoa {
    private int id;
    private String empresa;

    public Fornecedor(String nome, String telefone, String email, String genero, int id, String empresa) {
        super(nome, telefone, email, genero);
        this.id = id;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}