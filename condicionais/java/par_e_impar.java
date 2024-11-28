package condicionais.java;

import java.util.Scanner;

public class par_e_impar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.println("Digite um numero: ");
		i = sc.nextInt();
		
		if(i%2 ==0) {
			System.out.println(i + " é um numero par");
		}else {
			System.out.println(i+ " é um numero impar");
		}
	}

}
