
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

         System.out.println("Escolha um nome para o(a) personagem ? " );
         String nomePlayer = input.nextLine();

        boolean taCerto = false;

        do{
            System.out.println("");
            System.out.println("Ola " + nomePlayer);
            System.out.println("");
            System.out.println("Bem-vindo ao");
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
            System.out.println("|    <1> Instrucoes    |");
            System.out.println("|    <2> Jogar         |");
            System.out.println("|    <3> Creditos      |");
            System.out.println("|    <4> Sair          |");
            System.out.println("------------------------");
            System.out.println("");
            System.out.println("Digite uma opcao");
            int opc = input.nextInt();

            // INSTRUÇÕES DO JOGO
            switch(opc){
                case 1:
                    System.out.println("");
                    System.out.println("--------------");
                    System.out.println("| INSTRUCOES |");
                    System.out.println("--------------");
                    System.out.println("");
                    System.out.println("Como Jogar:");
                    System.out.println("Bem-vindo ao 'ByteBattle: Desvendando o algoritmo' Este e um jogo de RPG onde voce assumira o ");
                    System.out.println("papel de um(a) jovem aprendiz de programacao.");
                    System.out.println("Sua missao e explorar cidades, aprender a historia e os conceitos fundamentais da computacao e ");
                    System.out.println("algoritmos e protege-las dos ataques dos Hackers Sombrios.");
                    System.out.println("");
                    System.out.println("- Interaja com NPCs (personagens nao-jogadores) para receber missoes e obter dicas.");
                    System.out.println("- Complete desafios de programacao para aprimorar suas habilidades.");
                    System.out.println("- Lute contra os Hackers Sombrios em batalhas estrategicas baseadas em turnos.");
                    System.out.println("- Explore cidades para desvendar segredos e coletar itens valiosos.");
                    System.out.println("- Avance na historia e torne-se um Guardiao do Codigo lendario!");

                    break;

                case 2:

                    // INÍCIO DO JOGO
                    System.out.println("");
                    System.out.println("---------");
                    System.out.println("| JOGAR |");
                    System.out.println("---------");
                    System.out.println("");

                    System.out.println("Voce e um(a) jovem aventureiro(a) ansioso(a) por desvendar os misterios do mundo ao seu redor, e ");
                    System.out.println("em um futuro proximo, voce e transportado para uma cidade futuristica chamada NeoByte");
                    System.out.println("conhecida por sua tecnologia avancada e paisagem urbana futurista. Ao chegar, voce e recebido ");
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
                                System.out.println("desbravar os segredos desta cidade, voce tera que mergulhar no mundo da computacao. Estou");
                                System.out.println("aqui para guia-lo atraves dos desafios e ensina-lo sobre os conceitos fundamentais.");
                                System.out.println("Me acompanhe... '");
                                System.out.println("");

                                certo1 = false;
                                break;
                            default:
                                System.out.println("Opcao invalida!");
                                System.out.println("");
                                break;
                        }
                    }while(certo1);
                    // FIM

                    System.out.println("");
                    System.out.println("Pixel te leva em uma sala, cercado por telas digitais piscando. Uma voz ecoa pelo");
                    System.out.println("ambiente, que o ensina sobre a historia do Conceito da Compútacao.");

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
                                    System.out.println("Ola " + nomePlayer + ", vou te contar uma historia.");
                                    System.out.println("A historia do Conceito de Computacao, ela remonta aos primordios da civilizacao humana, quando os ");
                                    System.out.println("primeiros pensadores comecaram a explorar a natureza dos numeros, padroes e logica. ");
                                    System.out.println("Eles perceberam que havia uma ordem subjacente ao caos, uma linguagem universal que podia ser decifrada e codificada.");

                                    System.out.println("Na medida em que os calculos foram se complicando e aumentando de tamanho, sentiu-se a necessidade de um ");
                                    System.out.println("instrumento que viesse em auxilio");
                                    System.out.println("Comecou desde quando o homem descobriu que somente com os dedos, ou com pedras e gravetos, nao dava mais para fazer calculos...");

                                    System.out.println("Entao surgiu o Abaco...");
                                    System.out.println("Foi criado, ha aproximadamente 4.000 a.C");
                                    System.out.println("Um aparelho muito simples formado por uma placa de argila onde se escreviam algarismos que auxiliavam nos calculos");
                                    System.out.println("Cerca de 200 a.C., o Abaco era constituido por uma moldura retangular de madeira com varetas paralelas e pedras deslizantes.");
                                    System.out.println("");
                                    certo2 = false;
                                    break;
                                default:
                                    System.out.println("Opcao Invalida");
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
                        System.out.println("Sabe o que e um Abaco ?");
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
                                    System.out.println("Representacao de um Abaco.");
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
                                    System.out.println("com a posicao, representa a quantidade a ser trabalhada.");
                                    System.out.println("Eles representam as posicoes das casas decimais (unidade, dezena, centena, milhar, unidades");
                                    System.out.println("de milhar, dezenas de milhar, centenas de milhar, unidades de milhao).");
                                    System.out.println("");
                                    certo3 = false;
                                    break;
                                default:
                                    System.out.println("Opcao Invalida");
                                    System.out.println("");
                                    break;
                            }
                        }
                    }while(certo3); 

                    System.out.println("");
                    System.out.println("E em 1617, no ano de sua morte John Napier inventou um metodo diferente (nao-algoritimo) de ");
                    System.out.println("fazer multiplicacoes, conhecido como 'Ossos de Napier'");
                    System.out.println("Consistia num conjunto de barras segmentadas dispostas de modo que a resposta de um problema de multiplicacao era ");
                    System.out.println("obtida somando-se numeros em secoes horizontais adjacentes.");

                    boolean certo4 = true;

                    do{
                        System.out.println("Sabe o que e 'Ossos de Napier' ?");
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
                                    System.out.println("Representacao de 'Ossos de Napier.");
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
                                    System.out.println("resposta de um problema de miltiplicacao era obtida somando-se numeros em");
                                    System.out.println("secoes horizontais adjacentes. tornam possivel fazer multiplicacoes, divisoes e extracoes");
                                    System.out.println("de raizes quadradas de modo semimecanico.");
                                    System.out.println("");
                                    certo4 = false;
                                    break;
                                default:    
                                    System.out.println("Opcao Invalia");
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
                                    System.out.println("Opcao Invalida");
                                    System.out.println("");
                                    break;
                            }

                        }
                    }while(continuar);

                    System.out.println("");
                    System.out.println("Ja em 1633 William Oughtred, representou os logaritmos de Napier em escalas de  ");
                    System.out.println("marfim, chamando-os de 'Circulos de Proporcao', originou a ");
                    System.out.println("Regua de Calculos, o primeiro computador analogico da historia.");
                    System.out.println("Em 1642 um frances de 18 anos chamado Blaise Pascal, inventou a primeira maquina de somar. ");
                    System.out.println("A maquina se chmava 'Pascalina', a qual executava opercoes aritmeticas");
                    System.out.println("quando se giravam os discos interligados, sendo assim a ");
                    System.out.println("precursora das calculadoras mecanicas.");
                    System.out.println("Mas em 1671, Gottfried Leibnitz inventou uma maquina muito parecida");
                    System.out.println("com a Pascalina, que efetuava calculos de multiplicacao e divisao, e");
                    System.out.println("qual se tornou a antecessora direta das calculadoras manuais.");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Agora em 1728 Basile Bouchon construiu a 'Tear Para Tecer Desenhos de Seda', os");
                    System.out.println("desenhos eram cifrados em folha giratoria de papel perfurado, somente trabalhavam as ");
                    System.out.println("agulhas coincidentes com os furos.");
                    System.out.println("E 74 anos depois, na Franca em 1802 Joseph Marie Jacquard passou a autilizar cartoes");
                    System.out.println("perfurados para controlar suas maquinas de tear e automatiza-las. 20 anos depois ");
                    System.out.println("foi desenvolvido por Charles Babbage uma maquina diferencial que permitia a calculos como funcoes ");
                    System.out.println("trigonometricas e logaritmos, utilizando os cartoes de Jacquard. Mas nao satisfeito");
                    System.out.println("resolveu desenvolver uma maquina analitica capaz de executar as quatro operacoes sendo elas");
                    System.out.println("(somar, dividir, subtrair e multiplicar), e Babbage  foi conhecido como o pai do computador");
                    System.out.println("porem, sua maquina so pode der concluida anos apos a sua morte, tornando-se a base ");
                    System.out.println("para a estrutura dos computadores atuais, essa maquina era chamada de 'Maquina Diferencial");
                    System.out.println("de Babbage'.");
                    System.out.println("");

                    boolean certo5 = true;

                    do{
                        System.out.println("");
                        System.out.println("Esta entendendo ate aqui ?");
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
                                    System.out.println("Opcao Invalida");
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
                    respostas.add("<A> Um antigo dispositivo de calculo.");
                    respostas.add("<B> Um dispositivo para fazer cafe.");
                    respostas.add("<C> Um tipo de instrumento musical.");
                    respostas.add("<D> Nenhuma das opcoes.");

                    do{
                        limite++;
                        System.out.println("");
                        System.out.println("Voce tera 3 chances");
                        System.out.println("");
                        System.out.println("O que e Abaco ?");
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
                                System.out.println("Aternativa ' " + resp6 + " ' esta correta! ");
                                certo6 = false;
                                break;
                            case "B":
                            case "b":
                            case "C":
                            case "c":
                            case "D":
                            case "d":
                                System.out.println("Aternativa esta incorreta!");
                                break;
                            default:
                                System.out.println("Opcao Invalida");
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
                        respostas1.add("<C> Dispositivos de calculo inventados por John Napier.");
                        respostas1.add("<D> Nenhuma das opcoes.");

                        do{
                            limite1++;
                            System.out.println("");
                            System.out.println("O que e Ossos de Napier ?");
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
                                    System.out.println("Aternativa esta incorreta! ");
                                    break;
                                case "B":
                                case "b":
                                     System.out.println("Aternativa esta incorreta! ");
                                     break;
                                case "C":
                                case "c": 
                                    System.out.println("Aternativa ' " + resp7 + " ' esta correta! ");
                                    certo7 = false;
                                    break;
                                case "D":
                                case "d":
                                    System.out.println("Aternativa esta incorreta!");
                                    break;
                                default:
                                    System.out.println("Opcao Invalida");
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
                            System.out.println("Vamos avancar um pouco na historia.");
                            System.out.println("");
                            System.out.println("Moderna Era do Computador..");
                            System.out.println("Em 1930, surge Analisador Diferencial de Vannevar Bush anuncia a moderna era do computador.");
                            System.out.println("Em 1936, Allan Turing publica um artigo sobre 'Numeros Computáveis'.");
                            System.out.println("Claude Shannon demonstra numa tese a conexao entre logica simbolica e circuitos eletricos.");
                            System.out.println("Em 1937, George Stibitz constroi em sua mesa de cozinha um 'Somador Binário'.");
                            System.out.println("Na Segunda Guerra Mundial Em 1944, o primeiro computador eletromecanico (na Universidade");
                            System.out.println("de Harvard, pela equipe do professor H. Aiken e com a ajuda financeira da IBM, ");
                            System.out.println("que investiu US$ 500.000,00 no projeto), o MARK I. Um computador muito grande.");
                            System.out.println("O MARK I prestou seus servicos de matematica na Universidade");
                            System.out.println("de Harvard por 16 anos completos, apesar de nao ter feito muito sucesso.");
                            System.out.println("Em 1941, Konrad Zuse, na Alemanha, sao criados: Z1 e Z2.");
                            System.out.println("Os computadores Z3 e logo a seguir o Z4, eram utilizados na ");
                            System.out.println("solucao de problemas de engenharia de aeronaves e projetos de misseis.");
                            System.out.println("Umas das principais aplicacoes da maquinas de Zuze era quebrar os codigos ");
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
                                            System.out.println("Opcao Invalida");
                                            System.out.println("");
                                            break;
                                    }

                                }
                            }while(certo8);

                            System.out.println("Jovem " + nomePlayer + ", na tela atraz de você vai estar a memoria de Alan Turing, va ate la para escutar");
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
                                            System.out.println("Ola " + nomePlayer + ", vou te contar um pouco sobre a minha historia");
                                            System.out.println("");
                                            System.out.println("Nasci em 23 de junho de 1912, London e morri em 7 de junho de 1954, Manchester England");
                                            System.out.println("Em 1943, um projeto britanico, sob a minha liderança, colocamos ");
                                            System.out.println("em operacao uma serie de maquinas mais ambiciosas, o COLOSSUS.");
                                            System.out.println("O COLOSSUS foi criado na segunda Guerra mundial para quebrar codigoa alemaes ultra-secretos.");
                                            System.out.println("Ao inves de reles eletromecanicos, cada nova maquina usava 2.000 valvulas eletrenicas.");
                                            System.out.println("O Colossus trabalhava com simbolos perfurados numa argola de fita de papel,");
                                            System.out.println("por leitura fotoeletrica, comparando a mensagem cifrada com os codigos");
                                            System.out.println("conhecidos ate encontrar uma coincidencia.");
                                            System.out.println("Mais um pouco sobre a minha historia...");
                                            System.out.println("Alan Turing, com sua mente brilhante, narra os dias sombrios da Segunda Guerra Mundial. Ele fala");
                                            System.out.println("sobre a criacao da maquina Enigma, que ajudou a decifrar codigos secretos alemaes e mudou o ");
                                            System.out.println("curso da historia. Voce aprende sobre a importancia da computacao na guerra e como Turing");
                                            System.out.println("desempenhou um papel crucial nesse processo.");
                                            System.out.println("");
                                            System.out.println("Aqui na tela ao lado voce vai falar com o John von Neumann ");

                                            certo9 = false;
                                            break;
                                        default:
                                            System.out.println("Opcao Invalida");
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
                                            System.out.println("Meu interesse por computadores foi diferente pois eu conseguia visualizar a aplicacao na solucao");
                                            System.out.println(" de problemas matematicos e nao apenas na geracao de tabelas.");
                                            System.out.println("Durante a Guerra, meus conhecimentos de hidraulica, balistica, meteorologia, teoria de jogos e");
                                            System.out.println(" estatistica foram colocados em pratica em diversos projetos.");
                                            System.out.println("Eu juntei as necessidades do projeto Manhattan a capacidade dos primeiro engenheiros da Moore ");
                                            System.out.println("School of Electrical Engineering que estavam construindo o ENIAC, e em seguida o meu proprio projeto o");
                                            System.out.println("IAS. Varios supercomputadores forem construidos pela National Laboratories como copias destas maquinas.");
                                            System.out.println("Apos o final da guerra me concentrei em desenvolver o computador do Institute for Advanced");
                                            System.out.println(" Studies (IAS) e suas copias pelo mundo. Meu trabalho apos a Guerra continuou no desenvolvimento de solucoes");
                                            System.out.println("para a construcao da bomba de hidrogenio. ");
                                            System.out.println("Mais um pouco sobre a minha historia...");
                                            System.out.println("John von Neumann, com sua sabedoria profunda, compartilha sua visao da arquitetura de ");
                                            System.out.println("computadores. Ele descreve o conceito inovador que leva seu nome e explica como ele");
                                            System.out.println("influenciou o design dos computadores modernos. Voce entende como a separacao entre ");
                                            System.out.println("hardware e software revolucionou a forma como os computadores funcionam.");
                                            certo10 = false;
                                            break;
                                        default:
                                            System.out.println("Opcao Invalida!");
                                            System.out.println("");
                                            break;    
                                    }
                            }while(certo10);

                            System.out.println("");
                            System.out.println("Apos escutar o que Alan Turing e John von Neumann tinham para te falar, a voz misteriosa ");
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
                                respostas2.add("<C> Desenvolveu a maquina Enigma para decifrar codigos secretos alemaes.");
                                respostas2.add("<D> Nenhuma das opcoes.");
                            do{
                                limite2++;
                                System.out.println("--");
                                System.out.println("Voce tera 3 chances");
                                System.out.println("--");
                                System.out.println("Quais foram as contribuicoes de Alan Turing para o campo da computacao durante a Segunda Guerra Mundial ?");
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
                                        System.out.println("Aternativa esta incorreta!");
                                        break;
                                    case "B":
                                    case "b":
                                        System.out.println("Aternativa esta incorreta!");
                                        break;
                                    case "C":
                                    case "c":
                                        System.out.println("Aternativa ' " + resp11 + " ' esta correta!");
                                        certo11 = false;
                                        break;
                                    case "D":
                                    case "d":
                                        System.out.println("Aternativa esta incorreta!");
                                        break;
                                    default:
                                        System.out.println("Opcao Invalida!");
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
                                respostas3.add("<A> Um sistema de comunicacao criptografado usado pela resistencia.");
                                respostas3.add("<B> Um dispositivo de calculo que serviu como precursor dos computadores modernos.");
                                respostas3.add("<C> Uma maquina de cafe que Alan Turing inventou durante a guerra.");
                                respostas3.add("<D> Nenhuma das opcoes.");

                                do{
                                    limite3++;
                                    System.out.println("--");
                                    System.out.println("Voce tera 3 chances");
                                    System.out.println("--");
                                    System.out.println("O que e a Maquina de Turing e como ela influenciou o desenvolvimento dos computadores modernos ?");
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
                                            System.out.println("Aternativa ' " + resp12 + " ' esta correta!");
                                            certo12 = false;
                                            break;
                                        case "B":
                                        case "b":
                                            System.out.println("Aternativa esta incorreta!");
                                            break;
                                        case "C":
                                        case "c":
                                            System.out.println("Aternativa esta incorreta!");
                                            break;
                                        case "D":
                                        case "d":
                                            System.out.println("Aternativa esta incorreta!");
                                            break;
                                        default:
                                            System.out.println("Opcao Invalida!");
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
                                    respostas4.add("<A> Um sistema de comunicacao criptografado usado pela resistencia.");
                                    respostas4.add("<B> Um dispositivo de calculo que serviu como precursor dos computadores modernos.");
                                    respostas4.add("<C> Uma maquina de cafe que Alan Turing inventou durante a guerra.");
                                    respostas4.add("<D> Nenhuma das opcoes.");

                                    do{
                                        limite4++;
                                        System.out.println("--");
                                        System.out.println("Voce tera 3 chances");
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
                                                System.out.println("Aternativa esta incorreta!");
                                                break;
                                            case "B":
                                            case "b":
                                                System.out.println("Aternativa ' " + resp13 + " ' esta correta!");
                                                certo13 = false;
                                                break;
                                            case "C":
                                            case "c":
                                                System.out.println("Aternativa esta incorreta!");
                                                break;
                                            case "D":
                                            case "d":
                                                System.out.println("Aternativa esta incorreta!");
                                                break;
                                            default:
                                                System.out.println("Opcao Invalida!");
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
                                        respostas5.add("<B> Propôs o uso de memoria RAM para armazenar dados temporarios.");
                                        respostas5.add("<C> Estabeleceu a separacao entre hardware e software.");
                                        respostas5.add("<D> Nenhuma das opcoes.");

                                        do{
                                            limite5++;
                                            System.out.println("--");
                                            System.out.println("Voce tera 3 chances");
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
                                                    System.out.println("Aternativa esta incorreta!");
                                                    break;
                                                case "B":
                                                case "b":
                                                    System.out.println("Aternativa esta incorreta!");
                                                    break;
                                                case "C":
                                                case "c":
                                                    System.out.println("Aternativa ' " + resp14 + " ' esta correta!");
                                                    certo14 = false;
                                                    break;
                                                case "D":
                                                case "d":
                                                    System.out.println("Aternativa esta incorreta!");
                                                    break;
                                                default:
                                                    System.out.println("Opcao Invalida!");
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
                                            System.out.println("A medida que sua jornada avanca, voce e confrontado com dilemas eticos complexos. Voce ");
                                            System.out.println("se ve diante da responsabilidade de usar os Conceitos de Computacao nao apenas para resolver problemas,");
                                            System.out.println("mas tambem para promover o bem-estar da sociedade. Suas escolhas moldarao o curso da historia e definirao");
                                            System.out.println("o seu destino.");
                                            System.out.println("Com isso Pixel se aproxima de voce e te fala o que esta acontecendo em NeoByte");

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
                                                        System.out.println("A cidade de NeoByte esta mergulhada no caos. Um mestre da escuridao digital, conhecido apenas como ZERO, manipula os ");
                                                        System.out.println("sistemas da cidade para impor seu dominio sobre os cidadaos, espalhando medo e desespero por onde passa.");
                                                        System.out.println("E voce " + nomePlayer + " um(a) jovem hacker corajoso(a) e destemido(a), foi escolhido(a)com a ");
                                                        System.out.println("missao de libertar o povo do vilao ZERO. Com suas habilidades em programacao e ");
                                                        System.out.println("uma determinação inabalavel, voce vai conseguir salvar essa cidade das maos do ZERO.");
                                                        certo15 = false;
                                                        break;
                                                    default:
                                                        System.out.println("Opcao Invalida");
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
                                                        System.out.println("VOCE...");
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
                                                        System.out.println("Sabia que podiamos contar com voce, me siga agora vou te ensinar sobre sitemas binarios.");
                                                        System.out.println("");

                                                        certo16 = false;
                                                        break;
                                                    default:
                                                        System.out.println("Opcao Invalida");
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
                                                        System.out.println("voce se aventura pelas ruas infestadas de hackers e drones de vigilancia, determinado(a) a trazer a luz de volta a cidade.");
                                                        System.out.println("No entanto, para alcancar Zero e por um fim em sua tirania, voce deve primeiro superar uma serie");
                                                        System.out.println("de desafios de logica de programacao que ele espalhou por toda a cidade. Desde decifrar ");
                                                        System.out.println("codigos de seguranca em sistemas de controle ate encontrar brechas em firewalls impenetraveis, cada desafio leva");
                                                        System.out.println("voce um passo mais perto de confrontar o vilao.");
                                                        System.out.println("");
                                                        System.out.println("Escurecendo");
                                                        certo17 = false;
                                                        break;
                                                    default:
                                                        System.out.println("Opcao Invalida");
                                                        break;
                                                }
                                            }while(certo17);
                                        }
                                    }
                                }
                            }
                        }
                    }




                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println("------------");
                    System.out.println("| CREDITOS |");
                    System.out.println("------------");
                    System.out.println("  ");
                    System.out.println("Desenvolvido por: Caique Castro / Heitor Pereira / William Vieira ");
                    System.out.println("Design de Jogo: COLOCAR ");
                    System.out.println("Roteiro: COLOCAR ");
                    System.out.println("Arte e Graficos: COLOCAR ");
                    System.out.println("© 2024");
                    break;
                case 4:
                    System.out.println("-");
                    System.out.println("--------");
                    System.out.println("| SAIR |");
                    System.out.println("--------");
                        taCerto = true;
                        break;
                default:
                    System.out.println("Opcao invalida, por favor Digite uma opcao valida !");
                    break;
            }
        }while(!taCerto);
    }
}
