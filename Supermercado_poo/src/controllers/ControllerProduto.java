package controllers;

import gestaoProduto.Produto;

import java.util.Scanner;

public class ControllerProduto {

    Scanner input = new Scanner(System.in);

    int codigoProduto, quantidade;
    double valorCompra, valorVenda;
    String validade, nomeProd;
    private Produto produto;

    public void cadastrarProduto() {
        System.out.println("Digite o nome do produto: ");
        nomeProd = input.next();
        produto.setNomeProd(nomeProd);

        System.out.println("Digite a valdiade do produto: ");
        validade = input.next();
        produto.setValidade(validade);

        System.out.println("Digite o valor de compra do produto: ");
        valorCompra = input.nextDouble();
        produto.setValorCompra(valorCompra);

        System.out.println("Digite o valor de venda do produto: ");
        valorVenda = input.nextDouble();
        produto.setValorVenda(valorVenda);

        System.out.println("Digite a quantidade do produto: ");
        quantidade = input.nextInt();
        produto.setQuantidade(quantidade);

        System.out.println("Digite o código do produto: ");
        codigoProduto = input.nextInt();
        produto.setCodigoProduto(codigoProduto);

    }

    public void listarProdutos() {  System.out.println(produto.toString());  }




}