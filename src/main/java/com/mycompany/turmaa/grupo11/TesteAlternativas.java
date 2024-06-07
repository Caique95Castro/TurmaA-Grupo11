package com.mycompany.turmaa.grupo11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TesteAlternativas {

    // Este método embaralha e exibe as alternativas.
    public void exibirAlternativas(ArrayList<String> respostas) {
        Collections.shuffle(respostas);
        for (String resp : respostas) {
            System.out.println(resp);
        }
    }

    // Este método verifica se a resposta do usuário está correta.
    public boolean verificarResposta(String resposta) {
        if (resposta.equalsIgnoreCase("A")) {
            System.out.println("\nAlternativa [" + resposta + "] está correta!\n");
            return true;
        } else {
            System.out.println("\nAlternativa está incorreta!\n");
            return false;
        }
    }

    // Este é o método principal que controla o fluxo do programa, para iniciar o teste
    public void testarCodigo() {
        boolean certo6 = true;
        int limite = 3;

        // Código que é responsável por embaralhar as alternativas
        ArrayList<String> respostas = new ArrayList<String>();
        respostas.add("[A] 11111011100.");
        respostas.add("[B] 110111.");
        respostas.add("[C] 111110111000.");
        respostas.add("[D] 111110111.");

        Scanner input = new Scanner(System.in);

        System.out.println("\n> Os computadores utilizam o sistema binário ou de base 2 que é um sistema de");
        System.out.println("numeração em que todas as quantidades se representam com base em dois números,");
        System.out.println("ou seja, (0 e 1).\n(?) > Em um computador o número 2012, em base decimal, será representado, em base binária, por:\n");

        while (certo6 && limite > 0) {
            System.out.println("");
            System.out.println("(!) > Você tera " + limite + " chances");

            System.out.println("\nEscolha a alternativa correta!\n");
            exibirAlternativas(respostas);
            
            String resp6 = input.next();
            
            if (verificarResposta(resp6)) {
                certo6 = false;
            } else {
                limite--;
            }

            if (certo6 && limite == 0) {
                System.out.println("");
                System.out.println("Resposta incorreta nas 3 tentativas!\n");
                System.out.println("Tente novamente.\n");
            }
        }

        input.close();
    }

    // Cria uma instância da classe TesteAlternativas e chama o método testarCodigo() para iniciar o teste.
    public static void main(String[] args) {
        TesteAlternativas teste = new TesteAlternativas();
        teste.testarCodigo();
    }
}
