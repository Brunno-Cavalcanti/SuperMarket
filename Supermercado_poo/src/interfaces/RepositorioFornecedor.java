package interfaces;

import gestaoPessoa.Pessoa;
import java.util.List;
public interface RepositorioFornecedor {

    void inserir (Pessoa fornecedor);
    Pessoa procurar (String nome);
    void remover (String nome);
    List<Pessoa> listar();

}
