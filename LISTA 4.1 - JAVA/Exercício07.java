import util.Keyboard;

public class Exercício07 {
    public static void main(String[] args) {
       // 7) Desenvolver um programa que pergunte um valor inteiro positivo ou negativo, e exiba como resposta o módulo
        //deste valor, ou seja, o número lido como sendo positivo.    

        int num = Keyboard.readInt("INSIRA UM NUMERO NEGATIVO ou POSITIVO: ");

        int mold;

        if  (num <=  0){
            mold = (num * -1);
            System.out.println("O módulo do numero negativo é: " + mold);

        } else {
                    System.out.println("O número sem módulo é: " + num );

            } 
            
        }
            
        
    }
    

