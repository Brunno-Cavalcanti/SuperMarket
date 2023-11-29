package gestaoProduto;

public class Produto {
    private int codigoProduto;
    private double valorCompra;
    private double valorVenda;
    private int quantidade;
    private String validade;
    private String nomeProd;

    public Produto(int codigoProduto, double valorCompra, double valorVenda, int quantidade, String validade, String nomeProd) {
        this.codigoProduto = codigoProduto;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.quantidade = quantidade;
        this.validade = validade;
        this.nomeProd = nomeProd;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }
}