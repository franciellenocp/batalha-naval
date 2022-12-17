package ComecarJogo;

import static Jogadores.Jogador.converterLinha;

public class Validacao {

    public static void validarTiroJogador(String matriz [][], String matrizComp[][], int c, int l) {

        if (matrizComp[l][c].equals("N") && matriz[l][c].equals("N")) {
            matriz[l][c] = "X";
        } else if ((matrizComp[l][c].equals(" ") || matrizComp[l][c].equals("-")) && matriz[l][c].equals("N")) {
            matriz[l][c] = "n";
        } else if ((matrizComp[l][c].equals(" ") || matrizComp[l][c].equals("-")) && matriz[l][c].equals(" ")) {
            matriz[l][c] = "-";
        } else if ((matriz[l][c].equals(" ") || matriz[l][c].equals("-")) && matrizComp[l][c].equals("N")) {
            matriz[l][c] = "*";
        }


    }

    public static void validarTiroComputador(String matriz [][], String matrizComp[][], int c, int l) {

        if ((matriz[l][c].equals("-") || matriz[l][c].equals(" ")) && matrizComp[l][c].equals("N")) {
            matrizComp[l][c] = "n";
        } else if (matrizComp[l][c].equals("N") && matriz[l][c].equals("N")) {
            matrizComp[l][c] = "X";
        } else if ((matrizComp[l][c].equals(" ") || matrizComp[l][c].equals("-")) && matriz[l][c].equals("N")) {
            matrizComp[l][c] = "*";
        } else if ((matriz[l][c].equals(" ") || matriz[l][c].equals("-")) && matrizComp[l][c].equals(" ")) {
            matrizComp[l][c] = "-";
        }


    }


}
