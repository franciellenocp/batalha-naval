package Jogadores;
import java.util.Random;
import Tabuleiro.Tabuleiro;

public class JogadorRandom {

    Random random = new Random();

    public static void validarPosicoes(String[][] matrizComputador, String[][] matriz) {
    }

    public void JogadorComp(String[][] matrizComputador) {
        Tabuleiro tabuleiro = new Tabuleiro();
        int l;
        int c;

        System.out.println("Computador");
        l = random.nextInt(9) + 1;
        c = random.nextInt(9) + 1;
        validarPosicoes(matrizComputador, c, l);
        tabuleiro.imprimirJogo(matrizComputador);

    }


    public static void validarPosicoes(String matriz[][], int c, int l) {
        Random random = new Random();

        if (matriz[l][c].equals(" ")) {
            matriz[l][c] = "u";
        } else {
            l = random.nextInt(9) + 1;
            c = random.nextInt(9) + 1;

        validarPosicoes(matriz, c, l);
            }
        }
}
