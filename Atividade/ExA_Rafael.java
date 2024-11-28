package Atividade;
import java.util.Scanner;
public class ExA_Rafael {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];

        System.out.println("Digite 10 nomes de pessoas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }


        System.out.println("Os nomes digitados são:");
        for (int i = 0; i < 10; i++) {
            System.out.println(nomes[i]);
        }
        sc.close();
            }
        }


