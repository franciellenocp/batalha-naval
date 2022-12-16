public class TurnoJogador {
    public static char vezJogada(int turnojogada) {
        if (turnojogada % 2 == 0) {
            System.out.println("\nSua jogada\n");
            return 'P';
        } else {
            System.out.println("\nJogada do oponente\n");
            return 'R';
        }
    }
    public static boolean Vitoria(String[][] matriz, String[][] matrizComputador, int nSubmarino) {
        int submarinosAbatidosJogador = 0;
        int submarinosAbatidosRandom = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String submarino = matriz[i][j];
                if (Submarino == "X" || submarino == "*") {
                    submarinosAbatidosJogador++;
                }
            }
        }
        for (int i = 0; i < matrizComputador.length; i++) {
            for (int j = 0; j < matrizComputador[i].length; j++) {
                String submarino = matrizComputador[i][j];
                if (submarino == "X" || submarino == "*") {
                    submarinosAbatidosRandom++;
                }
            }
        }
        if (submarinosAbatidosJogador == nSubmarino) {
            System.out.println("\n" + jogador + ", você venceu!!!\n");
            return true;
        } else if (submarinosAbatidosRandom == nSubmarino) {
            System.out.println("\nSua Máquina Venceu!\n");
            return true;
        } else {
            return false;
        }
    }

}