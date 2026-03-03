import util.Keyboard;

public class Exercício08 {

	public static void main(String[] args) {
		//8) Fazer um algoritmo que receba o preço de custo de um produto e mostre como 
		//resposta o valor de venda. 
		//Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.

		
		double value_cost = Keyboard.readDouble("Qual o preço de custo do produto: ");
		double percent = Keyboard.readDouble("Qual o percentual de venda do produto: ");
		
		double calc_percent = percent / 100;
		
		double acres = (calc_percent * value_cost);
		
		double total_value = (acres + value_cost);
		
		System.out.printf("Valor de Acréscimo: R$ %.2f%n", acres);
		System.out.printf("O valor total + Acrescimo: R$ %.2f", total_value);
		
		
		
	}

}
