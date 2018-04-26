
import java.util.Scanner;

public class PI {

    static int pontuacao = 0;
    static int menu, op1;
    static int certa = 100;
    static Scanner entrada = new Scanner(System.in);

    //função gameover - mostra as mensagens de termino de jogo, deverá ser chamada quando o usuário errar 3 vezes em uma mesma pergunta

    static void gameover() {
        System.out.println("Game over! Você escolheu as opções erradas. Inicie um novo jogo!");
        System.out.println("Sua pontuacao final é: " + pontuacao);
    }

    //função vender
    static void vender() {
        loopVender:
        for (int i = 0; i < 3; i++) {
            System.out.println("1. Vender para o mercadinho da esquina. \n" +
                    "2. Vender na faculdade para os colegas. \n" +
                    "3. Vender no semáforo dizendo se tratar de trote da faculdade. \n" +
                    "4. Vender para os parentes.");
            op1 = entrada.nextInt();

            switch (op1) {
                case 1:
                    System.out.println("Você escolheu vender para o mercadinho da esquina. Seu Takashi, proprietário do local, ofereceu 10 centavos por unidade. Você tentou negociar o valor, mas ele estava irredutível.");
                    pontuacao = pontuacao + 10;
                    System.out.println("Você ganhou 10 pontos!");
                    certa = certa - 15;
                    System.out.println("Sua pontuação é: " + pontuacao);
                    break;
                case 2:
                    System.out.println("Você tentou vender os limões na faculdade. Recebeu uma porção de olhares desconfiados e quase foi expulso pelos seguranças.");
                    pontuacao = pontuacao - 10;
                    System.out.println("Você perdeu 10 pontos!");
                    certa = certa - 3;
                    System.out.println("Sua pontuação é: " + pontuacao);
                    break;
                case 3:
                    System.out.println("A ideia funcionaria, caso não fosse novembro. Não conseguiu dinheiro de nenhum motorista, e a maioria passou buzinando e xingando a sua mãe.");
                    pontuacao = pontuacao - 15;
                    System.out.println("Você perdeu 15 pontos!");
                    certa = certa - 3;
                    System.out.println("Sua pontuação é: " + pontuacao);
                    break;
                case 4:
                    System.out.println("Uma das suas tias trocou os limões por uma máquina de imprimir estampas em camiseta. Agora você pode começar um novo negócio. Boa troca!");
                    pontuacao = pontuacao + certa;
                    System.out.println("Você ganhou " + certa + " pontos!");
                    System.out.println("Sua pontuação é: " + pontuacao);
                    certa = 100;

                    //PRIMEIRA OPCAO CERTA - VENDER

                    for (int j = 0; j < 3; j++) {

                        System.out.println("O que você escolhe fazer com a máquina? \n" +
                                "1. Imprimir frases motivacionais para vender. \n" +
                                "2. Imprimir a camiseta dos formandos do seu curso. \n" +
                                "3. Imprimir o logotipo do maior mercado da cidade na camisa dos funcionários.  \n" +
                                "4. Imprimir o sobrenome da família nas camisetas para o final do ano.");
                        op1 = entrada.nextInt();

                        switch (op1) {
                            case 1:
                                System.out.println("Você escolheu imprimir frases motivacionais. Que coisa brega, ninguém mais compra esse tipo de coisa. Escolha ruim.");
                                pontuacao = pontuacao - 10;
                                System.out.println("Você perdeu 10 pontos!");
                                certa = certa - 3;
                                System.out.println("Sua pontuação é: " + pontuacao);
                                break;
                            case 2:
                                System.out.println("Você escolheu imprimir a camiseta dos formandos do seu curso. Infelizmente, apenas metade deles pagou o trabalho.");
                                pontuacao = pontuacao + 10;
                                System.out.println("Você ganhou 10 pontos!");
                                certa = certa - 3;
                                System.out.println("Sua pontuação é: " + pontuacao);
                                break;
                            case 3:
                                System.out.println("Você escolheu imprimir o logotipo do maior mercado da cidade na camisa dos funcionários. Boa ideia!!! Transformou os limões em uma boa grana, pois o dono do mercado gostou do seu trabalho e encomendou para outros amigos da região.");
                                pontuacao = pontuacao + certa;
                                System.out.println("Você ganhou " + certa + " pontos!");
                                System.out.println("Sua pontuação é: " + pontuacao);

                                System.out.println("Finalmente, você conseguiu uma quantidade de dinheiro considerável. Você lembra, no entanto, que a tarefa da professora era conseguir o máximo de dinheiro possível com os limões. O que você faz agora? \n1. Decide tentar multiplicar o dinheiro.\n2. Entrega essa quantia para a professora.");
                                op1 = entrada.nextInt();

                                switch (op1) {
                                    case 1:
                                        System.out.println("Você decidiu tentar multiplicar o dinheiro e entregar um valor maior para a professora. Como você faz isso?\n" +
                                                "1. Compra um celular caro e decide rifar na faculdade.\n" +
                                                "2. Troca em uma casa de câmbio torcendo para o dólar cair durante os próximos dias.\n" +
                                                "3. Aposta tudo no jogo do bicho escolhendo o macaco.\n" +
                                                "4. Empresta o dinheiro para um primo envolvido em negócios ilícitos, que prometeu pagar o dobro no dia seguinte.");
                                        op1 = entrada.nextInt();

                                        switch (op1) {
                                            case 1:
                                                System.out.println("Você decidiu rifar um celular caro. Infelizmente, quase ninguém comprou a rifa pois desconfiavam da procedência do celular, já que você perdeu a nota fiscal. Terminou com um celular adicional e pouco dinheiro para entregar à professora. Péssima escolha.");
                                                pontuacao = pontuacao - 15;
                                                System.out.println("Você perdeu 15 pontos.");
                                                break;
                                            case 2:
                                                System.out.println("Você decidiu comprar dólar para revender depois de alguns dias. Mas como era previsto, visto a situação econômica e os indicadores monetários, o dólar subiu. Você acabou com um pouco menos do que havia investido, mas não perdeu tanto dinheiro assim.");
                                                break;
                                            case 3:
                                                System.out.println("Você escolheu apostar todo o dinheiro no jogo do bicho. Incrivelmente foi a única a apostar no macaco naquela data e acabou ganhando todo o dinheiro do prêmio sozinha. Parabéns!");
                                                pontuacao = pontuacao + 150;
                                                System.out.println("Você ganhou 150 pontos.");
                                                break;
                                            case 4:
                                                System.out.println("Você emprestou o dinheiro para seu primo envolvido em negócios ilícitos. No dia seguinte, ele havia desaparecido. Boatos diziam que foi por causa de uma gangue rival, talvez um crime de vingança. De qualquer forma, você perdeu todo o dinheiro.");
                                                pontuacao = pontuacao - 200;
                                                System.out.println("Você perdeu 200 pontos.");
                                                break;
                                        }

                                        if (pontuacao <= 0) {
                                            System.out.println("Pontuação final: " + pontuacao);
                                            System.out.println("No final das contas, você não conseguiu lucrar com os limões. A professora decidiu não te ajudar e você ficou de DP na disciplina. Buuuu!!!");
                                            break loopVender;
                                        } else {
                                            System.out.println("Com o dinheiro em mãos, você foi até a professora para transmitir seus resultados. Ela ficou satisfeita com o seu empenho e com a sua dedicação em investir o dinheiro para tentar conseguir mais. Você foi aprovado na matéria com média 8! Parabéns!");
                                            System.out.println("Sua pontuação final é: " + pontuacao);
                                            break loopVender;
                                        }

                                            case 2:
                                                System.out.println("Com o dinheiro em mãos, você foi até a professora para transmitir seus resultados. Ela ficou satisfeita com o seu empenho, mas admitiu que você poderia ter conseguido mais dinheiro com o tempo que ainda restava. Você foi aprovada na matéria com média 6!");
                                                System.out.println("Pontuação final: " + pontuacao);
                                                break loopVender;
                                }

                            case 4:
                                System.out.println("Você escolheu imprimir o sobrenome da família nas camisetas para o final do ano. Rolou briga antes do ano novo e desmarcaram a confraternização. Ninguém se reuniu e você não recebeu nada. Péssima ideia!");
                                pontuacao = pontuacao - 10;
                                System.out.println("Você perdeu 10 pontos!");
                                certa = certa - 3;
                                System.out.println("Sua pontuação é: " + pontuacao);
                                break;
                        }
                        if ((j == 0) || (j == 1)) {
                            System.out.println("Tente novamente!");
                        } else if (j == 2) {
                            gameover();
                            break loopVender;
                        }
                    }

            }
            if ((i == 0) || (i == 1)) {
                System.out.println("Tente novamente!");
            } else if (i == 2) {
                gameover();
                break loopVender;
            }
        }
    }

    static void caipirinha() {
        System.out.println("Você decide usar os limões para preparar drinks e vendê-los na faculdade. Com qual bebida alcoólica você decide preparar as caipirinhas?\n"
                        + "1. Vodka barata. \n"
                        + "2. Cachaça forte. \n"
                        + "3. Saquê.");
        op1 = entrada.nextInt();

        switch (op1) {
            case 1:
                System.out.println("Você escolheu usar vodka barata. Foi a preferida dos alunos, e você gastou pouco dinheiro para comprar a bebida. Boa escolha.");
                pontuacao = pontuacao + 20;
                System.out.println("Você ganhou 20 pontos!");
                System.out.println("Sua pontuação é: " + pontuacao);
                break;
            case 2:
                System.out.println("Você escolheu usar cachaça. A maioria dos alunos achou a bebida muito forte, e não voltaram para comprar mais.");
                pontuacao = pontuacao + 10;
                System.out.println("Você ganhou 10 pontos!");
                System.out.println("Sua pontuação é: " + pontuacao);
                break;
            case 3:
                System.out.println("Você gastou muito na compra da bebida, e os alunos não aceitavam pagar mais caro. Acabou perdendo dinheiro com o investimento");
                pontuacao = pontuacao + 15;
                System.out.println("Você perdeu 15 pontos!");
                System.out.println("Sua pontuação é: " + pontuacao);
                break;
        }

        System.out.println("Onde você decide abrir seu ponto de vendas? \n" +
                        "1. Escondida, para a administração da faculdade não te localizar.\n"
                        +"2. Exposta, para atingir o maior número de alunos.");
        op1 = entrada.nextInt();

        switch (op1) {
            case 1:
                System.out.println("Você escolheu agir com precaução. Menos alunos ficaram sabendo do seu empreendimento, porém você não enfrentou nenhum problema com a administração da faculdade.");
                pontuacao = pontuacao + 10;
                System.out.println("Você ganhou 10 pontos!");
                System.out.println("Sua pontuação é: " + pontuacao);
                break;
            case 2:
                System.out.println("Você escolheu divulgar o seu negócio para o maior número de alunos. Ao final do dia, a administração já estava ciente do seu negócio, e você ganhou uma advertência permanente no seu histórico, mas isso não afetou suas vendas.");
                pontuacao = pontuacao + 30;
                System.out.println("Você ganhou 30 pontos!");
                System.out.println("Sua pontuação é: " + pontuacao);
                break;
        }

        // adicionando outra pergunta
        System.out.println("Você decide pedir identificação para vender apenas para maiores de idade, ou oferece para todos a bebida? \n" +
                        "1. Decide pedir identificação.\n"
                        + "2. Decide vender para todos.");
        op1 = entrada.nextInt();

        switch (op1) {
            case 1:
                System.out.println("Você escolheu pedir identificação. Ao final do dia sua consciência estava limpa, porém você perdeu uma grande quantidade de vendas.");
                pontuacao = pontuacao + 15;
                System.out.println("Você ganhou 15 pontos!");
                System.out.println("Sua pontuação é: " + pontuacao);
                break;
            case 2:
                System.out.println("Você decide vender para todos os alunos. Conseguiu um maior número de clientes sem nenhuma repercussão negativa. Moralmente errado, mas financeiramente positivo.");
                pontuacao = pontuacao + 20;
                System.out.println("Você ganhou 20 pontos!");
                System.out.println("Sua pontuação é: " + pontuacao);
                break;
        }

        /* outra pergunta */

        System.out.println("Quanto você decide cobrar por copo?\n" +
                "1. $5\n" +
                "2. $10" );
        op1 = entrada.nextInt();
        switch (op1) {
            case 1:
                System.out.println("Você escolheu cobrar 5$ por copo. Apesar do valor menor, isso atraía mais pessoas e ocasionou um maior fluxo de vendas.");
                pontuacao = pontuacao + 20;
                System.out.println("Você ganhou 20 pontos!");
                System.out.println("Sua pontuação é: " + pontuacao);
                break;
            case 2:
                System.out.println("Você escolheu cobrar 10$ por copo. O lucro era maior por venda, porém menos alunos compravam e menos pessoas divulgavam o seu negócio.");
                pontuacao = pontuacao - 10;
                System.out.println("Você perdeu 10 pontos!");
                System.out.println("Sua pontuação é: " + pontuacao);
                break;
        }

        // pergunta continução

        System.out.println("Qual promoção você escolhe fazer?\n" +
                        "1. Traga dois amigos para consumir e ganhe uma bebida grátis.\n" +
                        "2. Se beber 5 copos ganhe um Uber para casa.");
        op1 = entrada.nextInt();
        switch (op1) {
            case 1:
                System.out.println("Você escolheu a primeira promoção. Ela foi bem aceita e rapidamente os alunos espalharam a notícia para os colegas. O seu negócio disparou e rapidamente você havia vendido todo o estoque.");
                pontuacao = pontuacao + 50;
                System.out.println("Você ganhou 50 pontos!");
                System.out.println("Sua pontuação é: " + pontuacao);
                break;
            case 2:
                System.out.println("Você escolheu a segunda promoção. Você não considerou a distância da casa de todos os alunos, e apesar do maior número de vendas para cada cliente, por vezes o valor das corridas não compensava o lucro e você perdia dinheiro.");
                pontuacao = pontuacao - 25;
                System.out.println("Você perdeu 25 pontos!");
                System.out.println("Sua pontuação é: " + pontuacao);
                break;
        }
        System.out.println("Finalmente, você conseguiu uma quantidade de dinheiro considerável. Você lembra, no entanto, que a tarefa da professora era conseguir o máximo de dinheiro possível com os limões. O que você faz agora? \n1. Decide tentar multiplicar o dinheiro.\n2. Entrega essa quantia para a professora.");
        op1 = entrada.nextInt();

        switch (op1) {
            case 1:
                System.out.println("Você decidiu tentar multiplicar o dinheiro e entregar um valor maior para a professora. Como você faz isso?\n" +
                        "1. Compra um celular caro e decide rifar na faculdade.\n" +
                        "2. Troca em uma casa de câmbio torcendo para o dólar cair durante os próximos dias.\n" +
                        "3. Aposta tudo no jogo do bicho escolhendo o macaco.\n" +
                        "4. Empresta o dinheiro para um primo envolvido em negócios ilícitos, que prometeu pagar o dobro no dia seguinte.");
                op1 = entrada.nextInt();

                switch (op1) {
                    case 1:
                        System.out.println("Você decidiu rifar um celular caro. Infelizmente, quase ninguém comprou a rifa pois desconfiavam da procedência do celular, já que você perdeu a nota fiscal. Terminou com um celular adicional e pouco dinheiro para entregar à professora. Péssima escolha.");
                        pontuacao = pontuacao - 30;
                        System.out.println("Você perdeu 30 pontos.");
                        break;
                    case 2:
                        System.out.println("Você decidiu comprar dólar para revender depois de alguns dias. Mas como era previsto, visto a situação econômica e os indicadores monetários, o dólar subiu. Você acabou com um pouco menos do que havia investido, mas não perdeu tanto dinheiro assim.");
                        break;
                    case 3:
                        System.out.println("Você escolheu apostar todo o dinheiro no jogo do bicho. Incrivelmente foi a única a apostar no macaco naquela data e acabou ganhando todo o dinheiro do prêmio sozinha. Parabéns!");
                        pontuacao = pontuacao + 150;
                        System.out.println("Você ganhou 150 pontos.");
                        break;
                    case 4:
                        System.out.println("Você emprestou o dinheiro para seu primo envolvido em negócios ilícitos. No dia seguinte, ele havia desaparecido. Boatos diziam que foi por causa de uma gangue rival, talvez um crime de vingança. De qualquer forma, você perdeu todo o dinheiro");
                        pontuacao = pontuacao - 200;
                        System.out.println("Você perdeu 200 pontos.");
                        break;
                }

                if (pontuacao <= 0) {
                    System.out.println("Pontuação final: " + pontuacao);
                    System.out.println("No final das contas, você não conseguiu lucrar com os limões. A professora decidiu não te ajudar e você ficou de DP na disciplina. Buuuu!!!");
                    break;
                } else {
                    System.out.println("Com o dinheiro em mãos, você foi até a professora para transmitir seus resultados. Ela ficou satisfeita com o seu empenho e com a sua dedicação em investir o dinheiro para tentar conseguir mais. Você foi aprovado na matéria com média 8! Parabéns!");
                    System.out.println("Sua pontuação final é: " + pontuacao);
                    break;
                }
            case 2:
                System.out.println("Com o dinheiro em mãos, você foi até a professora para transmitir seus resultados. Ela ficou satisfeita com o seu empenho, mas admitiu que você poderia ter conseguido mais dinheiro com o tempo que ainda restava. Você foi aprovada na matéria com média 6!");
                System.out.println("Pontuação final: " + pontuacao);
                break;
        }

    }


    public static void main(String[] args) {
        boolean jogar = true;


        do {
            System.out.println("Menu: \n 1. Novo jogo \n 2. História \n 3. Pontuação \n 4. Sair");
            menu = entrada.nextInt();
            loopGeral:

            // SWITCH CASE MENU
            switch (menu) {
                case 1:
                    System.out.println("Ana é uma aluna do curso de Análise e Desenvolvimento de Sistemas. Ao final do semestre, na disciplina de Fundamentos de Administração, faltavam 0,5 pontos para ela atingir a média de aprovação na disciplina. \nApós diálogo com a professora, ficou combinado o seguinte desafio: Ana recebeu uma porção de limões da professora e deve aplicar todo o conhecimento adquirido na disciplina para transformar os limões em algo mais lucrativo. \nA sua missão é guiar Ana entre as difentes situações e terminar o jogo com a maior quantidade de retorno financeiro sobre os limões.");

                    // ESCOLHA INICIAL DE ANA, ENTRE VENDER, PLANTAR, ETC...
                    System.out.println("O que você escolhe fazer inicialmente com os limões? \n1. Vender \n2. Plantar \n3. Vender caipirinha na frente da faculdade \n4. Abrir uma barraquinha de limonada");
                    op1 = entrada.nextInt();

                    switch (op1) {
                        case 1:
                            vender();
                            System.out.println("Deseja voltar para o menu ou sair do jogo? \n" +
                                    "1. Voltar para o menu. \n" +
                                    "2. Sair do jogo.");
                            op1 = entrada.nextInt();
                            if (op1 == 1) {
                                break loopGeral;
                            } else if (op1 == 2) {
                                jogar = false;
                            }
                            break;
                        case 2:
                            // ESCOLHA PLANTAR
                            break;
                        case 3:
                            // ESCOLHA CAIPIRINHA
                            caipirinha();
                            System.out.println("Deseja voltar para o menu ou sair do jogo? \n" +
                                    "1. Voltar para o menu. \n" +
                                    "2. Sair do jogo.");
                            op1 = entrada.nextInt();
                            if (op1 == 1) {
                                break loopGeral;
                            } else if (op1 == 2) {
                                jogar = false;
                            }
                            break;
                        case 4:
                            // ESCOLHA BARRAQUINHA LIMONADA
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Ana é uma aluna do curso de Análise e Desenvolvimento de Sistemas. Ao final do semestre, na disciplina de Fundamentos de Administração, faltavam 0,5 pontos para ela atingir a média de aprovação na disciplina. \nApós diálogo com a professora, ficou combinado o seguinte desafio: Ana recebeu uma porção de limões da professora e deve aplicar todo o conhecimento adquirido na disciplina para transformar os limões em algo mais lucrativo. \nA sua missão é guiar Ana entre as difentes situações e terminar o jogo com a maior quantidade de retorno financeiro sobre os limões.");
                    break;
                case 3:
                    System.out.println("Maiores pontuações do jogo:");
                    break;
                case 4:
                    jogar = false;
            }

        } while (jogar == true);

    }
}
