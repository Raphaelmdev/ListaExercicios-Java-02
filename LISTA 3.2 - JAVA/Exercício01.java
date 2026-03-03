import util.Keyboard;

public class Exercício01 {

	public static void main(String[] args) {
		
		//1) Desenvolver um programa que pergunte o valor da conta a ser paga no restaurante e exiba como resposta o
		//valor com o acréscimo dos 10% da gorjeta do garçom.
		
		double value = Keyboard.readDouble("Qual o valor da conta?: ");
		
		double gorjeta = value * 0.10;
		
		double totalvalue = (value + gorjeta);
		
		System.out.printf("Valor da conta R$: %.2f %n", value );
		System.out.printf("Gorjeta do Garçom: %.2f %n", gorjeta );
		System.out.printf("Total a ser pago: %.2f %n ", totalvalue );
 		
	}
}
