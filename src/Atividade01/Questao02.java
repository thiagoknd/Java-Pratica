package Atividade01;

import java.util.Scanner;

public class Questao02 {
    private Scanner scanner = new Scanner(System.in);
    private int numero;

    public void vizinhos(){
        System.out.println("digite o numero:");
        numero = scanner.nextInt();
        System.out.println("anterior:"+(numero-1)+"\nsucessor:"+(numero+1));
    }
}

