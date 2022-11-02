package Atividade03;

import java.util.Scanner;

public class Questao02 {
    private String mensagem;
    private int numero;
    private Scanner scanner = new Scanner(System.in);

    public void repetir(){
        System.out.println("Digite a mensagem a ser repetida");
        mensagem = scanner.nextLine();  
        System.out.println("Digite quantas vezes quer que repita");
        numero = scanner.nextInt();

        for(int i= 0; i <numero; i++){
            System.out.println(mensagem);
        }
    }
}

