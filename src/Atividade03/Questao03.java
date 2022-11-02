package Atividade03;

import java.util.Scanner;

public class Questao03 {
    private int n1;
    private int n2;
    private Scanner scanner = new Scanner(System.in);


    public void entreNumeros(){
        System.out.println("digite em que numero começa:( irá começar cmo o posterior)");
        n1 = scanner.nextInt();
        System.out.println("Digite em que numero termina:( irá terminar com o anterior)");
        n2 = scanner.nextInt();

        for(int i=1; n1+i< n2;i++){
            System.out.println(n1+i);
        }
    }
}
