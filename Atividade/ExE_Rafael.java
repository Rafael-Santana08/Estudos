package Atividade;
import java.util.Scanner;
public class ExE_Rafael {

    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[15];
        long[] B = new long[15];


        System.out.println("Digite 15 elementos inteiros para a matriz A:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Elemento A[" + (i + 1) + "]: ");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            B[i] = calcularFatorial(A[i]);
        }

        System.out.println("A matriz A é:");
        for (int i = 0; i < 15; i++) {
            System.out.println("A[" + (i + 1) + "] = " + A[i]);
        }

        System.out.println("A matriz B (fatorial de A) é:");
        for (int i = 0; i < 15; i++) {
            System.out.println("B[" + (i + 1) + "] = " + B[i]);
        }

        sc.close();
    }
}

