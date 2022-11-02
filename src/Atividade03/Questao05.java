package Atividade03;


import java.util.Scanner;

public class Questao05 {
    private int idade;
    private int menor =0;
    private int maior =0;
    private Scanner scanner = new Scanner(System.in);


    public void comparacao(){
        for(int i = 1; i<=5; i++){
            System.out.println("Digite a "+i+" idade");
            idade = scanner.nextInt();

            if(idade < 18){
                menor += 1;
            }else{
                maior += 1;
            }
            
        }
        System.out.println("Resultado\nMenor que 18 anos: "+menor+"\nIgual/Maior que 18 anos: "+maior);
    }
}
