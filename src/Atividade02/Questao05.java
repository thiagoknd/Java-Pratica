package Atividade02;

import java.util.Scanner;
// Escreva um programa que dada a idade de uma pessoa, retorna uma das seguintes mensagens: “Não pode nem votar e nem dirigir”,
// “Pode votar, mas não pode dirigir”, “Pode votar e pode dirigir”.
public class Questao05 {
    private int idade;
    private Scanner scanner = new Scanner(System.in);


    public void idadeVotarDirigir(){
        System.out.println("Digite sua idade:");
        idade = scanner.nextInt();

        if((idade>= 16 && idade!=17) && idade>=18){
            System.out.println("Voce tem idade pra votar e dirigir");
        }else if(idade>=16 && idade <18){
            System.out.println("Voce pode votar, mas não pode dirigir");
        }else if(idade <=0){
            System.out.println("digite uma idade valida");
        }else{
            System.out.println("Voce não tem idade para votar e dirigir");
        }
    }
}
