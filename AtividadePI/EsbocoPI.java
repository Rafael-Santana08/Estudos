package AtividadePI;

import java.util.Scanner;

public class EsbocoPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int faltas;
        int n1,n2,n3,n4;
        double media, soma;
        String alunos;
        String professor;
        String unidade;
        String turma;

        System.out.println("Qual o seu professor?");
        professor = sc.next();
        System.out.println("Sua unidade escolar?");
        unidade = sc.next();
        System.out.println("Nome da sua turma: ");
        turma = sc.next();
        System.out.println("Qual o nome do aluno?");
        alunos = sc.next();

        System.out.println("Digte a sua primeira nota: ");
        n1 = sc.nextInt();
        System.out.println("Digte a sua segunda nota: ");
        n2 = sc.nextInt();
        System.out.println("Digte a sua terceira nota: ");
        n3 = sc.nextInt();
        System.out.println("Digte a sua primeira nota: ");
        n4 = sc.nextInt();

        System.out.println("Teve quantas faltas?");
        faltas = sc.nextInt();

        soma = n1+ n2+ n3+ n4;

        media = soma / 4;


            if (media >= 70 && faltas < 2) {
                System.out.println("Aprovado");
                return;
            }
            if (media >= 50 && media < 70 && faltas < 5) {
                System.out.println("Recuperação");
                return;
            } else {
                System.out.println("Reprovado");
                return;
            }


        }
    }

