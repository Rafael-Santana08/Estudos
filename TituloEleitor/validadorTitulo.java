package TituloEleitor;
import java.util.Scanner;
public class validadorTitulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito1 =0;
        int soma1=0;
        int[] peso1 ={2,3,4,5,6,7,8,9};
        int digito2 =0;
        int soma2=0;
        int[] peso2 ={7,8,9};
        int uf;
        int ufVeri;
        String uftextVeri;
        String uftext;
        String eTitulo;


        System.out.println("Digite o seu E-Titulo: ");
        eTitulo = sc.next();

        eTitulo = eTitulo.replaceAll("[^0-9]","");

        //Para a segunda condição dos estados 01 e 02
        ufVeri = Character.getNumericValue(eTitulo.charAt(8));

        //Para a segunda condição dos estados 01 e 02
        uftextVeri = Integer.toString(ufVeri);

        //Para a segunda condição dos estados 01 e 02
        uftextVeri += Character.getNumericValue(eTitulo.charAt(9));

        //Para calcular o digito
        uf = Character.getNumericValue(eTitulo.charAt(8));

        //Para calcular o digito
        uftext = Integer.toString(uf);

        //Para calcular o digito
        uftext += Character.getNumericValue(eTitulo.charAt(9));

        if (uftext.length()==12){

            switch (uftextVeri){
                case "01":
                    System.out.println("SP");
                    break;

                case "02":
                    System.out.println("MG");
                    break;

                case "03":
                    System.out.println("RJ");
                    break;

                case "04":
                    System.out.println("RS");
                    break;

                case "05":
                    System.out.println("BA");
                    break;

                case "06":
                    System.out.println("PR");
                    break;

                case "07":
                    System.out.println("CE");
                    break;

                case "08":
                    System.out.println("PE");
                    break;

                case "09":
                    System.out.println("SC");
                    break;

                case "10":
                    System.out.println("GO");
                    break;

                case "11":
                    System.out.println("MA");
                    break;

                case "12":
                    System.out.println("PB");
                    break;

                case "13":
                    System.out.println("PA");
                    break;

                case "14":
                    System.out.println("ES");
                    break;

                case "15":
                    System.out.println("PI");
                    break;

                case "16":
                    System.out.println("RN");
                    break;

                case "17":
                    System.out.println("AL");
                    break;

                case "18":
                    System.out.println("MT");
                    break;

                case "19":
                    System.out.println("MS");
                    break;

                case "20":
                    System.out.println("DF");
                    break;

                case "21":
                    System.out.println("SE");
                    break;

                case "22":
                    System.out.println("AM");
                    break;

                case "23":
                    System.out.println("RO");
                    break;

                case "24":
                    System.out.println("AC");
                    break;

                case "25":
                    System.out.println("AP");
                    break;

                case "26":
                    System.out.println("RR");
                    break;

                case "27":
                    System.out.println("TO");
                    break;

                case "28":
                    System.out.println("Exterior (ZZ)");
                    break;

                default:
                    System.out.println("Algo está errado, favor digitar novamente");
                    break;
            }
        }

        for (int i=0; i <8;i++){
            soma1 += Character.getNumericValue(eTitulo.charAt(i)) * peso1[i];
        }
        digito1 = (soma1 % 11);

        if (digito1>=10){
            digito1 = 0;
        } else if (digito1==0 && uftextVeri.equals("01")|| uftextVeri.equals("02")) {
            digito1 = 1;
        }

        uftext += Character.getNumericValue(eTitulo.charAt(10));


        for (int i=0; i <3;i++){
        soma2 += Character.getNumericValue(uftext.charAt(i)) * peso2[i];
        }

        digito2=(soma2%11);

        if (digito2>=10){
            digito2 =0;
        } else if (digito2==0 && uftextVeri.equals("01") || uftextVeri.equals("02")) {
            digito2 = 1;
        }


        if (digito1==Character.getNumericValue(eTitulo.charAt(10))
                &&digito2==Character.getNumericValue(eTitulo.charAt(11))){
            System.out.println("Titulo de leitor válido");
        }else {
            System.out.println("Titulo de eleitor inválido");
        }
    }
}