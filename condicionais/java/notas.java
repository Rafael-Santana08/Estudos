package condicionais.java;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int nota;
		
		System.out.println("Digite a sua nota: (De 0 á 100)");
		nota = sc.nextInt();
		
		while(true) {
			if(nota>=0 && nota <=100) {
				break;
			}else {
				System.out.println("Esse numero é invalido. Por favor, digite um numero de 0 a 100.");
				return;
				
			}
		}
		
		
		if(nota>=90 & nota <=100) {
			System.out.println("Você tirou nota A");
			return;
		}if(nota>=80 & nota<90) {
			System.out.println("Você tirou nota B");
			return;
		}if(nota>=70 & nota<80) {
			System.out.println("Você tirou nota C");
			return;
		}if(nota>=60 & nota<70) {
			System.out.println("Você tirou nota D");
			return;
		}else {
			System.out.println("Você tirou E");
			return;
		}
		
	}}