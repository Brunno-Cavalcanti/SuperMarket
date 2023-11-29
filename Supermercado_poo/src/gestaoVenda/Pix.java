package gestaoVenda;

public class Pix {
    private String codPix;
    private double valorPix;

    public Pix(String codPix, double valorPix) {
        this.codPix = codPix;
        this.valorPix = valorPix;
    }

    public String getCodPix() {
        return codPix;
    }

    public void setCodPix(String codPix) {
        this.codPix = codPix;
    }

    public double getValorPix() {
        return valorPix;
    }

    public void setValorPix(double valorPix) {
        this.valorPix = valorPix;
    }
}