package AtividadePI;

import java.util.Scanner;

public class PI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int faltas=0;
        int n1,n2,n3,n4=0;
        int[] soma={0,0,0,0,0};
        int[] media ={0,0,0,0,0};
        String[] aluno ={"","","","",""};
        String prof,unidade,turma;

        System.out.println("Digite o nome do professor: ");
        prof = sc.next();
        System.out.println("Digite o nome da sua unidade curricular: ");
        unidade = sc.next();
        System.out.println("Digite o nome da turma: ");
        turma = sc.next();

        for (int i1 =1; i1 <6;i1++) {
            System.out.println("Digite as informações do " + i1 + "° aluno");
            for (int i = 1; i < 2; i++) {
                System.out.println("Digite o nome do " + i1 + "° aluno");
                aluno[i] = sc.next();

            }
            for (int i = 1; i < 5; i++) {
                System.out.println("Digite a " + i + "° nota: ");
                n1 = sc.nextInt();
                soma[i] += n1;
            }
        }media[0] = soma[0]/4;

        System.out.println(media[0]);




        //media = soma /4;
        //System.out.println(media);
    }
}
