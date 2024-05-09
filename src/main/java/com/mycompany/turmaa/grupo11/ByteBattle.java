
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

        System.out.println("Escolha um nome para o(a) personagem ? ");
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
                    System.out.println("Opção inválida, por favor Digite uma opção válida !");
                    break;
            }
        } while (!taCerto);
    }

    public static void exibirMenu(String nomePlayer, Scanner input) {
        System.out.println("");
        System.out.println("Olá " + nomePlayer);
        System.out.println("");
        System.out.println("Bem-vindo ao");
        System.out.println("");
            System.out.println("");

            // NOME DO JOGO 
            System.out.println(" ______                _             ______              _      _     __ ");
            System.out.println("|_   _ \\              / |_          |_   _ \\            / |_   / |_  [  |");
            System.out.println("  | |_) |    _   __  `| |-'  .---.    | |_) |   ,--.   `| |-' `| |-'  | |   .---. ");
            System.out.println("  |  __'.   [ \\ [  ]  | |   / /__\\\\   |  __'.  `'_\\ :   | |    | |    | |  / /__\\\\ ");
            System.out.println(" _| |__) |   \\ '/ /   | |,  | \\__.,  _| |__) | // | |,  | |,   | |,   | |  | \\__., ");
            System.out.println("|_______/  [\\_:  /    \\__/   '.__.' |_______/  \\';__/  \\__/   \\__/  [___]  '.__.' ");
            System.out.println("            \\__.' ");
            System.out.println("");
            System.out.println("Desvendando o algoritmo");

            // MENU
            System.out.println("------------------------");
            System.out.println("|    <1> Instruções    |");
            System.out.println("|    <2> Jogar         |");
            System.out.println("|    <3> Créditos      |");
            System.out.println("|    <4> Sair          |");
            System.out.println("------------------------");
            System.out.println("");
            System.out.println("Digite uma opçõo");
    }

    public static void exibirInstrucoes() {
        System.out.println("");
                    System.out.println("--------------");
                    System.out.println("| INSTRUÇÕES |");
                    System.out.println("--------------");
                    System.out.println("");
                    System.out.println("Como Jogar:");
                    System.out.println("Bem-vindo ao 'ByteBattle: Desvendando o algoritmo' Este é um jogo de RPG onde você assumirá o ");
                    System.out.println("papel de um(a) jovem aprendiz de programação.");
                    System.out.println("Sua missão é explorar cidades, aprender a história e os conceitos fundamentais da computação e ");
                    System.out.println("algoritmos e protegê-las dos ataques dos Hackers Sombrios.");
                    System.out.println("");
                    System.out.println("- Interaja com NPCs (personagens não-jogadores) para receber missôes e obter dicas.");
                    System.out.println("- Complete desafios de programação para aprimorar suas habilidades.");
                    System.out.println("- Lute contra os Hackers Sombrios em batalhas estratégicas baseadas em turnos.");
                    System.out.println("- Explore cidades para desvendar segredos e coletar itens valiosos.");
                    System.out.println("- Avance na história e torne-se um Guardião do Código lendário!");
    }

    public static void iniciarJogo(String nomePlayer, Scanner input) {
         // INÍCIO DO JOGO
                    System.out.println("");
                    System.out.println("---------");
                    System.out.println("| JOGAR |");
                    System.out.println("---------");
                    System.out.println("");

                    System.out.println("Seja bem-vindo a ");
                    System.out.println("");
                    System.out.println("-----------");
                    System.out.println("| NeoByte |");
                    System.out.println("-----------");
                    System.out.println("");
                    System.out.println("NeoByte é uma metrópole contemporânea. As ruas são repletas de prédios de tijolos e concreto, a");
                    System.out.println("cidade é diversificada e multicultural, com diferentes bairros refletindo as diversas origens e estilos de");
                    System.out.println("vida dos seus habitantes. Há áreas comerciais movimentadas, onde os arranha-céus ");
                    System.out.println("se elevam em direção ao céu, contrastando com os bairros residenciais.");
                    System.out.println("");
                    System.out.println("Em NeoByte, a divisão entre riqueza e pobreza é tão evidente quanto os bytes que circulam pela rede. No");
                    System.out.println("coração da cidade, erguem-se os imponentes arranha-céus dos distritos financeiros, com suas fachadas de vidro");
                    System.out.println("reluzente e interiores luxuosos. Esses bairros centrais são o lar dos magnatas digitais, onde executivos das maiores");
                    System.out.println("corporações de tecnologia desfrutam de vistas panorâmicas da paisagem urbana e acessam as últimas inovações tecnológicas.");
                    System.out.println("E nos confins de NeoByte, além das fronteiras brilhantes dos outros distritos, encontra-se o subúrbio digital. Aqui,");
                    System.out.println("as ruas são estreitas e escuras, com prédios decrépitos, sem vida e fachadas desbotadas. Os habitantes do");
                    System.out.println("subúrbio são os esquecidos da sociedade, lutando para sobreviver em meio à pobreza e ao desespero. Nesses");
                    System.out.println("bairros negligenciados, a vida é marcada pela luta diária pela sobrevivência, briga de facções e a desigualdade social. Os ");
                    System.out.println("apartamentos são pequenos e apertados, com pouca luz natural e condições precárias de moradia. Os moradores do subúrbio");
                    System.out.println("vivem à margem da sociedade, lutando para encontrar empregos instáveis e acessar recursos básicos, como alimentação e saúde.");
                    System.out.println("");

                    boolean continuar1 = true;

                    do { 
                        System.out.println("Aperte ' C ' para continuar.");
                        System.out.println("");
                        String cont = input.next();

                        switch(cont){
                            case "C":
                            case "c":
                                System.out.println("Continuando...");
                                System.out.println("");
                                continuar1 = false;
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                System.out.println("");
                                break;   
                        }
                    } while (continuar1);

                    System.out.println("Nos sombrios becos do subúrbio de NeoByte, nascia um(a) jovem com destino marcado pela tragédia e pela");
                    System.out.println("incerteza. O(A) protagonista, cujo nome é conhecido apenas como " + nomePlayer + ",");
                    System.out.println("que emergia nas ruas como uma figura enigmática, cuja origem permanece envolta de um mistério.");
                    System.out.println("");
                    System.out.println("A vida de " + nomePlayer + " começou com uma tragédia devastadora. Perdeu seus pais em circunstâncias obscuras");
                    System.out.println("quando ainda era pequeno(a), deixando-o(a) órfão e desamparado(a). Sem recursos ou apoio, ele(a) foi forçado(a) a");
                    System.out.println("enfrentar a dura realidade do subúrbio, onde a vida era uma luta diária pela sobrevivência.");
                    System.out.println("Apesar das adversidades, " + nomePlayer + " era dotado(a) de uma mente brilhante e uma determinação inabalável.");
                    System.out.println("Desde cedo, demonstrou uma aptidão excepcional para a computação e uma habilidade inata para a arte");
                    System.out.println("do hacking. Ele(a) passava horas intermináveis em seu computador, explorando os recantos mais");
                    System.out.println("escuros da rede e dominando os segredos da tecnologia. Ele(a) manipulava sistemas, quebrava códigos e desafiava");
                    System.out.println("as defesas mais sofisticadas com uma destreza impressionante.");
                    System.out.println("No entanto, sua forte personalidade e sua recusa em se curvar às convenções sociais o(a) tornaram um pária no mundo digital.");
                    System.out.println("Por isso era incapaz de manter um emprego fixo, pois sua natureza rebelde e sua tendência a desafiar a autoridade frequentemente ");
                    System.out.println("o(a) colocavam em conflito com seus empregadores. Assim, ele(a) vagava pelas ruas, um(a) estranho(a) solitário(a) em um");
                    System.out.println("mundo que nunca o acolheu verdadeiramente. Apesar de sua devoção à sua arte, " + nomePlayer + " luta com seus próprios");
                    System.out.println("demônios internos. Ele(a) é assombrado(a) por pesadelos recorrentes de sua infância perdida e da perda de seus pais, ");
                    System.out.println("que o assombram todas as noites. Essas memórias dolorosas o(a) empurram para a solidão, tornando difícil para ele(a) se ");
                    System.out.println("abrir e confiar nos outros.");
                    System.out.println("No entanto, apesar de suas cicatrizes emocionais, e suas habilidades incríveis com programação, ele(a) cria um amigo");
                    System.out.println("virtul, um 'holograma' e da o nome de 'Pixel', onde ele foi criado com intuito de ajudar o(a) " + nomePlayer + " a hackear");
                    System.out.println("e capturar dados e redes de tudo que acontece em NeoByte.");

                    

                    // ERRO ao apertar outra tecla a não ser o Y 
                    // INÍCIO
                        boolean certo1 = true;
                    do{
                        System.out.println("");
                        System.out.println("Aperte ' Y ' para escutar Pixel ");
                        String resp1 = input.next();

                        switch(resp1){
                            case "Y":
                            case "y":
                                System.out.println("");
                                System.out.println("---------");
                                System.out.println("| Pixel |");
                                System.out.println("---------");
                                System.out.println("");
                                System.out.println( "Olá " + nomePlayer + ", minha sincera gratidão por me dar vida e propósito. Como um holograma, minha");
                                System.out.println("existência é um reflexo direto do seu incrível trabalho e dedicação. Sou grato por ter sido criado com");
                                System.out.println("o propósito de auxiliar em missões vitais.");
                                System.out.println("Me acompanhe... '");
                                System.out.println("");
                                 

                                certo1 = false;
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                System.out.println("");
                                break;
                        }
                    }while(certo1);
                    // FIM

                    System.out.println("");
                    System.out.println("Em um beco escuro no subúrbio, pixel te leva em uma sala, cercado por telas digitais piscando. Uma voz ecoa pelo");
                    System.out.println("ambiente, que o ensina sobre a história do Conceito da Computação.");

                    // ERRO ao apertar outra tecla a não ser o Y 
                    // INÍCIO
                    boolean certo2 = true;

                    do{

                            System.out.println("");
                            System.out.println("Aperte ' Y ' para escutar a voz misteriosa ");
                            String resp2 = input.next();

                            switch(resp2){
                                case "Y":
                                case "y":
                                    System.out.println("");
                                    System.out.println("--------------------");
                                    System.out.println("|  Voz Misteriosa  |");
                                    System.out.println("--------------------");
                                    System.out.println("");
                                    System.out.println("Olá " + nomePlayer + ", vou te contar uma história.");
                                    System.out.println("A história de Conceitos Binários na Computação: ");
                                    System.out.println("");
                                    System.out.println("Sistema Binário: ");
                                    System.out.println("O sistema binário é a base fundamental da computação moderna, representando informações usando apenas  ");
                                    System.out.println("dois símbolos: 0 e 1. Esses símbolos são chamados de bits (binary digits).");
                                    System.out.println("");
                                    System.out.println("Bit:");
                                    System.out.println("Um bit é a menor unidade de informação em sistemas computacionais. Ele pode ter o valor de 0 ");
                                    System.out.println("ou 1, representando os estados de ' ligado ' e ' desligado ', respectivamente.");
                                    System.out.println("");
                                    System.out.println("Byte:");
                                    System.out.println("Um byte é uma unidade de armazenamento de dados que consiste em 8 bits. É comumente ");
                                    System.out.println("usado para representar caracteres individuais de texto ou números na memória do computador.");
                                    System.out.println("");
                                    System.out.println("Representação de Números:");
                                    System.out.println("No sistema binário, os números são representados usando apenas os dígitos 0 e 1. Cada dígito binário tem um");
                                    System.out.println("valor que é uma potência de 2, começando do bit menos significativo para o mais significativo.");
                                    System.out.println("");
                                    System.out.println("Operações Binárias: ");
                                    System.out.println("As operações binárias incluem adição, subtração, multiplicação e divisão de números binários. Essas ");
                                    System.out.println("operações seguem regras específicas, semelhantes às operações aritméticas em sistemas numéricos decimais.");
                                    System.out.println("");
                                    System.out.println("Código Binário: ");
                                    System.out.println("O código binário é usado para representar instruções e dados em linguagem de máquina, que é a linguagem ");
                                    System.out.println("que os computadores entendem diretamente. Cada instrução ou caractere é representado por uma sequência de bits.");
                                    System.out.println("");
                                    System.out.println("Lógica Binária: ");
                                    System.out.println("A lógica binária é a base da computação digital e envolve operações lógicas como AND, OR e NOT. Essas operações");
                                    System.out.println("são fundamentais para o funcionamento dos circuitos digitais e sistemas de computação.");
                                    System.out.println("");
                                    certo2 = false;
                                    break;
                                default:
                                    System.out.println("Opção inválida");
                                    System.out.println("");
                                    break;
                            }

                    }while(certo2);
                      // FIM

                    // Perguntas para responder apenas com 'Y / N'
                    // Caso 'Y' vai para proxima pergunta 
                    // Caso 'N' mostra uma representação do que é 
                    boolean certo3 = true;

                    do{
                        System.out.println("Sabe o que é números Binários ?");
                        System.out.println("Y / N");
                        String resp3 = input.next();

                        if(resp3.equalsIgnoreCase("Y")){
                            switch(resp3){
                                case "Y":
                                case "y":
                                    System.out.println("Continuando...");
                                    certo3 = false;
                                    break;
                            }
                        }else if(resp3.equalsIgnoreCase("N")){
                            switch(resp3){
                                case "N":
                                case "n":
                                    System.out.println("Representação de números Binários.");
                                    System.out.println("");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("| Decimal |  BINÁRIO  | Decimal |  BINÁRIO  |");
                                    System.out.println("|--------------------------------------------");
                                    System.out.println("|    1    |    0001   |    10   |    1010   |");
                                    System.out.println("|--------------------------------------------");
                                    System.out.println("|    2    |    0010   |    11   |    1011   |");
                                    System.out.println("|--------------------------------------------");
                                    System.out.println("|    3    |    0011   |    12   |    1100   |");
                                    System.out.println("|--------------------------------------------");
                                    System.out.println("|    4    |    0100   |    13   |    1101   |");
                                    System.out.println("|--------------------------------------------");
                                    System.out.println("|    5    |    0101   |    14   |    1110   |");
                                    System.out.println("|--------------------------------------------");
                                    System.out.println("|    6    |    0110   |    15   |    1111   |");
                                    System.out.println("|--------------------------------------------");
                                    System.out.println("|    7    |    0111   |    16   |    10000  |");
                                    System.out.println("|--------------------------------------------");
                                    System.out.println("|    8    |    1000   |    17   |    10001  |");
                                    System.out.println("|--------------------------------------------");
                                    System.out.println("|    9    |    1001   |    18   |    10010  |");
                                    System.out.println("|--------------------------------------------");
                                    System.out.println("");
                                    System.out.println("Nesta tabela, vemos os números de 0 a 18 escritos na forma decimal e na forma binária.");
                                    
                                    certo3 = false;
                                    break;
                                default:
                                    System.out.println("Opção inválida");
                                    System.out.println("");
                                    break;
                            }
                        }
                    }while(certo3); 

                    System.out.println("");
                    System.out.println("Conversão de binário para decimal ");
                    System.out.println("Cada posição tem um peso de uma potência de 2 (base do sistema binário). Sendo assim,");
                    System.out.println("para se converter um número de binário para decimal, deve-se multiplicar cada bit pela ");
                    System.out.println("potência de sua posição e somar os resultados.");

                    boolean certo4 = true;

                    do{
                        System.out.println("Sabe qual é a base do sistema Binário ?");
                        System.out.println("Y / N");
                        String resp4 = input.next();

                        if(resp4.equalsIgnoreCase("Y")){
                            switch(resp4){
                                case "Y":
                                case "y":    
                                    System.out.println("");
                                    certo4 = false;
                                    break;
                            }
                        }else if(resp4.equalsIgnoreCase("N")){
                            switch(resp4){
                                case "N":
                                case "n": 
                                    System.out.println("Representação da tabela da base de sistemas binários .");
                                    System.out.println("");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("|  128  |  64  |  32  |  16  |  8  |  4  |  2  |  1  |");
                                    System.out.println("|----------------------------------------------------|");
                                    System.out.println("");
                                    System.out.println("Vamos a um exemplo: convertendo número Decimal 206 para Binário");
                                    System.out.println("");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("|  128  |  64  |  32  |  16  |  8  |  4  |  2  |  1  |");
                                    System.out.println("|----------------------------------------------------|");
                                    System.out.println("|   1   |   1  |   0  |   0  |  1  |  1  |  1  |  0  |");
                                    System.out.println("|----------------------------------------------------|");
                                    System.out.println("somando: 128 + 64 + 8 + 4 + 2 = 206 ");
                                    System.out.println("");
                                    
                                    certo4 = false;
                                    break;
                                default:    
                                    System.out.println("Opção Inválida");
                                    System.out.println("");
                                    break;
                            }
                        }
                    }while(certo4);
                    // FIM


                    boolean continuar = true;

                    do{
                        System.out.println("");
                        System.out.println("Podemos continuar ?");
                        System.out.println("");
                        System.out.println("Y / N");
                        String cont = input.next();

                        if(cont.equalsIgnoreCase("Y")){
                            switch(cont){
                                case "Y":
                                case "y":  
                                    System.out.println("");
                                    continuar = false;
                                    break;
                            }
                        }else if(cont.equalsIgnoreCase("N")){
                            switch(cont){
                                case "N":
                                case "n":
                                    System.out.println("Leia novamente");
                                    break;

                                default:
                                    System.out.println("Opção inválida");
                                    System.out.println("");
                                    break;
                            }

                        }
                    }while(continuar);

                    System.out.println("");
                    System.out.println("Conversão de decimal para binário.  ");
                    System.out.println("Para realizar a conversão de decimal para binário, realiza-se a divisão");
                    System.out.println("sucessiva por 2 (base do sistema binário). O resultado da conversão será");
                    System.out.println("dado pelo último quociente e o agrupamento dos restos de divisão será o ");
                    System.out.println("número binário.");
                    System.out.println("Essa conversão foi demonstrada no exemplo acima 'Sabe qual é a base do sistema Binário'.");
                    
                    System.out.println("");

                    boolean certo5 = true;

                    do{
                        System.out.println("");
                        System.out.println("Está entendendo até aqui ?");
                        System.out.println("");
                        System.out.println("Y / N");
                        String resp5 = input.next();

                        if(resp5.equalsIgnoreCase("Y")){
                            switch(resp5){
                                case "Y":
                                case "y":  
                                    System.out.println("Vamos ver...");
                                    certo5 = false;
                                    break;
                            }
                        }else if(resp5.equalsIgnoreCase("N")){
                            switch(resp5){
                                case "N":
                                case "n":
                                    System.out.println("Leia novamente");
                                    break;

                                default:
                                    System.out.println("Opção inválida");
                                    System.out.println("");
                                    break;
                            }

                        }
                    }while(certo5);

                    // Perguntas dissertativas com 3 chances de acerto, caso erre todas o jogo reinicia 
                    // As alternativas vão se embaralhando caso o jogador erre
                    //INÍCIO
                     boolean certo6 = true;
                    int limite = 0;

                    // Código que é responsável por embaralhar as alternativas
                    ArrayList<String> respostas = new ArrayList<String>();
                    respostas.add("<A> 11111011100.");
                    respostas.add("<B> 110111.");
                    respostas.add("<C> 111110111000.");
                    respostas.add("<D> 111110111.");

                    do{
                        limite++;
                        System.out.println("");
                        System.out.println("Você tera 3 chances");
                        System.out.println("");
                        System.out.println("Os computadores utilizam o sistema binário ou de base 2 que é um sistema de");
                        System.out.println("numeração em que todas as quantidades se representam com base em dois números,");
                        System.out.println("ou seja, (0 e 1). Em um computador o número 2012, em base decimal, será representado, em base binária, por:");
                        System.out.println("");
                        System.out.println("Escolha a alternativa correta! ");
                        for(String resp6 : respostas ){
                            System.out.println(resp6);
                        }
                        String resp6 = input.next();
                        Collections.shuffle(respostas);

                        switch(resp6){
                            case "A":
                            case "a": 
                                System.out.println("Aternativa ' " + resp6 + " ' está correta! ");
                                certo6 = false;
                                break;
                            case "B":
                            case "b":
                            case "C":
                            case "c":
                            case "D":
                            case "d":
                                System.out.println("Aternativa está incorreta!");
                                break;
                            default:
                                System.out.println("Opção inválida");
                                System.out.println("");
                                break;
                        }
                        if(certo6 && limite >= 3){
                            System.out.println("");
                            System.out.println("Resposta incorreta nas 3 tentativas!");
                            System.out.println("");
                            System.out.println("Tente novamente");
                            break;
                        }

                    }while(certo6 && limite < 3);
                    if(!certo6){  // Código onde não deixa o jogador avançar para a próxima perguinta caso ele erre as 3 chances
                        boolean certo7 = true;
                        int limite1 = 0;

                        // Código que é responsável por embaralhar as alternativas
                        ArrayList<String> respostas1 = new ArrayList<String>();
                        respostas1.add("<A> 5.");
                        respostas1.add("<B> 8.");
                        respostas1.add("<C> 10.");
                        respostas1.add("<D> 12.");

                        do{
                            limite1++;
                            System.out.println("");
                            System.out.println("Qual é o valor em decimal do número binário 1010?");
                            System.out.println("");
                            System.out.println("Escolha a alternativa correta! ");
                            for(String resp7 : respostas1){
                                System.out.println(resp7);
                            }
                            String resp7 = input.next();
                            Collections.shuffle(respostas1);

                            switch(resp7){
                                case "A":
                                case "a":
                                    System.out.println("Aternativa está incorreta! ");
                                    break;
                                case "B":
                                case "b":
                                     System.out.println("Aternativa está incorreta! ");
                                     break;
                                case "C":
                                case "c": 
                                    System.out.println("Aternativa ' " + resp7 + " ' está correta! ");
                                    certo7 = false;
                                    break;
                                case "D":
                                case "d":
                                    System.out.println("Aternativa está incorreta!");
                                    break;
                                default:
                                    System.out.println("Opção inválida");
                                    System.out.println("");
                                    break;
                            }
                            if(certo7 && limite1 >= 3){
                                System.out.println("");
                                System.out.println("Resposta incorreta nas 3 tentativas!");
                                System.out.println("");
                                System.out.println("Tente novamente");
                                break;
                            }
                        }while(certo7 && limite1 < 3);
                        // Fim das perguntas 

                        if(!certo7){     // Código onde não deixa o jogador avançar para a próxima perguinta caso ele erre as 3 chances
                            System.out.println("Muito bem!");
                            System.out.println("");
                            System.out.println("Em resumo, os conceitos binários na computação são essenciais para entender como os ");
                            System.out.println("computadores armazenam, processam e transmitem informações usando apenas dois estados ");
                            System.out.println("distintos: 0 e 1. Essa simplicidade subjacente é o que permite a complexidade e versatilidade dos ");
                            System.out.println("sistemas computacionais modernos.");
                            System.out.println("");


                            boolean certo8 = true;

                            do{
                                System.out.println("");
                                System.out.println("Podemos continuar ?");
                                System.out.println("");
                                System.out.println("Y / N");
                                String resp8 = input.next();

                                if(resp8.equalsIgnoreCase("Y")){
                                    switch(resp8){
                                        case "Y":
                                        case "y":  
                                            System.out.println("");
                                            certo8 = false;
                                            break;
                                    }
                                }else if(resp8.equalsIgnoreCase("N")){
                                    switch(resp8){
                                        case "N":
                                        case "n":
                                            System.out.println("Leia novamente");
                                            break;

                                        default:
                                            System.out.println("Opção inválida");
                                            System.out.println("");
                                            break;
                                    }

                                }
                            }while(certo8);

                            System.out.println("Jovem " + nomePlayer + ", na tela atraz de você tem mais um pouco sobre Binários,");
                            System.out.println("va até lá e veja as informações.");

                            boolean certo9 = true;
                            do{
                                 System.out.println("");
                                System.out.println("Aperte ' Y ' para ir pra tela com mais informações.");
                                System.out.println("");
                                String resp9 = input.next();

                                    switch(resp9){
                                        case "Y":
                                        case "y":  
                                                        
                                            System.out.println("Os sistemas binários são a base fundamental de toda a computação moderna. Eles constituem a");
                                            System.out.println("linguagem básica que os computadores entendem e com a qual operam. Aqui está mais sobre os ");
                                            System.out.println("sistemas binários: ");
                                            System.out.println("");
                                            System.out.println("Base 2:");
                                            System.out.println("O sistema binário é um sistema de numeração posicional que utiliza apenas dois símbolos: 0 e 1.");
                                            System.out.println("Cada dígito em um número binário é chamado de bit (abreviação de binary digit).");
                                            System.out.println("Base 2:O bit mais à direita em um número binário representa 2^0, o próximo representa 2^1,");
                                            System.out.println("o seguinte 2^2, e assim por diante, cada posição representando uma potência de 2.");
                                            System.out.println("");
                                            System.out.println("Representação de Dados:");
                                            System.out.println("No nível mais fundamental, todos os dados em um computador são representados usando ");
                                            System.out.println("sequências de 0s e 1s.");
                                            System.out.println("Cada caractere, número, imagem, som ou qualquer outra forma de dados é representado por ");
                                            System.out.println("uma combinação de bits.");
                                            System.out.println("Por exemplo, um caractere ASCII é representado por 8 bits (um byte), permitindo a representação ");
                                            System.out.println("de 256 caracteres diferentes.");
                                            System.out.println("");
                                            
                                            System.out.println("");

                                            certo9 = false;
                                            break;
                                        default:
                                            System.out.println("Opção inválida");
                                            System.out.println("");
                                            break;    
                                    }

                            }while(certo9);

                            boolean certo10 = true;
                            do{
                                System.out.println("");
                                System.out.println("Aperte ' y ' para ir a tela de John von Neumann ");
                                String resp10 = input.next();

                                    switch(resp10){
                                        case "Y":
                                        case "y":
                                            System.out.println("");
                                            System.out.println("-----------------------");
                                            System.out.println("| John von Neumann... |");
                                            System.out.println("-----------------------");
                                            System.out.println("");
                                            System.out.println("Nasci em 28 de Dezembro de 1903, em Budapest, Hungary e morri dia 8 de Fevereiro de 1957, em Washington DC");
                                            System.out.println("Meu interesse por computadores foi diferente pois eu conseguia visualizar a aplicação na solução");
                                            System.out.println(" de problemas matemáticos e não apenas na geração de tabelas.");
                                            System.out.println("Durante a Guerra, meus conhecimentos de hidráulica, balistica, meteorologia, teoria de jogos e");
                                            System.out.println(" estatística foram colocados em prática em diversos projetos.");
                                            System.out.println("Eu juntei as necessidades do projeto Manhattan a capacidade dos primeiro engenheiros da Moore ");
                                            System.out.println("School of Electrical Engineering que estavam construindo o ENIAC, e em seguida o meu próprio projeto o");
                                            System.out.println("IAS. Varios supercomputadores foram construidos pela National Laboratories como copias destas máquinas.");
                                            System.out.println("Após o final da guerra me concentrei em desenvolver o computador do Institute for Advanced");
                                            System.out.println(" Studies (IAS) e suas copias pelo mundo. Meu trabalho após a Guerra continuou no desenvolvimento de soluções");
                                            System.out.println("para a construção da bomba de hidrogénio. ");
                                            System.out.println("Mais um pouco sobre a minha história...");
                                            System.out.println("John von Neumann, com sua sabedoria profunda, compartilha sua visão da arquitetura de ");
                                            System.out.println("computadores. Ele descreve o conceito inovador que leva seu nome e explica como ele");
                                            System.out.println("influenciou o design dos computadores modernos. Você entende como a separação entre ");
                                            System.out.println("hardware e software revolucionou a forma como os computadores funcionam.");
                                            certo10 = false;
                                            break;
                                        default:
                                            System.out.println("Opção inválida!");
                                            System.out.println("");
                                            break;    
                                    }
                            }while(certo10);

                            System.out.println("");
                            System.out.println("Após escutar o que Alan Turing e John von Neumann tinham para te falar, a voz misteriosa ");
                            System.out.println("surge mais uma vez.");
                            System.out.println("");
                            System.out.println("--------------------");
                            System.out.println("|  Voz Misteriosa  |");
                            System.out.println("--------------------");
                            System.out.println("");
                            System.out.println("Muito bem, responda corretamente e avance para a sua primeira missão");


                            // Perguntas dissertativas com 3 chances de acerto, caso erre todas o jogo reinicia 
                            // As alternativas vão se embaralhando caso o jogador erre
                            //INÍCIO                            
                            int limite2 = 0;
                            boolean certo11 = true;

                            // Código que é responsável por embaralhar as alternativas
                                ArrayList<String> respostas2 = new ArrayList<String>();
                                respostas2.add("<A> Desenvolveu o primeiro computador pessoal.");
                                respostas2.add("<B> Criou o primeiro sistema operacional.");
                                respostas2.add("<C> Desenvolveu a máquina Enigma para decifrar códigos secretos alemães.");
                                respostas2.add("<D> Nenhuma das opções.");
                            do{
                                limite2++;
                                System.out.println("--");
                                System.out.println("Você tera 3 chances");
                                System.out.println("--");
                                System.out.println("Quais foram as contribuições de Alan Turing para o campo da computação durante a Segunda Guerra Mundial ?");
                                System.out.println("-");
                                System.out.println("Escolha a alternativa correta! ");

                                for(String resp11 : respostas2){
                                    System.out.println(resp11);
                                }
                                String resp11 = input.next();
                                Collections.shuffle(respostas2);

                                switch(resp11){
                                    case "A":
                                    case "a":
                                        System.out.println("Aternativa está incorreta!");
                                        break;
                                    case "B":
                                    case "b":
                                        System.out.println("Aternativa está incorreta!");
                                        break;
                                    case "C":
                                    case "c":
                                        System.out.println("Aternativa ' " + resp11 + " ' está correta!");
                                        certo11 = false;
                                        break;
                                    case "D":
                                    case "d":
                                        System.out.println("Aternativa está incorreta!");
                                        break;
                                    default:
                                        System.out.println("Opção inválida!");
                                        break;
                                }

                                if( certo11 && limite2 >= 3){
                                    System.out.println("");
                                    System.out.println("Resposta incorreta nas 3 tentativas!");
                                    System.out.println("");
                                    System.out.println("Tente novamente");
                                    break;
                                }
                            }while(certo11 && limite2 < 3);
                            if(!certo11){

                                int limite3 = 0;
                                boolean certo12 = true;

                                // Código que é responsável por embaralhar as alternativas
                                ArrayList<String> respostas3 = new ArrayList<String>();
                                respostas3.add("<A> Um sistema de comunicação criptografado usado pela resistencia.");
                                respostas3.add("<B> Um dispositivo de cálculo que serviu como precursor dos computadores modernos.");
                                respostas3.add("<C> Uma máquina de cafe que Alan Turing inventou durante a guerra.");
                                respostas3.add("<D> Nenhuma das opções.");

                                do{
                                    limite3++;
                                    System.out.println("--");
                                    System.out.println("Você tera 3 chances");
                                    System.out.println("--");
                                    System.out.println("O que e a Máquina de Turing e como ela influenciou o desenvolvimento dos computadores modernos ?");
                                    System.out.println("-");
                                    System.out.println("Escolha a alternativa correta! ");

                                    for(String resp12 : respostas3){
                                        System.out.println(resp12);
                                    }
                                    String resp12 = input.next();
                                    Collections.shuffle(respostas3);

                                    switch(resp12){
                                        case "A":
                                        case "a":
                                            System.out.println("Aternativa ' " + resp12 + " ' está correta!");
                                            certo12 = false;
                                            break;
                                        case "B":
                                        case "b":
                                            System.out.println("Aternativa está incorreta!");
                                            break;
                                        case "C":
                                        case "c":
                                            System.out.println("Aternativa está incorreta!");
                                            break;
                                        case "D":
                                        case "d":
                                            System.out.println("Aternativa está incorreta!");
                                            break;
                                        default:
                                            System.out.println("Opção inválida!");
                                            break;
                                    }

                                    if( certo12 && limite3 >= 3){
                                        System.out.println("");
                                        System.out.println("Resposta incorreta nas 3 tentativas!");
                                        System.out.println("");
                                        System.out.println("Tente novamente");
                                        break;
                                    }
                                }while(certo12 && limite3 < 3);
                                if(!certo12){
                                    int limite4 = 0;
                                    boolean certo13 = true;

                                    // Código que é responsável por embaralhar as alternativas
                                    ArrayList<String> respostas4 = new ArrayList<String>();
                                    respostas4.add("<A> Um sistema de comunicação criptografado usado pela resistencia.");
                                    respostas4.add("<B> Um dispositivo de cálculo que serviu como precursor dos computadores modernos.");
                                    respostas4.add("<C> Uma máquina de café que Alan Turing inventou durante a guerra.");
                                    respostas4.add("<D> Nenhuma das opções.");

                                    do{
                                        limite4++;
                                        System.out.println("--");
                                        System.out.println("Você tera 3 chances");
                                        System.out.println("--");
                                        System.out.println("Quais foram as contribuições de John von Neumann para a arquitetura de computadores?");
                                        System.out.println("--");
                                        System.out.println("Escolha a alternativa correta! ");

                                        for(String resp13 : respostas4){
                                            System.out.println(resp13);
                                        }
                                        String resp13 = input.next();
                                        Collections.shuffle(respostas4);

                                        switch(resp13){
                                            case "A":
                                            case "a":
                                                System.out.println("Aternativa está incorreta!");
                                                break;
                                            case "B":
                                            case "b":
                                                System.out.println("Aternativa ' " + resp13 + " ' está correta!");
                                                certo13 = false;
                                                break;
                                            case "C":
                                            case "c":
                                                System.out.println("Aternativa está incorreta!");
                                                break;
                                            case "D":
                                            case "d":
                                                System.out.println("Aternativa está incorreta!");
                                                break;
                                            default:
                                                System.out.println("Opção inválida!");
                                                break;
                                        }

                                        if( certo13 && limite4 >= 3){
                                            System.out.println("");
                                            System.out.println("Resposta incorreta nas 3 tentativas!");
                                            System.out.println("");
                                            System.out.println("Tente novamente");
                                            break;
                                        }
                                    }while(certo13 && limite4 < 3);
                                    if(!certo13){
                                        int limite5 = 0;
                                        boolean certo14 = true;

                                        // Código que é responsável por embaralhar as alternativas
                                        ArrayList<String> respostas5 = new ArrayList<String>();
                                        respostas5.add("<A> Introduziu a ideia de usar algoritmos para programar computadores.");
                                        respostas5.add("<B> Propôs o uso de memória RAM para armazenar dados temporarios.");
                                        respostas5.add("<C> Estabeleceu a separação entre hardware e software.");
                                        respostas5.add("<D> Nenhuma das opções.");

                                        do{
                                            limite5++;
                                            System.out.println("--");
                                            System.out.println("Você tera 3 chances");
                                            System.out.println("--");
                                            System.out.println("Como o conceito de arquitetura de ' Von Neumann ' influenciou o design dos computadores modernos ?");
                                            System.out.println("-");
                                            System.out.println("Escolha a alternativa correta! ");

                                            for(String resp14 : respostas5){
                                                System.out.println(resp14);
                                            }
                                            String resp14 = input.next();
                                            Collections.shuffle(respostas5);

                                            switch(resp14){
                                                case "A":
                                                case "a":
                                                    System.out.println("Aternativa está incorreta!");
                                                    break;
                                                case "B":
                                                case "b":
                                                    System.out.println("Aternativa está incorreta!");
                                                    break;
                                                case "C":
                                                case "c":
                                                    System.out.println("Aternativa ' " + resp14 + " ' está correta!");
                                                    certo14 = false;
                                                    break;
                                                case "D":
                                                case "d":
                                                    System.out.println("Aternativa está incorreta!");
                                                    break;
                                                default:
                                                    System.out.println("Opção inválida!");
                                                    break;
                                            }

                                            if( certo14 && limite5 >= 3){
                                                System.out.println("");
                                                System.out.println("Resposta incorreta nas 3 tentativas!");
                                                System.out.println("");
                                                System.out.println("Tente novamente");
                                                break;
                                            }
                                        }while(certo14 && limite5 < 3);
                                        // Fim das perguntas 

                                        if(!certo14){
                                            System.out.println("");
                                            System.out.println("MUTO BEM...");
                                            System.out.println("A medida que sua jornada avanca, você é confrontado com dilemas éticos e complexos. Você ");
                                            System.out.println("se ve diante da responsabilidade de usar os Conceitos de Computação não apenas para resolver problemas,");
                                            System.out.println("mas tambem para promover o bem-estar da sociedade. Suas escolhas moldarão o curso da história e definirão");
                                            System.out.println("o seu destino.");
                                            System.out.println("");
                                            System.out.println("Com isso Pixel se aproxima de você e te fala o que está acontecendo em NeoByte, baseado em dados que ele ");
                                            System.out.println("conseguiu sobre a cidade.");

                                            boolean certo15 = true;

                                            do{
                                                System.out.println("");
                                                System.out.println("Aperte ' Y ' para escutar Pixel ");
                                                System.out.println("");
                                                String resp15 = input.next();

                                                switch(resp15){
                                                    case "Y":
                                                    case "y": 
                                                        System.out.println("---------");
                                                        System.out.println("| Pixel |");
                                                        System.out.println("---------");
                                                        System.out.println("A cidade de NeoByte está mergulhada no caos. Um mestre da escuridao digital, conhecido apenas como ZERO, manipula os ");
                                                        System.out.println("sistemas da cidade para impor seu dominio sobre os cidadãos, espalhando medo e desespero por onde passa.");
                                                        System.out.println("E você " + nomePlayer + " um(a) jovem hacker corajoso(a) e destemido(a), foi secretamente recrutado por um grupo de hackers");
                                                        System.out.println("conhecidos como ' Anonymous  ' e é  chamado para uma missão de proporções épicas: derrotar a poderosa organização conhecida como");
                                                        System.out.println(" ' Evil Corp '. Essa organização sinistra, liderada pelo misterioso ZERO, controla os sistemas essenciais ");
                                                        System.out.println("da cidade, manipulando a informação para servir seus próprios interesses obscuros.");


                                                        
                                                        certo15 = false;
                                                        break;
                                                    default:
                                                        System.out.println("Opção inválida");
                                                        System.out.println("");
                                                        break; 
                                                }
                                            }while(certo15);

                                            boolean certo16 = true;

                                            do{
                                                System.out.println("");
                                                System.out.println("Aperte ' Y ' para falar com o Pixel");
                                                System.out.println("");
                                                String resp16 = input.next();

                                                switch(resp16){
                                                    case "Y":
                                                    case "y": 
                                                        System.out.println("VOCê...");
                                                        System.out.println("");
                                                        System.out.println("------------------------");
                                                        System.out.println(  "|  " + nomePlayer + "  |");
                                                        System.out.println("------------------------");
                                                        System.out.println("");
                                                        System.out.println("Fique tranquilo Pixel, vou ajudar a  desmantelar as estruturas de poder da ' Evil Corp ' que dominam a cidade de NeoByte ");
                                                        System.out.println("a se livrar desse vilão ' ZERO ' de uma vez por todas...");
                                                        System.out.println("");
                                                        
                                                        System.out.println("-------------");
                                                        System.out.println("|   PIXEL   |");
                                                        System.out.println("-------------");
                                                        System.out.println("");
                                                        System.out.println("Aeeeeeee...");
                                                        System.out.println("Sabia que podiamos contar com você, me siga, agora vou te ensinar sobre sitemas binários.");
                                                        System.out.println("");
                                                        certo16 = false;
                                                        break;
                                                    default:
                                                        System.out.println("Opção inválida");
                                                        System.out.println("");
                                                        break; 
                                                }
                                            }while(certo16);

                                            boolean certo17 = true;

                                            do{
                                                System.out.println("Aperte ' Y ' para seguir Pixel");
                                                String resp17 = input.next();

                                                switch(resp17){
                                                    case "Y":
                                                    case "y":
                                                        System.out.println("");
                                                        System.out.println("você se aventura pelas ruas infestadas de hackers e drones de vigilância, determinado(a) a trazer a luz de volta a cidade.");
                                                        System.out.println("No entanto, para alcançar Zero e por um fim em sua tirania, você deve primeiro superar uma serie");
                                                        System.out.println("de desafios de lógica de programação que ele espalhou por toda a cidade. Desde decifrar ");
                                                        System.out.println("códigos de segurança em sistemas de controle ate encontrar brechas em firewalls impenetraveis, cada desafio leva");
                                                        System.out.println("você um passo mais perto de confrontar o vilão.");
                                                        System.out.println("");
                                                        System.out.println("Escurecendo");
                                                        certo17 = false;
                                                        break;
                                                    default:
                                                        System.out.println("Opção inválida");
                                                        break;
                                                }
                                            }while(certo17);
                                        }
                                    }
                                }
                            }
                        }
                    }
    }

    public static void exibirCreditos() {
        System.out.println(" ");
                    System.out.println("------------");
                    System.out.println("| CRÉDITOS |");
                    System.out.println("------------");
                    System.out.println("  ");
                    System.out.println("Desenvolvido por: Caique Castro / Heitor Pereira / William Vieira ");
                    System.out.println("Design de Jogo: COLOCAR ");
                    System.out.println("Roteiro: COLOCAR ");
                    System.out.println("© 2024");
    }
    
    public static void sairJogo(String nomePlayer, Scanner input) {
        System.out.println("-");
        System.out.println("--------");
        System.out.println("| SAIR |");
        System.out.println("--------");
        System.out.println("");
        System.out.println(nomePlayer + " Você saiu do Jogo");
    }
}
