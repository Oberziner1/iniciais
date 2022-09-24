package teste;

import java.util.Scanner;

public class Beta {

	public static void main(String[] args) {
		
		{
			Integer numero;
			
			Scanner s = new Scanner(System.in);
			System.out.println("Digite um numero?");
			numero = s.nextInt();
			if (numero % 2 == 0) {
				System.out.println("Esse número é par");
			}else {
				System.out.println("Esse número é impar");
			}
			s.close();
			}	
	}

}
