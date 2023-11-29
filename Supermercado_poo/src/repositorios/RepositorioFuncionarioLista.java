package repositorios;

import gestaoPessoa.Pessoa;
import gestaoPessoa.Funcionario;
import interfaces.RepositorioFuncionario;

import java.util.ArrayList;
import java.util.List;
public class RepositorioFuncionarioLista implements RepositorioFuncionario {
    private List<Pessoa> funcionario;

    public RepositorioFuncionarioLista() { funcionario = new ArrayList<Pessoa>(); }

    @Override
    public void inserir(Pessoa funcionario) {
        funcionario.add(funcionario);
    }

    @Override
    public Pessoa procurar(String nome) {
        Pessoa funcionarioProcurado = null;
        for (Pessoa p: funcionario) {
            if (p.getNome().equals(nome)) {
                funcionarioProcurado = p;
            }
        }
        return funcionarioProcurado;
    }

    @Override
    public void remover(String nome){
        int posicao = -1;
        for (Pessoa p: funcionario){
            if (p.getNome().equals(nome)){
                posicao = funcionario.indexOf(p);
                break;
            }
        }
        if (posicao != -1){
            funcionario.remove(posicao);
        }
    }

    @Override
    public List<Pessoa> listar() {  return this.funcionario;  }


}
