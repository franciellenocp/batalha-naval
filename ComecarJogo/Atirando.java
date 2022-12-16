package ComecarJogo;

import Jogadores.Jogador;
import Tabuleiro.Tabuleiro;
import java.util.Random;
import java.util.Scanner;
import static Jogadores.Jogador.converterLinha;
import static Jogadores.Jogador.validarPosicoes;

public class Atirando {
    public static void AtirandoJogador(String matriz [][], String matrizComp[][], int c, String l) {
        Scanner scan = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();
        c = 0;
        int linha;
        tabuleiro.imprimirJogo(matriz);

        System.out.println("Digite a linha desejada:");
        l = scan.next();
        //Exception caso digite uma posição que não existe
        while ((!l.equalsIgnoreCase("A") && !l.equalsIgnoreCase("B") && !l.equalsIgnoreCase("C") &&
                !l.equalsIgnoreCase("D") && !l.equalsIgnoreCase("E") && !l.equalsIgnoreCase("F") &&
                !l.equalsIgnoreCase("G") && !l.equalsIgnoreCase("H") && !l.equalsIgnoreCase("I") &&
                !l.equalsIgnoreCase("J"))) {
            System.out.println("Valor digitado é INVÁLIDO");
            System.out.println("Por favor, digite novamente a linha desejada:");
            l = scan.nextLine();
        }
        System.out.println("Digite a coluna desejada:");
        c = scan.nextInt();
        //Exception caso digite uma posição que não existe
        while ((c <= 0) || (c > 11)) {
            System.out.println("Valor digitado é INVÁLIDO");
            System.out.println("Por favor, digite novamente a coluna desejada:");
            c = scan.nextInt();
        }
        linha = converterLinha(l);
        Validacao.validarTiro(matriz, matrizComp, c, linha);
        tabuleiro.imprimirJogo(matriz);
    }

    public static void AtirandoJogador(String matriz [][], String matrizComputador[][]) {
            Random random = new Random();
            Tabuleiro tabuleiro = new Tabuleiro();
            int l;
            int c;
            System.out.println("Computador");
            l = random.nextInt(9) + 1;
            c = random.nextInt(9) + 1;
            Validacao.validarTiro(matriz, matrizComputador, c, l);
            tabuleiro.imprimirJogo(matrizComputador);

        }



}
