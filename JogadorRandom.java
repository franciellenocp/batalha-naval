import java.util.Random;
import java.util.Scanner;

public class JogadorRandom {

    Random random = new Random();
    public void JogadorComp(String[][] matriz) {
        Tabuleiro tabuleiro = new Tabuleiro();
        int l;
        int c;

        System.out.println("Computador");
        l = random.nextInt(9) + 1;
        c = random.nextInt(9) + 1;
        validarPosicoes(matriz, c, l);
        tabuleiro.imprimirJogo(matriz);

    }

    public static void validarPosicoes(String matriz[][], int c, int l) {
        Random random = new Random();

        if (matriz[l][c].equals(" ")) {
            matriz[l][c] = "N";
        } else {
            l = random.nextInt(9) + 1;
            c = random.nextInt(9) + 1;
            validarPosicoes(matriz, c, l);
            }
        }
}
