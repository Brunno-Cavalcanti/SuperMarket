package gestaoVenda;

public class Dinheiro {
    private double valorRecebido;
    private double troco;

    public Dinheiro(double valorRecebido, double troco) {
        this.valorRecebido = valorRecebido;
        this.troco = troco;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }
}