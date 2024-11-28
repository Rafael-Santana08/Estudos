package Atividade;
import java.util.Scanner;
public class ExD_Rafael {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[15];
        double[] b = new double[15];

        System.out.println("Digite 15 elementos reais para a matriz A:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Elemento a[" + (i + 1) + "]: ");
            a[i] = sc.nextDouble();
        }

        for (int i = 0; i < 15; i++) {
            b[i] = a[i] * a[i];
        }

        System.out.println("A matriz A é:");
        for (int i = 0; i < 15; i++) {
            System.out.println("A[" + (i + 1) + "] = " + a[i]);
        }

        System.out.println("\nA matriz B (quadrado de A) é:");
        for (int i = 0; i < 15; i++) {
            System.out.println("B[" + (i + 1) + "] = " + b[i]);
        }
        sc.close();
        }
    }

