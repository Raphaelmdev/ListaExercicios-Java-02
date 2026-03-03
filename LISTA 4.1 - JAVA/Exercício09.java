import util.Keyboard;

public class Exercício09 {

    public static void main(String[] args) {
        
        //9) Desenvolver um programa que pergunte um número e exiba a informação de que ele é positivo, negativo ou
        //nulo.

        int num = Keyboard.readInt("INSIRA UM NÚMERO: ");
        if (num >= 1 ){
            System.out.println("O " + num + " É POSITIVO:");
        }else if (num <= -1){
            System.out.println("O " + num + " É NEGATIVO");
        } else {
            System.out.println("O NÚMERO É NULO");
        }
            
    }
    
}
