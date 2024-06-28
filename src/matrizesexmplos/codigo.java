package matrizesexmplos;

import java.util.Random;

public class codigo {


        public static String mostrarMatriz(char[][] matriz) {
            String result = "";
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    result += matriz[i][j] + " ";
                }
                result += "\n";
            }
            return result;
        }

        public static int[] somaElementos(char[][] matriz) {
            int n = matriz.length;

            int somaAcimaDiagonal = 0;
            int somaAbaixoDiagonal = 0;
            int somaDiagonal = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int valorNumerico = matriz[i][j] - '0'; // Conversão direta de char para int
                    if (i == j) {
                        somaDiagonal += valorNumerico;
                    } else if (i < j) {
                        somaAcimaDiagonal += valorNumerico;
                    } else {
                        somaAbaixoDiagonal += valorNumerico;
                    }
                }
            }

            return new int[]{somaAcimaDiagonal, somaAbaixoDiagonal, somaDiagonal};
        }

        public static void main(String[] args) {
            int n = 3;
            char[][] matriz = new char[n][n];
            Random random = new Random();

            // Preenchendo a matriz com números aleatórios de 0 a 9
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = (char) (random.nextInt(10) + '0');
                }
            }

            System.out.println("Matriz gerada:");
            System.out.println(mostrarMatriz(matriz));

            int[] resultado = somaElementos(matriz);
            System.out.println("Soma acima da diagonal: " + resultado[0]);
            System.out.println("Soma abaixo da diagonal: " + resultado[1]);
            System.out.println("Soma na diagonal: " + resultado[2]);
        }
    }

