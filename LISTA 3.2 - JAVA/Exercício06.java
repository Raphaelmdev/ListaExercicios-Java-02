import util.Keyboard;

public class Exercício06 {

	public static void main(String[] args) {
		
		//6) Fazer um algoritmo que pergunte o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por
		//ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
		//exibir ao final o seu nome, o salário fixo, a comissão e o salário completo (fixo + comissão sobre vendas) no final
		//do mês.
		
		
		String nome = Keyboard.readText("Informe seu Nome: ");
		double salary = Keyboard.readDouble("Informe seu Salário: ");
		double totalsales = Keyboard.readDouble("Informe seu Total de Vendas: ");
		
		double comission = totalsales * 0.15;
		double totalsalary = (salary + comission);
		
		System.out.println("Seu Nome é: " + nome);
		System.out.println("Seu Salário é: " + "R$ " + salary);
		System.out.println("Sua Comissão é: " + "R$ " + comission );
		System.out.println("Seu Total de Vendas é: " + "R$ " + totalsales );
		System.out.println("Seu Salário Total é: " + "R$ " + totalsalary );
		
		
	}

}
