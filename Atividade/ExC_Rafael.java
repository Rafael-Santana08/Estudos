package Atividade;
import java.util.Scanner;
public class ExC_Rafael {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] a = new double[20];
        double[] b = new double[20];
        double[] c = new double[20];



        System.out.println("Digite 20 elementos reais para a matriz a:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Elemento a[" + (i + 1) + "]: ");
            a[i] = sc.nextDouble();
        }

        System.out.println("\nDigite 20 elementos reais para a matriz b:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Elemento b[" + (i + 1) + "]: ");
            b[i] = sc.nextDouble();
        }

        for (int i = 0; i < 20; i++) {
            c[i] = a[i] - b[i];
        }

        System.out.println("A matriz C (A - B) é:");
        for (int i = 0; i < 20; i++) {
            System.out.println("c[" + (i + 1) + "] = " + c[i]);
        }

        sc.close();
    }
}


