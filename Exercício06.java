import util.Keyboard;

public class Exercício06 {
    public static void main(String[] args) {
        //6) Desenvolver um programa que pergunte dois valores numéricos inteiros e apresente o valor da diferença entre o
        //maior valor e o menor valor lido.

        int num1 = Keyboard.readInt("INSIRA UM VALORES INTEIROS");
        int num2 = Keyboard.readInt("INSIRA DOIS VALORES INTEIROS");
        
        int diff;

        if(num1 > num2){
            diff = num1 - num2; 
        } else {
            diff = num2 - num1;
            System.out.println("A Diferença entre maior e menor valor é : " + diff);

        }
    
        
        

    
    }
}
