package Atividade02;

import java.util.Scanner;
//Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode dirigir (idade>=18).
public class Questao04 {
    private int idade;
    private Scanner scanner = new Scanner(System.in);

    public void idadeParaDirigir(){
        System.out.println("Digite sua idade:");
        idade = scanner.nextInt();

        if(idade >=18){
            System.out.println("você tem idade para dirigir");
        }else if(idade >0 && idade <=17){
            System.out.println("você não tem idade para dirigir");
        }
        else{
            System.out.println("digite uma idade valida");
        }
    }
}
