package condicionais.java;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num,i;
		
		System.out.println("Digite o fatorial: ");
		num = sc.nextInt();
		
		long fatorial = 1;
		
		for(i=1;i<= num;i++) {
			fatorial *=i;
			
		}
		System.out.println("o fatorial de " + num + " é " + fatorial);
	}

}
