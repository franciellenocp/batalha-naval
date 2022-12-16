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

        System.out.println("Quantos submarinos você quer que tenha no jogo");
        int cont = scan.nextInt();
        while (cont != 0) {
            jogadorPessoa.posicionarNavio(matriz);
            System.out.println("\n");
            jogador2.JogadorComp(matrizComputador);
            System.out.println("\n");
            cont--;
        }

//
    }


}
