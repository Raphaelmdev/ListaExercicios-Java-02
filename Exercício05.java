import util.Keyboard;

public class Exercício05{
    public static void main(String[] args) {
        
        // Desenvolver um programa que pergunte 4 notas escolares de um aluno e exiba mensagem informando que o
        //aluno foi aprovado se a média escolar for maior ou igual a 6. Se o aluno não foi aprovado, indicar uma
        //mensagem informando essa condição. Apresentar junto com a mensagem de aprovação ou reprovação o valor
        //da média obtida pelo aluno.

        double nota1 = Keyboard.readDouble("INSIRA A NOTA 1");
        double nota2 = Keyboard.readDouble("INSIRA A NOTA 2");
        double nota3 = Keyboard.readDouble("INSIRA A NOTA 3");
        double nota4 = Keyboard.readDouble("INSIRA A NOTA 4");

        double avg = (nota1 + nota2 + nota3 + nota4) / 4;

        if (avg >= 6){
            System.out.println("APROVADO");
        }else {
            System.out.println("REPROVADO");
        }
    }
}