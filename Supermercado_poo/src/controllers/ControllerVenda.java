package controllers;

import gestaoVenda.Venda;
import java.util.ArrayList;
import java.util.List;

public class ControllerVenda {
    private List<Venda> vendas;

    public ControllerVenda() {
        this.vendas = new ArrayList<>();
    }

    public void adicionarVenda(Venda venda) {
        vendas.add(venda);
    }

    public Venda obterVendaPorCodigo(int codigoVenda) {
        for (Venda venda : vendas) {
            if (venda.getCodigoVenda() == codigoVenda) {
                return venda;
            }
        }
        return null;
    }

    public List<Venda> obterTodasVendas() {
        return vendas;
    }

    public double calcularTotalVendas() {
        double total = 0;
        for (Venda venda : vendas) {
            total += venda.getValor();
        }
        return total;
    }
}