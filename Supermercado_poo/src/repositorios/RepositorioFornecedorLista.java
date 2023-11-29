package repositorios;
import gestaoPessoa.Pessoa;
import gestaoPessoa.Fornecedor;
import interfaces.RepositorioFornecedor;
import interfaces.RepositorioFuncionario;

import java.util.ArrayList;
import java.util.List;
public class RepositorioFornecedorLista implements RepositorioFornecedor {

    private List<Pessoa> fornecedor;
    private RepositorioFornecedorLista() { fornecedor = new ArrayList<Pessoa>(); }

    @Override
    public void inserir(Pessoa fornecedor) { fornecedor.add(fornecedor); }

    @Override
    public Pessoa procurar(String nome) {
        Pessoa fornecedorProcurado = null;
        for (Pessoa p: fornecedor) {
            if (p.getNome().equals(nome)) {
                fornecedorProcurado = p;
            }
        }
        return  fornecedorProcurado;
    }

    @Override
    public void remover(String nome) {
        int posicao = -1;
        for (Pessoa p: fornecedor){
            if (p.getNome().equals(nome)){
                posicao = fornecedor.indexOf(p);
                break;
            }
        }
        if (posicao != -1){
            fornecedor.remove(posicao);
        }
    }

    @Override
    public List<Pessoa> listar() {  return  this.fornecedor;  }


}
