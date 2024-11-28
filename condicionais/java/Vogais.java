package condicionais.java;

import java.util.Scanner;

public class Vogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para digitar uma frase
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();  // Lê a frase completa

        // Inicializando variáveis para contar vogais e consoantes
        int quantidadeVogais = 0;
        int quantidadeConsoantes = 0;

        // Converter a frase para minúsculas para facilitar a comparação
        frase = frase.toLowerCase();

        // Percorrer cada caractere da frase
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);  // Obtemos o caractere na posição i

            // Verificar se o caractere é uma letra
            if (Character.isLetter(c)) {
                // Verificar se é uma vogal
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    quantidadeVogais++;
                } else {
                    quantidadeConsoantes++;
                }
            }
        }

        // Exibir os resultados
        System.out.println("Vogais: " + quantidadeVogais);
        System.out.println("Consoantes: " + quantidadeConsoantes);

        scanner.close();
    }
}
