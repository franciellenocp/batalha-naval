public class Tabuleiro {
    String[][] matriz = new String[11][11];

    public static void preencherJogo(String matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = " ";
            }
        }
        linhaColuna(matriz);
    }

    public static void linhaColuna(String matriz[][]) {
        matriz[0][0] = " ";
        matriz[1][0] = "A";
        matriz[2][0] = "B";
        matriz[3][0] = "C";
        matriz[4][0] = "D";
        matriz[5][0] = "E";
        matriz[6][0] = "F";
        matriz[7][0] = "G";
        matriz[8][0] = "H";
        matriz[9][0] = "I";
        matriz[10][0] = "J";
        matriz[0][1] = "1";
        matriz[0][2] = "2";
        matriz[0][3] = "3";
        matriz[0][4] = "4";
        matriz[0][5] = "5";
        matriz[0][6] = "6";
        matriz[0][7] = "7";
        matriz[0][8] = "8";
        matriz[0][9] = "9";
        matriz[0][10] = "10";

    }

    public static void imprimirJogo(String matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println(" ");
        }
    }
}
