package Aula1NoIntelliJ_funcao;

import java.util.Scanner;

public class funcao {

    public static void  soma(int n1, int n2){
        int r;
        r = n1 + n2;
        System.out.println(r);
    }
    public static void sub(int n1, int n2){
        int r;
        r = n1 - n2;
        System.out.println(r);
    }
    public static int multi(int n1, int n2){
        int r=0;
        r = n1 * n2;
        return r;
    }
    public static int div(int n1, int n2){
        int r=0;
        r = n1 / n2;
        return r;
    }

    public static void calculadora(int opc, int n1, int n2) {
        switch (opc){
            case 1: soma(n1,n2);
                    break;
            case 2: sub(n1,n2);
                break;
            case 3: System.out.println(multi(n1,n2));
                break;
            case 4: System.out.println(div(n1,n2));
            break;
        }
    }
    public static void main(String[] args) {

        int opc,n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Infomre dois valores: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("1 - Soma\n2 - Subtração\n3 - Multi\n4 - Div");
        opc = sc.nextInt();
        calculadora(opc, n1, n2);


    }
}
