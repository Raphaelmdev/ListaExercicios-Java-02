import util.Keyboard;

public class Exercício01 {
    static void main(String[] args){
         //1) Desenvolver um programa que pergunte um número. Se este número for maior que 20, então ele deverá exibir a
        //metade deste número, senão, ele deverá exibir o número sem alterações.
      
        double num = Keyboard.readInt("INSIRA UM NÚMERO: ");
        if (num > 20) {
             double metade = num / 2;
            System.out.println("O número maior que 20 foi divido por 2: " + metade);
        }else {
            System.out.print("Seu número é: " + num);
        }

    }
}
