package Atividade01;

import java.util.Scanner;

public class Questao4 {
    private String nome;
    private double valorHora;
    private int horas;
    private double salario;
    private Scanner valores = new Scanner(System.in);
    
    public void Salariado(){
         System.out.println("Digite seu nome:");
         nome = valores.nextLine();
         System.out.println("Digite a quantidade de horas:");
         horas = valores.nextInt();
         System.out.println("Digite o valor de pagamento p/ Hora:");
        valorHora = valores.nextDouble();
        salario = horas*valorHora;
        System.out.println(nome +" seu salario é: "+ salario);
        }

}
