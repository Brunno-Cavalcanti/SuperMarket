package controllers;

import gestaoPessoa.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class ControllerPessoa {
    private List<Pessoa> pessoas;

    public ControllerPessoa() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public Pessoa obterPessoaPorNome(String nome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }
        return null; // Retorna null se não encontrar a pessoa com o nome especificado
    }

    public List<Pessoa> obterTodasPessoas() {
        return pessoas;
    }
}