package br.com.infnet;

import java.util.Scanner;

public class OpcoesMenu {
    static Scanner sc = new Scanner(System.in);
    public void mostrarMenu(){
        System.out.println("*-----------------------------------------------------*");
        System.out.println("Para escolher uma das opções digite o número correspondente:");
        System.out.println("Adição [ 1 ]");
        System.out.println("Subtração [ 2 ]");
        System.out.println("Multiplicação [ 3 ]");
        System.out.println("Divisão [ 4 ]");
        System.out.println("Sair do programa [ 0 ]");
        System.out.println("*-----------------------------------------------------*");
    }

    public void validacaoDoInput(String operacaoMatematica){
        while (!operacaoMatematica.matches("[01234]")) {
            System.out.println("Operação inválida, digite uma operação válida: ");
            operacaoMatematica = sc.nextLine();
        }
    }

    public static double recebePrimeiroValor(){
        String primeiroValor;
        do {
            System.out.println("Selecione o primeiro número a ser usado na operação: ");
            primeiroValor = sc.nextLine();
        } while (!primeiroValor.matches("-?\\d+(\\.\\d+)?")); // Verifica se é um número
        return Double.parseDouble(primeiroValor);
    }

    public static double recebeSegundoValor(){
        String segundoValor;
        do {
            System.out.println("Selecione o segundo número a ser usado na operação: ");
            segundoValor = sc.nextLine();
        } while (!segundoValor.matches("-?\\d+(\\.\\d+)?")); // Verifica se é um número
        return Double.parseDouble(segundoValor);
    }
    public double calculo(double primeiroValor, double segundoValor, String operacao){
       OperacoesBasicas operacoesBasicas = new OperacoesBasicas();
        switch (operacao) {
            case "1":
                return operacoesBasicas.adicao(primeiroValor, segundoValor);
            case "2":
                return operacoesBasicas.subtracao(primeiroValor, segundoValor);
            case "3":
                return operacoesBasicas.multiplicacao(primeiroValor, segundoValor);
            case "4":
                return operacoesBasicas.divisao(primeiroValor, segundoValor);
        }
        return 0.0;
    }
}
