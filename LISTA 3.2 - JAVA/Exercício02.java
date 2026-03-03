import util.Keyboard;

public class Exercício02 {
	
	public static void main(String[] args) {
		
		//2) Desenvolver um programa que faça duas perguntas: o valor referente às horas atuais e o valor referente aos
		//minutos atuais. Exemplo, se agora são 09:35h o usuário deverá informar como resposta às horas atuais o valor
		//09 e como resposta aos minutos atuais o valor 35. Em seguida o programa deverá apresentar como resposta
		//quantos minutos já se passaram desde às 00:00h deste dia.
		
		int hour = Keyboard.readInt("Informe a Hora atual: "); 
		int min = Keyboard.readInt("Informe o minuto atual: "); 
		
		int totalmin = (hour * 60) + min;
		
		System.out.println("A hora atual é: " + hour + ":" + min);
		System.out.println("Se passaram desde ás 00:00h: " + totalmin + " Minutos");
	}

}
