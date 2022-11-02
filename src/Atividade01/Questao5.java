package Atividade01;

import java.util.Scanner;

public class Questao5{
    private double valorJantar;
    private double valorJantarTotal;
    private Scanner leitura = new Scanner(System.in);
    
    public void total(){
        System.out.println("Digite o valor total do pedido");
        valorJantar = leitura.nextDouble();
        valorJantarTotal = valorJantar + (valorJantar/10);
        System.out.println(valorJantar+"+ 10%  = "+valorJantarTotal);
    }

}