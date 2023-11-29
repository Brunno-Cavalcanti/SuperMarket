package controllers;

import gestaoPessoa.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import gestaoPessoa.Pessoa;

public class ControllerFornecedor {
    Scanner input = new Scanner(System.in);
    Pessoa fornecedor;
    String nome, telefone, email, genero, empresa;

    public void cadastrarFornecedor(){
        fornecedor = new Pessoa();
        System.out.println("Digite o nome: ");
        nome = input.next();
        fornecedor.setNome(nome);

        System.out.println("Digite o telefone: ");
        telefone = input.next();
        fornecedor.setTelefone(telefone);

        System.out.println("Digite o email: ");
        email = input.next();
        fornecedor.setEmail(email);

        System.out.println("Digite o gênero: ");
        genero = input.next();
        fornecedor.setGenero(genero);

        System.out.println("Digite a empresa: ");
        empresa = input.next();
        fornecedor.setEmpresa(empresa);

    }

    public void listarFornecedor() {  System.out.println(fornecedor.toString()); }

}