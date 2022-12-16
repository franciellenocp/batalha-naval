import java.util.Jogadores.Jogador;

import static java.util.Jogadores.Jogador.converterLinha;

public class Validacao {

    public static void validarTiro(String matriz [][], String matrizComp[][], int c, int l) {

        if (matriz[l][c].equals(" ")) {
            matriz[l][c] = "-";
        } else if (matriz[l][c].equals("N")) {
            matriz[l][c] = "*";
        } else if (matrizComp.equals('N') && matriz.equals('N')) {
            matriz[l][c] = "X";
        } else if (matrizComp.equals('N') && matriz.equals('-')) {
            matriz[l][c] = "n";
        }
    }

    public static void validarTiro(String matriz [][], String matrizComp[][], int c, String linha) {

        int l = converterLinha(linha);

        if (matriz[l][c].equals(" ")) {
            matriz[l][c] = "-";
        } else if (matriz[l][c].equals("N")) {
            matriz[l][c] = "*";
        } else if (matrizComp.equals('N') && matriz.equals('N')) {
            matriz[l][c] = "X";
        } else if (matrizComp.equals('N') && matriz.equals('-')) {
            matriz[l][c] = "n";
        }

    }

}
