package Atividade;
import java.util.Scanner;
public class ExF_Rafael {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[15];
        int[] C = new int[30];

        System.out.println("Digite 15 elementos inteiros para a matriz A:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Elemento A[" + (i + 1) + "]: ");
            A[i] = sc.nextInt();
        }

            System.out.println("Digite 15 elementos inteiros para a matriz B:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Elemento B[" + (i + 1) + "]: ");
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            C[i] = A[i];
            C[i + 15] = B[i];
        }

        System.out.println("A matriz C (junção de A e B) é:");
        for (int i = 0; i < 30; i++) {
            System.out.println("C[" + (i + 1) + "] = " + C[i]);
        }
        sc.close();
    }
}

