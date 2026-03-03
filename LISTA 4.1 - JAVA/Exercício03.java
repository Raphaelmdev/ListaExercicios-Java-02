import util.Keyboard;

public class Exercício03{

    public static void main(String[] args) {

        //3) Desenvolver um programa que pergunte um número, e apresente como resposta se o referido número é par ou
        //é ímpar.

        int num = Keyboard.readInt("INSIRA UM NÚMERO: ");
        if (num % 2 == 0 ){
            System.out.println("O " + num +  " é par");
        } else {
            System.out.println("O " + num + " é ímpar" );
        }
        
    }
}