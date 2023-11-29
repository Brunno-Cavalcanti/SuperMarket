package interfaces;
import gestaoProduto.Produto;
import java.util.List;
public interface RepositorioProduto {

    void inserir (Produto produto);
    Produto procurar (String nomeProd);
    void remover (String nomeProd);
    List<Produto> listar();
}
