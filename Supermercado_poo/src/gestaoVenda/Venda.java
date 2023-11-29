package gestaoVenda;

public class Venda {
    private int codigoVenda;
    private double valor;
    private String data;
    private int idFuncionario;
    private String notaFiscal;
    private double trocoVenda;

    public Venda(int codigoVenda, double valor, String data, int idFuncionario, String notaFiscal, double trocoVenda) {
        this.codigoVenda = codigoVenda;
        this.valor = valor;
        this.data = data;
        this.idFuncionario = idFuncionario;
        this.notaFiscal = notaFiscal;
        this.trocoVenda = trocoVenda;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public double getTrocoVenda() {
        return trocoVenda;
    }

    public void setTrocoVenda(double trocoVenda) {
        this.trocoVenda = trocoVenda;
    }
}