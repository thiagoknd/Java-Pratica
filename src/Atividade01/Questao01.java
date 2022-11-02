package Atividade01;

import java.util.Scanner;

public class Questao01 {
    private double nota01;
    private double nota02;
    private double mediaFinal;
    private Scanner scanner = new Scanner(System.in);
    
    public void media(){
        System.out.println("Digite a primeira nota:");
        nota01 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota02 = scanner.nextDouble();
        mediaFinal = (nota01+nota02)/2;
        if(mediaFinal> 0 && mediaFinal <=6.99){
            System.out.println("aluno reprovado\ncom media:\n"+ mediaFinal);
        }else if(mediaFinal>= 7 && mediaFinal <=10){
            System.out.println("aluno aprovado\ncom media:\n"+mediaFinal);
        }else{
            System.out.println("digite uma nota valida");
        }   

    }
}
