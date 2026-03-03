import util.Keyboard;

public class Exercício02 {

    //) Desenvolver um programa que permita ao aluno responder qual a capital do Brasil. O programa deverá exibir se
    //a resposta está certa ou errada.
    public static void main(String[] args){


         String capital = Keyboard.readText("Qual a capítal do Brasil? ");

        if (capital.equalsIgnoreCase("Brasilia") ) {
            System.out.println("Parabéns! Você acertou."); 
        } else {
            System.out.println("Infelizmente você errou. A capital é Brasília.");
        } 

    }
}