import util.Keyboard;

public class Exercício07 {

	public static void main(String[] args) {
		
		//7) A Loja Mamão com Açúcar está vendendo seus produtos em até 10 prestações sem juros. Faça um algoritmo que
	//pergunte um valor de uma compra, o número de prestações escolhidas e apresente como resultado o valor das
	//prestações.
		
		double produto_value = Keyboard.readDouble("Qual o valor da compra?: ");
		double value_prestacao = Keyboard.readDouble("Parcele em até 10x s/Juros: ");
		
		double prestacao = produto_value / value_prestacao;
		
		System.out.printf("Valor Parcelado: R$%.2f", prestacao);

	}

}
