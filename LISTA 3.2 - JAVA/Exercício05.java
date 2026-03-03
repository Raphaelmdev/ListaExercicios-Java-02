import util.Keyboard;

public class Exercício05 {

	public static void main(String[] args) {
		
		//5) Fazer um algoritmo que pergunte dois números e ao final apresente os seguintes valores: a soma dos dois
		//números, a subtração do primeiro pelo segundo número, a subtração do segundo pelo primeiro número, a
		//multiplicação entre os dois números, a divisão do primeiro pelo segundo número, e também o resto da divisão
		//do primeiro pelo segundo número.
		
		int num1 = Keyboard.readInt("Informe o primeiro número: ");
		int num2 = Keyboard.readInt("Informe o segundo número: ");
		
		int soma = num1 + num2;
		int sub1 = num1 - num2;
		int sub2 = num2 - num1;
		int mul = num1 * num2;
		int res = num1 % num2;
		
		System.out.println("A SOMA DOS DOIS NÚMEROS É: " + soma);
		System.out.println("A SUBTRAÇÃO DO PRIMEIRO PELO SEGUNDO É: " + sub1);
		System.out.println("A SUBTRAÇÃO DO SEGUNDO PELO PRIMEIRO É: " + sub2);
		System.out.println("A MULTIPLICAÇÃO DOS DOIS NÚMEROS É: " + mul);
		System.out.println("O RESTO DOS DOIS NÚMEROS É: " + res);
	}
}
