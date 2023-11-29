package controllers;

import gestaoPessoa.Pessoa;

import java.util.Scanner;



public class ControllerFuncionario {
    Scanner input = new Scanner(System.in);
    Pessoa funcionario;
    String nome, telefone, email, genero;
    int matriculaFuncionario;
    double salarioFuncionario;
    String cargoFuncionario;

    public void cadastrarFuncionario() {
        funcionario = new Pessoa();
        System.out.println("Digite o nome: ");
        nome = input.next();
        funcionario.setNome(nome);


        System.out.println("Digite o telefone: ");
        telefone = input.next();
        funcionario.setTelefone(telefone);


        System.out.println("Digite o email: ");
        email = input.next();
        funcionario.setEmail(email);


        System.out.println("Digite o genero: ");
        genero = input.next();
        funcionario.setGenero(genero);


        System.out.println("Digite a matricula: ");
        matriculaFuncionario = input.nextInt();
        funcionario.setMatriculaFuncionario(matriculaFuncionario);

        System.out.println("Digite o salario: ");
        salarioFuncionario = input.nextDouble();
        funcionario.setSalarioFuncionario(salarioFuncionario);

        System.out.println("Digite o cargo: ");
        cargoFuncionario = input.next();
        funcionario.setCargoFuncionario(cargoFuncionario);

    }

    public void listarFuncionarios() { System.out.println(funcionario.toString()); }

}