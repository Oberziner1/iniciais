package teste;

import java.util.Scanner;

public class Delta {

	public static void main(String[] args) {
	
		Integer n1;
		Integer n2;
		Integer n3;
		Integer n4;
		Integer n5;
		Integer nota;
		
		
		n1 = leVariavel ("Primeira");
		n2 = leVariavel ("Segunda");
		n3 = leVariavel ("Terceira");
		n4 = leVariavel ("Quarta");
		n5 = leVariavel ("Quinta");
		
		nota = (n1+n2+n3+n4+n5)/5;
		
		System.out.println("Sua nota é "+nota);
		if (nota  >= 7) { 
			System.out.println("Você está Aprovado!");
		}
		else {
			System.out.println("Você está Reprovado!");
			
		}
		
	}

	@SuppressWarnings("resource")
	private static Integer leVariavel(String ordem) {
		Scanner s = new Scanner(System.in);
		System.out.println("Qual o "+ordem+" nota?");
		Integer numero = s.nextInt();
		return numero;
	}
	
}
		


