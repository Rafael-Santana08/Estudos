package condicionais.java;

import java.util.Scanner;

public class Contagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		double res;
		
		System.out.println("Digite o numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o numero: ");
		num2 = sc.nextInt();
		
		res = Math.pow(num1,num2);
		
		System.out.println("o resultado dessa operação é " + res);
	}

}
