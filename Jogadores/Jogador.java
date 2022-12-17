package Jogadores;

import java.util.Scanner;

import Tabuleiro.Tabuleiro;

public class Jogador {
    public static void posicionarNavio(String matriz[][], int quantidade_navio) {
        Scanner scan = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();
        String l;
        int c = 0, linha;


        tabuleiro.imprimirJogo(matriz);

        System.out.printf("Vamos posicionar o " + quantidade_navio + "º navio (s) no jogo\n");

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
        validarPosicoes(matriz, c, linha);
        tabuleiro.imprimirJogo(matriz);


    }


    public static int converterLinha(String l) {
        int linha = -1;
        if (l.equalsIgnoreCase("A")) {
            linha = 1;
        } else if (l.equalsIgnoreCase("B")) {
            linha = 2;
        } else if (l.equalsIgnoreCase("C")) {
            linha = 3;
        } else if (l.equalsIgnoreCase("D")) {
            linha = 4;
        } else if (l.equalsIgnoreCase("E")) {
            linha = 5;
        } else if (l.equalsIgnoreCase("F")) {
            linha = 6;
        } else if (l.equalsIgnoreCase("G")) {
            linha = 7;
        } else if (l.equalsIgnoreCase("H")) {
            linha = 8;
        } else if (l.equalsIgnoreCase("I")) {
            linha = 9;
        } else if (l.equalsIgnoreCase("J")) {
            linha = 10;
        }
        return linha;
    }

    public static void validarPosicoes(String matriz[][], int c, int linha) {
        String l;
        Scanner scan = new Scanner(System.in);
        if (matriz[linha][c].equals(" ")) {
            matriz[linha][c] = "N";
        } else {
            while (!matriz[linha][c].equals(" ")) {
                System.out.println("Posição já preenchida");
                System.out.println("Informe novamente uma linha:");
                l = scan.nextLine();
                linha = converterLinha(l);
                System.out.println("Informe novamente uma coluna");
                c = scan.nextInt();
            }
            matriz[linha][c] = "N";
        }
    }
}


