package Atividade02;

import java.util.Scanner;
//Escreva um programa que receba três inteiros e diga qual deles é o maior e qual o menor.

public class Questao02 {
    private int n1;
    private int n2;
    private int n3;
    private Scanner scanner = new Scanner(System.in);
    

    public void comparacao(){
        System.out.println("Digite o primeiro numero");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        n2 = scanner.nextInt();
        System.out.println("digite o terceiro numero");
        n3 = scanner.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println("o numero "+n1+" é maior que "+n2+" e "+n3);
        }else if(n2 > n1 && n2 > n3){
            System.out.println("o numero "+n2+" é maior que "+n1+" e "+n3);
        }else{
            System.out.println("o numero "+n3+" é maior que "+n1+" e "+n2);
        }
    }
}
