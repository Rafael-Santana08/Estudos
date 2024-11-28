package condicionais.java;

import java.util.Scanner;

public class saudacoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Qual o horario na sua localidade? \nObs: de 06h a 21h");
		hora = sc.nextInt();
		
		while(true) {
			if(hora>=0 && hora<=23) {
				break;
			}else {
				System.out.println("Essa hora é inválida. Por favor digite o horário de forma correta.");
				return;
			}
			
			}
		if(hora>=6 && hora<=11) {
			System.out.println("Bom dia");
			return;
		}if(hora>=12 && hora<=17) {
			System.out.println("Boa tarde");
			return;
		}if(hora>=18 && hora<=21) {
			System.out.println("Boa noite");
			return;
		}else {
			System.out.println("Não tem saudações para esse horário.");
			return;
		}
	}

}
