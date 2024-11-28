package condicionais.java;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Digite a sua nota: ");
		nota = sc.nextInt();
		
		
		if(nota>=60) {
			System.out.println("Você está aprovado");
			return;
			}if(nota>=20) {
				System.out.println("Você está de recuperação");
				return;
			}else {
				System.out.println("Você está reprovado");
				
		}
	}

}
