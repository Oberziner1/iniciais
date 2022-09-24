package teste;

import java.util.Scanner;

public class Epsilon {

	public static void main(String[] args) {
		String nome;
		Integer ano;
		Integer mes;
		Integer dia;
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Qual seu nome?");
		nome = s.nextLine();
		System.out.println("Qual ano você nasceu?");
		ano = s.nextInt();
		System.out.println("Qual mês você nasceu em número?");
		mes = s.nextInt();
		System.out.println("Qual dia você nasceu?");
		dia = s.nextInt();
		
		System.out.println(nome+" tem " + (((2022-ano)*365) + (mes * 30) + (24-dia)) +" dias.");
		s.close();
		

	}

}
