package ComecarJogo;

import Jogadores.Jogador;
import Jogadores.JogadorRandom;
import Tabuleiro.Tabuleiro;

import java.util.Scanner;

public class LogicaJogo extends Comecando {
    public static void LogicaJogo(String[][] matriz, String[][] matrizComputador) {

        Scanner scan = new Scanner(System.in);

        boolean fim = TurnoJogador.Vitoria(matriz, matrizComputador, 0);
        while (fim = false) {
//            Escolhendo quem vai começar
            int TJogador = 0;
            char vezJogador = TurnoJogador.vezJogada(TJogador);

            if (vezJogador == 'J') {
                Tabuleiro.imprimirJogo(matriz);
                System.out.println("Digite a linha desejada:");


            } else if (vezJogador == 'C') {
                Tabuleiro.imprimirJogo(matrizComputador);
            }




        }




//        if (fim) {
//            tabuleiro.imprimirJogo(matriz);
//            System.out.println("\n---------------------------------------------------------\n");
//            tabuleiro.imprimirJogo(matrizComputador);
//            break;
//        }


    }
}




