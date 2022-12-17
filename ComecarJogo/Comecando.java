package ComecarJogo;

import Jogadores.Jogador;
import Jogadores.JogadorRandom;
import Tabuleiro.Tabuleiro;

import java.util.Scanner;


public class Comecando {
    public static void ComecandoJogo()

    {
        String[][] matriz = new String[11][11];
        String[][] matrizComputador = new String[11][11];

        Scanner scan = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador jogadorPessoa = new Jogador();
        JogadorRandom jogador2 = new JogadorRandom();
        Tabuleiro tabuleiroRandom = new Tabuleiro();
        int tentativas = 0, acertos = 0;
        int submarino;

        tabuleiro.preencherJogo(matriz);
        tabuleiro.preencherJogo(matrizComputador);

//        System.out.println("Quantos submarinos você quer que tenha no jogo");
//        int cont = scan.nextInt();
        int cont = 10;
        while (cont != 0) {
            jogadorPessoa.posicionarNavio(matriz, cont);
            System.out.println("\n");
            jogador2.JogadorComp(matrizComputador);
            System.out.println("\n");
            cont--;
        }


        int TJogador = 0;
        char vezJogador = TurnoJogador.vezJogada(TJogador);
        while (!TurnoJogador.Vitoria(matriz, matrizComputador, 10)) {

//            Escolhendo quem vai começar

            if (vezJogador == 'J') {
                Atirando.AtirandoJogador(matriz, matrizComputador);
                if (TurnoJogador.Vitoria(matriz, matrizComputador, 10)) {
                    break;
                }
                vezJogador = 'C';
            } else if (vezJogador == 'C') {
                System.out.println("\n");
                Atirando.AtirandoComp(matriz, matrizComputador);
                if (TurnoJogador.Vitoria(matriz, matrizComputador, 10)) {
                    break;
                }
                vezJogador = 'J';

            }
        }
    }


}
