import util.Keyboard;

public class Exercício09 {
	
	public static void main(String[] args) {
		
		//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas
		//em dias. Obs: Considere os anos com 365 dias e os meses com 30 dias.
		
		
		int idade = Keyboard.readInt("Insira sua idade: ");
		int meses = Keyboard.readInt("Insira os Meses: ");
		int dias = Keyboard.readInt("Insira os Dias: ");
		
		
		int calc_data = (idade * 365) + (meses * 30) + (dias); 
		
		System.out.println("Sua idade em dias é: " + calc_data + " Dias");
		
	}

}
