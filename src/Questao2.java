import java.util.Scanner;


public class Questao2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matriz = new int[5][5];

            // Leitura dos elementos da matriz
            System.out.println("Digite os elementos da matriz 5x5:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            // Impressão dos elementos da diagonal principal
            System.out.println("Elementos da diagonal principal:");
            for (int i = 0; i < 5; i++) {
                System.out.print(matriz[i][i] + " ");
            }

            scanner.close();
        }

}
