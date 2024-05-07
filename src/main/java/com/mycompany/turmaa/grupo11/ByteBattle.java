
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

                    System.out.println("Você é um(a) jovem aventureiro(a) ansioso(a) por desvendar os mistérios do mundo ao seu redor, e ");
                    System.out.println("em um futuro próximo, você é transportado para uma cidade futuristica chamada NeoByte");
                    System.out.println("conhecida por sua tecnologia avançada e paisagem urbana futurista. Ao chegar, você é recebido ");
                    System.out.println("por um holograma chamado Pixel, o guia virtual da cidade.");

                    // ERRO ao apertar outra tecla a não ser o Y 
                    // INÍCIO
                        boolean certo1 = true;
                    do{
                        System.out.println("");
                        System.out.println("Aperte ' Y ' para ver o que ele tem para te falar ");
                        String resp1 = input.next();

                        switch(resp1){
                            case "Y":
                            case "y":
                                System.out.println("");
                                System.out.println("---------");
                                System.out.println("| Pixel |");
                                System.out.println("---------");
                                System.out.println("");
                                System.out.println("' Bem-vindo a NeoByte, " + nomePlayer + ", viajante do tempo, Prepare-se para uma aventura digital unica. Para");
                                System.out.println("desbravar os segredos desta cidade, você tera que mergulhar no mundo da computação. Estou");
                                System.out.println("aqui para guia-lo atraves dos desafios e ensina-lo sobre os conceitos fundamentais.");
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
                    System.out.println("Pixel te leva em uma sala, cercado por telas digitais piscando. Uma voz ecoa pelo");
                    System.out.println("ambiente, que o ensina sobre a história do Conceito da Computação.");

                    // ERRO ao apertar outra tecla a não ser o Y 
                    // INÍCIO
                    boolean certo2 = true;

                    do{

                            System.out.println("");
                            System.out.println("Aperte ' Y ' para ver o que a voz misteriosa tem para te falar ");
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
                                    System.out.println("A história do Conceito de Computação, ela remonta aos primordios da civilização humana, quando os ");
                                    System.out.println("primeiros pensadores começaram a explorar a natureza dos números, padrões e lógica. ");
                                    System.out.println("Eles perceberam que havia uma ordem subjacente ao caos, uma linguagem universal que podia ser decifrada e codificada.");

                                    System.out.println("Na medida em que os cálculos foram se complicando e aumentando de tamanho, sentiu-se a necessidade de um ");
                                    System.out.println("instrumento que viesse em auxílio");
                                    System.out.println("Comecou desde quando o homem descobriu que somente com os dedos, ou com pedras e gravetos, não dava mais para fazer cálculos...");

                                    System.out.println("Entao surgiu o Ábaco...");
                                    System.out.println("Foi criado, a aproximadamente 4.000 a.C");
                                    System.out.println("Um aparelho muito simples formado por uma placa de argila onde se escreviam algarismos que auxiliavam nos cálculos");
                                    System.out.println("Cerca de 200 a.C., o Ábaco era constituido por uma moldura retangular de madeira com varetas paralelas e pedras deslizantes.");
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
                        System.out.println("Sabe o que é um Ábaco ?");
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
                                    System.out.println("Representação de um Ábaco.");
                                    System.out.println("");
                                    System.out.println("--------------------");
                                    System.out.println("| o o o o o o o o o |");
                                    System.out.println("| o   o o   o   o   |");
                                    System.out.println("|                   |");
                                    System.out.println("|   o     o   o   o |");
                                    System.out.println("|-------------------|");
                                    System.out.println("|     o o o   o o o |");
                                    System.out.println("|     o o o     o o |");
                                    System.out.println("|         o     o o |");
                                    System.out.println("| o o       o     o |");
                                    System.out.println("| o o       o o     |");
                                    System.out.println("| o o o o   o o     |");
                                    System.out.println("| o o o o o o o o   |");
                                    System.out.println("| o o o o o o o o o |");
                                    System.out.println("--------------------");
                                    System.out.println("");
                                    System.out.println("Formado por fios paralelos e arruelas deslizantes, que de acordo ");
                                    System.out.println("com a posição, representa a quantidade a ser trabalhada.");
                                    System.out.println("Eles representam as posições das casas decimais (unidade, dezena, centena, milhar, unidades");
                                    System.out.println("de milhar, dezenas de milhar, centenas de milhar, unidades de milhão).");
                                    System.out.println("");
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
                    System.out.println("E em 1617, no ano de sua morte John Napier inventou um metodo diferente (não-algoritimo) de ");
                    System.out.println("fazer multiplicações, conhecido como 'Ossos de Napier'");
                    System.out.println("Consistia num conjunto de barras segmentadas dispostas de modo que a resposta de um problema de multiplicação era ");
                    System.out.println("obtida somando-se números em seções horizontais adjacentes.");

                    boolean certo4 = true;

                    do{
                        System.out.println("Sabe o que é 'Ossos de Napier' ?");
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
                                    System.out.println("Representação de 'Ossos de Napier.");
                                    System.out.println("");
                                    System.out.println("-----------------------------------------------------------");
                                    System.out.println("|   |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |");
                                    System.out.println("|---------------------------------------------------------|");
                                    System.out.println("| 1 | 0/1 | 0/2 | 0/3 | 0/4 | 0/5 | 0/6 | 0/7 | 0/8 | 0/9 |");
                                    System.out.println("|---------------------------------------------------------|");
                                    System.out.println("| 2 | 0/2 | 0/4 | 0/6 | 0/8 | 1/0 | 1/2 | 1/4 | 1/6 | 1/8 |");
                                    System.out.println("|---------------------------------------------------------|");
                                    System.out.println("| 3 | 0/3 | 0/6 | 0/9 | 1/2 | 1/5 | 1/8 | 2/1 | 2/4 | 2/7 |");
                                    System.out.println("|---------------------------------------------------------|");
                                    System.out.println("| 4 | 0/4 | 0/8 | 1/2 | 1/6 | 2/0 | 2/4 | 2/8 | 3/2 | 3/6 |");
                                    System.out.println("|---------------------------------------------------------|");
                                    System.out.println("| 5 | 0/5 | 1/0 | 1/5 | 2/0 | 2/5 | 3/0 | 3/5 | 4/0 | 4/5 |");
                                    System.out.println("|---------------------------------------------------------|");
                                    System.out.println("| 6 | 0/6 | 1/2 | 1/8 | 2/4 | 3/0 | 3/6 | 4/2 | 4/8 | 5/4 |");
                                    System.out.println("|---------------------------------------------------------|");
                                    System.out.println("| 7 | 0/7 | 1/4 | 2/1 | 2/8 | 3/5 | 4/2 | 4/9 | 5/6 | 6/3 |");
                                    System.out.println("|---------------------------------------------------------|");
                                    System.out.println("| 8 | 0/8 | 1/6 | 2/4 | 3/2 | 4/0 | 4/8 | 5/6 | 6/4 | 7/2 |");
                                    System.out.println("|---------------------------------------------------------|");
                                    System.out.println("| 9 | 0/9 | 1/8 | 2/7 | 3/6 | 4/5 | 5/4 | 6/3 | 7/2 | 8/1 |");
                                    System.out.println("|---------------------------------------------------------|");
                                    System.out.println("");
                                    System.out.println("Consistia num conjunto de barras segmentadas dispostas de modo que a ");
                                    System.out.println("resposta de um problema de multiplicação era obtida somando-se números em");
                                    System.out.println("seções horizontais adjacentes. tornam possível fazer multiplicações, divisões e extrações");
                                    System.out.println("de raizes quadradas de modo semi mecânico.");
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
                    System.out.println("Já em 1633 William Oughtred, representou os logaritmos de Napier em escalas de  ");
                    System.out.println("marfim, chamando-os de 'Círculos de Proporção', originou a ");
                    System.out.println("Régua de Cálculos, o primeiro computador analógico da história.");
                    System.out.println("Em 1642 um francês de 18 anos chamado Blaise Pascal, inventou a primeira máquina de somar. ");
                    System.out.println("A máquina se chmava 'Pascalina', a qual executava operções aritméticas");
                    System.out.println("quando se giravam os discos interligados, sendo assim a ");
                    System.out.println("precursora das calculadoras mecânicas.");
                    System.out.println("Mas em 1671, Gottfried Leibnitz inventou uma máquina muito parecida");
                    System.out.println("com a Pascalina, que efetuava cálculos de multiplicação e divisão, e");
                    System.out.println("qual se tornou a antecessora direta das calculadoras manuais.");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Agora em 1728 Basile Bouchon construiu a 'Tear Para Tecer Desenhos de Seda', os");
                    System.out.println("desenhos eram cifrados em folha giratória de papel perfurado, somente trabalhavam as ");
                    System.out.println("agulhas coincidentes com os furos.");
                    System.out.println("E 74 anos depois, na França em 1802 Joseph Marie Jacquard passou a autilizar cartões");
                    System.out.println("perfurados para contrár suas máquinas de tear e automatiza-las. 20 anos depois ");
                    System.out.println("foi desenvolvido por Charles Babbage uma máquina diferencial que permitia a cálculos como funções ");
                    System.out.println("trigonométricas e logaritmos, utilizando os cartões de Jacquard. Mas não satisfeito");
                    System.out.println("resolveu desenvolver uma máquina analítica capaz de executar as quatro operações sendo elas");
                    System.out.println("(somar, dividir, subtrair e multiplicar), e Babbage  foi conhecido como o pai do computador");
                    System.out.println("porem, sua máquina só pode ser concluida anos após a sua morte, tornando-se a base ");
                    System.out.println("para a estrutura dos computadores atuais, essa máquina era chamada de 'Máquina Diferencial");
                    System.out.println("de Babbage'.");
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
                    respostas.add("<A> Um antigo dispositivo de cálculo.");
                    respostas.add("<B> Um dispositivo para fazer café.");
                    respostas.add("<C> Um tipo de instrumento musical.");
                    respostas.add("<D> Nenhuma das opções.");

                    do{
                        limite++;
                        System.out.println("");
                        System.out.println("Você tera 3 chances");
                        System.out.println("");
                        System.out.println("O que é Ábaco ?");
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
                        respostas1.add("<A> Ferramentas de carpintaria.");
                        respostas1.add("<B> Instrumentos musicais antigos.");
                        respostas1.add("<C> Dispositivos de cálculo inventados por John Napier.");
                        respostas1.add("<D> Nenhuma das opções.");

                        do{
                            limite1++;
                            System.out.println("");
                            System.out.println("O que é Ossos de Napier ?");
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
                            System.out.println("Vamos avançar um pouco na história.");
                            System.out.println("");
                            System.out.println("Moderna Era do Computador..");
                            System.out.println("Em 1930, surge Analisador Diferencial de Vannevar Bush anuncia a moderna era do computador.");
                            System.out.println("Em 1936, Allan Turing publica um artigo sobre 'Números Computáveis'.");
                            System.out.println("Claude Shannon demonstra um tese a conexão entre lógica simbólica e circuitos elétricos.");
                            System.out.println("Em 1937, George Stibitz constrói em sua mesa de cozinha um 'Somador Binário'.");
                            System.out.println("Na Segunda Guerra Mundial Em 1944, o primeiro computador eletromecânico (na Universidade");
                            System.out.println("de Harvard, pela equipe do professor H. Aiken e com a ajuda financeira da IBM, ");
                            System.out.println("que investiu US$ 500.000,00 no projeto), o MARK I. Um computador muito grande.");
                            System.out.println("O MARK I prestou seus serviços de matemática na Universidade");
                            System.out.println("de Harvard por 16 anos completos, apesar de não ter feito muito sucesso.");
                            System.out.println("Em 1941, Konrad Zuse, na Alemanha, são criados: Z1 e Z2.");
                            System.out.println("Os computadores Z3 e logo a seguir o Z4, eram utilizados na ");
                            System.out.println("solução de problemas de engenharia de aeronaves e projetos de misseis.");
                            System.out.println("Umas das principais aplicações das máquinas de Zuze era quebrar os códigos ");
                            System.out.println("secretos que os ingleses usavam para se comunicar com os comandantes no campo.");


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

                            System.out.println("Jovem " + nomePlayer + ", na tela atraz de você vai estar a memória de Alan Turing, va até la para escutar");
                            System.out.println("o que ele tem para te falar.");

                            boolean certo9 = true;
                            do{
                                 System.out.println("");
                                System.out.println("Aperte ' Y ' para ir ate a tela de Alan Turing");
                                System.out.println("");
                                String resp9 = input.next();

                                    switch(resp9){
                                        case "Y":
                                        case "y":  
                                            System.out.println();
                                            System.out.println("");
                                            System.out.println("------------------");
                                            System.out.println("| Alan Turing... |");
                                            System.out.println("------------------");
                                            System.out.println("");
                                            System.out.println("Olá " + nomePlayer + ", vou te contar um pouco sobre a minha história");
                                            System.out.println("");
                                            System.out.println("Nasci em 23 de junho de 1912, London e morri em 7 de junho de 1954, Manchester England");
                                            System.out.println("Em 1943, um projeto britanico, sob a minha liderança, colocamos ");
                                            System.out.println("em operação uma serie de máquinas mais ambiciosas, o COLOSSUS.");
                                            System.out.println("O COLOSSUS foi criado na segunda Guerra mundial para quebrar códigos alemães ultra-secretos.");
                                            System.out.println("Ao invés de reles eletromecânicos, cada nova máquina usava 2.000 válvulas eletrônicas.");
                                            System.out.println("O Colossus trabalhava com símbolos perfurados numa argola de fita de papel,");
                                            System.out.println("por leitura fotoelétrica, comparando a mensagem cifrada com os códigos");
                                            System.out.println("conhecidos até encontrar uma coincidencia.");
                                            System.out.println("Mais um pouco sobre a minha história...");
                                            System.out.println("Alan Turing, com sua mente brilhante, narra os dias sombrios da Segunda Guerra Mundial. Ele fala");
                                            System.out.println("sobre a criação da máquina Enigma, que ajudou a decifrar códigos secretos alemães e mudou o ");
                                            System.out.println("curso da história. Você aprende sobre a importancia da computação na guerra e como Turing");
                                            System.out.println("desempenhou um papel crucial nesse processo.");
                                            System.out.println("");
                                            System.out.println("Aqui na tela ao lado você vai falar com o John von Neumann ");

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
                                            System.out.println("Com isso Pixel se aproxima de você e te fala o que está acontecendo em NeoByte");

                                            boolean certo15 = true;

                                            do{
                                                System.out.println("");
                                                System.out.println("Aperte ' Y ' para escutar o que Pixel temm para te falar");
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
                                                        System.out.println("E você " + nomePlayer + " um(a) jovem hacker corajoso(a) e destemido(a), foi escolhido(a)com a ");
                                                        System.out.println("missão de libertar o povo do vilão ZERO. Com suas habilidades em programação e ");
                                                        System.out.println("uma determinação inabalável, você vai conseguir salvar essa cidade das maos do ZERO.");
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
                                                        System.out.println("|  " + nomePlayer + "  |");
                                                        System.out.println("------------------------");
                                                        System.out.println("");
                                                        System.out.println("Fique tranquilo Pixel, vou ajudar a cidade de NeoByte a se livrar desse vilão ' ZERO ' de uma vez por todas.");
                                                        System.out.println("");
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
