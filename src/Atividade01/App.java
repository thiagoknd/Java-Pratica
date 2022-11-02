package Atividade01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner escolha = new Scanner(System.in);
        int opcao;
        Questao01 questao01 = new Questao01();
        Questao02 questao02 = new Questao02();
        Questao03 questao03 = new Questao03();
        Questao4 questao04 = new Questao4();
        Questao5 questao5 = new Questao5();
        Questao6 questao6 = new Questao6();
        int i=0;


        while(i <=1){
            System.out.println("Digite uma opção para ver uma das questões");
            System.out.println("1 - questão 1");
            System.out.println("2 - questão 2");
            System.out.println("3 - questão 3");
            System.out.println("4 - questão 4");
            System.out.println("5 - questão 5");
            System.out.println("6 - questão 6");
            System.out.println("7 - sair");
            opcao = escolha.nextInt();
            switch(opcao){
                case 1:
                questao01.media();
                    break;
                case 2:
                    questao02.vizinhos();  
                    break;
                case 3:
                    questao03.nome(); 
                    break;
                case 4:
                    questao04.Salariado();
                    break;
                case 5:
                    questao5.total();
                    break;
                case 6:
                    questao6.divisao();
                    break;
                case 7:
                    System.out.println("voce saiu");
                    i = 5;
                    break;
                default:
                    System.out.println("Digite uma opção valida");
            }
            
        }
    }

    
}
