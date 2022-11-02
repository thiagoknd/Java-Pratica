package Atividade03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {      
        Questao01 questao01 = new Questao01();
        Questao02 questao02 = new Questao02();
        Questao03 questao03 = new Questao03();
        Questao04 questao04 = new Questao04();
        Questao05 questao05 = new Questao05();
        Questao06 questao06 = new Questao06();


        Scanner escolha = new Scanner(System.in);
        int opcao;
        int i = 0;
        while(i<1){
            System.out.println("\n\nDigite uma opção para ver uma das questões");
            System.out.println("1 - questão 1 ");
            System.out.println("2 - questão 2");
            System.out.println("3 - questão 3");
            System.out.println("4 - questão 4");
            System.out.println("5 - questão 5");
            System.out.println("6 - questão 6");
            System.out.println("7 - sair");
            opcao = escolha.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("-- QUESTÃO 01 SELECIONADA --");
                    questao01.tabuada();
                    break;
                case 2:
                    System.out.println("-- QUESTÃO 02 SELECIONADA --");
                    questao02.repetir(); 
                    break;
                case 3:
                    System.out.println("-- QUESTÃO 03 SELECIONADA --");
                    questao03.entreNumeros();
                    break;
                case 4:
                    System.out.println("-- QUESTÃO 04 SELECIONADA --");
                    questao04.acerteAPalavra();
                    break;
                case 5:
                    System.out.println("-- QUESTÃO 05 SELECIONADA --");
                    questao05.comparacao();
                    break;
                case 6:
                    System.out.println("-- QUESTÃO 06 SELECIONADA --");
                    questao06.resultados();
                    break;
                case 7:
                    System.out.println("voce saiu");
                    i ++;
                    break;
                default:
                    System.out.println("Digite uma opção valida");
            }
        }

    }
}
