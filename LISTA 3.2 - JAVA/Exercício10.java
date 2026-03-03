import util.Keyboard;

public class Exercício10 {

	public static void main(String[] args) {
		//10) Escreva um algoritmo pergunte o número total de eleitores de um município, o número de votos brancos, nulos
		//e válidos e apresente como resposta o percentual que cada um representa em relação ao total de eleitores.
		
		int total_eleitores = Keyboard.readInt("Qual o total de Eleitores desse Município?: "); 
		int total_eleitoresv = Keyboard.readInt("Qual o total de Votos Válidos desse Município?: "); 
		int total_eleitoresb = Keyboard.readInt("Qual o total de Votos Brancos desse Município?: "); 
		int total_eleitoresn = Keyboard.readInt("Qual o total de Votos Nulos desse Município?: "); 
		
		double  percent_eleitoresb = (double)total_eleitoresb / total_eleitores * 100 ;
		double  percent_eleitoresn = (double)total_eleitoresn / total_eleitores * 100 ;
		double  percent_eleitoresv = (double)total_eleitoresv / total_eleitores * 100 ;
		
		System.out.println("Total de Eleitores: " + total_eleitores);
		System.out.printf("Porcentagem de Votos Válidos: %.2f%%%n", percent_eleitoresv);
		System.out.printf("Porcentagem de Votos Brancos: %.2f%%%n",  percent_eleitoresb);
		System.out.printf("Porcentagem de Votos Nulos: %.2f%%%n", percent_eleitoresn);
		
		
		
		 
		


	}

}
