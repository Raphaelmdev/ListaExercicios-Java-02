import util.Keyboard;


public class Exercício13 {
    public static void main(String[] args) {
        //13) Desenvolver um programa que pergunte 3 valores (variáveis a, b e c) e ao final apresente-os dispostos em ordem
        //crescente

        int a = Keyboard.readInt("DIGITE O VALOR DE A: ");
        int b = Keyboard.readInt("DIGITE O VALOR DE B: ");
        int c = Keyboard.readInt("DIGITE O VALOR DE C: ");

        int menor,meio,maior;

        if (a <= b && a <= c) {
            menor = a;
        } else if (b <= a && b <= c) {
            menor = b;
        } else {
            menor = c;
}
         if (a >= b && a >= c) {
            maior = a;
        } else if (b >= a && b >= c) {
            maior = b;
        } else {
            maior = c;
        }

        meio = a + b + c - menor - maior;


        System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior);
    }
}
