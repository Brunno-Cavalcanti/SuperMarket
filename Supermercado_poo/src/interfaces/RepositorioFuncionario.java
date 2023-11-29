package interfaces;

import gestaoPessoa.Pessoa;
import gestaoPessoa.Funcionario;

import java.util.List;

public interface RepositorioFuncionario {
    void inserir (Pessoa funcionario);
    Pessoa procurar (String nome);
    void remover (String nome);
    List<Pessoa> listar();

}
