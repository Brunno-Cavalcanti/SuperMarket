package gestaoVenda;

public class TipoPagamento {
    private boolean dinheiro;
    private boolean pix;
    private boolean cartao;

    public TipoPagamento(boolean dinheiro, boolean pix, boolean cartao) {
        this.dinheiro = dinheiro;
        this.pix = pix;
        this.cartao = cartao;
    }

    public boolean isDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(boolean dinheiro) {
        this.dinheiro = dinheiro;
    }

    public boolean isPix() {
        return pix;
    }

    public void setPix(boolean pix) {
        this.pix = pix;
    }

    public boolean isCartao() {
        return cartao;
    }

    public void setCartao(boolean cartao) {
        this.cartao = cartao;
    }
}