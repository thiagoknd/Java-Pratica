package Atividade04;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidade;

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(int valor){
        int velocidadeAtual = velocidade;
        velocidade += valor;
        if(velocidade >= 200){
            velocidade = 200;
            System.out.printf("Acelerando: %d + %d > %d \n",velocidadeAtual,valor,velocidade);
        }else{
            System.out.printf("Acelerando: %d + %d > %d\n",velocidadeAtual,valor,velocidade);
        }
    }
    public void frear(int valor){
        int velocidadeAtual = velocidade;
        velocidade -= valor;
        if(velocidade<=0){
            velocidade = 0;
            System.out.printf("freando: %d - %d > %d\n",velocidadeAtual,valor,velocidade);
        }else{
            System.out.printf("freando: %d - %d > %d\n",velocidadeAtual,valor,velocidade);
        }
    }
    public String toString(){
        return "Macar= "+marca+",Modelo= "+modelo+", Velocidade= "+velocidade;
    }

    public void printStatus(){
        System.out.println(toString());
    }
}
