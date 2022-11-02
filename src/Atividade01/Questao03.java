package Atividade01;

import java.util.Scanner;

public class Questao03 {
    private Scanner nomear = new Scanner(System.in);

    public void nome(){
        System.out.println("Digite seu nome:");
        System.out.println("Olá "+nomear.nextLine());
    }
}

