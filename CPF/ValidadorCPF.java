package CPF;

import java.util.Scanner;

public class ValidadorCPF {
    public static void main(String[] args) { //digite psvm(inicial de cada palavra) e aperte TAB
    Scanner sc = new Scanner(System.in);

    int digito1 =0;
    int digito2 =0;
    int soma1 = 0;
    int soma2 =0;
    int[] peso1 ={10,9,8,7,6,5,4,3,2};
    int[] peso2 ={11,10,9,8,7,6,5,4,3,2};
    String cpf;

        System.out.println("Digite o seu CPF: ");
        cpf = sc.next();

        cpf = cpf.replaceAll("[^0-9]",""); //aqui muda a forma de tirar os traços e pontos


        //Digito 1
        for (int i=0;i<9;i++){
            soma1 += Character.getNumericValue(cpf.charAt(i)) * peso1[i];
        }

        digito1 = (soma1 % 11);

        if (digito1 < 2){
            digito1 = 0;
        }else if (digito1>=2){
        digito1 =  11 - digito1;
        }


        //Digito 2
        for (int i =0;i<10;i++){
            soma2 += Character.getNumericValue(cpf.charAt(i)) *  peso2[i];
        }

        digito2 = (soma2 % 11);

        if (digito2 < 2){
            digito2 = 0;
        }else if (digito2 >= 2){
            digito2 = 11 - digito2;
        }

        //Validação do CNPJ
        if (digito1==Character.getNumericValue(cpf.charAt(9))
                && digito2 == Character.getNumericValue(cpf.charAt(10))){
            System.out.println("CPF válido");
        }else {
            System.out.println("CPF inválido");
        }
    }
}
