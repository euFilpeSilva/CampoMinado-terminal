package jogocampominado;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class CampoMinado {
    private int tamanho;
    private int numeroMinas;
    private boolean[][] tabuleiro;
    private boolean[][] revelado;
    private int[][] proximidade;

    private int linhas;
    private int colunas;

    public CampoMinado(int tamanho, int numeroMinas, int i) {
        this.tamanho = tamanho;
        this.numeroMinas = numeroMinas;
        tabuleiro = new boolean[tamanho][tamanho];
        revelado = new boolean[tamanho][tamanho];
        proximidade = new int[tamanho][tamanho];
        linhas = tamanho;
        colunas = tamanho;
    }

    public static void main(String[] args) {
        int tamanho = 10;
        int numeroMinas = 20;

        CampoMinado campoMinado = new CampoMinado(tamanho, numeroMinas, 10);
        campoMinado.jogar();
    }


    public void jogar() {
        gerarMinas();
        while (true) {
            mostrarTabuleiro(true);
            int linha = obterInteiro("Digite a linha: ");
            int coluna = obterInteiro("Digite a coluna: ");
            if (tabuleiro[linha][coluna]) {
                System.out.println("BOOM! Você perdeu.");
                mostrarMinas(); // exibe todas as minas no tabuleiro
                return;
            }
            revelado[linha][coluna] = true;
            if (ganhou()) {
                System.out.println("Parabéns, você venceu!");
                mostrarTabuleiro(true);
                return;
            }
        }
    }


    private void gerarMinas() {
        Random random = new Random();
        int minasGeradas = 0;
        while (minasGeradas < numeroMinas) {
            int linha = random.nextInt(tamanho);
            int coluna = random.nextInt(tamanho);
            if (!tabuleiro[linha][coluna]) {
                tabuleiro[linha][coluna] = true;
                minasGeradas++;
            }
        }
        for (int linha = 0; linha < tamanho; linha++) {
            for (int coluna = 0; coluna < tamanho; coluna++) {
                if (tabuleiro[linha][coluna]) {
                    continue;
                }
                int count = 0;
                if (linha > 0 && coluna > 0 && tabuleiro[linha - 1][coluna - 1]) {
                    count++;
                }
                if (linha > 0 && tabuleiro[linha - 1][coluna]) {
                    count++;
                }
                if (linha > 0 && coluna < tamanho - 1 && tabuleiro[linha - 1][coluna + 1]) {
                    count++;
                }
                if (coluna > 0 && tabuleiro[linha][coluna - 1]) {
                    count++;
                }
                if (coluna < tamanho - 1 && tabuleiro[linha][coluna + 1]) {
                    count++;
                }
                if (linha < tamanho - 1 && coluna > 0 && tabuleiro[linha + 1][coluna - 1]) {
                    count++;
                }
                if (linha < tamanho - 1 && tabuleiro[linha + 1][coluna]) {
                    count++;
                }
                if (linha < tamanho - 1 && coluna < tamanho - 1 && tabuleiro[linha + 1][coluna + 1]) {
                    count++;
                }
                proximidade[linha][coluna] = count;
            }
        }

    }

    public void mostrarTabuleiro(boolean mostrarMinas) {
        System.out.println("   0 1 2 3 4 5 6 7 8");
        System.out.println("  -------------------");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(i + "| ");
            for (int j = 0; j < tamanho; j++) {
                if (revelado[i][j]) {
                    if (tabuleiro[i][j]) {
                        System.out.print("* ");
                    } else {
                        System.out.print(calcularMinasAoRedor(i, j) + " ");
                    }
                } else if (mostrarMinas && tabuleiro[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println("|" + i);
        }
        System.out.println("  -------------------");
        System.out.println("   0 1 2 3 4 5 6 7 8");
    }

    private int calcularMinasAoRedor(int linha, int coluna) {
        int count = 0;
        for (int l = linha - 1; l <= linha + 1; l++) {
            for (int c = coluna - 1; c <= coluna + 1; c++) {
                if (l >= 0 && l < tamanho && c >= 0 && c < tamanho && tabuleiro[l][c]) {
                    count++;
                }
            }
        }
        return count;
    }

    private void mostrarMinas() {
        for (int linha = 0; linha < tamanho; linha++) {
            for (int coluna = 0; coluna < tamanho; coluna++) {
                if (tabuleiro[linha][coluna]) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }


    public int obterInteiro(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print(mensagem);
            try {
                valor = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Insira um número inteiro.");
                scanner.nextLine(); // descartar entrada inválida
            }
        }

        return valor;
    }


    public boolean ganhou() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (!tabuleiro[i][j] && !revelado[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }


}