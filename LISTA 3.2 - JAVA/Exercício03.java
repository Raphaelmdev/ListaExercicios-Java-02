import util.Keyboard;

public class Exercício03 {

	public static void main(String[] args) {
			
		//Desenvolver um programa que pergunte ao usuário o seu peso (em quilos) e sua altura (em metros). Ao final o
		//programa deverá exibir na tela para o usuário o valor do peso informado em gramas e a altura em centímetros.
		
		int quilos = Keyboard.readInt("Informe seu peso em quilos: ");
		int altura = Keyboard.readInt("Informe sua altura: ");
		
		double gramas = quilos * 1.000;
		
		double centimetros = altura * 100;
		
		System.out.println("O seu peso em gramas: "+ gramas + " g");
		System.out.println("O sua altura em centímetros: "+ centimetros + " cm");

	}

}
