package ComecarJogo;

import Jogadores.Jogador;
import Tabuleiro.Tabuleiro;
import java.util.Random;
import java.util.Scanner;
import static Jogadores.Jogador.converterLinha;
import static Jogadores.Jogador.validarPosicoes;

public class Atirando {
    public static void AtirandoJogador(String matriz [][], String matrizComp[][]) {
        Scanner scan = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();
        String l;
        int c = 0;
        int linha;
        tabuleiro.imprimirJogo(matriz);

        boolean condicaoLinha = true;
        do {
            try {
                System.out.println("Digite a linha desejada:");
                l = scan.next();
                if ((!l.equalsIgnoreCase("A") && !l.equalsIgnoreCase("B") && !l.equalsIgnoreCase("C") &&
                     !l.equalsIgnoreCase("D") && !l.equalsIgnoreCase("E") && !l.equalsIgnoreCase("F") &&
                     !l.equalsIgnoreCase("G") && !l.equalsIgnoreCase("H") && !l.equalsIgnoreCase("I") &&
                     !l.equalsIgnoreCase("J"))) {
                    throw new IllegalArgumentException("O valor deve ser uma letra de A a J.");
                } else {
                    condicaoLinha = false;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e);
                l = scan.nextLine();
            }
        } while (condicaoLinha);
 
        boolean condicaoColuna = true;
        do {
            try {
                System.out.println("Digite a coluna desejada:");
                c = scan.nextInt();
                if (c <= 0 || c > 11) {
                    throw new IllegalArgumentException("O valor deve ser um número de 1 a 10.");
                } else {
                    condicaoColuna = false; 
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e);
                l = scan.nextLine();
            }
        } while (condicaoColuna);

        linha = converterLinha(l);
        Validacao.validarTiroJogador(matriz, matrizComp, c, linha);
        tabuleiro.imprimirJogo(matriz);
    }

    public static void AtirandoComp(String matriz [][], String matrizComputador[][]) {
            Random random = new Random();
            Tabuleiro tabuleiro = new Tabuleiro();
            int l;
            int c;
            System.out.println("Computador");
            l = random.nextInt(9) + 1;
            c = random.nextInt(9) + 1;
            Validacao.validarTiroJogador(matriz, matrizComputador , c, l);
            tabuleiro.imprimirJogo(matrizComputador);

        }



}
