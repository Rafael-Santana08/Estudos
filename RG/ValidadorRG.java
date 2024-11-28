package RG;

import java.util.Scanner;

public class ValidadorRG {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int digito1 =0;
        int soma1 =0;
        int[] peso1 = {2,3,4,5,6,7,8,9};
        String rg;

        System.out.println("Digite o seu RG: ");
        rg = sc.next();

        rg = rg.replaceAll("[^0-9]","");

        for (int i = 0; i < 8; i++){
            soma1 += Character.getNumericValue(rg.charAt(i)) * peso1[i];
        }
        digito1 = (soma1 % 11);

        if(digito1 < 2){
            digito1 =0;
        } else if (digito1 >= 2) {
            digito1 = 11 - digito1;
        }

        if (digito1 == Character.getNumericValue(rg.charAt(8))){
            System.out.println("RG válido");
        }else {
            System.out.println("RG inválido");
        }

        }
    }

