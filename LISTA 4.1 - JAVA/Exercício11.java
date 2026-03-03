import util.Keyboard;

public class Exercício11 {
    public static void main(String[] args) {

        //11) Desenvolver um programa que pergunte um número inteiro de 3 algarismos e apresente como resultado
        //somente o algarismo das centenas.

        int num = Keyboard.readInt("INSIRA UM NÚMERO DE 3 ALGARISMOS: ");
        if (num <= 100){
            System.out.println("Não existe a centena deste número");
        }else if (num >= 100){
            int calc_centena = num / 100;
            System.out.println("A centena deste número é: " + calc_centena );
        }

    

    
}
}