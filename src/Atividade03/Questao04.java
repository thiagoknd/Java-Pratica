package Atividade03;

import java.util.Scanner;

public class Questao04 {
    private String palavra;
    private Scanner scanner = new Scanner(System.in);

    public void acerteAPalavra(){
        System.out.println("tente acerta a palavra(voce tem 5 tentativas)");

        for(int i = 1; i<=5;i++){
            System.out.println("digite a palavra:");
            palavra = scanner.nextLine();

            if(palavra.equals("Java-2022")){
                System.out.println("Palavra ok");
                i = 5;
            }else{
                System.out.println("Palavra errada, tentativa:"+i);
                
            }
        }
    }
}
