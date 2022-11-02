package Atividade03;

import java.util.Scanner;

public class Questao01 {
    private int numero;
    private Scanner scanner = new Scanner(System.in);


    public void tabuada(){
     System.out.println("Tabuada de:");
     numero = scanner.nextInt();

     for(int i = 0; i <= 10; i++){
        System.out.println(numero+"x"+i+"="+(numero*i));
     }
    }
}

