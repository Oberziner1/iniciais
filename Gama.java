package teste;

import java.util.Scanner;

public class Gama {

	public static void main(String[] args) {
		
		Integer x;
		Integer y;
		
		x = LeVariavel ("primeiro");
		y = LeVariavel ("segundo");
		Imprime(x,y);
		{
			System.out.println("O resultado é: " +x*y);
			}	
	}

	private static void Imprime(Integer x, Integer y) {
		
	}
	private static Integer LeVariavel(String ordem) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Qual o "+ordem+" número?");
		Integer numero = s.nextInt();
		return numero;
	}

	

}
