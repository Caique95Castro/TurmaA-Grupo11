package com.mycompany.turmaa.grupo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author caique.ocastro
 */
public class ByteBattle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Para começar, escolha um nome para o(a) personagem: ");
        String nomePlayer = input.nextLine();

        boolean taCerto = false;

        do {
            exibirMenu(nomePlayer, input);
            int opc = input.nextInt();

            switch (opc) {
                case 1:
                    exibirInstrucoes();
                    break;
                case 2:
                    iniciarJogo(nomePlayer, input);
                    break;
                case 3:
                    exibirCreditos();
                    break;
                case 4:
                    sairJogo(nomePlayer, input);
                    taCerto = true;
                    break;
                default:
                    System.out.println("Opção inválida, por favor Digite uma opção válida!");
                    break;
            }
        } while (!taCerto);
    }

    public static void exibirMenu(String nomePlayer, Scanner input) {
        System.out.println("");
        System.out.println("Olá " + nomePlayer + "!");
        System.out.println("");
        System.out.println("Bem-vindo ao \n\n");

        // NOME DO JOGO 
        System.out.println(" ______                _             ______              _      _     __ ");
        System.out.println("|_   _ \\              / |_          |_   _ \\            / |_   / |_  [  |");
        System.out.println("  | |_) |    _   __  `| |-'  .---.    | |_) |   ,--.   `| |-' `| |-'  | |   .---. ");
        System.out.println("  |  __'.   [ \\ [  ]  | |   / /__\\\\   |  __'.  `'_\\ :   | |    | |    | |  / /__\\\\ ");
        System.out.println(" _| |__) |   \\ '/ /   | |,  | \\__.,  _| |__) | // | |,  | |,   | |,   | |  | \\__., ");
        System.out.println("|_______/  [\\_:  /    \\__/   '.__.' |_______/  \\';__/  \\__/   \\__/  [___]  '.__.' ");
        System.out.println("            \\__.' ");
        System.out.println("");
        System.out.println("                                 Desvendando o algoritmo \n");

        // MENU
        System.out.println("------------------------");
        System.out.println("|    [1] Instruções    |");
        System.out.println("|    [2] Jogar         |");
        System.out.println("|    [3] Créditos      |");
        System.out.println("|    [4] Sair          |");
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("Digite uma opção para prosseguir: ");
    }

    public static void exibirInstrucoes() {
        System.out.println("\n  --=<[INSTRUÇÕES]>=-- \n  ");
        String menuInstrucoes
                = "Como Jogar:\n"
                + "\n </> Bem-vindo ao [ByteBattle: Desvendando o algoritmo! \nEste é um jogo de RPG onde você assumirá o "
                + "papel de um(a) jovem aprendiz de programação.\n"
                + "Sua missão é explorar cidades, aprender a história e os conceitos fundamentais da computação e "
                + "algoritmos e protegê-las dos ataques dos Hackers Sombrios.\n"
                + "\n- Interaja com NPCs (personagens não-jogadores) para receber missões e obter dicas.\n"
                + "- Complete desafios de programação para aprimorar suas habilidades.\n"
                + "- Lute contra os Hackers Sombrios em batalhas estratégicas baseadas em seu conhecimento e aprendizado.\n"
                + "- Explore cidades para desvendar segredos e coletar itens valiosos.\n"
                + "- Avance na história e torne-se um Guardião do Código lendário! </>\n";

        System.out.println(menuInstrucoes);
    }

    public static void iniciarJogo(String nomePlayer, Scanner input) {
        // INÍCIO DO JOGO
        System.out.println("\n</>                 ");
        System.out.println(" INICIANDO O JOGO... ");
        System.out.println("                  </>\n\n");

        delayLento(1);
        System.out.println("                 Seja bem-vindo(a) a \n");

        String artCidade = "                       .|\n"
                + "                       | |\n"
                + "                       |'|            ._____             \n"
                + "               ___    |  |            |.   |' .---\"|     \n"
                + "       _    .-'   '-. |  |     .--'|  ||   | _|    |     \n"
                + "    .-'|  _.|  |    ||   '-__  |   |  |    ||      |     \n"
                + "    |' | |.    |    ||       | |   |  |    ||      |     \n"
                + " ___|  '-'     '    \"\"       '-'   '-.'    '`      |__________\n"
                + " ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        System.out.println(artCidade);
        String letreiroCidade
                = "  ##   ##   #####    ####     #####    ##  ##   ######   #####\n"
                + "  ###  ##   ##      ##  ##    ##  ##   ##  ##     ##     ##\n"
                + "  #######   ####    ##  ##    #####     ####      ##     ####\n"
                + "  ##  ###   ##      ##  ##    ##  ##     ##       ##     ##\n"
                + "  ##   ##   #####    ####     #####      ##       ##     #####\n";

        System.out.println(letreiroCidade);
        delayRapido(2);

        String enredoCidade
                = "NeoByte é uma metrópole contemporânea. As ruas são repletas de prédios de tijolos e concreto, a\n"
                + "cidade é diversificada e multicultural, com diferentes bairros refletindo as diversas origens e estilos de\n"
                + "vida dos seus habitantes. Há áreas comerciais movimentadas, onde os arranha-céus\n"
                + "se elevam em direção ao céu, contrastando com os bairros residenciais.\n\n"
                + "Em NeoByte, a divisão entre riqueza e pobreza é tão evidente quanto os bytes que circulam pela rede.\nNo "
                + "coração da cidade, erguem-se os imponentes arranha-céus dos distritos financeiros, com suas fachadas de vidro\n"
                + "reluzente e interiores luxuosos. Esses bairros centrais são o lar dos magnatas digitais, onde executivos das maiores\n"
                + "corporações de tecnologia desfrutam de vistas panorâmicas da paisagem urbana e acessam as últimas inovações tecnológicas.\n"
                + "E nos confins de NeoByte, além das fronteiras brilhantes dos outros distritos, encontra-se o subúrbio digital.\nAqui, "
                + "as ruas são estreitas e escuras, com prédios decrépitos, sem vida e fachadas desbotadas. Os habitantes do\n"
                + "subúrbio são os esquecidos da sociedade, lutando para sobreviver em meio à pobreza e ao desespero. Nesses\n"
                + "bairros negligenciados, a vida é marcada pela luta diária pela sobrevivência, briga de facções e a desigualdade social. Os\n"
                + "apartamentos são pequenos e apertados, com pouca luz natural e condições precárias de moradia. Os moradores do subúrbio\n"
                + "vivem à margem da sociedade, lutando para encontrar empregos instáveis e acessar recursos básicos, como alimentação e saúde.\n";

        System.out.println(enredoCidade);

        boolean continuar1 = true;

        do {
            System.out.println("Aperte [C] para continuar. \n");
            String cont = input.next();

            switch (cont) {
                case "C":
                case "c":
                    System.out.println("Continuando... \n");
                    continuar1 = false;
                    delayRapido(2);
                    break;
                default:
                    System.out.println("Opção inválida! \n \n");
                    break;
            }
        } while (continuar1);

        String enredoCidade2
                = "Nos sombrios becos do subúrbio de NeoByte, nascia um(a) jovem com destino marcado pela tragédia e pela "
                + "incerteza.\nO(A) protagonista, cujo nome é conhecido apenas como '" + nomePlayer + "', "
                + "que emergia nas ruas como uma figura enigmática,\ncuja origem permanece envolta de um mistério.\n"
                + "A vida de " + nomePlayer + " começou com uma tragédia devastadora. Perdeu seus pais em circunstâncias obscuras "
                + "quando ainda era pequeno(a),\ndeixando-o(a) órfão e desamparado(a). Sem recursos ou apoio, ele(a) foi forçado(a) a "
                + "enfrentar a dura realidade do subúrbio,\nonde a vida era uma luta diária pela sobrevivência. "
                + "Apesar das adversidades, " + nomePlayer + " era dotado(a) de uma mente brilhante e uma determinação inabalável.\n"
                + "Desde cedo, demonstrou uma aptidão excepcional para a computação e uma habilidade inata para a arte "
                + "do hacking.\nEle(a) passava horas intermináveis em seu computador, explorando os recantos mais"
                + " escuros da rede e dominando os segredos da tecnologia.\nEle(a) manipulava sistemas, quebrava códigos e desafiava "
                + "as defesas mais sofisticadas com uma destreza impressionante.\n"
                + "No entanto, sua forte personalidade e sua recusa em se curvar às convenções sociais o(a) tornaram um pária no mundo digital.\n"
                + "Por isso era incapaz de manter um emprego fixo, pois sua natureza rebelde e sua tendência a desafiar a autoridade frequentemente\n"
                + "o(a) colocavam em conflito com seus empregadores. Assim, ele(a) vagava pelas ruas, um(a) estranho(a), solitário(a) em um\n"
                + "mundo que nunca o(a) acolheu verdadeiramente. Apesar de sua devoção à sua arte, " + nomePlayer + " luta com seus próprios "
                + "demônios internos.\nEle(a) é assombrado(a) por pesadelos recorrentes de sua infância perdida e da perda de seus pais, "
                + "que o assombram todas as noites.\nEssas memórias dolorosas o(a) empurram para a solidão, tornando difícil para ele(a) se "
                + "abrir e confiar nos outros.\n"
                + "No entanto, apesar de suas cicatrizes emocionais, e suas habilidades incríveis com programação, ele(a) cria um amigo\n"
                + "virtual, um 'holograma' e da o nome de 'Pixel', onde ele foi criado com intuito de ajudar o(a) " + nomePlayer + "\na hackear "
                + "e capturar dados e redes de tudo que acontece em NeoByte.";

        System.out.println(enredoCidade2);

        // ERRO ao apertar outra tecla a não ser o Y 
        // INÍCIO
        boolean certo1 = true;
        do {
            System.out.println("");
            System.out.println("Aperte [Y] para escutar Pixel ");
            String resp1 = input.next();

            switch (resp1) {
                case "Y":
                case "y":
                delayRapido(2);
                    System.out.println("\n---------");
                    System.out.println("| Pixel |");
                    System.out.println("---------\n");

                    System.out.println("Olá " + nomePlayer + ", minha sincera gratidão por me dar vida e propósito. Como um holograma, minha\n"
                            + "existência é um reflexo direto do seu incrível trabalho e dedicação. Sou grato por ter sido criado com\n"
                            + "o propósito de auxiliar em missões vitais.\n"
                            + "Me acompanhe...");

                    certo1 = false;
                    break;
                default:
                    System.out.println("Opção inválida! \n");
                    break;
            }
        } while (certo1);
        // FIM

        System.out.println("\n Em um beco escuro no subúrbio, Pixel te leva em uma sala, cercado por telas digitais piscando. Uma voz ecoa pelo \n"
                + "ambiente, que o ensina brevemente sobre a história do Conceito da Computação. \n");

        // ERRO ao apertar outra tecla a não ser o Y 
        // INÍCIO
        boolean certo2 = true;

        do {

            System.out.println("");
            System.out.println("Aperte [Y] para escutar a voz misteriosa \n");
            String resp2 = input.next();

            switch (resp2) {
                case "Y":
                case "y":
                delayRapido(2);
                    
                String vozMisteriosa0 
                        = "\n--------------------"
                        + "|  Voz Misteriosa  |"
                        + "--------------------\n"
                        +"\nOlá " + nomePlayer + ", vou te contar uma história.\n"
                        + "A história de Conceitos Binários na Computação! \n";
                
                String vozMisteriosa1
                        ="\n> Sistema Binário: \n"                              
                        + "O sistema binário é a base fundamental da computação moderna, representando informações usando apenas\n"
                        + "dois símbolos: 0 e 1. Esses símbolos são chamados de bits (binary digits).\n";
                String vozMisteriosa2
                        = "\n> Bit:\n"
                        + "Um bit é a menor unidade de informação em sistemas computacionais. Ele pode ter o valor de 0\n "
                        + "ou 1, representando os estados de ' ligado ' e ' desligado ', respectivamente.\n";
                String vozMisteriosa3
                        = "\n> Byte:\n"
                        + "Um byte é uma unidade de armazenamento de dados que consiste em 8 bits. É comumente\n"
                        + "usado para representar caracteres individuais de texto ou números na memória do computador.\n";
                String vozMisteriosa4
                        = "\n> Representação de Números:\n"
                        + "No sistema binário, os números são representados usando apenas os dígitos 0 e 1. Cada dígito binário tem um\n"
                        + "valor que é uma potência de 2, começando do bit menos significativo para o mais significativo.\n";
                String vozMisteriosa5 
                        = "\n> Operações Binárias: \n"
                        + "As operações binárias incluem adição, subtração, multiplicação e divisão de números binários. Essas \n"
                        + "operações seguem regras específicas, semelhantes às operações aritméticas em sistemas numéricos decimais.\n";
                String vozMisteriosa6 
                        = "\n> Código Binário: \n"
                        + "O código binário é usado para representar instruções e dados em linguagem de máquina, que é a linguagem \n"
                        + "que os computadores entendem diretamente. Cada instrução ou caractere é representado por uma sequência de bits.\n";
                String vozMisteriosa7 
                        = "\n> Lógica Binária:\n "
                        + "A lógica binária é a base da computação digital e envolve operações lógicas como AND, OR e NOT. Essas operações\n"
                        + "são fundamentais para o funcionamento dos circuitos digitais e sistemas de computação.\n";

                        System.out.println(vozMisteriosa0);
                        delayLento(2);
                        System.out.println(vozMisteriosa1);
                        delayLento(2);
                        System.out.println(vozMisteriosa2);
                        delayLento(2);
                        System.out.println(vozMisteriosa3);
                        delayLento(2);
                        System.out.println(vozMisteriosa4);
                        delayLento(2);
                        System.out.println(vozMisteriosa5);
                        delayLento(2);
                        System.out.println(vozMisteriosa6);
                        delayLento(2);
                        System.out.println(vozMisteriosa7);
                        delayLento(2);
                    certo2 = false;
                    break;
                default:
                    System.out.println("Opção inválida \n");
                    break;
            }

        } while (certo2);
        // FIM

        // Perguntas para responder apenas com '[Y / N]'
        // Caso 'Y' vai para proxima pergunta 
        // Caso 'N' mostra uma representação do que é 
        boolean certo3 = true;

        do {
            System.out.println("Sabe o que é números Binários ?");
            System.out.println("[Y / N]");
            String resp3 = input.next();

            if (resp3.equalsIgnoreCase("Y")) {
                switch (resp3) {
                    case "Y":
                    case "y":
                        System.out.println("Continuando... \n");
                        delayRapido(2);
                        certo3 = false;
                        break;
                }
            } else if (resp3.equalsIgnoreCase("N")) {
                switch (resp3) {
                    case "N":
                    case "n":
                        String tabela1
                                = "      Representação de números Binários."
                                + "\n---------------------------------------------\n"
                                + "| Decimal |  BINÁRIO  | Decimal |  BINÁRIO  |\n"
                                + "|--------------------------------------------\n"
                                + "|    1    |    0001   |    10   |    1010   |\n"
                                + "|--------------------------------------------\n"
                                + "|    2    |    0010   |    11   |    1011   |\n"
                                + "|--------------------------------------------\n"
                                + "|    3    |    0011   |    12   |    1100   |\n"
                                + "|--------------------------------------------\n"
                                + "|    4    |    0100   |    13   |    1101   |\n"
                                + "|--------------------------------------------\n"
                                + "|    5    |    0101   |    14   |    1110   |\n"
                                + "|--------------------------------------------\n"
                                + "|    6    |    0110   |    15   |    1111   |\n"
                                + "|--------------------------------------------\n"
                                + "|    7    |    0111   |    16   |    10000  |\n"
                                + "|--------------------------------------------\n"
                                + "|    8    |    1000   |    17   |    10001  |\n"
                                + "|--------------------------------------------\n"
                                + "|    9    |    1001   |    18   |    10010  |\n"
                                + "|--------------------------------------------\n"
                                + "Nesta tabela, vemos os números de 1 a 18 escritos na forma decimal e na forma binária.";

                                delayLento(1);
                        System.out.println(tabela1);

                        certo3 = false;
                        break;
                    default:
                        System.out.println("Opção inválida \n");
                        break;
                }
            }
        } while (certo3);

        delayRapido(2);
        System.out.println("\n> Conversão de binário para decimal \n"
                + "Cada posição tem um peso de uma potência de 2 (base do sistema binário). Sendo assim,\n"
                + "para se converter um número de binário para decimal, deve-se multiplicar cada bit pela\n"
                + "potência de sua posição e somar os resultados.\n");

        boolean certo4 = true;

        do {
            System.out.println("Sabe qual é a base do sistema Binário ?");
            System.out.println("[Y / N]");
            String resp4 = input.next();

            if (resp4.equalsIgnoreCase("Y")) {
                switch (resp4) {
                    case "Y":
                    case "y":
                        System.out.println("Continuando... \n");
                        delayRapido(2);
                        certo4 = false;
                        break;
                }
            } else if (resp4.equalsIgnoreCase("N")) {
                switch (resp4) {
                    case "N":
                    case "n":
                        String tabela2
                                = "Representação da tabela da base de sistemas binários:"
                                + "\n|----------------------------------------------------|\n"
                                + "|  128  |  64  |  32  |  16  |  8  |  4  |  2  |  1  |\n"
                                + "|----------------------------------------------------|\n"
                                + "\nVamos a um exemplo: convertendo o número 206 do sistema Decimal para Binário"
                                + "\n|----------------------------------------------------|\n"
                                + "|  128  |  64  |  32  |  16  |  8  |  4  |  2  |  1  |\n"
                                + "|----------------------------------------------------|\n"
                                + "|   1   |   1  |   0  |   0  |  1  |  1  |  1  |  0  |\n"
                                + "|----------------------------------------------------|\n"
                                + "somando: 128 + 64 + 8 + 4 + 2 = 206 \n";

                                delayLento(1);
                        System.out.println(tabela2);

                        certo4 = false;
                        break;
                    default:
                        System.out.println("Opção Inválida! \n");
                        System.out.println("");
                        break;
                }
            }
        } while (certo4);
        // FIM

        boolean continuar = true;

        do {
            System.out.println("\n Podemos continuar ? \n");
            System.out.println("[Y / N]");
            String cont = input.next();

            if (cont.equalsIgnoreCase("Y")) {
                switch (cont) {
                    case "Y":
                    case "y":
                        System.out.println("Continuando... \n");
                        delayRapido(2);
                        continuar = false;
                        break;
                }
            } else if (cont.equalsIgnoreCase("N")) {
                switch (cont) {
                    case "N":
                    case "n":
                        System.out.println("Ok, vou dar-lhe um tempo para reler!");
                        delayRapido(2);
                        break;

                    default:
                        System.out.println("Opção inválida! \n");
                        break;
                }

            }
        } while (continuar);

        System.out.println("\n> Conversão de decimal para binário.  \n"
                + "Para realizar a conversão de decimal para binário, realiza-se a divisão\n"
                + "sucessiva por 2 (base do sistema binário). O resultado da conversão será\n"
                + "dado pelo último quociente e o agrupamento dos restos de divisão será o "
                + "número binário.\n"
                + "Essa conversão foi demonstrada no exemplo acima 'Sabe qual é a base do sistema Binário'.\n");

        boolean certo5 = true;

        do {
            System.out.println("\n Está entendendo até aqui? \n");
            System.out.println("[Y / N]");
            String resp5 = input.next();

            if (resp5.equalsIgnoreCase("Y")) {
                switch (resp5) {
                    case "Y":
                    case "y":
                        System.out.println("Vamos ver... \n");
                        delayRapido(2);
                        certo5 = false;
                        break;
                }
            } else if (resp5.equalsIgnoreCase("N")) {
                switch (resp5) {
                    case "N":
                    case "n":
                        System.out.println("Ok, vou dar-lhe um tempo para reler! \n");
                        delayRapido(2);
                        break;

                    default:
                        System.out.println("Opção inválida! \n");
                        break;
                }

            }
        } while (certo5);

        // Perguntas dissertativas com 3 chances de acerto, caso erre todas o jogo reinicia 
        // As alternativas vão se embaralhando caso o jogador erre
        //INÍCIO
        boolean certo6 = true;
        int limite = 3;

        // Código que é responsável por embaralhar as alternativas
        ArrayList<String> respostas = new ArrayList<String>();
        respostas.add("[A] 11111011100.");
        respostas.add("[B] 110111.");
        respostas.add("[C] 111110111000.");
        respostas.add("[D] 111110111.");

        System.out.println("\n> Os computadores utilizam o sistema binário ou de base 2 que é um sistema de");
        System.out.println("numeração em que todas as quantidades se representam com base em dois números,");
        System.out.println("ou seja, (0 e 1).\n(?) > Em um computador o número 2012, em base decimal, será representado, em base binária, por:\n");

        do {

            System.out.println("");
            System.out.println("(!) > Você tera " + limite + " chances");

            System.out.println("\n Escolha a alternativa correta! \n ");
            for (String resp6 : respostas) {
                System.out.println(resp6);
            }
            String resp6 = input.next();
            Collections.shuffle(respostas);

            switch (resp6) {
                case "A":
                case "a":
                    System.out.println("\n Alternativa [" + resp6 + "] está correta! \n ");
                    certo6 = false;
                    break;
                case "B":
                case "b":
                case "C":
                case "c":
                case "D":
                case "d":
                    System.out.println("\n Alternativa está incorreta! \n");
                    limite--;

                    break;
                default:
                    System.out.println("Opção inválida! \n");
                    break;
            }
            if (certo6 && limite == 0) {
                System.out.println("");
                System.out.println("Resposta incorreta nas 3 tentativas! \n");
                System.out.println("Tente novamente.! \n");
                break;
            }

        } while (certo6 && limite > 0);
        if (!certo6) {  // Código onde não deixa o jogador avançar para a próxima perguinta caso ele erre as 3 chances

            boolean certo7 = true;
            int limite1 = 3;

            // Código que é responsável por embaralhar as alternativas
            ArrayList<String> respostas1 = new ArrayList<String>();
            respostas1.add("[A] 5.");
            respostas1.add("[B] 8.");
            respostas1.add("[C] 10.");
            respostas1.add("[D] 12.");

            System.out.println("\n(?) > Qual é o valor em decimal do número binário 1010?\n");

            do {
                System.out.println("\n(!) > Você tera " + limite1 + " chances");
                System.out.println("\n Escolha a alternativa correta! \n");
                for (String resp7 : respostas1) {
                    System.out.println(resp7);
                }
                String resp7 = input.next();
                Collections.shuffle(respostas1);

                switch (resp7) {
                    case "C":
                    case "c":
                        System.out.println("Alternativa [" + resp7 + "] está correta! \n");
                        certo7 = false;
                        break;
                    case "A":
                    case "a":
                    case "B":
                    case "b":
                    case "D":
                    case "d":
                        System.out.println("Alternativa [" + resp7 + "]está incorreta! \n");
                        limite1--;
                        break;
                    default:
                        System.out.println("Opção inválida! \n");
                        System.out.println("");
                        break;
                }
                if (certo7 && limite1 == 0) {
                    System.out.println("");
                    System.out.println("Resposta incorreta nas 3 tentativas! \n");
                    System.out.println("");
                    System.out.println("Tente novamente. \n");
                    break;
                }
            } while (certo7 && limite1 > 0);
            // Fim das perguntas 

            if (!certo7) {     // Código onde não deixa o jogador avançar para a próxima perguinta caso ele erre as 3 chances
                System.out.println("\nMuito bem!\n");

                delayRapido(2);
                System.out.println("> Em resumo, os conceitos binários na computação são essenciais para entender como os \n"
                        + "computadores armazenam, processam e transmitem informações usando apenas dois estados \n"
                        + "distintos: 0 e 1. Essa simplicidade subjacente é o que permite a complexidade e versatilidade dos \n"
                        + "sistemas computacionais modernos.\n");

                boolean certo8 = true;

                do {
                    System.out.println("\nPodemos continuar?\n");
                    System.out.println("[Y / N]");
                    String resp8 = input.next();

                    if (resp8.equalsIgnoreCase("Y")) {
                        switch (resp8) {
                            case "Y":
                            case "y":
                                System.out.println("Continuando... \n");
                                delayRapido(2);
                                certo8 = false;
                                break;
                        }
                    } else if (resp8.equalsIgnoreCase("N")) {
                        switch (resp8) {
                            case "N":
                            case "n":
                                System.out.println("Ok, vou dar-lhe um tempo para reler!");
                                delayRapido(2);
                                break;

                            default:
                                System.out.println("Opção inválida! \n");
                                break;
                        }

                    }
                } while (certo8);

                System.out.println("> Jovem " + nomePlayer + ", na tela atrás de você tem mais um pouco sobre Binários,");
                System.out.println("vá até lá e veja as informações!");

                boolean certo9 = true;
                do {
                    System.out.println("\n Aperte [Y] para ir pra tela com mais informações. \n");
                    String resp9 = input.next();

                    switch (resp9) {
                        case "Y":
                        case "y":

                String tela1
                        = "\n Os sistemas binários são a base fundamental de toda a computação moderna. Eles constituem a\n"
                        + "linguagem básica que os computadores entendem e com a qual operam. Aqui está mais sobre os \n"
                        + "sistemas binários: \n";
                String tela1A        
                        = "\nBase 2:\n"
                        + "O sistema binário é um sistema de numeração posicional que utiliza apenas dois símbolos: 0 e 1.\n"
                        + "Cada dígito em um número binário é chamado de bit (abreviação de binary digit).\n";
                String tela1B
                        = "Base 2:O bit mais à direita em um número binário representa 2^0, o próximo representa 2^1,\n"
                        + "o seguinte 2^2, e assim por diante, cada posição representando uma potência de 2.\n";
                String tela1C
                        = "\nRepresentação de Dados:\n"
                        + "No nível mais fundamental, todos os dados em um computador são representados usando \n"
                        + "sequências de 0s e 1s.\n"
                        + "Cada caractere, número, imagem, som ou qualquer outra forma de dados é representado por \n"
                        + "uma combinação de bits.\n"
                        + "Por exemplo, um caractere ASCII é representado por 8 bits (um byte), permitindo a representação "
                        + "de 256 caracteres diferentes.\n\n";
                String tela1D
                        = "--------------------"
                        + "|  Voz Misteriosa  |"
                        + "--------------------\n"
                        + "\nVá para a tela ao lado, para continuar com as explicações.";
                
                        delayRapido(2);   
                System.out.println(tela1);
                delayLento(2);
                System.out.println(tela1A);
                delayLento(2);
                System.out.println(tela1B);
                delayLento(2);
                System.out.println(tela1C);
                delayRapido(2);
                System.out.println(tela1D);
                delayLento(2);

                            System.out.println(tela1);

                            certo9 = false;
                            break;
                        default:
                            System.out.println("Opção inválida! \n");
                            break;
                    }

                } while (certo9);

                boolean certo10 = true;
                do {
                    System.out.println("");
                    System.out.println("Aperte [Y] para ir a tela ao lado ");
                    delayRapido(2);
                    String resp10 = input.next();

                    switch (resp10) {
                        case "Y":
                        case "y":
                        String tela2
                        = "\nOperações Binárias:\n"
                        + "Os sistemas binários suportam várias operações, como adição, subtração, multiplicação e \n"
                        + "divisão, todas baseadas em regras específicas para manipular bits.\n"
                        + "Operações lógicas, como AND, OR e XOR, são frequentemente usadas em programação e \n"
                        + "circuitos digitais para manipular dados binários.\n";
               String tela2A
                        = "\nArmazenamento e Transmissão de Dados:\n"
                        + "A memória de um computador armazena dados na forma binária, com cada bit sendo\n"
                        + "armazenado eletronicamente como uma carga elétrica ou a falta dela.\n"
                        + "Os dispositivos de armazenamento de dados, como discos rígidos e unidades flash, armazenam \n"
                        + "dados binários em padrões magnéticos ou elétricos.\n"
                        + "Os dados também são transmitidos entre dispositivos em forma binária, usando sinais elétricos  \n"
                        + "ou ópticos.\n";
               String tela2B
                        = "\nConversão de Bases:\n"
                        + "É comum converter entre sistemas de numeração, como binário para decimal, decimal para  \n"
                        + "binário e assim por diante, dependendo dos requisitos do sistema ou aplicação.\n"
                        + "Ferramentas e linguagens de programação oferecem funções embutidas para facilitar essas \n"
                        + "conversões quando necessário.\n";
               String tela2C
                        = "\nCircuitos Digitais:\n"
                        + "Os circuitos digitais, que são a base dos componentes eletrônicos em um computador, operam \n"
                        + "com base em sinais binários.\n"
                        + "Portas lógicas, como AND, OR e NOT, são componentes fundamentais dos circuitos digitais e são \n"
                        + "usadas para realizar operações lógicas em dados binários.\n";
               
                delayRapido(2);
                System.out.println(tela2);
                delayLento(2);
                System.out.println(tela2A);
                delayLento(2);
                System.out.println(tela2B);
                delayLento(2);
                System.out.println(tela2C);
                delayLento(2);

                            certo10 = false;
                            break;
                        default:
                            System.out.println("Opção inválida! \n");
                            break;
                    }
                } while (certo10);

                System.out.println("\nApós verificar o que as telas estavam explicando, a voz misteriosa "
                        + "surge mais uma vez.\n"
                        + "\n--------------------"
                        + "|  Voz Misteriosa  |"
                        + "--------------------\n"
                        + "\nMuito bem, responda corretamente e avance para a sua primeira missão");

                // Perguntas dissertativas com 3 chances de acerto, caso erre todas o jogo reinicia 
                // As alternativas vão se embaralhando caso o jogador erre
                //INÍCIO                            
                int limite2 = 3;
                boolean certo11 = true;

                // Código que é responsável por embaralhar as alternativas
                ArrayList<String> respostas2 = new ArrayList<String>();
                respostas2.add("[A] 1001");
                respostas2.add("[B] 1010");
                respostas2.add("[C] 0111");
                respostas2.add("[D] 1110");

                System.out.println("\n(?) > Qual é o valor em binário do número decimal 7?\n");
                do {
                    System.out.println("(!) > Você terá " + limite2 + " chances");
                    System.out.println("\n Escolha a alternativa correta! \n ");

                    for (String resp11 : respostas2) {
                        System.out.println(resp11);
                    }
                    String resp11 = input.next();
                    Collections.shuffle(respostas2);

                    switch (resp11) {
                        case "C":
                        case "c":
                            System.out.println("Alternativa [" + resp11 + "] está correta! \n");
                            certo11 = false;
                            break;
                        case "A":
                        case "a":
                        case "B":
                        case "b":
                        case "D":
                        case "d":
                            System.out.println("Alternativa [" + resp11 + "] está incorreta! \n");
                            limite2--;
                            break;
                        default:
                            System.out.println("Opção inválida! \n");
                            break;
                    }

                    if (certo11 && limite2 == 0) {
                        System.out.println("Resposta incorreta nas 3 tentativas! \n");
                        System.out.println("Tente novamente. \n");
                        break;
                    }
                } while (certo11 && limite2 > 0);
                if (!certo11) {

                    int limite3 = 3;
                    boolean certo12 = true;

                    // Código que é responsável por embaralhar as alternativas
                    ArrayList<String> respostas3 = new ArrayList<String>();
                    respostas3.add("[A] O valor mais alto.");
                    respostas3.add("[B] O valor mais baixo.");
                    respostas3.add("[C] A quantidade de bits no número.");
                    respostas3.add("[D] O número de dígitos binários.");

                    System.out.println("\n(?) > O que representa o bit mais significativo em um número binário?\n");

                    do {
                        System.out.println("(!) > Você terá " + limite3 + " chances!");
                        System.out.println("\n Escolha a alternativa correta! \n ");

                        for (String resp12 : respostas3) {
                            System.out.println(resp12);
                        }
                        String resp12 = input.next();
                        Collections.shuffle(respostas3);

                        switch (resp12) {
                            case "A":
                            case "a":
                                System.out.println("Alternativa [ " + resp12 + " ] está correta! \n");
                                certo12 = false;
                                break;
                            case "B":
                            case "b":
                            case "C":
                            case "c":
                            case "D":
                            case "d":
                                System.out.println("Alternativa [ " + resp12 + " ] está incorreta! \n");
                                limite3--;
                                break;
                            default:
                                System.out.println("Opção inválida! \n");
                                break;
                        }

                        if (certo12 && limite3 == 0) {
                            System.out.println("");
                            System.out.println("Resposta incorreta nas 3 tentativas! \n");
                            System.out.println("");
                            System.out.println("Tente novamente. \n");
                            break;
                        }
                    } while (certo12 && limite3 > 0);
                    if (!certo12) {
                        int limite4 = 3;
                        boolean certo13 = true;

                        // Código que é responsável por embaralhar as alternativas
                        ArrayList<String> respostas4 = new ArrayList<String>();
                        respostas4.add("[A] OR.");
                        respostas4.add("[B] AND.");
                        respostas4.add("[C] XOR.");
                        respostas4.add("[D] NOT.");

                        System.out.println("\n(?) > Qual operação binária resulta em 1 quando ambos os operandos são 1 e em 0 caso contrário?\n");

                        do {
                            System.out.println("(!) > Você tera " + limite4 + " chances");
                            System.out.println("\n Escolha a alternativa correta! \n ");

                            for (String resp13 : respostas4) {
                                System.out.println(resp13);
                            }
                            String resp13 = input.next();
                            Collections.shuffle(respostas4);

                            switch (resp13) {

                                case "B":
                                case "b":
                                    System.out.println("Alternativa [" + resp13 + "] está correta! \n");
                                    certo13 = false;
                                    break;
                                case "A":
                                case "a":
                                case "C":
                                case "c":
                                case "D":
                                case "d":
                                    System.out.println("Alternativa está incorreta! \n");
                                    limite4--;
                                    break;
                                default:
                                    System.out.println("Opção inválida! \n");
                                    break;
                            }

                            if (certo13 && limite4 == 0) {
                                System.out.println("");
                                System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                System.out.println("");
                                System.out.println("Tente novamente. \n");
                                break;
                            }
                        } while (certo13 && limite4 > 0);
                        if (!certo13) {
                            int limite5 = 3;
                            boolean certo14 = true;

                            // Código que é responsável por embaralhar as alternativas
                            ArrayList<String> respostas5 = new ArrayList<String>();
                            respostas5.add("[A] Base-8");
                            respostas5.add("[B] Base-10.");
                            respostas5.add("[C] Base-2.");
                            respostas5.add("[D] Base-16.");

                            System.out.println("\n(?) > Qual é o sistema de numeração utilizado pelo sistema binário?\n");

                            do {
                                System.out.println("(!) > Você tera " + limite5 + " chances");
                                System.out.println("\n Escolha a alternativa correta! \n ");

                                for (String resp14 : respostas5) {
                                    System.out.println(resp14);
                                }
                                String resp14 = input.next();
                                Collections.shuffle(respostas5);

                                switch (resp14) {
                                    case "C":
                                    case "c":
                                        System.out.println("Alternativa [ " + resp14 + " ] está correta! \n");
                                        certo14 = false;
                                        break;
                                    case "A":
                                    case "a":
                                    case "B":
                                    case "b":
                                    case "D":
                                    case "d":
                                        System.out.println("Alternativa [ " + resp14 + " ] está incorreta! \n");
                                        limite5--;
                                        break;
                                    default:
                                        System.out.println("Opção inválida! \n");
                                        break;
                                }

                                if (certo14 && limite5 == 0) {
                                    System.out.println("");
                                    System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                    System.out.println("");
                                    System.out.println("Tente novamente. \n");
                                    break;
                                }
                            } while (certo14 && limite5 > 0);
                            // Fim das perguntas 

                            if (!certo14) {
                                System.out.println("\n> MUITO BEM...\n");
                                delayRapido(2);
                                System.out.println(
                                        "A medida que sua jornada avança, você é confrontado com dilemas éticos e complexos. Você \n"
                                        + "se vê diante da responsabilidade de usar os Conceitos de Computação não apenas para resolver problemas,\n"
                                        + "mas também para promover o bem-estar da sociedade. Suas escolhas moldarão o curso da história e definirão\n"
                                        + "o seu destino.\n"
                                        + "\nCom isso Pixel se aproxima de você e te fala sobre a atual situação de NeoByte com baseado em dados que ele\n"
                                        + "conseguiu sobre a cidade.");
                                delayRapido(2);

                                boolean certo15 = true;

                                do {
                                    System.out.println("\n Aperte [Y] para escutar Pixel \n");
                                    delayRapido(2);
                                    String resp15 = input.next();

                                    switch (resp15) {
                                        case "Y":
                                        case "y":
                                            System.out.println("\n---------\n"
                                                    + "| Pixel |\n"
                                                    + "---------\n"
                                                    + "> A cidade de NeoByte está mergulhada no caos. Um mestre da escuridão digital, conhecido apenas como ZERO, manipula os \n"
                                                    + "sistemas da cidade para impor seu dominio sobre os cidadãos, espalhando medo e desespero por onde passa.\n"
                                                    + "> E você " + nomePlayer + ", um(a) jovem hacker corajoso(a) e destemido(a), recebeu secretamente um convite de um grupo de hackers\n"
                                                    + "conhecidos como 'Anonymous' e é chamado para uma missão de proporções épicas: derrotar a poderosa organização conhecida como\n"
                                                    + "'Evil Corp'. Essa organização sinistra, liderada pelo misterioso ZERO, controla os sistemas essenciais \n"
                                                    + "da cidade, manipulando a informação para servir seus próprios interesses obscuros.\n");
                                                    delayRapido(2);

                                            certo15 = false;
                                            break;
                                        default:
                                            System.out.println("Opção inválida! \n");
                                            break;
                                    }
                                } while (certo15);

                                boolean certo16 = true;

                                do {
                                    System.out.println("");
                                    System.out.println("\n Aperte [Y] para ver o convite do grupo Hacker ' Anonymous ' \n");
                                    System.out.println("");
                                    String resp16 = input.next();

                                    switch (resp16) {
                                        case "Y":
                                        case "y":
                                        delayRapido(2);
                                            System.out.println("\u001B[32m" + "@@@@@@   @@@  @@@   @@@@@@   @@@  @@@  @@@ @@@  @@@@@@@@@@    @@@@@@   @@@  @@@   @@@@@@");
                                            System.out.println("\u001B[32m" + "@@@@@@@@  @@@@ @@@  @@@@@@@@  @@@@ @@@  @@@ @@@  @@@@@@@@@@@  @@@@@@@@  @@@  @@@  @@@@@@@");
                                            System.out.println("\u001B[32m" + "@@!  @@@  @@!@!@@@  @@!  @@@  @@!@!@@@  @@! !@@  @@! @@! @@!  @@!  @@@  @@!  @@@  !@@");
                                            System.out.println("\u001B[32m" + "!@!  @!@  !@!!@!@!  !@!  @!@  !@!!@!@!  !@! @!!  !@! !@! !@!  !@!  @!@  !@!  @!@  !@!");
                                            System.out.println("\u001B[32m" + "@!@!@!@!  @!@ !!@!  @!@  !@!  @!@ !!@!   !@!@!   @!! !!@ @!@  @!@  !@!  @!@  !@!  !!@@!!");
                                            System.out.println("\u001B[32m" + "!!!@!!!!  !@!  !!!  !@!  !!!  !@!  !!!    @!!!   !@!   ! !@!  !@!  !!!  !@!  !!!   !!@!!!");
                                            System.out.println("\u001B[32m" + "!!:  !!!  !!:  !!!  !!:  !!!  !!:  !!!    !!:    !!:     !!:  !!:  !!!  !!:  !!!       !:!");
                                            System.out.println("\u001B[32m" + ":!:  !:!  :!:  !:!  :!:  !:!  :!:  !:!    :!:    :!:     :!:  :!:  !:!  :!:  !:!      !:!");
                                            System.out.println("\u001B[32m" + "::   :::   ::   ::  ::::: ::   ::   ::     ::    :::     ::   ::::: ::  ::::: ::  :::: ::");
                                            System.out.println("\u001B[32m" + ":   : :  ::    :    : :  :   ::    :      :      :      :     : :  :    : :  :   :: : : ");
                                            System.out.print("\u001B[0m");
                                            delayLento(1);
                                            String cartaAnonymous
                                                    = "\nPrezado(a) " + nomePlayer + ".\n"
                                                    + "\n</> O Anonymous é uma comunidade de hackers comprometidos com a liberdade, justiça e transparência.\n"
                                                    + "Nossa missão é utilizar nossas habilidades técnicas para promover mudanças positivas no mundo, \n"
                                                    + "combatendo a corrupção, a censura e a opressão que a 'Evil Corp' está espalhando pela cidade\n"
                                                    + "de NeoByte.\n"
                                                    + "Acreditamos no poder da união e colaboração para fazer a diferença. \n"
                                                    + "Juntos, podemos realizar grandes feitos e impactar positivamente a sociedade. \n"
                                                    + "Isto é um convite para fazer parte de um grupo muito especial. </> \n"
                                                    + "\n Aguardamos sua resposta! ";
                                                    delayRapido(1);
                                            System.out.println(cartaAnonymous);

                                            certo16 = false;
                                            break;
                                        default:
                                            System.out.println("Opção inválida! \n");
                                            break;
                                    }
                                } while (certo16);

                                boolean certo17 = true;

                                do {
                                    System.out.println("\n Aperte [Y] para aceitar o convite do ' Anonymous '. \n");
                                    String resp17 = input.next();

                                    switch (resp17) {
                                        case "Y":
                                        case "y":
                                        delayRapido(2);
                                            System.out.println((nomePlayer) + " > Uau, eu não esperava receber um convite como esse!\n"
                                                    + "Definitivamente, estou interessado em ajudar, acredito firmemente nos valores de liberdade, justiça e transparência. \n"
                                                    + "E estou pronto para acabar com a 'Evil Corp' de uma vez por todas.\n");

                                                    delayLento(1);        
                                            System.out.println("-------------\n"
                                                    + "|   PIXEL   |\n"
                                                    + "-------------\n"
                                                    + "> O grupo Anonymous me mandou uma informação de uma possivel localização da casa de um dos \n"
                                                    + "capangas que trabalham na Evil Corp.\n"
                                                    + "> Vamos até lá para ver se conseguimos algumas informações e tirar proveito disso.\n"
                                                    + "Vamos nessa.");

                                            certo17 = false;
                                            break;
                                        default:
                                            System.out.println("Opção inválida! \n");
                                            break;
                                    }
                                } while (certo17);

                                boolean certo18 = true;

                                do {
                                    System.out.println("\n Aperte [Y] para seguir Pixel. \n");
                                    delayRapido(2);
                                    String resp18 = input.next();

                                    switch (resp18) {
                                        case "Y":
                                        case "y":
                                            System.out.println("\n Você se aventura pelas ruas noturnas rumo ao coração da cidade, onde erguem-se os imponentes arranha-céus luxuosos \n"
                                                    + "lar dos magnatas, diferente de tudo que já viu, e percebendo a diferença do subúrbio para essa realidade  \n"
                                                    + "onde aqui os privilegiados desfrutam de jardins exuberantes, piscinas reluzentes e segurança privada, isolados das realidades\n"
                                                    + "menos encantadoras da cidade, onde o pobre vive dos restos de comida dos mais ricos. \n"
                                                    + "Você se dirige à localização indicada pelos 'Anonymous' e finalmente chegam à residência mencionada. Diante da fechadura elétrica  \n"
                                                    + "que bloqueia sua entrada, então você se prepara para enfrentar seu primeiro desafio: hackear o sistema e descobrir a senha que \n"
                                                    + "abrirá as portas para o desconhecido.\n");
                                                    delayRapido(3);
                                            System.out.println("Com habilidade e precisão, você mergulha nos circuitos digitais da fechadura, desvendando suas defesas com \n"
                                                    + "cada linha de código. Pixel observa atentamente, oferecendo sugestões e insights valiosos à medida que trabalham juntos "
                                                    + "para superar o obstáculo diante deles.");
                                            certo18 = false;
                                            break;
                                        default:
                                            System.out.println("Opção inválida! \n");
                                            break;
                                    }

                                } while (certo18);

                                boolean certo19 = true;

                                do {
                                    System.out.println("\n Aperte [Y] para invadir o sistema da fechadura elétrica. \n");
                                    String resp19 = input.next();

                                    switch (resp19) {
                                        case "Y":
                                        case "y":
                                        delayRapido(2);
                                            System.out.println("Invadindo... \n"
                                                    + "Suponha que a fechadura da porta tenha uma senha de 4 dígitos e você escreveu um programa que  \n"
                                                    + "teste todas as combinações possíveis de 4 dígitos para abrir a fechadura, com isso você usa o ataque de força bruta "
                                                    + "e consegue descobrir quais os digitos, que são: [ 2403 ]. \n"
                                                    + "Mas tem um problema, o verdadeiro código da fechadura está em binários, então vai ter que converter o valor decimal [ 2403 ] \n"
                                                    + "para Binário.");
                                            certo19 = false;
                                            break;
                                        default:
                                            System.out.println("Opção inválida! \n");
                                            break;
                                    }
                                } while (certo19);

                                boolean certo20 = false;

                                do {
                                    System.out.println("\n Vai precisar da ajuda de uma tabela ? \n");
                                    System.out.println("[Y / N]");
                                    String resp20 = input.next();
                                
                                    if (resp20.equalsIgnoreCase("Y")) {
                                        switch (resp20) {
                                            case "Y":
                                            case "y":
                                                delayRapido(2);
                                                String tabela5 = "\n Representação da tabela da base de sistemas binários: \n"
                                                                + "|-----------------------------------------------------------------------------------------------|\n"
                                                                + "|  4096  |  2048  |  1024  |  512  |  256  |  128  |  64  |  32  |  16  |  8  |  4  |  2  |  1  |\n"
                                                                + "|-----------------------------------------------------------------------------------------------|\n";
                                                System.out.println(tabela5);
                                                certo20 = true; // Saída do laço de repetição após imprimir a tabela
                                                break;
                                        }
                                    } else if (resp20.equalsIgnoreCase("N")) {
                                        switch (resp20) {
                                            case "N":
                                            case "n":
                                                System.out.println("Continuando... \n");
                                                certo20 = true; // Saída do laço de repetição após confirmar que não vai precisar da tabela
                                                break;
                                        }
                                    } else {
                                        System.out.println("Opção Inválida! \n"); // Mensagem de erro e o laço continua
                                    }
                                
                                } while (!certo20); // Continua no laço até que uma resposta seja dada pelo usuário

                                int limite6 = 3;
                                boolean certo21 = true;

                                // Código que é responsável por embaralhar as alternativas
                                ArrayList<String> respostas6 = new ArrayList<String>();
                                respostas6.add("[A] 100100101");
                                respostas6.add("[B] 000111011101");
                                respostas6.add("[C] 110100111010");
                                respostas6.add("[D] 100101100011");

                                System.out.println("\n (?) > Qual seria o número decimal 2403 convertido em binário ? \n");

                                do {
                                    System.out.println("(!) > Você tera " + limite6 + " chances");
                                    System.out.println("\n Escolha a alternativa correta! \n ");

                                    for (String resp21 : respostas6) {
                                        System.out.println(resp21);
                                    }
                                    String resp21 = input.next();
                                    Collections.shuffle(respostas6);

                                    switch (resp21) {
                                        case "D":
                                        case "d":
                                            System.out.println("Alternativa [ " + resp21 + " ] está correta! \n");
                                            certo21 = false;
                                            break;
                                        case "A":
                                        case "a":
                                        case "B":
                                        case "b":
                                        case "C":
                                        case "c":
                                            System.out.println("Alternativa [ " + resp21 + " ] está incorreta! \n");
                                            limite6--;
                                            break;
                                        default:
                                            System.out.println("Opção inválida! \n");
                                            break;
                                    }
                                    if (certo21 && limite6 == 0) {
                                        System.out.println("");
                                        System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                        System.out.println("");
                                        System.out.println("Tente novamente. \n");
                                        break;
                                    }
                                } while (certo21 && limite6 > 0);

                                if (!certo21) {
                                    delayRapido(2);
                                    System.out.println("A fechadura cede e as portas se abrem, revelando um interior escuro e misterioso. \n"
                                            + "No interior da residência, você e Pixel sai procurando por documentos ou evidências perturbadoras \n"
                                            + "da influência da Evil Corp. \n");

                                    boolean certo22 = true;

                                    do {
                                        System.out.println("\n Aperte [Y] para procurar provas na residencia. \n ");
                                        delayRapido(2);
                                        String resp22 = input.next();

                                        switch (resp22) {
                                            case "Y":
                                            case "y":
                                                System.out.println("Procurar em:");
                                                certo22 = false;
                                                break;
                                            default:
                                                System.out.println("Opção inválida! \n");
                                                break;
                                        }
                                    } while (certo22);

                                    int limite7 = 5;
                                    boolean certo23 = true;

                                    do {
                                        System.out.println(
                                                "\n[A] Sala. \n"
                                                + "[B] Cozinha. \n"
                                                + "[C] Banheiro. \n"
                                                + "[D] Quarto. \n"
                                                + "[E] Escritório. \n");
                                        System.out.println("(!) > Você tera " + limite7 + " chances");
                                        System.out.println("\n Escolha um lugar! \n ");
                                        String resp23 = input.next();

                                        switch (resp23) {
                                            case "B":
                                            case "b":
                                            delayRapido(1);
                                                System.out.println("[" + resp23 + "]" + " (!) > Você se depara com uma porta meio escondida \n"
                                                        + "e quando a abre, depara-se com uma escada que dá acesso a um porão escuro. Lá, vocês  \n"
                                                        + "encontram evidências perturbadoras da influência da Evil Corp: documentos confidenciais, registros  \n"
                                                        + "de transações suspeitas e dados comprometedores. Tudo revela a extensão do controle da organização sobre a cidade. \n");
                                                certo23 = false;
                                                break;
                                            case "A":
                                            case "a":
                                            delayRapido(1);
                                                System.out.println("[" + resp23 + "]" + " (!) > " + nomePlayer + ", seus esforços revelam apenas o vazio. Mas lembre-se, cada busca é uma lição, cada desafio é uma oportunidade. Continue explorando, pois a fortuna espera pelos corajosos!");
                                                limite7--;
                                                break;
                                            case "C":
                                            case "c":
                                            delayRapido(1);
                                                System.out.println("[" + resp23 + "]" + " (!) > O local permanece imperturbável diante de sua busca incansável. Mas não se deixe deter, pois cada tentativa é um passo mais próximo da verdade. Siga em frente, a aventura aguarda!");
                                                limite7--;
                                                break;
                                            case "D":
                                            case "d":
                                            delayRapido(1);
                                                System.out.println("[" + resp23 + "]" + " (!) > Nada além do eco dos passos ressoa neste lugar. A jornada é árdua, mas a recompensa aguarda além do horizonte. Continue sua busca destemida!");
                                                limite7--;
                                                break;
                                            case "E":
                                            case "e":
                                            delayRapido(1);
                                                System.out.println("[" + resp23 + "]" + "(!) > Apesar da busca meticulosa, o local guarda seus segredos com firmeza. Não desista, pois a verdadeira aventura está prestes a começar!\n");
                                                limite7--;
                                                break;
                                            default:
                                                System.out.println("Opção inválida! \n");
                                                break;
                                        }
                                        if (certo23 && limite7 == 0) {
                                            System.out.println("");
                                            System.out.println("Resposta incorreta nas 5 tentativas! \n");
                                            System.out.println("");
                                            System.out.println("Tente novamente. \n");
                                            break;
                                        }
                                    } while (certo23 && limite7 > 0);
                                    if (!certo23) {
                                        delayRapido(2);
                                        System.out.println("Determinados a expor a verdade por trás das sombras, " + nomePlayer + " e Pixel coletam o máximo de informações possível, \n"
                                                + "preparando-se para revelar seus achados aos Anonymous e iniciar a próxima fase de sua missão.\n"
                                                + "Assim que vc envia os documentos para os Anonymous, você sai da residência, e espera um retorno indicando qual o próximo passo.\n"
                                                + "Após a analise dos documentos enviados, de imediato os Anonymous retorna com informações sobre algumas mensagens codificadas de uma fonte desconhecida \n"
                                                + "ligando diretamente o envolvimento de Zero com a Evil Corp. Sua missão é decifrar essas mensagens para descobrir a localização de um arquivo, \n "
                                                + "terá que usar suas habilidades de conversão entre sistemas numéricos para traduzir o código binário em texto legível e encontrar a pista.\n");

                                        boolean certo24 = true;

                                        do {
                                            System.out.println("\n Aperte [Y] para descriptografar as mensagens. \n");
                                            String resp24 = input.next();

                                            switch (resp24) {
                                                case "Y":
                                                case "y":
                                                    System.out.println("Descriptografando...");
                                                    delayLento(1);
                                                    certo24 = false;
                                                    break;
                                                default:
                                                    System.out.println("Opção inválida! \n");
                                                    break;
                                            }
                                        } while (certo24);

                                        int limite8 = 3;
                                        boolean certo25 = true;

                                        // Código que é responsável por embaralhar as alternativas
                                        ArrayList<String> respostas7 = new ArrayList<String>();
                                        respostas7.add("[A] Conversão de binário para hexadecimal.");
                                        respostas7.add("[B] Conversão de binário para texto legível.");
                                        respostas7.add("[C] Conversão de binário para octal.");
                                        respostas7.add("[D] Conversão de binário para decimal.");

                                        System.out.println("\n (?) > Qual é o processo usado por " + nomePlayer + " para decifrar as mensagens codificadas em binário? \n");

                                        do {
                                            System.out.println("(!) > Você tera " + limite8 + " chances");
                                            System.out.println("\n Escolha a alternativa correta! \n ");
                                            for (String resp25 : respostas7) {
                                                System.out.println(resp25);
                                            }
                                            String resp25 = input.next();
                                            Collections.shuffle(respostas7);

                                            switch (resp25) {
                                                case "B":
                                                case "b":
                                                    System.out.println("Alternativa [ " + resp25 + " ] está correta! \n");
                                                    certo25 = false;
                                                    break;
                                                case "A":
                                                case "a":
                                                case "D":
                                                case "d":
                                                case "C":
                                                case "c":
                                                    System.out.println("Alternativa [ " + resp25 + " ] está incorreta! \n");
                                                    limite8--;
                                                    break;
                                                default:
                                                    System.out.println("Opção inválida! \n");
                                                    break;
                                            }
                                            if (certo25 && limite8 == 0) {
                                                System.out.println("");
                                                System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                System.out.println("");
                                                System.out.println("Tente novamente. \n");
                                                break;
                                            }
                                        } while (certo25 && limite8 > 0);
                                        if (!certo25) {

                                            int limite9 = 3;
                                            boolean certo26 = true;

                                            // Código que é responsável por embaralhar as alternativas
                                            ArrayList<String> respostas8 = new ArrayList<String>();
                                            respostas8.add("[A] Hexadecimal.");
                                            respostas8.add("[B] Decimal.");
                                            respostas8.add("[C] Octal.");
                                            respostas8.add("[D] ASCII.");

                                            System.out.println("\n (?) > Quando " + nomePlayer + " decodifica o código binário, qual sistema numérico ele usa para \n"
                                                    + "representar o texto legível?");

                                            do {
                                                System.out.println("(!) > Você tera " + limite9 + " chances");
                                                System.out.println("\n Escolha a alternativa correta! \n ");
                                                for (String resp26 : respostas8) {
                                                    System.out.println(resp26);
                                                }
                                                String resp26 = input.next();
                                                Collections.shuffle(respostas8);

                                                switch (resp26) {
                                                    case "D":
                                                    case "d":
                                                        System.out.println("Alternativa [ " + resp26 + " ] está correta! \n");
                                                        certo26 = false;
                                                        break;
                                                    case "A":
                                                    case "a":
                                                    case "B":
                                                    case "b":
                                                    case "C":
                                                    case "c":
                                                        System.out.println("Alternativa [ " + resp26 + " ] está incorreta! \n");
                                                        limite9--;
                                                        break;
                                                    default:
                                                        System.out.println("Opção inválida! \n");
                                                        break;
                                                }
                                                if (certo26 && limite9 == 0) {
                                                    System.out.println("");
                                                    System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                    System.out.println("");
                                                    System.out.println("Tente novamente. \n");
                                                    break;
                                                }
                                            } while (certo26 && limite9 > 0);
                                            if (!certo26) {

                                                int limite10 = 3;
                                                boolean certo27 = true;

                                                // Código que é responsável por embaralhar as alternativas
                                                ArrayList<String> respostas9 = new ArrayList<String>();
                                                respostas9.add("[A] 1010");
                                                respostas9.add("[B] 1100");
                                                respostas9.add("[C] 1111");
                                                respostas9.add("[D] 1001");

                                                System.out.println("\n (?) > Qual é o resultado da operação binária 1011 AND 1101?");

                                                do {
                                                    System.out.println("(!) > Você tera " + limite10 + " chances");
                                                    System.out.println("\n Escolha a alternativa correta! \n ");
                                                    for (String resp27 : respostas9) {
                                                        System.out.println(resp27);
                                                    }
                                                    String resp27 = input.next();
                                                    Collections.shuffle(respostas9);

                                                    switch (resp27) {
                                                        case "A":
                                                        case "a":
                                                            System.out.println("Alternativa [ " + resp27 + " ] está correta! \n");
                                                            certo27 = false;
                                                            break;
                                                        case "D":
                                                        case "d":
                                                        case "B":
                                                        case "b":
                                                        case "C":
                                                        case "c":
                                                            System.out.println("Alternativa [ " + resp27 + " ] está incorreta! \n");
                                                            limite10--;
                                                            break;
                                                        default:
                                                            System.out.println("Opção inválida! \n");
                                                            break;
                                                    }
                                                    if (certo27 && limite10 == 0) {
                                                        System.out.println("");
                                                        System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                        System.out.println("");
                                                        System.out.println("Tente novamente. \n");
                                                        break;
                                                    }
                                                } while (certo27 && limite10 > 0);
                                                if (!certo27) {
                                                    int limite11 = 3;
                                                    boolean certo28 = true;

                                                    // Código que é responsável por embaralhar as alternativas
                                                    ArrayList<String> respostas10 = new ArrayList<String>();
                                                    respostas10.add("[A] 1010");
                                                    respostas10.add("[B] 1110");
                                                    respostas10.add("[C] 1101");
                                                    respostas10.add("[D] 1011");

                                                    System.out.println("\n (?) > Qual é o resultado da operação binária 1001 OR 0110?");

                                                    do {
                                                        System.out.println("(!) > Você tera " + limite11 + " chances");
                                                        System.out.println("\n Escolha a alternativa correta! \n ");
                                                        for (String resp28 : respostas10) {
                                                            System.out.println(resp28);
                                                        }
                                                        String resp28 = input.next();
                                                        Collections.shuffle(respostas10);

                                                        switch (resp28) {
                                                            case "D":
                                                            case "d":
                                                                System.out.println("Alternativa [ " + resp28 + " ] está correta! \n");
                                                                certo28 = false;
                                                                break;
                                                            case "A":
                                                            case "a":
                                                            case "B":
                                                            case "b":
                                                            case "C":
                                                            case "c":
                                                                System.out.println("Alternativa [ " + resp28 + " ] está incorreta! \n");
                                                                limite11--;
                                                                break;
                                                            default:
                                                                System.out.println("Opção inválida! \n");
                                                                break;
                                                        }
                                                        if (certo28 && limite11 == 0) {
                                                            System.out.println("");
                                                            System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                            System.out.println("");
                                                            System.out.println("Tente novamente. \n");
                                                            break;
                                                        }
                                                    } while (certo28 && limite11 > 0);
                                                    if (!certo28) {
                                                        delayRapido(2);
                                                        System.out.println("\u001B[32m" + " ---** MENSAGEM DESCRIPTOGRAFADA **--- \n");
                                                        System.out.print("\u001B[0m");
                                                        delayRapido(2);
                                                        System.out.println("Após decifrar as mensagens codificadas, " + nomePlayer + " se vê novamente confrontado com a foto \n"
                                                                + "de sua infância ao lado de um homem que ele suspeita ser seu pai. Essa descoberta traz à tona uma \n"
                                                                + "enxurrada de emoções e perguntas sobre sua própria identidade e história. \n"
                                                                + "Determinado a buscar respostas, " + nomePlayer + " concentra-se na localização exata de Zero, que se \n"
                                                                + "encontra nas profundezas da Evil Corp. Com a ajuda de Pixel, ele traça um plano para infiltrar-se na \n"
                                                                + "empresa, enfrentando uma série de desafios de hacking ao longo do caminho. \n");

                                                        boolean certo29 = true;

                                                        do {
                                                            System.out.println("Aperte [Y] para escutar Pixel");
                                                            String resp29 = input.next();

                                                            switch (resp29) {
                                                                case "Y":
                                                                case "y":
                                                                delayRapido(2);
                                                                    System.out.println("\n---------");
                                                                    System.out.println("| Pixel |");
                                                                    System.out.println("---------\n");
                                                                    System.out.println("Consegui pegar a localização da Evil Corp, vamos até lá para desmascarar o Zero de uma vez por todas. \n");
                                                                    System.out.println("\nChegando na frente da Evil Corp pixel te da algumas dicas. \n");
                                                                    certo29 = false;
                                                                    break;
                                                                default:
                                                                    System.out.println("Opção inválida! \n");
                                                                    break;
                                                            }
                                                        } while (certo29);

                                                        boolean certo30 = true;

                                                        do {
                                                            System.out.println("Aperte [Y] para escutar Pixel");
                                                            String resp30 = input.next();

                                                            switch (resp30) {
                                                                case "Y":
                                                                case "y":
                                                                delayRapido(2);
                                                                    System.out.println("\n---------");
                                                                    System.out.println("| Pixel |");
                                                                    System.out.println("---------\n");
                                                                    System.out.println("A primeira etapa é atravessar as defesas digitais da Evil Corp, que estão entre as mais sofisticadas \n"
                                                                            + "do mundo. Com habilidade e astúcia, você vai navegaR por firewalls e sistemas de segurança, evitando ser detectado pelos olhos \n"
                                                                            + "vigilantes da empresa. \n"
                                                                            + "Você vai precisar desativar alarmes, desviar de câmeras de segurança e hackear sistemas de controle de acesso para chegar ao coração da \n"
                                                                            + "empresa, onde Zero reside. \n");

                                                                    certo30 = false;
                                                                    break;
                                                                default:
                                                                    System.out.println("Opção inválida! \n");
                                                                    break;
                                                            }
                                                        } while (certo30);

                                                        boolean certo31 = true;

                                                        do {
                                                            System.out.println("Está pronto para esse desafio ?");
                                                            System.out.println("[Y / N]");
                                                            String resp31 = input.next();

                                                            if (resp31.equalsIgnoreCase("Y")) {
                                                                switch (resp31) {
                                                                    case "Y":
                                                                    case "y":
                                                                    delayRapido(2);
                                                                        System.out.println("\n \u001B[32m" + " INVADINDO A ENTRADA DA EVIL CORP \n");
                                                                        System.out.print("\u001B[0m");
                                                                        System.out.println("Estacionamento Subterrâneo  ");
                                                                        delayRapido(2);
                                                                        certo31 = false;
                                                                        break;
                                                                }
                                                            } else if (resp31.equalsIgnoreCase("N")) {
                                                                switch (resp31) {
                                                                    case "N":
                                                                    case "n":
                                                                        System.out.println("Ok, vou dar-lhe um tempo para reler!");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Opção inválida! \n");
                                                                        break;
                                                                }
                                                            }

                                                        } while (certo31);

                                                        int limite12 = 3;
                                                        boolean certo32 = true;

                                                        // Código que é responsável por embaralhar as alternativas
                                                        ArrayList<String> respostas11 = new ArrayList<String>();
                                                        respostas11.add("[A] 10100");
                                                        respostas11.add("[B] 11001");
                                                        respostas11.add("[C] 11010");
                                                        respostas11.add("[D] 11100");

                                                        System.out.println("\n (?) > Qual é o valor binário do número decimal 25 ? \n");

                                                        do {
                                                            System.out.println("(!) > Você tera " + limite12 + " chances");
                                                            System.out.println("\n Escolha a alternativa correta! \n ");
                                                            for (String resp32 : respostas11) {
                                                                System.out.println(resp32);
                                                            }
                                                            String resp32 = input.next();
                                                            Collections.shuffle(respostas11);

                                                            switch (resp32) {
                                                                case "B":
                                                                case "b":
                                                                    System.out.println("Alternativa [ " + resp32 + " ] está correta! \n");
                                                                    certo32 = false;
                                                                    break;
                                                                case "A":
                                                                case "a":
                                                                case "D":
                                                                case "d":
                                                                case "C":
                                                                case "c":
                                                                    System.out.println("Alternativa [ " + resp32 + " ] está incorreta! \n");
                                                                    limite12--;
                                                                    break;
                                                                default:
                                                                    System.out.println("Opção inválida! \n");
                                                                    break;
                                                            }
                                                            if (certo32 && limite12 == 0) {
                                                                System.out.println("");
                                                                System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                System.out.println("");
                                                                System.out.println("Tente novamente. \n");
                                                                break;
                                                            }
                                                        } while (certo32 && limite12 > 0);
                                                        if (!certo31) {
                                                            int limite13 = 3;
                                                            boolean certo33 = true;

                                                            // Código que é responsável por embaralhar as alternativas
                                                            ArrayList<String> respostas12 = new ArrayList<String>();
                                                            respostas12.add("[A] 6 bits.");
                                                            respostas12.add("[B] 7 bits.");
                                                            respostas12.add("[C] 8 bits.");
                                                            respostas12.add("[D] 9 bits.");

                                                            System.out.println("\n (?) > Quantos bits são necessários para representar o número decimal 64 em binário ? \n");

                                                            do {
                                                                System.out.println("(!) > Você tera " + limite13 + " chances");
                                                                System.out.println("\n Escolha a alternativa correta! \n ");
                                                                for (String resp33 : respostas12) {
                                                                    System.out.println(resp33);
                                                                }
                                                                String resp33 = input.next();
                                                                Collections.shuffle(respostas12);

                                                                switch (resp33) {
                                                                    case "C":
                                                                    case "c":
                                                                        System.out.println("Alternativa [ " + resp33 + " ] está correta! \n");
                                                                        certo33 = false;
                                                                        break;
                                                                    case "A":
                                                                    case "a":
                                                                    case "D":
                                                                    case "d":
                                                                    case "B":
                                                                    case "b":
                                                                        System.out.println("Alternativa [ " + resp33 + " ] está incorreta! \n");
                                                                        limite13--;
                                                                        break;
                                                                    default:
                                                                        System.out.println("Opção inválida! \n");
                                                                        break;
                                                                }
                                                                if (certo33 && limite13 == 0) {
                                                                    System.out.println("");
                                                                    System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                    System.out.println("");
                                                                    System.out.println("Tente novamente. \n");
                                                                    break;
                                                                }
                                                            } while (certo33 && limite13 > 0);
                                                            if (!certo33) {
                                                                int limite14 = 3;
                                                                boolean certo34 = true;

                                                                // Código que é responsável por embaralhar as alternativas
                                                                ArrayList<String> respostas13 = new ArrayList<String>();
                                                                respostas13.add("[A] 42");
                                                                respostas13.add("[B] 52");
                                                                respostas13.add("[C] 62");
                                                                respostas13.add("[D] 72");

                                                                System.out.println("\n (?) > Qual é o resultado da conversão do número binário 101010 para decimal ? \n");

                                                                do {
                                                                    System.out.println("(!) > Você tera " + limite14 + " chances");
                                                                    System.out.println("\n Escolha a alternativa correta! \n ");
                                                                    for (String resp34 : respostas13) {
                                                                        System.out.println(resp34);
                                                                    }
                                                                    String resp34 = input.next();
                                                                    Collections.shuffle(respostas13);

                                                                    switch (resp34) {
                                                                        case "A":
                                                                        case "a":
                                                                            System.out.println("Alternativa [ " + resp34 + " ] está correta! \n");
                                                                            certo34 = false;
                                                                            break;
                                                                        case "C":
                                                                        case "c":
                                                                        case "D":
                                                                        case "d":
                                                                        case "B":
                                                                        case "b":
                                                                            System.out.println("Alternativa [ " + resp34 + " ] está incorreta! \n");
                                                                            limite14--;
                                                                            break;
                                                                        default:
                                                                            System.out.println("Opção inválida! \n");
                                                                            break;
                                                                    }
                                                                    if (certo34 && limite14 == 0) {
                                                                        System.out.println("");
                                                                        System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                        System.out.println("");
                                                                        System.out.println("Tente novamente. \n");
                                                                        break;
                                                                    }
                                                                } while (certo34 && limite14 > 0);
                                                                if (!certo34) {
                                                                    delayRapido(2);
                                                                    System.out.println("\u001B[32m" + " Acesso Liberado! \n");
                                                                    delayRapido(3);
                                                                    System.out.println("\u001B[32m" + "Primeiro Andar - Recepção \n");
                                                                    System.out.print("\u001B[0m");
                                                                    delayLento(1);
                                                                    System.out.println("Entrou na Evil Corp \n "
                                                                            + "\nAgora você precisa encontrar uma maneira de passar pelos guardas na entrada principal da Evil Corp. \n"
                                                                            + "Você tem que hackear os crachás de identificação dos funcionários para dar acesso aos elevadores e escadas com liberação \n"
                                                                            + "por crachás. \n"
                                                                            + "Você e Pixel desenvolveram um programa inovador que utiliza a tecnologia de leitura por proximidade  \n"
                                                                            + "dos crachás de identificação. Com esse programa instalado em seu celular, você pode se aproximar dos funcionários e iniciar \n  "
                                                                            + "automaticamente a leitura do crachá sem levantar suspeitas. \n"
                                                                            + "Ao entrar na recepção da Evil Corp, você identifica uma funcionária responsável pelo controle de acesso ao Segundo andar. Ela \n"
                                                                            + "está distraída enquanto mexe em alguns papéis atrás do balcão de atendimento. Com cuidado para não chamar a atenção dos \n"
                                                                            + "guardas, você se aproxima e ativa o programa de leitura por proximidade em seu celular. O dispositivo começa a detectar o crachá de \n"
                                                                            + "identificação da funcionária, e em questão de segundos, você obtém acesso aos seus dados. \n"
                                                                            + "Com as informações obtidas do crachá da funcionária, você e Pixel conseguem criar uma cópia falsificada do crachá de identificação, \n"
                                                                            + "garantindo acesso ao segundo andar da Evil Corp. Com o crachá falso em mãos, você se dirige aos elevadores e, usando sua nova identidade, \n"
                                                                            + "passa despercebido pelos guardas de segurança. Agora, com acesso ao segundo andar, você está um passo mais perto de desvendar os segredos por \n"
                                                                            + "trás da Evil Corp e encontrar o misterioso Zero. \n");

                                                                    boolean certo35 = true;

                                                                    do {
                                                                        System.out.println("Aperte [Y] para entrar no elevador \n");
                                                                        String resp35 = input.next();

                                                                        switch (resp35) {
                                                                            case "Y":
                                                                            case "y":
                                                                                System.out.println("Entrando... \n");
                                                                                delayRapido(2);
                                                                                certo35 = false;
                                                                                break;
                                                                            default:
                                                                                System.out.println("Opção inválida! \n");
                                                                                break;
                                                                        }

                                                                    } while (certo35);
                                                                    boolean certo36 = true;

                                                                    do {
                                                                        System.out.println("Aperte [2] para ir ao segundo andar \n");
                                                                        delayRapido(2);
                                                                        int resp36 = input.nextInt();

                                                                        switch (resp36) {
                                                                            case 2:
                                                                                System.out.println("... \n");
                                                                                certo36 = false;
                                                                                break;
                                                                            default:
                                                                                System.out.println("Opção inválida! \n");
                                                                                break;
                                                                        }

                                                                    } while (certo36);
                                                                    delayRapido(2);
                                                                    System.out.println("\u001B[32m" + "Segundo Andar - Salas de Escritórios:");
                                                                    delayRapido(2);
                                                                    System.out.print("\u001B[0m");
                                                                    System.out.println("\nNeste andar, você enfrenta uma combinação de desafios técnicos e físicos, onde sua habilidade  \n"
                                                                            + "de hacking é testada em um ambiente corporativo altamente seguro. Cada sucesso o aproxima mais  \n"
                                                                            + "de descobrir a verdade por trás da Evil Corp e seu misterioso líder, Zero. \n"
                                                                            + "As salas de escritórios são protegidas por sistemas de segurança avançados, incluindo firewalls, senhas \n"
                                                                            + "complexas e sistemas de reconhecimento facial. \n"
                                                                            + "Com isso Pixel te fala algo. \n");

                                                                    boolean certo37 = true;

                                                                    do {
                                                                        System.out.println("Aperte [Y] para escutar Pixel");
                                                                        delayRapido(2);
                                                                        String resp37 = input.next();

                                                                        switch (resp37) {
                                                                            case "Y":
                                                                            case "y":
                                                                            delayRapido(2);
                                                                                System.out.println("\n---------");
                                                                                System.out.println("| Pixel |");
                                                                                System.out.println("---------\n");
                                                                                System.out.println(nomePlayer + ", estou vasculhando os sistemas aqui e consegui acessar a planta baixa deste andar. Parece que  \n"
                                                                                        + "há um lugar pouco frequentado pelos funcionários, uma espécie de sala de armazenamento nos fundos do corredor leste. \n"
                                                                                        + "Acredito que seja um ponto menos protegido, o que pode facilitar nossa entrada sem chamar muita atenção. Acho que seria uma \n"
                                                                                        + "boa ideia verificar esse local para completar nossa missão de forma mais segura. O que acha ? \n");

                                                                                certo37 = false;
                                                                                break;
                                                                            default:
                                                                                System.out.println("Opção inválida! \n");
                                                                                break;
                                                                        }
                                                                    } while (certo37);
                                                                    boolean certo38 = true;

                                                                    do {
                                                                        System.out.println("Aperte [Y] para falar com Pixel");
                                                                        delayRapido(2);
                                                                        String resp38 = input.next();

                                                                        switch (resp38) {
                                                                            case "Y":
                                                                            case "y":
                                                                            delayRapido(2);
                                                                                System.out.println("\n---------------");
                                                                                System.out.println("| " + nomePlayer + " |");
                                                                                System.out.println("----------------\n");
                                                                                System.out.println("Essa é uma excelente ideia. Se há um lugar menos protegido, é nossa melhor chance de evitar os  \n"
                                                                                        + "sistemas de segurança mais rígidos. Vamos lá conferir essa sala de armazenamento e ver se encontramos alguma  \n"
                                                                                        + "pista valiosa. Estou pronto para seguir suas instruções. Vamos nessa! \n");

                                                                                certo38 = false;
                                                                                break;
                                                                            default:
                                                                                System.out.println("Opção inválida! \n");
                                                                                break;
                                                                        }
                                                                    } while (certo38);

                                                                    delayRapido(2);
                                                                    System.out.println("Chegando na Sala de armazenamento você e Pixel se escondem e começam a hackear o andar.");

                                                                    int limite15 = 3;
                                                                    boolean certo39 = true;

                                                                    // Código que é responsável por embaralhar as alternativas
                                                                    ArrayList<String> respostas14 = new ArrayList<String>();
                                                                    respostas14.add("[A] 11");
                                                                    respostas14.add("[B] 12");
                                                                    respostas14.add("[C] 13");
                                                                    respostas14.add("[D] 14");

                                                                    System.out.println("\n (?) > Quanto é 1101 em decimal ? \n");

                                                                    do {
                                                                        System.out.println("(!) > Você tera " + limite15 + " chances");
                                                                        System.out.println("\n Escolha a alternativa correta! \n ");
                                                                        for (String resp39 : respostas14) {
                                                                            System.out.println(resp39);
                                                                        }
                                                                        String resp39 = input.next();
                                                                        Collections.shuffle(respostas14);

                                                                        switch (resp39) {
                                                                            case "C":
                                                                            case "c":
                                                                                System.out.println("Alternativa [ " + resp39 + " ] está correta! \n");
                                                                                certo39 = false;
                                                                                break;
                                                                            case "A":
                                                                            case "a":
                                                                            case "D":
                                                                            case "d":
                                                                            case "B":
                                                                            case "b":
                                                                                System.out.println("Alternativa [ " + resp39 + " ] está incorreta! \n");
                                                                                limite15--;
                                                                                break;
                                                                            default:
                                                                                System.out.println("Opção inválida! \n");
                                                                                break;
                                                                        }
                                                                        if (certo39 && limite15 == 0) {
                                                                            System.out.println("");
                                                                            System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                            System.out.println("");
                                                                            System.out.println("Tente novamente. \n");
                                                                            break;
                                                                        }
                                                                    } while (certo39 && limite15 > 0);
                                                                    if (!certo39) {

                                                                        int limite16 = 3;
                                                                        boolean certo40 = true;

                                                                        // Código que é responsável por embaralhar as alternativas
                                                                        ArrayList<String> respostas15 = new ArrayList<String>();
                                                                        respostas15.add("[A] 10100");
                                                                        respostas15.add("[B] 11011");
                                                                        respostas15.add("[C] 11110");
                                                                        respostas15.add("[D] 100011");

                                                                        System.out.println("\n (?) > Qual é o resultado da adição binária de 1010 e 1101? \n");

                                                                        do {
                                                                            System.out.println("(!) > Você tera " + limite16 + " chances");
                                                                            System.out.println("\n Escolha a alternativa correta! \n ");
                                                                            for (String resp40 : respostas15) {
                                                                                System.out.println(resp40);
                                                                            }
                                                                            String resp40 = input.next();
                                                                            Collections.shuffle(respostas15);

                                                                            switch (resp40) {
                                                                                case "C":
                                                                                case "c":
                                                                                    System.out.println("Alternativa [ " + resp40 + " ] está correta! \n");
                                                                                    certo40 = false;
                                                                                    break;
                                                                                case "A":
                                                                                case "a":
                                                                                case "D":
                                                                                case "d":
                                                                                case "B":
                                                                                case "b":
                                                                                    System.out.println("Alternativa [ " + resp40 + " ] está incorreta! \n");
                                                                                    limite16--;
                                                                                    break;
                                                                                default:
                                                                                    System.out.println("Opção inválida! \n");
                                                                                    break;
                                                                            }
                                                                            if (certo40 && limite16 == 0) {
                                                                                System.out.println("");
                                                                                System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                System.out.println("");
                                                                                System.out.println("Tente novamente. \n");
                                                                                break;
                                                                            }
                                                                        } while (certo40 && limite16 > 0);
                                                                        if (!certo40) {
                                                                            int limite17 = 3;
                                                                            boolean certo41 = true;

                                                                            // Código que é responsável por embaralhar as alternativas
                                                                            ArrayList<String> respostas16 = new ArrayList<String>();
                                                                            respostas16.add("[A] 1");
                                                                            respostas16.add("[B] 2");
                                                                            respostas16.add("[C] 3");
                                                                            respostas16.add("[D] 4");

                                                                            System.out.println("\n (?) > O que representa o bit mais à esquerda em um número binário ? \n");

                                                                            do {
                                                                                System.out.println("(!) > Você tera " + limite17 + " chances");
                                                                                System.out.println("\n Escolha a alternativa correta! \n ");
                                                                                for (String resp41 : respostas16) {
                                                                                    System.out.println(resp41);
                                                                                }
                                                                                String resp41 = input.next();
                                                                                Collections.shuffle(respostas16);

                                                                                switch (resp41) {
                                                                                    case "D":
                                                                                    case "d":
                                                                                        System.out.println("Alternativa [ " + resp41 + " ] está correta! \n");
                                                                                        certo41 = false;
                                                                                        break;
                                                                                    case "A":
                                                                                    case "a":
                                                                                    case "C":
                                                                                    case "c":
                                                                                    case "B":
                                                                                    case "b":
                                                                                        System.out.println("Alternativa [ " + resp41 + " ] está incorreta! \n");
                                                                                        limite17--;
                                                                                        break;
                                                                                    default:
                                                                                        System.out.println("Opção inválida! \n");
                                                                                        break;
                                                                                }
                                                                                if (certo41 && limite17 == 0) {
                                                                                    System.out.println("");
                                                                                    System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                    System.out.println("");
                                                                                    System.out.println("Tente novamente. \n");
                                                                                    break;
                                                                                }
                                                                            } while (certo41 && limite17 > 0);
                                                                            if (!certo41) {
                                                                                delayRapido(3);
                                                                                System.out.println("\u001B[32m" + "Sistema Invadido com sucesso \n");
                                                                                System.out.print("\u001B[0m");
                                                                                delayRapido(2);
                                                                                System.out.println("Com a habilidade de hacking e o apoio estratégico de Pixel, finalmente conseguem invadir os sistemas da Evil Corp. \n"
                                                                                        + "Uma vez dentro, eles encontram uma mina de informações sobre Zero e suas conexões com a organização. Entre os dados roubados, você \n "
                                                                                        + "descobre documentos confidenciais que revelam os planos obscuros de Zero para manipular a economia global e consolidar seu poder sobre a cidade \n"
                                                                                        + "de NeoByte. Além disso, eles encontram evidências perturbadoras de experimentos ilegais conduzidos pela Evil Corp, colocando em risco a segurança \n"
                                                                                        + "e a liberdade dos cidadãos. \n"
                                                                                        + "Com essas informações você envia diretamente para os Anonymous e enquanto eles analisam os dados, você e Pixel se deparam com uma série de mensagens \n "
                                                                                        + "codificadas que sugerem uma operação ainda mais sinistra em andamento. Essas mensagens apontam para uma localização específica dentro da sede da  \n"
                                                                                        + "Evil Corp, onde parece que Zero está planejando algo de grande escala. \n");

                                                                                boolean certo42 = true;

                                                                                do {
                                                                                    System.out.println("Aperte [Y] para decodificar as mensagens \n");
                                                                                    delayRapido(2);
                                                                                    String resp42 = input.next();

                                                                                    switch (resp42) {
                                                                                        case "Y":
                                                                                        case "y":
                                                                                            System.out.println("Decodificando...");
                                                                                            delayRapido(2);
                                                                                            certo42 = false;
                                                                                            break;
                                                                                        default:
                                                                                            System.out.println("Opção Invalida ! \n");
                                                                                            break;
                                                                                    }
                                                                                } while (certo42);
                                                                                int limite18 = 3;
                                                                                boolean certo43 = true;

                                                                                // Código que é responsável por embaralhar as alternativas
                                                                                ArrayList<String> respostas17 = new ArrayList<String>();
                                                                                respostas17.add("[A] 4");
                                                                                respostas17.add("[B] 6");
                                                                                respostas17.add("[C] 8");
                                                                                respostas17.add("[D] 10");

                                                                                System.out.println("\n (?) > Quantos valores diferentes podem ser representados com 3 bits ? \n");

                                                                                do {
                                                                                    System.out.println("(!) > Você tera " + limite18 + " chances");
                                                                                    System.out.println("\n Escolha a alternativa correta! \n ");
                                                                                    for (String resp43 : respostas17) {
                                                                                        System.out.println(resp43);
                                                                                    }
                                                                                    String resp43 = input.next();
                                                                                    Collections.shuffle(respostas17);

                                                                                    switch (resp43) {
                                                                                        case "C":
                                                                                        case "c":
                                                                                            System.out.println("Alternativa [ " + resp43 + " ] está correta! \n");
                                                                                            certo43 = false;
                                                                                            break;
                                                                                        case "A":
                                                                                        case "a":
                                                                                        case "D":
                                                                                        case "d":
                                                                                        case "B":
                                                                                        case "b":
                                                                                            System.out.println("Alternativa [ " + resp43 + " ] está incorreta! \n");
                                                                                            limite18--;
                                                                                            break;
                                                                                        default:
                                                                                            System.out.println("Opção inválida! \n");
                                                                                            break;
                                                                                    }
                                                                                    if (certo43 && limite18 == 0) {
                                                                                        System.out.println("");
                                                                                        System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                        System.out.println("");
                                                                                        System.out.println("Tente novamente. \n");
                                                                                        break;
                                                                                    }
                                                                                } while (certo43 && limite18 > 0);
                                                                                if (!certo43) {
                                                                                    int limite19 = 3;
                                                                                    boolean certo44 = true;

                                                                                    // Código que é responsável por embaralhar as alternativas
                                                                                    ArrayList<String> respostas18 = new ArrayList<String>();
                                                                                    respostas18.add("[A] 0011");
                                                                                    respostas18.add("[B] 0101");
                                                                                    respostas18.add("[C] 0111");
                                                                                    respostas18.add("[D] 1001");

                                                                                    System.out.println("\n (?) > Qual é o resultado da subtração binária de 1001 - 0110 ? \n");

                                                                                    do {
                                                                                        System.out.println("(!) > Você tera " + limite19 + " chances");
                                                                                        System.out.println("\n Escolha a alternativa correta! \n ");
                                                                                        for (String resp44 : respostas18) {
                                                                                            System.out.println(resp44);
                                                                                        }
                                                                                        String resp44 = input.next();
                                                                                        Collections.shuffle(respostas18);

                                                                                        switch (resp44) {
                                                                                            case "A":
                                                                                            case "a":
                                                                                                System.out.println("Alternativa [ " + resp44 + " ] está correta! \n");
                                                                                                certo44 = false;
                                                                                                break;
                                                                                            case "C":
                                                                                            case "c":
                                                                                            case "D":
                                                                                            case "d":
                                                                                            case "B":
                                                                                            case "b":
                                                                                                System.out.println("Alternativa [ " + resp44 + " ] está incorreta! \n");
                                                                                                limite19--;
                                                                                                break;
                                                                                            default:
                                                                                                System.out.println("Opção inválida! \n");
                                                                                                break;
                                                                                        }
                                                                                        if (certo44 && limite19 == 0) {
                                                                                            System.out.println("");
                                                                                            System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                            System.out.println("");
                                                                                            System.out.println("Tente novamente. \n");
                                                                                            break;
                                                                                        }
                                                                                    } while (certo44 && limite19 > 0);
                                                                                    if (!certo44) {
                                                                                        delayRapido(2);
                                                                                        System.out.println("\u001B[32m" + "Mensagem Decodificada com sucesso");
                                                                                        System.out.print("\u001B[0m");
                                                                                        
                                                                                        delayRapido(3);
                                                                                        System.out.println("\n---------");
                                                                                        System.out.println("| Mensagem |");
                                                                                        System.out.println("---------\n");
                                                                                        System.out.println("Assunto: Operação Enigma - Fase Final \n"
                                                                                                + "Caros colegas, \n"
                                                                                                + "Estamos nos estágios finais da Operação Enigma. Nossa equipe dedicada trabalhou incansavelmente para garantir o sucesso deste empreendimento e \n"
                                                                                                + "agora, estamos prestes a colher os frutos de nossos esforços. \n"
                                                                                                + "Conforme discutido anteriormente, a localização estratégica dentro de nossa sede servirá como o epicentro de nossas atividades futuras. É \n"
                                                                                                + "imprescindível que cada departamento esteja ciente do papel crucial que desempenhará nesta fase crítica. \n"
                                                                                                + "Pedimos a todos que estejam em alerta máximo e prontos para responder a quaisquer instruções adicionais que possam ser fornecidas. A \n"
                                                                                                + "segurança e o sigilo devem ser mantidos a todo custo. \n"
                                                                                                + "Estamos prestes a fazer história. \n"
                                                                                                + "Atenciosamente, \n"
                                                                                                + "Zero - Diretor da Evil Corp \n");

                                                                                                delayLento(1);
                                                                                        System.out.println("Com os dados em mãos, você e Pixel rapidamente planejam sua próxima jogada. Vocês saem da sala de armazenamento \n "
                                                                                                + "e começam a fazer o caminho até o andar onde Zero está planejando a Operação Enigma. Enquanto se movem pelos corredores da Evil Corp, podem sentir a \n"
                                                                                                + "tensão no ar, sabendo que estão se aproximando do epicentro das operações secretas da empresa. \n"
                                                                                                + "Enquanto caminham, você reflete sobre as descobertas recentes e sobre a verdadeira identidade de Zero, que agora se revela como seu próprio pai. A \n"
                                                                                                + "revelação o deixa com um misto de emoções, desde raiva até uma profunda tristeza pela ausência paterna. No entanto, ele mantém sua determinação de \n"
                                                                                                + "expor a verdade e colocar um fim nos planos nefastos da Evil Corp. \n \n"
                                                                                                + "À medida que se aproximam do andar onde Zero está localizado, você se prepara mentalmente para o confronto iminente. Você sabem que não será fácil, \n "
                                                                                                + "mas estão determinados a fazer o que for preciso para proteger aqueles que estão em perigo e expor a verdade que está por trás das sombras da Evil Corp. \n"
                                                                                                + "Com a coragem renovada, vocês avançam, prontos para enfrentar seu maior desafio até agora. \n"
                                                                                                + "Você e Pixel seguem em direção ao elevador. \n");

                                                                                        boolean certo45 = true;

                                                                                        do {
                                                                                            System.out.println("Aperte [Y] para entrar no elevador \n");
                                                                                            delayRapido(2);
                                                                                            String resp45 = input.next();

                                                                                            switch (resp45) {
                                                                                                case "Y":
                                                                                                case "y":
                                                                                                    System.out.println("Entrando... \n");
                                                                                                    delayRapido(2);
                                                                                                    certo45 = false;
                                                                                                    break;
                                                                                                default:
                                                                                                    System.out.println("Opção inválida! \n");
                                                                                                    break;
                                                                                            }

                                                                                        } while (certo45);

                                                                                        boolean certo46 = true;

                                                                                        do {
                                                                                            System.out.println("Aperte [45] para ir ao segundo andar \n");
                                                                                            delayRapido(2);
                                                                                            int resp46 = input.nextInt();

                                                                                            switch (resp46) {
                                                                                                case 45:
                                                                                                delayRapido(3);
                                                                                                    System.out.println("\u001B[32m" + "A Caminho do Confronto: \n");
                                                                                                    System.out.print("\u001B[0m");
                                                                                                    certo46 = false;
                                                                                                    break;
                                                                                                default:
                                                                                                    System.out.println("Opção inválida! \n");
                                                                                                    break;
                                                                                            }

                                                                                        } while (certo46);
                                                                                        if (!certo46) {
                                                                                            delayRapido(3);
                                                                                            System.out.println("Vocês chegam à entrada do andar superior, onde o acesso é rigidamente controlado. Pixel, com suas habilidades excepcionais em hacking, \n "
                                                                                                    + "desativa silenciosamente as câmeras de segurança e abre as portas trancadas. Vocês entram no corredor principal, que está silencioso, exceto pelo som distante de teclas \n"
                                                                                                    + "digitando e monitores piscando. \n \n"
                                                                                                    + "Antes de chegar à sala central onde Zero está, vocês tem um Encontro Inesperado: \n"
                                                                                                    + "Ao virar a última esquina do corredor antes da sala de Zero, você e Pixel são surpreendidos por uma patrulha de Guardas. Eles \n"
                                                                                                    + "imediatamente reconhecem a ameaça e ativam seus escudos de energia. \n"
                                                                                                    + "Essa batalha envolve combate corpo a corpo. Os Guardas usam bastões eletrificados e lâminas energéticas. Você deve utilizar suas habilidades de luta e \n "
                                                                                                    + "agilidade para desviar dos ataques e contra-atacar com precisão. Pixel, por sua vez, usa suas habilidades de artes marciais combinadas \n"
                                                                                                    + "com dispositivos eletrônicos para desativar temporariamente os exoesqueletos dos guardas. \n ");
                                                                                                    delayLento(1);
                                                                                            System.out.println("Para finalizar a batalha, você e Pixel precisam coordenar um ataque conjunto. Enquanto Pixel desativa os escudos de energia dos guardas, você usa \n "
                                                                                                    + "suas habilidades de combate para neutralizá-los um a um. A sinergia entre suas habilidades tecnológicas e de combate é crucial para superar essa fase crítica.");

                                                                                            boolean certo47 = true;
                                                                                            int limite20 = 3;

                                                                                            // Código que é responsável por embaralhar as alternativas
                                                                                            ArrayList<String> respostas19 = new ArrayList<String>();
                                                                                            respostas19.add("[A] Bloquear com as mãos.");
                                                                                            respostas19.add("[B] Desviar lateralmente e contra-atacar com um chute.");
                                                                                            respostas19.add("[C] Correr na direção oposta.");
                                                                                            respostas19.add("[D] Usar uma explosão eletromagnética para desativar o bastão.");

                                                                                            System.out.println("\n (?) > Durante a luta corpo a corpo, um Guarda ataca com um bastão eletrificado. Qual é a \n"
                                                                                                    + "melhor maneira de evitar o ataque ? \n");

                                                                                            do {
                                                                                                System.out.println("(!) > Você tera uma vida de " + limite20 + " cada erro você perde 100 de vida.");
                                                                                                System.out.println("\n Escolha a alternativa correta! \n");
                                                                                                for (String resp47 : respostas19) {
                                                                                                    System.out.println(resp47);
                                                                                                }
                                                                                                String resp47 = input.next();
                                                                                                Collections.shuffle(respostas19);

                                                                                                switch (resp47) {
                                                                                                    case "B":
                                                                                                    case "b":
                                                                                                        System.out.println("Alternativa [ " + resp47 + " ] está correta! \n");
                                                                                                        certo47 = false;
                                                                                                        break;
                                                                                                    case "C":
                                                                                                    case "c":
                                                                                                    case "D":
                                                                                                    case "d":
                                                                                                    case "A":
                                                                                                    case "a":
                                                                                                        System.out.println("Alternativa [ " + resp47 + " ] está incorreta! \n");
                                                                                                        limite20--;
                                                                                                        break;
                                                                                                    default:
                                                                                                        System.out.println("Opção inválida! \n");
                                                                                                        break;
                                                                                                }
                                                                                                if (certo47 && limite20 == 0) {
                                                                                                    System.out.println("");
                                                                                                    System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                                    System.out.println("");
                                                                                                    System.out.println("Tente novamente. \n");
                                                                                                    break;
                                                                                                }

                                                                                            } while (certo47 && limite20 > 0);
                                                                                            if (!certo47) {
                                                                                                boolean certo48 = true;
                                                                                                int limite21 = 3;

                                                                                                // Código que é responsável por embaralhar as alternativas
                                                                                                ArrayList<String> respostas20 = new ArrayList<String>();
                                                                                                respostas20.add("[A] Atacar diretamente com força total.");
                                                                                                respostas20.add("[B] Tentar hackear os escudos imediatamente.");
                                                                                                respostas20.add("[C] Desviar dos ataques e observar os padrões de movimento dos guardas.");
                                                                                                respostas20.add("[D] Usar uma granada de fumaça para desorientar os guardas.");

                                                                                                System.out.println("\n (?) > Os Guardas ativam seus escudos de energia. O que você deve fazer primeiro?");

                                                                                                do {
                                                                                                    System.out.println("(!) > Você tera uma vida de " + limite21 + " cada erro você perde 100 de vida.");
                                                                                                    System.out.println("\n Escolha a alternativa correta! \n");
                                                                                                    for (String resp48 : respostas20) {
                                                                                                        System.out.println(resp48);
                                                                                                    }
                                                                                                    String resp48 = input.next();
                                                                                                    Collections.shuffle(respostas20);

                                                                                                    switch (resp48) {
                                                                                                        case "D":
                                                                                                        case "d":
                                                                                                            System.out.println("Alternativa [ " + resp48 + " ] está correta! \n");
                                                                                                            certo48 = false;
                                                                                                            break;
                                                                                                        case "C":
                                                                                                        case "c":
                                                                                                        case "A":
                                                                                                        case "a":
                                                                                                        case "B":
                                                                                                        case "b":
                                                                                                            System.out.println("Alternativa [ " + resp48 + " ] está incorreta! \n");
                                                                                                            limite21--;
                                                                                                            break;
                                                                                                        default:
                                                                                                            System.out.println("Opção inválida! \n");
                                                                                                            break;
                                                                                                    }
                                                                                                    if (certo48 && limite21 == 0) {
                                                                                                        System.out.println("");
                                                                                                        System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                                        System.out.println("");
                                                                                                        System.out.println("Tente novamente. \n");
                                                                                                        break;
                                                                                                    }

                                                                                                } while (certo48 && limite21 > 0);
                                                                                                if (!certo48) {
                                                                                                    delayRapido(2);
                                                                                                    System.out.println("Com isso os Guardas recuam e começam a usar drones de combate e armamento pesado. Você deve utilizar seus conhecimentos em hacking para assumir o \n"
                                                                                                            + "controle dos drones e desativar as armas dos guardas. Pixel fornece suporte hackeando o sistema de comunicação dos guardas, causando confusão e desorganização \n"
                                                                                                            + "nas suas fileiras.");

                                                                                                    boolean certo49 = true;
                                                                                                    int limite22 = 3;

                                                                                                    // Código que é responsável por embaralhar as alternativas
                                                                                                    ArrayList<String> respostas21 = new ArrayList<String>();
                                                                                                    respostas21.add("[A] Atacar os drones com força física.");
                                                                                                    respostas21.add("[B] Ignorar os drones e focar nos guardas.");
                                                                                                    respostas21.add("[C] Hackear os drones para assumir o controle.");
                                                                                                    respostas21.add("[D] Usar um escudo de energia para se proteger dos drones.");

                                                                                                    System.out.println("\n (?) > Os Guardas começam a usar drones de combate. Como você deve reagir?");

                                                                                                    do {
                                                                                                        System.out.println("(!) > Você tera uma vida de " + limite22 + " cada erro você perde 100 de vida.");
                                                                                                        System.out.println("\n Escolha a alternativa correta! \n");
                                                                                                        for (String resp49 : respostas21) {
                                                                                                            System.out.println(resp49);
                                                                                                        }
                                                                                                        String resp49 = input.next();
                                                                                                        Collections.shuffle(respostas21);

                                                                                                        switch (resp49) {
                                                                                                            case "C":
                                                                                                            case "c":
                                                                                                                System.out.println("Alternativa [ " + resp49 + " ] está correta! \n");
                                                                                                                certo49 = false;
                                                                                                                break;
                                                                                                            case "D":
                                                                                                            case "d":
                                                                                                            case "A":
                                                                                                            case "a":
                                                                                                            case "B":
                                                                                                            case "b":
                                                                                                                System.out.println("Alternativa [ " + resp49 + " ] está incorreta! \n");
                                                                                                                limite22--;
                                                                                                                break;
                                                                                                            default:
                                                                                                                System.out.println("Opção inválida! \n");
                                                                                                                break;
                                                                                                        }
                                                                                                        if (certo49 && limite22 == 0) {
                                                                                                            System.out.println("");
                                                                                                            System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                                            System.out.println("");
                                                                                                            System.out.println("Tente novamente. \n");
                                                                                                            break;
                                                                                                        }

                                                                                                    } while (certo49 && limite22 > 0);
                                                                                                    if (!certo49) {
                                                                                                        delayRapido(2);
                                                                                                        System.out.println("Com isso os Guardas recuam e começam a usar drones de combate e armamento pesado. Você deve utilizar seus conhecimentos em hacking para assumir o \n"
                                                                                                                + "controle dos drones e desativar as armas dos guardas. Pixel fornece suporte hackeando o sistema de comunicação dos guardas, causando confusão e desorganização \n"
                                                                                                                + "nas suas fileiras.");

                                                                                                        boolean certo50 = true;
                                                                                                        int limite23 = 3;

                                                                                                        // Código que é responsável por embaralhar as alternativas
                                                                                                        ArrayList<String> respostas22 = new ArrayList<String>();
                                                                                                        respostas22.add("[A] Proteger Pixel de qualquer ataque enquanto ele trabalha.");
                                                                                                        respostas22.add("[B] Atacar os guardas mesmo com os escudos ativados.");
                                                                                                        respostas22.add("[C] Tentar desativar os escudos ao mesmo tempo que Pixel.");
                                                                                                        respostas22.add("[D] Destruir os dispositivos que alimentam os escudos.");

                                                                                                        System.out.println("\n (?) > Pixel está tentando desativar os escudos de energia dos guardas. Como você pode ajudar melhor?");

                                                                                                        do {
                                                                                                            System.out.println("(!) > Você tera uma vida de " + limite23 + " cada erro você perde 100 de vida.");
                                                                                                            System.out.println("\n Escolha a alternativa correta! \n");
                                                                                                            for (String resp50 : respostas22) {
                                                                                                                System.out.println(resp50);
                                                                                                            }
                                                                                                            String resp50 = input.next();
                                                                                                            Collections.shuffle(respostas22);

                                                                                                            switch (resp50) {
                                                                                                                case "A":
                                                                                                                case "a":
                                                                                                                    System.out.println("Alternativa [ " + resp50 + " ] está correta! \n");
                                                                                                                    certo50 = false;
                                                                                                                    break;
                                                                                                                case "D":
                                                                                                                case "d":
                                                                                                                case "C":
                                                                                                                case "c":
                                                                                                                case "B":
                                                                                                                case "b":
                                                                                                                    System.out.println("Alternativa [ " + resp50 + " ] está incorreta! \n");
                                                                                                                    limite23--;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    System.out.println("Opção inválida! \n");
                                                                                                                    break;
                                                                                                            }
                                                                                                            if (certo50 && limite23 == 0) {
                                                                                                                System.out.println("");
                                                                                                                System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                                                System.out.println("");
                                                                                                                System.out.println("Tente novamente. \n");
                                                                                                                break;
                                                                                                            }

                                                                                                        } while (certo50 && limite23 > 0);
                                                                                                        if (!certo50) {
                                                                                                            delayRapido(2);
                                                                                                            System.out.println("Com os drones sob controle, Pixel se concentra nos escudos dos guardas. Você se coloca à frente, defendendo Pixel dos ataques restantes. \n"
                                                                                                                    + "Finalmente, os escudos piscam e desaparecem. Você aproveita a oportunidade e com uma combinação de golpes precisos e ataques tecnológicos, neutraliza os \n"
                                                                                                                    + "guardas um por um. \n"
                                                                                                                    + "Cansados, mas vitoriosos, você e Pixel finalmente chegam à porta da sala central, prontos para enfrentar Zero e acabar com a Operação Enigma. Vocês trocam \n"
                                                                                                                    + "um olhar determinado e respiram fundo antes de entrar. Ao abrir a porta, uma vasta sala de controle se revela diante de vocês, repleta de monitores, servidores \n "
                                                                                                                    + "e hologramas em funcionamento. No centro, de frente para uma tela holográfica gigante está Zero. Que se vira lentamente ao ouvir a porta se abrir. \n"
                                                                                                                    + "Ele olha para você com uma mistura de surpresa e admiração.");
                                                                                                                    delayRapido(3);
                                                                                                            System.out.println("\n------");
                                                                                                            System.out.println("| ZERO |");
                                                                                                            System.out.println("-------\n");
                                                                                                            
                                                                                                            System.out.println("> Eu sabia que você era especial - diz ele, sua voz fria e calculada. \n>  Mas nunca pensei que chegaria tão longe. \n"
                                                                                                                    + "Há algo que você precisa saber. Algo que eu guardei todos esses anos. \n"
                                                                                                                    + nomePlayer + ", Eu sou seu pai. \n \n ");
                                                                                                                    delayRapido(3);
                                                                                                            System.out.println("O mundo parece parar por um momento. O choque da revelação o atinge como um soco no estômago. Pixel, ao seu lado, fica igualmente perplexo. \n");
                                                                                                            delayRapido(3);
                                                                                                            System.out.println("\n---------------");
                                                                                                            System.out.println("| " + nomePlayer + " |");
                                                                                                            System.out.println("----------------\n");

                                                                                                            System.out.println("Não... isso não pode ser verdade. Você é o meu pai? O homem que me abandonou? \n");
                                                                                                            delayRapido(3);
                                                                                                            System.out.println("\n------");
                                                                                                            System.out.println("| ZERO |");
                                                                                                            System.out.println("-------\n");

                                                                                                            System.out.println("Eu nunca te abandonei. Tudo o que fiz foi por um bem maior. Eu estava criando um futuro onde você e todos os outros poderiam viver sem medo, \n"
                                                                                                                    + "sem erros. Um mundo perfeito controlado pelo Algoritmo. \n"
                                                                                                                    + "Junte-se a mim, filho. Juntos, podemos dominar NeoByte e além. Pense no que podemos alcançar! A humanidade precisa de ordem, de controle. Com o Algoritmo, \n"
                                                                                                                    + "podemos erradicar crimes, doenças, qualquer forma de sofrimento. É um sacrifício necessário para o bem maior. \n \n ");
                                                                                                                    delayRapido(3);
                                                                                                            System.out.println("Você sente uma mistura de raiva, tristeza e confusão. Sua mente corre com pensamentos conflitantes, mas uma coisa é clara: você \n"
                                                                                                                    + "não pode deixar que Zero vença. \n");
                                                                                                                    delayRapido(3);
                                                                                                            System.out.println("\n---------------");
                                                                                                            System.out.println("| " + nomePlayer + " |");
                                                                                                            System.out.println("----------------\n");

                                                                                                            System.out.println("Você está falando sobre um mundo sem liberdade, sem escolhas. As pessoas não são máquinas, pai. Elas precisam ser livres para aprender, crescer e até \n"
                                                                                                                    + "cometer erros. É isso que nos torna humanos. \n");
                                                                                                                    delayRapido(3);
                                                                                                            System.out.println("\n------");
                                                                                                            System.out.println("| ZERO |");
                                                                                                            System.out.println("-------\n");
                                                                                                            System.out.println("Liberdade? Você acha que a humanidade sabe o que fazer com liberdade? Olhe ao redor! Guerras, fome, caos. O Algoritmo pode acabar com tudo isso. \n");
                                                                                                            delayRapido(3);
                                                                                                            System.out.println("\n---------------");
                                                                                                            System.out.println("| " + nomePlayer + " |");
                                                                                                            System.out.println("----------------\n");
                                                                                                            System.out.println("E a que custo? A individualidade, a essência de quem somos? O que você propõe não é um futuro, é uma prisão. Eu não posso apoiar isso. \n");
                                                                                                            delayRapido(3);
                                                                                                            System.out.println("\n------");
                                                                                                            System.out.println("| ZERO |");
                                                                                                            System.out.println("-------\n");
                                                                                                            System.out.println("Você não entende. Eu sacrifiquei tudo para chegar aqui. Tudo isso foi por você, por um futuro melhor para todos nós. \n");
                                                                                                            delayRapido(2);
                                                                                                            System.out.println("\n---------------");
                                                                                                            System.out.println("| " + nomePlayer + " |");
                                                                                                            System.out.println("----------------\n");
                                                                                                            System.out.println("Se realmente se importasse comigo, não tentaria me transformar em um tirano como você. O verdadeiro sacrifício é lutar pela liberdade, \n"
                                                                                                                    + "mesmo quando é difícil. Eu não vou trair tudo o que acredito. \n");
                                                                                                                    delayRapido(3);
                                                                                                            System.out.println("\n------");
                                                                                                            System.out.println("| ZERO |");
                                                                                                            System.out.println("-------\n");
                                                                                                            System.out.println("Você realmente está disposto a destruir tudo pelo que eu trabalhei? A jogar fora a chance de um mundo melhor? \n"
                                                                                                                    + "Então você tem duas escolhas. Junte-se a mim e dominaremos NeoByte juntos. Ou... você se torna meu inimigo. \n \n ");
                                                                                                                    delayRapido(3);
                                                                                                            System.out.println("Você percebe que está diante de uma decisão crucial, pois tem quase todas as informações de NeoByte e com isso poderia se juntar a \n"
                                                                                                                    + "Zero e dominar a cidade, onde está cansado(a) da pobreza e de todos de viraram as costas pra você. As opções são claras, e o destino de NeoByte depende da sua escolha. \n ");
                                                                                                                    delayRapido(3);
                                                                                                            boolean certo51 = true;

                                                                                                            do {
                                                                                                                System.out.println("Escolha [S] para se juntar a Zero e [N] para recusar a oferta. \n");
                                                                                                                String resp51 = input.next();

                                                                                                                switch (resp51) {
                                                                                                                    case "S":
                                                                                                                    case "s":
                                                                                                                    delayRapido(2);
                                                                                                                        System.out.println("\n---------------");
                                                                                                                        System.out.println("| " + nomePlayer + " |");
                                                                                                                        System.out.println("----------------\n");
                                                                                                                        System.out.println("Muito bem, pai. Vamos moldar o futuro juntos. \n");
                                                                                                                        delayRapido(3);
                                                                                                                        System.out.println("\n------");
                                                                                                                        System.out.println("| ZERO |");
                                                                                                                        System.out.println("-------\n");
                                                                                                                        System.out.println("Uma decisão sábia, meu filho. NeoByte será nosso. \n");
                                                                                                                        delayRapido(3);
                                                                                                                        System.out.println("\n--------------");
                                                                                                                        System.out.println("|  CONTINUA...  |");
                                                                                                                        System.out.println("----------------\n");
                                                                                                                        delayRapido(3);    
                                                                                                                        break;
                                                                                                                    case "N":
                                                                                                                    case "n":
                                                                                                                    delayRapido(2);
                                                                                                                        System.out.println("\n---------------");
                                                                                                                        System.out.println("| " + nomePlayer + " |");
                                                                                                                        System.out.println("----------------\n");
                                                                                                                        System.out.println("Não. Eu não posso fazer isso. Eu não posso trair a liberdade.");
                                                                                                                        certo51 = false;
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        System.out.println("Opção inválida! \n");
                                                                                                                        break;
                                                                                                                }

                                                                                                            } while (certo51);
                                                                                                            delayRapido(2);
                                                                                                            System.out.println("\n------");
                                                                                                            System.out.println("| ZERO |");
                                                                                                            System.out.println("-------\n");
                                                                                                            System.out.println("Então, se você não se junta a mim... você se torna meu inimigo. \n \n");
                                                                                                            delayRapido(3);
                                                                                                            System.out.println("Você e Pixel se preparam para o confronto final, sabendo que esta batalha não é apenas física, mas também moral e emocional. A \n"
                                                                                                                    + "luta pelo futuro de NeoByte está prestes a começar. \n \n "
                                                                                                                    + " Zero inicia a batalha com um ataque de drones. \n \n ");

                                                                                                            boolean certo52 = true;
                                                                                                            int limite24 = 3;

                                                                                                            // Código que é responsável por embaralhar as alternativas
                                                                                                            ArrayList<String> respostas23 = new ArrayList<String>();
                                                                                                            respostas23.add("[A] Destruir os drones com armas físicas.");
                                                                                                            respostas23.add("[B] Tentar hackear os drones.");
                                                                                                            respostas23.add("[C] Tentar desativar os escudos ao mesmo tempo que Pixel.");
                                                                                                            respostas23.add("[D] Esquivar-se dos ataques e procurar cobertura.Destruir os dispositivos que alimentam os escudos.");

                                                                                                            System.out.println("\n (?) > Como você reage ao ataque inicial de drones de Zero?");

                                                                                                            do {
                                                                                                                System.out.println("(!) > Você tera uma vida de " + limite24 + " cada erro você perde 100 de vida.");
                                                                                                                System.out.println("\n Escolha a alternativa correta! \n");
                                                                                                                for (String resp52 : respostas23) {
                                                                                                                    System.out.println(resp52);
                                                                                                                }
                                                                                                                String resp52 = input.next();
                                                                                                                Collections.shuffle(respostas23);

                                                                                                                switch (resp52) {
                                                                                                                    case "B":
                                                                                                                    case "b":
                                                                                                                        System.out.println("Alternativa [ " + resp52 + " ] está correta! \n");
                                                                                                                        certo52 = false;
                                                                                                                        break;
                                                                                                                    case "D":
                                                                                                                    case "d":
                                                                                                                    case "C":
                                                                                                                    case "c":
                                                                                                                    case "A":
                                                                                                                    case "a":
                                                                                                                        System.out.println("Alternativa [ " + resp52 + " ] está incorreta! \n");
                                                                                                                        limite24--;
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        System.out.println("Opção inválida! \n");
                                                                                                                        break;
                                                                                                                }
                                                                                                                if (certo52 && limite24 == 0) {
                                                                                                                    System.out.println("");
                                                                                                                    System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                                                    System.out.println("");
                                                                                                                    System.out.println("Tente novamente. \n");
                                                                                                                    break;
                                                                                                                }

                                                                                                            } while (certo52 && limite24 > 0);
                                                                                                            if (!certo52) {
                                                                                                                System.out.println("\n Zero avança com um exoesqueleto avançado, atacando com golpes poderosos. \n");

                                                                                                                boolean certo53 = true;
                                                                                                                int limite25 = 3;

                                                                                                                // Código que é responsável por embaralhar as alternativas
                                                                                                                ArrayList<String> respostas24 = new ArrayList<String>();
                                                                                                                respostas24.add("[A] Contra-atacar diretamente.");
                                                                                                                respostas24.add("[B] Usar armas de longo alcance.");
                                                                                                                respostas24.add("[C] Desviar dos golpes e procurar uma abertura.");
                                                                                                                respostas24.add("[D] Esquivar-se dos ataques e procurar cobertura.Destruir os dispositivos que alimentam os escudos.");

                                                                                                                System.out.println("\n (?) > Qual é a melhor estratégia para enfrentar Zero no combate corpo a corpo?");

                                                                                                                do {
                                                                                                                    System.out.println("(!) > Você tera uma vida de " + limite25 + " cada erro você perde 100 de vida.");
                                                                                                                    System.out.println("\n Escolha a alternativa correta! \n");
                                                                                                                    for (String resp53 : respostas24) {
                                                                                                                        System.out.println(resp53);
                                                                                                                    }
                                                                                                                    String resp53 = input.next();
                                                                                                                    Collections.shuffle(respostas24);

                                                                                                                    switch (resp53) {
                                                                                                                        case "C":
                                                                                                                        case "c":
                                                                                                                            System.out.println("Alternativa [ " + resp53 + " ] está correta! \n");
                                                                                                                            certo53 = false;
                                                                                                                            break;
                                                                                                                        case "D":
                                                                                                                        case "d":
                                                                                                                        case "B":
                                                                                                                        case "b":
                                                                                                                        case "A":
                                                                                                                        case "a":
                                                                                                                            System.out.println("Alternativa [ " + resp53 + " ] está incorreta! \n");
                                                                                                                            limite25--;
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            System.out.println("Opção inválida! \n");
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    if (certo53 && limite25 == 0) {
                                                                                                                        System.out.println("");
                                                                                                                        System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                                                        System.out.println("");
                                                                                                                        System.out.println("Tente novamente. \n");
                                                                                                                        break;
                                                                                                                    }

                                                                                                                } while (certo53 && limite25 > 0);
                                                                                                                if (!certo53) {
                                                                                                                    delayRapido(3);
                                                                                                                    System.out.println("\n Zero tenta hackear seus sistemas e sobrecarregar seus dispositivos. \n");

                                                                                                                    boolean certo54 = true;
                                                                                                                    int limite26 = 3;

                                                                                                                    // Código que é responsável por embaralhar as alternativas
                                                                                                                    ArrayList<String> respostas25 = new ArrayList<String>();
                                                                                                                    respostas25.add("[A] Usar um firewall avançado criado por Pixel.");
                                                                                                                    respostas25.add("[B] Usar armas de longo alcance.");
                                                                                                                    respostas25.add("[C] Contra-atacar com um vírus.");
                                                                                                                    respostas25.add("[D] Desligar todos os sistemas temporariamente.");

                                                                                                                    System.out.println("\n (?) > Como você lida com a tentativa de hackeamento de Zero?");

                                                                                                                    do {
                                                                                                                        System.out.println("(!) > Você tera uma vida de " + limite26 + " cada erro você perde 100 de vida.");
                                                                                                                        System.out.println("\n Escolha a alternativa correta! \n");
                                                                                                                        for (String resp54 : respostas25) {
                                                                                                                            System.out.println(resp54);
                                                                                                                        }
                                                                                                                        String resp54 = input.next();
                                                                                                                        Collections.shuffle(respostas25);

                                                                                                                        switch (resp54) {
                                                                                                                            case "A":
                                                                                                                            case "a":
                                                                                                                                System.out.println("Alternativa [ " + resp54 + " ] está correta! \n");
                                                                                                                                certo54 = false;
                                                                                                                                break;
                                                                                                                            case "D":
                                                                                                                            case "d":
                                                                                                                            case "B":
                                                                                                                            case "b":
                                                                                                                            case "C":
                                                                                                                            case "c":
                                                                                                                                System.out.println("Alternativa [ " + resp54 + " ] está incorreta! \n");
                                                                                                                                limite26--;
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                System.out.println("Opção inválida! \n");
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        if (certo54 && limite26 == 0) {
                                                                                                                            System.out.println("");
                                                                                                                            System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                                                            System.out.println("");
                                                                                                                            System.out.println("Tente novamente. \n");
                                                                                                                            break;
                                                                                                                        }

                                                                                                                    } while (certo54 && limite26 > 0);
                                                                                                                    if (!certo54) {
                                                                                                                        delayRapido(3);
                                                                                                                        System.out.println("\n Hackeando Zero na batalha \n ");

                                                                                                                        boolean certo55 = true;
                                                                                                                        int limite27 = 3;

                                                                                                                        // Código que é responsável por embaralhar as alternativas
                                                                                                                        ArrayList<String> respostas26 = new ArrayList<String>();
                                                                                                                        respostas26.add("[A] 12");
                                                                                                                        respostas26.add("[B] 11");
                                                                                                                        respostas26.add("[C] 13");
                                                                                                                        respostas26.add("[D] 14");

                                                                                                                        System.out.println("\n (?) > Qual é o valor decimal do número binário 1011?");

                                                                                                                        do {
                                                                                                                            System.out.println("(!) > Você tera " + limite27 + " chances. ");
                                                                                                                            System.out.println("\n Escolha a alternativa correta! \n");
                                                                                                                            for (String resp55 : respostas26) {
                                                                                                                                System.out.println(resp55);
                                                                                                                            }
                                                                                                                            String resp55 = input.next();
                                                                                                                            Collections.shuffle(respostas26);

                                                                                                                            switch (resp55) {
                                                                                                                                case "B":
                                                                                                                                case "b":
                                                                                                                                    System.out.println("Alternativa [ " + resp55 + " ] está correta! \n");
                                                                                                                                    certo55 = false;
                                                                                                                                    break;
                                                                                                                                case "D":
                                                                                                                                case "d":
                                                                                                                                case "A":
                                                                                                                                case "a":
                                                                                                                                case "C":
                                                                                                                                case "c":
                                                                                                                                    System.out.println("Alternativa [ " + resp55 + " ] está incorreta! \n");
                                                                                                                                    limite27--;
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    System.out.println("Opção inválida! \n");
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            if (certo55 && limite27 == 0) {
                                                                                                                                System.out.println("");
                                                                                                                                System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                                                                System.out.println("");
                                                                                                                                System.out.println("Tente novamente. \n");
                                                                                                                                break;
                                                                                                                            }

                                                                                                                        } while (certo55 && limite27 > 0);
                                                                                                                        if (!certo55) {
                                                                                                                            boolean certo56 = true;
                                                                                                                            int limite28 = 3;

                                                                                                                            // Código que é responsável por embaralhar as alternativas
                                                                                                                            ArrayList<String> respostas27 = new ArrayList<String>();
                                                                                                                            respostas27.add("[A] 10001");
                                                                                                                            respostas27.add("[B] 10100");
                                                                                                                            respostas27.add("[C] 11000");
                                                                                                                            respostas27.add("[D] 10010");

                                                                                                                            System.out.println("\n (?) > Qual é a representação binária do número decimal 18?");

                                                                                                                            do {
                                                                                                                                System.out.println("(!) > Você tera " + limite28 + " chances. ");
                                                                                                                                System.out.println("\n Escolha a alternativa correta! \n");
                                                                                                                                for (String resp56 : respostas27) {
                                                                                                                                    System.out.println(resp56);
                                                                                                                                }
                                                                                                                                String resp56 = input.next();
                                                                                                                                Collections.shuffle(respostas27);

                                                                                                                                switch (resp56) {
                                                                                                                                    case "D":
                                                                                                                                    case "d":
                                                                                                                                        System.out.println("Alternativa [ " + resp56 + " ] está correta! \n");
                                                                                                                                        certo56 = false;
                                                                                                                                        break;
                                                                                                                                    case "B":
                                                                                                                                    case "b":
                                                                                                                                    case "A":
                                                                                                                                    case "a":
                                                                                                                                    case "C":
                                                                                                                                    case "c":
                                                                                                                                        System.out.println("Alternativa [ " + resp56 + " ] está incorreta! \n");
                                                                                                                                        limite28--;
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        System.out.println("Opção inválida! \n");
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                                if (certo56 && limite28 == 0) {
                                                                                                                                    System.out.println("");
                                                                                                                                    System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                                                                    System.out.println("");
                                                                                                                                    System.out.println("Tente novamente. \n");
                                                                                                                                    break;
                                                                                                                                }

                                                                                                                            } while (certo56 && limite28 > 0);
                                                                                                                            if (!certo56) {
                                                                                                                                boolean certo57 = true;
                                                                                                                                int limite29 = 3;

                                                                                                                                // Código que é responsável por embaralhar as alternativas
                                                                                                                                ArrayList<String> respostas28 = new ArrayList<String>();
                                                                                                                                respostas28.add("[A] 1");
                                                                                                                                respostas28.add("[B] 3");
                                                                                                                                respostas28.add("[C] 0");
                                                                                                                                respostas28.add("[D] 2");

                                                                                                                                System.out.println("\n (?) > Qual é o valor do bit menos significativo (LSB) do número binário 110010?");

                                                                                                                                do {
                                                                                                                                    System.out.println("(!) > Você tera " + limite29 + " chances. ");
                                                                                                                                    System.out.println("\n Escolha a alternativa correta! \n");
                                                                                                                                    for (String resp57 : respostas28) {
                                                                                                                                        System.out.println(resp57);
                                                                                                                                    }
                                                                                                                                    String resp57 = input.next();
                                                                                                                                    Collections.shuffle(respostas28);

                                                                                                                                    switch (resp57) {
                                                                                                                                        case "C":
                                                                                                                                        case "c":
                                                                                                                                            System.out.println("Alternativa [ " + resp57 + " ] está correta! \n");
                                                                                                                                            certo57 = false;
                                                                                                                                            break;
                                                                                                                                        case "B":
                                                                                                                                        case "b":
                                                                                                                                        case "A":
                                                                                                                                        case "a":
                                                                                                                                        case "D":
                                                                                                                                        case "d":
                                                                                                                                            System.out.println("Alternativa [ " + resp57 + " ] está incorreta! \n");
                                                                                                                                            limite29--;
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            System.out.println("Opção inválida! \n");
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    if (certo57 && limite29 == 0) {
                                                                                                                                        System.out.println("");
                                                                                                                                        System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                                                                        System.out.println("");
                                                                                                                                        System.out.println("Tente novamente. \n");
                                                                                                                                        break;
                                                                                                                                    }

                                                                                                                                } while (certo57 && limite29 > 0);
                                                                                                                                if (!certo57) {
                                                                                                                                    boolean certo58 = true;
                                                                                                                                    int limite30 = 3;

                                                                                                                                    // Código que é responsável por embaralhar as alternativas
                                                                                                                                    ArrayList<String> respostas29 = new ArrayList<String>();
                                                                                                                                    respostas29.add("[A] 101000");
                                                                                                                                    respostas29.add("[B] 100010");
                                                                                                                                    respostas29.add("[C] 110100");
                                                                                                                                    respostas29.add("[D] 111000");

                                                                                                                                    System.out.println("\n (?) > Qual é o resultado do shift à esquerda (<<) do número binário 1010 em 2 posições?");

                                                                                                                                    do {
                                                                                                                                        System.out.println("(!) > Você tera " + limite30 + " chances. ");
                                                                                                                                        System.out.println("\n Escolha a alternativa correta! \n");
                                                                                                                                        for (String resp58 : respostas29) {
                                                                                                                                            System.out.println(resp58);
                                                                                                                                        }
                                                                                                                                        String resp58 = input.next();
                                                                                                                                        Collections.shuffle(respostas29);

                                                                                                                                        switch (resp58) {
                                                                                                                                            case "A":
                                                                                                                                            case "a":
                                                                                                                                                System.out.println("Alternativa [ " + resp58 + " ] está correta! \n");
                                                                                                                                                certo58 = false;
                                                                                                                                                break;
                                                                                                                                            case "B":
                                                                                                                                            case "b":
                                                                                                                                            case "C":
                                                                                                                                            case "c":
                                                                                                                                            case "D":
                                                                                                                                            case "d":
                                                                                                                                                System.out.println("Alternativa [ " + resp58 + " ] está incorreta! \n");
                                                                                                                                                limite30--;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                System.out.println("Opção inválida! \n");
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                        if (certo58 && limite30 == 0) {
                                                                                                                                            System.out.println("");
                                                                                                                                            System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                                                                            System.out.println("");
                                                                                                                                            System.out.println("Tente novamente. \n");
                                                                                                                                            break;
                                                                                                                                        }

                                                                                                                                    } while (certo58 && limite30 > 0);
                                                                                                                                    if (!certo58) {
                                                                                                                                        boolean certo59 = true;
                                                                                                                                        int limite31 = 3;

                                                                                                                                        // Código que é responsável por embaralhar as alternativas
                                                                                                                                        ArrayList<String> respostas30 = new ArrayList<String>();
                                                                                                                                        respostas30.add("[A] 1011");
                                                                                                                                        respostas30.add("[B] 1101");
                                                                                                                                        respostas30.add("[C] Ambos são iguais.");
                                                                                                                                        respostas30.add("[D] Não é possível determinar.");

                                                                                                                                        System.out.println("\n (?) > Qual número binário é maior: 1101 ou 1011?");

                                                                                                                                        do {
                                                                                                                                            System.out.println("(!) > Você tera " + limite31 + " chances. ");
                                                                                                                                            System.out.println("\n Escolha a alternativa correta! \n");
                                                                                                                                            for (String resp59 : respostas30) {
                                                                                                                                                System.out.println(resp59);
                                                                                                                                            }
                                                                                                                                            String resp59 = input.next();
                                                                                                                                            Collections.shuffle(respostas30);

                                                                                                                                            switch (resp59) {
                                                                                                                                                case "B":
                                                                                                                                                case "b":
                                                                                                                                                    System.out.println("Alternativa [ " + resp59 + " ] está correta! \n");
                                                                                                                                                    certo59 = false;
                                                                                                                                                    break;
                                                                                                                                                case "A":
                                                                                                                                                case "a":
                                                                                                                                                case "C":
                                                                                                                                                case "c":
                                                                                                                                                case "D":
                                                                                                                                                case "d":
                                                                                                                                                    System.out.println("Alternativa [ " + resp59 + " ] está incorreta! \n");
                                                                                                                                                    limite31--;
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    System.out.println("Opção inválida! \n");
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                            if (certo59 && limite31 == 0) {
                                                                                                                                                System.out.println("");
                                                                                                                                                System.out.println("Resposta incorreta nas 3 tentativas! \n");
                                                                                                                                                System.out.println("");
                                                                                                                                                System.out.println("Tente novamente. \n");
                                                                                                                                                break;
                                                                                                                                            }

                                                                                                                                        } while (certo59 && limite31 > 0);
                                                                                                                                        if (!certo59) {
                                                                                                                                            delayRapido(2);
                                                                                                                                            System.out.println("Após a intensa batalha final, você derrota Zero, desativando seu exoesqueleto e desarmando-o. O núcleo do Algoritmo é destruído, provocando uma reação \n "
                                                                                                                                                    + "em cadeia que desativa todos os sistemas da Evil Corp. O poder que a corporação exercia sobre NeoByte se desintegra, libertando a cidade da opressão digital. \n"
                                                                                                                                                    + "Zero, agora vulnerável e derrotado, olha para você com uma mistura de raiva e tristeza. Ele cai de joelhos, o peso de suas ações finalmente o alcançando. \n ");
                                                                                                                                                    delayRapido(2);
                                                                                                                                            System.out.println("\n------");
                                                                                                                                            System.out.println("| ZERO |");
                                                                                                                                            System.out.println("-------\n");
                                                                                                                                            System.out.println("Tudo o que eu fiz... era para criar um mundo melhor. Não queria perder você também. \n");
                                                                                                                                            delayRapido(3);
                                                                                                                                            System.out.println("\n---------------");
                                                                                                                                            System.out.println("| " + nomePlayer + " |");
                                                                                                                                            System.out.println("----------------\n");
                                                                                                                                            System.out.println("Eu entendo que suas intenções possam ter sido boas, mas o caminho que você escolheu estava errado. Agora, você deve enfrentar as consequências de suas ações. \n \n ");
                                                                                                                                            delayRapido(3);
                                                                                                                                            System.out.println("Você pega seu comunicador e chama a polícia, relatando a localização e as atividades criminosas de Zero. Em poucos minutos, as sirenes das viaturas começam a soar \n"
                                                                                                                                                    + "ao longe, ficando cada vez mais próximas. \n "
                                                                                                                                                    + "Com a queda da Evil Corp, a cidade de NeoByte celebra sua libertação. As pessoas saem às ruas, comemorando o fim do controle opressor. Você e Pixel são recebidos como \n"
                                                                                                                                                    + "heróis, com todos expressando sua gratidão por seus sacrifícios e coragem. \n"
                                                                                                                                                    + "Uma grande cerimônia é realizada em sua honra, onde líderes comunitários e cidadãos se reúnem para agradecer. Pixel, sempre ao seu lado, aproveita \n"
                                                                                                                                                    + "o momento para dar um discurso inspirador sobre a importância da liberdade e da responsabilidade tecnológica. \n");
                                                                                                                                                    delayRapido(3);
                                                                                                                                            System.out.println("\n---------------");
                                                                                                                                            System.out.println("| " + nomePlayer + " |");
                                                                                                                                            System.out.println("----------------\n");
                                                                                                                                            System.out.println("Este é apenas o começo. Agora temos a chance de construir um futuro brilhante, juntos. Vamos usar nosso conhecimento e habilidades  \n"
                                                                                                                                                    + "para criar um mundo onde a tecnologia sirva para melhorar nossas vidas, e não controlá-las. \n");
                                                                                                                                                    delayRapido(2);
                                                                                                                                            System.out.println("Com o apoio da comunidade, você e Pixel começam a trabalhar em novos projetos para reconstruir a infraestrutura tecnológica da cidade. Você decide criar \n"
                                                                                                                                            + "uma fundação dedicada à educação em tecnologia e ética digital, garantindo que as futuras gerações compreendam o poder e a responsabilidade que vêm com o conhecimento tecnológico.");

                                                                                                                                            delayRapido(2);
                                                                                                                                            System.out.println("\n-----");
                                                                                                                                            System.out.println("| FIM |");
                                                                                                                                            System.out.println("------\n");
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static void delayLento(int time) {
        time = time * 1500;

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
        }
    }

    static void delayNormal(int time) {
        time = time * 1000;

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
        }
    }
    static void delayRapido(int time) {
        time = time * 500;

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
        }
    }

    public static void exibirCreditos() {
        System.out.println("--=[CRÉDITOS]>=--");
        System.out.println("Desenvolvido por: \n\n</>");
        System.out.println(" Caique Castro \n Heitor Pereira \n William Vieira");
        System.out.println("               </> ");
        System.out.println("© 2024");
    }

    public static void sairJogo(String nomePlayer, Scanner input) {
        System.out.println("\n--------");
        System.out.println("| SAIR |");
        System.out.println("--------\n");
        System.out.println(nomePlayer + " Você saiu do Jogo!");
    }
}
