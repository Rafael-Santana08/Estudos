package CNPJ;

import java.util.Scanner;

public class ValidadorCNPJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digito1 = 0;
        int digito2 = 0;
        int soma1 =0;
        int soma2 =0;
        int[] peso1 = {5,4,3,2,9,8,7,6,5,4,3,2};
        int[] peso2 = {6,5,4,3,2,9,8,7,6,5,4,3,2};
        String cnpj;

        System.out.println("Digite o seu CNPJ: ");
        cnpj = sc.next();

        cnpj = cnpj.replaceAll("[^0-9]","");

        //Digito 1
        for (int i = 0; i < 12; i++ ){
            soma1 += Character.getNumericValue(cnpj.charAt(i)) * peso1[i];
        }

        digito1 = (soma1 % 11);

        if (digito1 < 2){
            digito1 = 0;
        }else if (digito1>=2){
            digito1 = 11 - digito1;
        }

        //Digito 2
        for (int i = 0; i < 13; i++ ){
            soma2 += Character.getNumericValue(cnpj.charAt(i)) * peso2[i];
        }

        digito2 = (soma2 % 11);

        if (digito2 < 2){
            digito2 = 0;
        }else if (digito2 >= 2){
            digito2 = 11 - digito2;
        }

        //Validação do CNPJ
        if (digito1 == Character.getNumericValue(cnpj.charAt(12))
            && digito2 == Character.getNumericValue(cnpj.charAt(13))){
            System.out.println("CNPJ válido");
        }else {
            System.out.println("CNPJ inválido");
        }
    }
}
