import util.Keyboard;

public class Exercício04 {

	public static void main(String[] args) {
		
		//Desenvolver um programa que pergunte ao usuário o seu peso e sua altura. 
		//Ao final o programa deverá exibir na tela o valor do índice de massa corporal desta pessoa (IMC).
		//órmula: IMC = peso / altura2
		//- Obs: peso em quilos e altura em metros.
		
		Double peso = Keyboard.readDouble("Informe seu Peso: ");
		Double altura = Keyboard.readDouble("Informe sua Altura: ");
		
		double imc = peso / (altura * altura);
						
		System.out.println("Sua Altura é: " + altura + " m" );
		System.out.println("Seu Peso é: " + peso + "Kg");
		System.out.println("Seu IMC é: " + imc);
		
	}

}
