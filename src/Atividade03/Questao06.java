package Atividade03;

import java.util.Scanner;

class Questao06{
    private int numero;
    private int maior;
    private int menor;
    private int soma;
    private Scanner scanner = new Scanner(System.in);

    public void resultados(){
        System.out.println("Digite o 1 numero");
        numero = scanner.nextInt();
        maior = numero;
        menor = numero;
        for(int i = 2; i<=5; i++){
            System.out.println("Digite o "+i+" numeor");
            numero = scanner.nextInt();
            soma += numero;
            if(numero >= maior){
                maior = numero;
            }else if(numero <= menor){
                menor = numero;
            }
            
        }
        System.out.println("\nMaior: "+maior+"\nMenor: "+menor+"\nSomatorio: "+soma+"\nMedia: "+(soma/5));
    }
}