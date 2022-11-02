package Atividade02;

import java.util.Scanner;
//Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode votar (idade>=16).
public class Questao03 {
    private int idade;
    private Scanner scanner  = new Scanner(System.in);

    public void eleicao(){
        System.out.println("Digite sua idade:");
        idade = scanner.nextInt();
        if(idade >= 16){
            System.out.println("voce esta elegível para votar");
        }else if(idade > 0 && idade <=15){
            System.out.println("você não esta elegível para votar");
        }else{
            System.out.println("Digite uma idade valida");
        }
    }
}
