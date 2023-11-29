package repositorios;
import gestaoProduto.Produto;
import interfaces.RepositorioProduto;
import java.util.ArrayList;
import java.util.List;
public class RepositorioProdutoLista implements RepositorioProduto{

    private List<Produto> produtos;

    public RepositorioProdutoLista() { produtos = new ArrayList<Produto>(); }

    @Override
    public void inserir(Produto produto) {  produtos.add(produto);  }

    @Override
    public Produto procurar(String nomeProd) {
        Produto produtoProcurado = null;
        for (Produto prod: produtos) {
            if (prod.getNomeProd().equals(nomeProd)) {
                produtoProcurado = prod;
            }
        }
        return produtoProcurado;
    }

    @Override
    public void remover (String nomeProd) {
        int posicao = -1;
        for (Produto prod: produtos) {
            if (prod.getNomeProd().equals(nomeProd)) {
                posicao = produtos.indexOf(prod);
                break;
            }
        }
        if (posicao != -1) {
            produtos.remove(posicao);
        }
    }

    @Override
    public List<Produto> listar() {  return this.produtos;  }


}
