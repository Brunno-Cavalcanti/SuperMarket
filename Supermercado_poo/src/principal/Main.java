package principal;

import controllers.*;
import view.Menus;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Menus menu = new Menus();
        ControllerPessoa controllerPessoa = new ControllerPessoa();
        ControllerFuncionario controllerFuncionario = new ControllerFuncionario();
        ControllerVenda controllerVenda = new ControllerVenda();
        ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
        ControllerProduto controllerProduto = new ControllerProduto();
        Scanner leia = new Scanner(System.in);
        String resposta;
        int op;

        do {
            menu.mostrarMenu();
            op = leia.nextInt();
            switch (op){
                case 1: controllerProduto.cadastrarProduto(); //dando erro
                    break;

                case 2: controllerProduto.listarProdutos();
                    break;

                case 3:  ; // excluir produtos
                    break;

                case 4:  ; //abrir venda
                    break;

                case 5: ;  // listar venda
                    break;

                case 6: controllerFuncionario.cadastrarFuncionario();
                    break;

                case 7:  ;  //excluir funcionario
                    break;

                case 8: controllerFuncionario.listarFuncionarios();  //retornando endereço de memoria
                    break;

                case 9: controllerFornecedor.cadastrarFornecedor();
                    break;

                case 10: controllerFornecedor.listarFornecedor();   //retornando endereço de memoria
                    break;

                case 11:  ; // excluir forncedor
                    break;

                case 12: System.exit(0);
                    break;
                default: System.out.println("Opção invalida, verifique o número informado");
            }
            System.out.println("Deseja continuar?: ");
            resposta = leia.next();
        } while (resposta.equalsIgnoreCase("SIM"));
    }








}