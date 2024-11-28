package Atividade;
import java.util.Scanner;
public class ExB_Rafael {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[8];

        int[] B = new int[8];

        System.out.println("Digite 8 elementos inteiros para a matriz A:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Elemento A[" + (i + 1) + "]: ");
            A[i] = sc.nextInt();
        }


        for (int i = 0; i < 8; i++) {
            B[i] = A[i] * 3;
        }


        System.out.println("A matriz B (A multiplicada por 3) é:");
        for (int i = 0; i < 8; i++) {
            System.out.println("B[" + (i + 1) + "] = " + B[i]);
        }
        sc.close();
    }
}