import util.Keyboard;

public class Exercício04 {

    public static void main(String[] args) {

        //4) Desenvolver um programa que pergunte um valor numérico inteiro e faça a exibição desse valor caso seja
        //divisível por 4 e 5. Não sendo divisível por 4 e 5, o programa deverá exibir a mensagem “Valor não é divisível por
        //4 e 5”.     

        int vlnum = Keyboard.readInt("INSIRA UM NÚMERO INTEIRO: ");
        if (vlnum % 4 == 0 && vlnum % 5 == 0 ){
            System.out.println("Valor" + vlnum);
        }else {
            System.out.println("VALOR NÃO É DIVISIVEL POR 4 E 5");
        }

    }
    }