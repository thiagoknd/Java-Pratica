package Atividade02;

import java.util.Scanner;
//Escreva um programa que leia um número e escreva na tela se o número é menor, igual ou maior que zero
public class Questao01{
    private double numero;
    private Scanner scanner = new Scanner(System.in);

    public void number(){
        System.out.println("Digite um número:");
        numero = scanner.nextDouble();
        if(numero > 0){
            System.out.println("número é maior que zero");
        }else if( numero < 0){
            System.out.println("Numero é menor que zero");
        }else{
            System.out.println("numero é igual a zero");
        }
    }
}