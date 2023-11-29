package gestaoVenda;

public class Cartao {
    private String codTransacao;
    private double valorCartao;

    public Cartao(String codTransacao, double valorCartao) {
        this.codTransacao = codTransacao;
        this.valorCartao = valorCartao;
    }

    public String getCodTransacao() {
        return codTransacao;
    }

    public void setCodTransacao(String codTransacao) {
        this.codTransacao = codTransacao;
    }

    public double getValorCartao() {
        return valorCartao;
    }

    public void setValorCartao(double valorCartao) {
        this.valorCartao = valorCartao;
    }
}