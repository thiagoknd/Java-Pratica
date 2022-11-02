package Atividade02;

import java.util.Scanner;
//Escreva um programa para calcular O IMC (índice de massa corpórea) que indica o grau de obesidade de uma pessoa.
public class Questao06 {
    private double peso;
    private double altura;
    private double imc;
    private Scanner scanner = new Scanner(System.in);
    
    
    public void calcularImc(){
        System.out.println("Digite seu peso:");
        peso = scanner.nextDouble();
        System.out.println("Digite sua altura:");
        altura = scanner.nextDouble();
        imc = peso/(altura*altura);
        if(imc < 20){
            System.out.println("seu IMC é "+imc+" e está abaixo do normal");
        }else if(imc >=20 && imc<25){
            System.out.println("seu IMC é "+imc+" e está normal");
        }else if(imc>=25 && imc<30){
            System.out.println("seu IMC é "+imc+" e está com sobrepeso");
        }else if(imc>=30 && imc<35){
            System.out.println("seu IMC é "+imc+" e está com obesidade leve");
        }else if(imc>=35 && imc<=40){
            System.out.println("seu IMC é "+imc+" e está com obesidade moderada");
        }else if(imc >40){
            System.out.println("seu IMC é "+imc+" e está com obesidade morbida");
        }else{
            System.out.println("erro ");
        }
    }
}

