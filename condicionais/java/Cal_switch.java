package condicionais.java;

import java.util.Scanner;

public class Cal_switch {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println("Escolha a operação que deseja:");
			System.out.println("1. Soma");
			System.out.println("2. Subtração");
			System.out.println("3. Multiplicação");
			System.out.println("4. Divisão");
			System.out.println("5. Sair");
			System.out.println("Opção: ");
			opcao = sc.nextInt();
			
			double num1,num2,res;
			
			switch(opcao) {
				case 1: System.out.println("Digite o primeiro numero: ");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo numero: ");
				num2 = sc.nextDouble();
				res = num1 + num2;
				System.out.println("O resultado foi: " + res + "\n");
				break;
				
				case 2: System.out.println("Digite o primeiro numero: ");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo numero: ");
				num2 = sc.nextDouble();
				res = num1 - num2;
				System.out.println("O resultado foi: " + res + "\n");
				break;
				
				case 3: System.out.println("Digite o primeiro numero: ");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo numero: ");
				num2 = sc.nextDouble();
				res = num1 * num2;
				System.out.println("O resultado foi: " + res + "\n");
				break;
				
				case 4: System.out.println("Digite o primeiro numero: ");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo numero: ");
				num2 = sc.nextDouble();
				if(num2 !=0) {
					res = num1 / num2;
					System.out.println("Resultado: " + res + "\n");
				}else {
					System.out.println("Erro: Divisão por zero!");
				}
				break;
				
				case 5: System.out.println("Saindo...");
				break;
				
				default:
					System.out.println("Opção inválida. Tente novamnete\n");
			}
		}while(opcao !=5); //faz o looping do codigo, é um do-while essa calculaora
			
		
	}


	}


