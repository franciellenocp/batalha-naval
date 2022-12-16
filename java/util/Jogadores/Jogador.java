package java.util.Jogadores;

import java.util.Scanner;

public class Jogador {
    public static void posicionarNavio(String matriz[][]) {
        Scanner scan = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();
        String l;
        int c = 0, linha;
        int quantidade_navio = 1;

        tabuleiro.imprimirJogo(matriz);
        System.out.printf("Vamos posicionar o " + quantidade_navio + "º navio (s) no jogo\n");
        quantidade_navio++;
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
            validarPosicoes(matriz, c, linha);



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
                //Adicionar uma exception
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

    public static void validarPosicoes(String[][] matriz, String[][] matrizComputador) {
    }
}


