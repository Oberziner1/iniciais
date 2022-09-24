package teste;

import java.util.Scanner;

public class Alfa {

	public static void main(String[] args) {
		
		String nome1;
		String nome2;
		Integer idade1;
		Integer idade2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual nome da Primeira pessoa?");
			nome1 = s.nextLine();
		System.out.println("Qual sua idade?");
			idade1 = s.nextInt();
			s.nextLine();
			System.out.println("Seu nome é "+nome1+" e sua idade é "+idade1+ " anos.");
		System.out.println("Qual o nome da Segunda pessoa?");
			nome2 = s.nextLine();
		System.out.println("Qual sua idade?");
			idade2 = s.nextInt();
			System.out.println("Seu nome é "+nome2+" e sua idade é "+idade2+ " anos.");
		
		if (idade1>idade2){
			System.out.println(nome1+" é  mais velho que " +nome2);
		
		} else if(idade1<idade2) {
			System.out.println(nome2+" é  mais velho que " +nome1);
		} else {
			System.out.println(nome1+" tem a mesma idade que " +nome2);
		}
		s.close();
	}

}
