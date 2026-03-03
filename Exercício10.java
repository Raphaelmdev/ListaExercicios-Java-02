import util.Keyboard;

public class Exercício10{
    public static void main(String[] args) {

        //10) Desenvolver um programa que pergunte dois números inteiros, e apresente como resultado se o segundo
        //número informado é ou não um divisor do primeiro número informado.

        int num = Keyboard.readInt("INSIRA O PRIMEIRO NÚMERO: ");
        int num2 = Keyboard.readInt("INSIRA O SEGUNDO NÚMERO: ");

        if (num2 == 0){
                   System.out.println("Vlw monstro quer dividir o ZERO KKKKKKKK");
        }else if (num % num2 == 0){
                   System.out.println("O número informado é divisor do primeiro número");
        
        }else {
            System.out.println("Não é um divisor do número informado");
    }
}
}