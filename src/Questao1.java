import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o número de alunos
        System.out.print("Digite o número de alunos: ");
        int numAlunos = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        // Criar a matriz para armazenar o nome dos alunos e suas notas
        String[][] dadosAlunos = new String[numAlunos][4];  // Nome, Nota 1, Nota 2, Média

        // Coletar dados dos alunos
        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            System.out.print("Nome: ");
            dadosAlunos[i][0] = scanner.nextLine();

            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();
            scanner.nextLine();  // Consumir a nova linha

            // Armazenar notas
            dadosAlunos[i][1] = String.valueOf(nota1);
            dadosAlunos[i][2] = String.valueOf(nota2);

            // Calcular a média
            double media = (nota1 + nota2) / 2;
            dadosAlunos[i][3] = String.format("%.2f", media);
        }

        // Exibir resultados
        System.out.println("\nResultados:");
        for (int i = 0; i < numAlunos; i++) {
            String nome = dadosAlunos[i][0];
            double nota1 = Double.parseDouble(dadosAlunos[i][1]);
            double nota2 = Double.parseDouble(dadosAlunos[i][2]);
            double media = Double.parseDouble(dadosAlunos[i][3]);

            String status = media >= 6.0 ? "Aprovado" : "Reprovado";

            System.out.println("Nome: " + nome);
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Média: " + media);
            System.out.println("Status: " + status);
            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}
