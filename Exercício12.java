import util.Keyboard;

public class Exercício12 {
    public static void main(String[] args) {
        
        //12) Desenvolver um programa que pergunte 5 números inteiros e identifique o maior número e o menor número

        int num1 = Keyboard.readInt("INSIRA O PRIMEIRO NÚMERO: "); 
        int num2 = Keyboard.readInt("INSIRA O SEGUNDO NÚMERO: ");
        int num3 = Keyboard.readInt("INSIRA O TERCEIRO NÚMERO: ");
        int num4 = Keyboard.readInt("INSIRA O QUARTO NÚMERO: ");
        int num5 = Keyboard.readInt("INSIRA O QUINTO NÚMERO: ");

        int maior = num1;
        int menor = num1;

         if (num2 > maior) {
            maior = num2;
        }
        if (num2 < menor) {
            menor = num2;
        }

        if (num3 > maior) {
            maior = num3;
        }
        if (num3 < menor) {
            menor = num3;
        }

        if (num4 > maior) {
            maior = num4;
        }
        if (num4 < menor) {
            menor = num4;
        }

        if (num5 > maior) {
            maior = num5;
        }
        if (num5 < menor) {
            menor = num5;
        }
        
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);




    }
}
