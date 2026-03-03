import util.Keyboard;

public class Exercício08 {
    public static void main(String[] args) {
        
        //Desenvolver um programa que pergunte um número inteiro qualquer e verifique se ele está na faixa de 1 a 10

        int num = Keyboard.readInt("INSIRA UM NÚMERO INTEIRO");

        if (num >= 1 && num <= 10){
            System.out.println("O Número está na faixa entre 1 a 10. O numero é: " + num);
        }else {
            System.out.println("O Número está fora da faixa de 1 a 10. O número é: "+ num);
        }


    }
    
}
