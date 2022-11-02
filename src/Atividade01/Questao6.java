package Atividade01;

import java.util.Scanner;

public class Questao6 {
    private double valorDaConta;
    private int pessoas;
    private double valorPorPessoa;
    private Scanner scannear = new Scanner(System.in);
    public void divisao(){
        System.out.println("Digite o valor da conta");
        valorDaConta = scannear.nextDouble();
        System.out.println("Digite quantas pessoas irá dividir a conta");
        pessoas = scannear.nextInt();
        valorPorPessoa = valorDaConta/pessoas;
        System.out.println("cada um vai pagar: "+valorPorPessoa+"R$");

    }
}

