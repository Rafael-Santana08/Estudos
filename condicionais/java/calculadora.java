package condicionais.java;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,res,oper;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextInt();
		
		System.out.println("Digite qual a operação:\n1 - (+)\n2 - (-)\n3 - (*)\n4 - (/)\n5 - (%)");
		oper= sc.nextInt();
		
		while(true) {
			if(oper<=5) {
				break;
			}else {
				System.out.println("Por favor digite um numero de 1 a 5.");
				return;
				
			}
		}
			
		if(oper == 1) {
			res = num1 + num2;
			System.out.println("O resultado é: " + res);
		}if(oper == 2) {
			res = num1 - num2;
			System.out.println("O resultado é: " + res);
		}if(oper == 3) {
			res = num1 * num2;
			System.out.println("O resultado é: " + res);
		}if(oper == 4) {
			res = num1 / num2;
			System.out.println("O resultado é: " + res);
		}if(oper == 5) {
			res = num1 % num2;
			System.out.println("O resultado é: " + res);
		}
	}

}
