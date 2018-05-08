
import javax.swing.*;
import java.util.Scanner;

public class PI {

    static boolean jogar = true;
    static boolean pedeRanking;
    static int pontuacao = 0;
    static int menu, op1;
    static int certa = 100;
    static int pontFinal = 0;
    static int cont;
    static int contImprimir;
    static int[] ranking = new int[5];
    static String[] rankingNome = new String[5];
    static Scanner entrada = new Scanner(System.in);

    //função gameover - mostra as mensagens de termino de jogo, deverá ser chamada quando o usuário errar 3 vezes em uma mesma pergunta
    static void gameover() {
        JOptionPane.showMessageDialog(null,"Game over! Você escolheu as opções erradas. Inicie um novo jogo!");
    }

    //Funcao voltar o menu ou sair do jogo
    static void voltarOuSair (){

        do {
            op1 = Integer.parseInt(JOptionPane.showInputDialog("Deseja voltar para o menu ou sair do jogo? \n"
                    + "1. Voltar para o menu. \n"
                    + "2. Sair do jogo."));
        } while (op1 <= 0 || op1 > 2);

        if (op1 == 1) {
            pedeRanking = true;
            return;
        } else if (op1 == 2) {
            jogar = false;
            pedeRanking = false;
        }

    }

    //Funcao que chama o menu
    static int menu() {
        pontuacao = 0;
        pontFinal = 0;
        certa = 100;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha \n 1. Novo jogo \n 2. História \n 3. Pontuação \n 4. Sair"));
        } while (menu <= 0 || menu > 4);
        return menu;
    }
    //Funcao Entregar ou tentar multiplicar o dinheiro
    static int entregarOuMultiplicar(int pontuacao){
        do {
            op1 =  Integer.parseInt(JOptionPane.showInputDialog("Finalmente, você conseguiu uma quantidade de dinheiro considerável. \nVocê lembra, no entanto, que a tarefa da professora era conseguir o máximo de dinheiro possível com os limões. O que você faz agora? \n1. Decide tentar multiplicar o dinheiro.\n2. Entrega essa quantia para a professora."));
        } while (op1 <= 0 || op1 > 2);

        switch (op1) {
            case 1:
                do {
                    op1 = Integer.parseInt(JOptionPane.showInputDialog("Você decidiu tentar multiplicar o dinheiro e entregar um valor maior para a professora. Como você faz isso?\n"
                            + "1. Compra um celular caro e decide rifar na faculdade.\n"
                            + "2. Troca em uma casa de câmbio torcendo para o dólar cair durante os próximos dias.\n"
                            + "3. Aposta tudo no jogo do bicho escolhendo o macaco.\n"
                            + "4. Empresta o dinheiro para um primo envolvido em negócios ilícitos, que prometeu pagar o dobro no dia seguinte."));
                } while (op1 <= 0 || op1 > 4);

                switch (op1) {

                    case 1:
                        pontuacao = pontuacao - 30;
                        JOptionPane.showMessageDialog(null,"Você decidiu rifar um celular caro. \nInfelizmente, quase ninguém comprou a rifa pois desconfiavam da procedência do celular, já que você perdeu a nota fiscal. \nTerminou com um celular adicional e pouco dinheiro para entregar à professora. Péssima escolha. \n Você perdeu 30 pontos.");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Você decidiu comprar dólar para revender depois de alguns dias. \nMas como era previsto, visto a situação econômica e os indicadores monetários, o dólar subiu. \nVocê acabou com um pouco menos do que havia investido, mas não perdeu tanto dinheiro assim.");
                        break;
                    case 3:
                        pontuacao = pontuacao + 150;
                        JOptionPane.showMessageDialog(null,"Você escolheu apostar todo o dinheiro no jogo do bicho. \nIncrivelmente foi a única a apostar no macaco naquela data e acabou ganhando todo o dinheiro do prêmio sozinha. \nParabéns! Você ganhou 150 pontos.");
                        break;
                    case 4:
                        pontuacao = pontuacao - 200;
                        JOptionPane.showMessageDialog(null,"Você emprestou o dinheiro para seu primo envolvido em negócios ilícitos. \nNo dia seguinte, ele havia desaparecido. Boatos diziam que foi por causa de uma gangue rival, talvez um crime de vingança. De qualquer forma, \nvocê perdeu todo o dinheiro. Você perdeu 200 pontos.");
                        break;
                }

                if (pontuacao <= 0) {
                    JOptionPane.showMessageDialog(null,"Pontuação final: " + pontuacao + ". No final das contas, você não conseguiu lucrar com os limões. \nA professora decidiu não te ajudar e você ficou de DP na disciplina. Buuuu!!!");
                    return pontuacao;
                    } else {
                    JOptionPane.showMessageDialog(null,"Com o dinheiro em mãos, você foi até a professora para transmitir seus resultados. \nEla ficou satisfeita com o seu empenho e com a sua dedicação em investir o dinheiro para tentar conseguir mais. \n Você foi aprovado na matéria com média 8! Parabéns! Sua pontuação final é: " + pontuacao);
                    return pontuacao;

                }

            case 2:
                JOptionPane.showMessageDialog(null,"Com o dinheiro em mãos, você foi até a professora para transmitir seus resultados. \nEla ficou satisfeita com o seu empenho, mas admitiu que você poderia ter conseguido mais dinheiro com o tempo que ainda restava. \nVocê foi aprovada na matéria com média 6! \n Pontuação final: " + pontuacao);
                return pontuacao;
        }
        return pontuacao;
    }

    // funcao plantar
    static int plantar() {
        loopPlantar:
        for (int i = 0; i < 3; i++) {
            do {
                op1 = Integer.parseInt(JOptionPane.showInputDialog("1. Plantar no quintal de casa. \n"
                        + "2. Plantar na horta do bairro. \n"
                        + "3. Plantar no terreno atrás da faculdade. \n"
                        + "4. Plantar no canteiro da avenida."));
            } while (op1 <= 0 || op1 > 4);

            switch (op1) {
                case 1:
                    pontuacao = pontuacao + 10;
                    certa = certa - 10;
                    JOptionPane.showMessageDialog(null,"Você escolheu plantar no quintal de casa. \nPorém o solo não era fértil, portanto é claro que não deu frutos. Caso escolhesse esperar você \nperderia o prazo e não ganharia dinheiro algum. \n Você ganhou 10 pontos! \n Sua pontuação é:" + pontuacao);
                    break;
                case 2:
                    pontuacao = pontuacao - 10;
                    certa = certa - 15;
                    JOptionPane.showMessageDialog(null, "Você esolheu plantar na horta do bairro. \nO solo erá fertil e o crescimento dos limões era promissor. Mas, durante a noite, o dono da horta roubava seus \nlimões te deixando sem dinheiro e sem frutos. \n Você perdeu 10 pontos! \n Sua pontuação é: " + pontuacao);
                    break;
                case 3:
                    pontuacao = pontuacao + certa;
                    JOptionPane.showMessageDialog(null,"Você escolheu plantar no terreno atrás da faculdade. \nEnquanto cavava o buraco para colocar os limões, encontou uma cápsula do tempo enterrada \ndesde a década de 60 que vale mais que uma porção de limões.\n Bom trabalho! \n Você ganhou " + certa + " pontos! \n Sua pontuação é: " + pontuacao);
                    certa = 100;

                    //Opção certa
                    for (int j = 0; j < 3; j++) {
                        do {
                            op1 =  Integer.parseInt(JOptionPane.showInputDialog("Dentro da cápsula do tempo você encontrou: \n"
                                    + "1. Um disco 1ª edição Pet Souds dos Beach Boys.\n"
                                    + "2. Um video game Atari ainda lacrado, dentro da caixa.\n"
                                    + "3. Um par de brincos de perola que apresentavam ser bijoteria.\n"
                                    + "4. Figurinhas da copa de 1962. \n Qual dessas opções você escolhe para vender pela Internet?"));
                        } while (op1 <= 0 || op1 > 4);

                        switch (op1) {
                            case 1:
                                pontuacao = pontuacao - 10;
                                certa = certa - 5;
                                JOptionPane.showMessageDialog(null,"Apesar da raridade do disco, o rock clássico anda em baixa nas paradas musicais brasileiras. \nPassaram-se dias e você não recebeu nenhuma oferta. Escolheu mal! \n Você perdeu 10 pontos! \n Sua pontuação é: " + pontuacao);
                                break;
                            case 2:
                                pontuacao = pontuacao - 10;
                                certa = certa - 10;
                                JOptionPane.showMessageDialog(null,"O videogame é uma peça clássica, mas todas as pessoas que entraram en contato desistiram \npor não ter uma TV compativel com a entrada do videogame, que é ultrapassada e não é mais utilizada. Má escolha. \n Você ganhou 10 pontos! \n Sua pontuação é: " + pontuacao);
                                break;
                            case 3:
                                pontuacao = pontuacao + certa;
                                JOptionPane.showMessageDialog(null,"As joias eram herança de uma rica família norueguesa que tinha vínculos com a corte real \ne boatos de envolvimento com a máfia Húngara. Um colecionador ofertou uma ótima quantia pelo par de brincos. Parabéns!!! \n Você ganhou " + certa + " pontos. \n Sua pontuação é: " + pontuacao);
                                certa = 100;
                                pontFinal = entregarOuMultiplicar(pontuacao);
                                break loopPlantar;
                            case 4:
                                pontuacao = pontuacao - 10;
                                JOptionPane.showMessageDialog(null,"Você recebeu uma oferta pela figurinha, mas durante o embalo e postagem \nvocê acabou rasgando a cabeça do pelé. O comprador desistiu da compra, com razão. \n Você perdeu 10 pontos! \n Sua pontuação é: " + pontuacao);
                                certa = certa - 3;
                                break;
                        }
                        if ((j == 0) || (j == 1)) {
                            JOptionPane.showMessageDialog(null,"Tente novamente! " + j+1 + " de 3 tentativas.");
                        } else if (j == 2) {
                            gameover();
                            break loopPlantar;
                        }
                    }

                case 4:
                    pontuacao = pontuacao - 15;
                    JOptionPane.showMessageDialog(null,"Você escolheu plantar no canteiro da avenida, \nmas foi pego pela fiscalização enquanto cavava e levou uma multa por plantar sem autorização. \nFicou agora com menos dinheiro que tinha começado. \n Você perdeu 15 pontos! \n Sua pontuação é: " + pontuacao);
                    certa = certa - 10;
                    break;
            }
            if ((i == 0) || (i == 1)) {
                JOptionPane.showMessageDialog(null,"Tente novamente! " + i+1 + " de 3 tentativas.");
            } else if (i == 2) {
                gameover();
                break;
            }
        }
        return pontFinal;
    }

    //função vender
    static int vender() {
        loopVender:
        for (int i = 0; i < 3; i++) {
            do {
                op1 =  Integer.parseInt(JOptionPane.showInputDialog("1. Vender para o mercadinho da esquina. \n"
                        + "2. Vender para os colegas. \n"
                        + "3. Vender no semáforo dizendo se tratar de trote da faculdade. \n"
                        + "4. Vender para os parentes."));
            } while (op1 <= 0 || op1 > 4);

            switch (op1) {
                case 1:
                    pontuacao = pontuacao + 10;
                    JOptionPane.showMessageDialog(null,"Você escolheu vender para o mercadinho da esquina. \nSeu Takashi, proprietário do local, ofereceu 10 centavos por unidade. Você tentou negociar o valor, mas ele estava irredutível.\nVocê ganhou 10 pontos! Sua pontuação é: " + pontuacao);
                    certa = certa - 15;
                    break;
                case 2:
                    pontuacao = pontuacao - 10;
                    JOptionPane.showMessageDialog(null,"Você tentou vender os limões na faculdade. Recebeu uma porção de olhares \ndesconfiados e quase foi expulso pelos seguranças.\nVocê perdeu 10 pontos! Sua pontuação é: " + pontuacao);
                    certa = certa - 3;
                    break;
                case 3:
                    pontuacao = pontuacao - 15;
                    JOptionPane.showMessageDialog(null,"A ideia funcionaria, caso não fosse novembro. Não conseguiu dinheiro de nenhum motorista, \ne a maioria passou buzinando e xingando a sua mãe.\nVocê perdeu 15 pontos! Sua pontuação é: " + pontuacao);
                    certa = certa - 3;
                    break;
                case 4:
                    pontuacao = pontuacao + certa;
                    JOptionPane.showMessageDialog(null,"Uma das suas tias trocou os limões por uma máquina de imprimir estampas em camiseta. \nAgora você pode começar um novo negócio. Boa troca!\nVocê ganhou " + certa + " pontos! Sua pontuação é: " + pontuacao);
                    certa = 100;

                    //PRIMEIRA OPCAO CERTA - VENDER
                    for (int j = 0; j < 3; j++) {
                        do {
                            op1 =  Integer.parseInt(JOptionPane.showInputDialog("O que você escolhe fazer com a máquina? \n"
                                    + "1. Imprimir frases motivacionais para vender. \n"
                                    + "2. Imprimir a camiseta dos formandos do seu curso. \n"
                                    + "3. Imprimir o logotipo do maior mercado da cidade na camisa dos funcionários.  \n"
                                    + "4. Imprimir o sobrenome da família nas camisetas para o final do ano."));
                        } while (op1 <= 0 || op1 > 4);

                        switch (op1) {
                            case 1:
                                pontuacao = pontuacao - 10;
                                JOptionPane.showMessageDialog(null,"Você escolheu imprimir frases motivacionais. \nQue coisa brega, ninguém mais compra esse tipo de coisa. Escolha ruim.\nVocê perdeu 10 pontos! Sua pontuação é: " + pontuacao);
                                certa = certa - 3;
                                break;
                            case 2:
                                pontuacao = pontuacao + 10;
                                JOptionPane.showMessageDialog(null,"Você escolheu imprimir a camiseta dos formandos do seu curso. \nInfelizmente, apenas metade deles pagou o trabalho.\nVocê ganhou 10 pontos! Sua pontuação é: " + pontuacao);
                                certa = certa - 3;
                                break;
                            case 3:
                                pontuacao = pontuacao + certa;
                                JOptionPane.showMessageDialog(null,"Você escolheu imprimir o logotipo do maior mercado da cidade na camisa dos funcionários. Boa ideia!!! \nTransformou os limões em uma boa grana, pois o dono do mercado gostou do seu trabalho e encomendou para outros amigos da região.\nVocê ganhou " + certa + " pontos! Sua pontuação é: " + pontuacao);
                                pontFinal = entregarOuMultiplicar(pontuacao);
                                break loopVender;
                            case 4:
                                pontuacao = pontuacao - 10;
                                JOptionPane.showMessageDialog(null,"Você escolheu imprimir o sobrenome da família nas camisetas para o final do ano. \nRolou briga antes do ano novo e desmarcaram a confraternização. \nNinguém se reuniu e você não recebeu nada. Péssima ideia!\nVocê perdeu 10 pontos! Sua pontuação é: " + pontuacao);
                                certa = certa - 3;
                                break;
                        }
                        if ((j == 0) || (j == 1)) {
                            JOptionPane.showMessageDialog(null,"Tente novamente! " + (j+1) + " de 3 tentativas.");
                        } else if (j == 2) {
                            gameover();
                            break loopVender;
                        }
                    }

            }
            if ((i == 0) || (i == 1)) {
                JOptionPane.showMessageDialog(null,"Tente novamente! " + (i+1) + " de 3 tentativas.");
            } else if (i == 2) {
                gameover();
                break;
            }
        }
        return pontFinal;
    }

    static int caipirinha() {
        do {
            op1 = Integer.parseInt(JOptionPane.showInputDialog("Você decide usar os limões para preparar drinks e vendê-los na faculdade. \nCom qual bebida alcoólica você decide preparar as caipirinhas?\n"
                    + "1. Vodka barata. \n"
                    + "2. Cachaça forte. \n"
                    + "3. Saquê."));
        } while (op1 <= 0 || op1 > 3);

        switch (op1) {
            case 1:
                pontuacao = pontuacao + 20;
                JOptionPane.showMessageDialog(null,"Você escolheu usar vodka barata. Foi a preferida dos alunos, \ne você gastou pouco dinheiro para comprar a bebida. Boa escolha.\nVocê ganhou 20 pontos! Sua pontuação é: " + pontuacao);
                break;
            case 2:
                pontuacao = pontuacao + 10;
                JOptionPane.showMessageDialog(null,"Você escolheu usar cachaça. A maioria dos alunos achou a bebida muito forte, e não voltaram para comprar mais.\nVocê ganhou 10 pontos! Sua pontuação é: " + pontuacao);
                break;
            case 3:
                pontuacao = pontuacao - 15;
                JOptionPane.showMessageDialog(null,"Você gastou muito na compra da bebida, e os alunos não aceitavam pagar mais caro. \nAcabou perdendo dinheiro com o investimento. Você perdeu 15 pontos!\n Sua pontuação é: " + pontuacao);
                break;
        }
        do {
            op1 = Integer.parseInt(JOptionPane.showInputDialog("Onde você decide abrir seu ponto de vendas? \n"
                    + "1. Escondida, para a administração da faculdade não te localizar.\n"
                    + "2. Exposta, para atingir o maior número de alunos."));
        } while (op1 <= 0 || op1 > 2);

        switch (op1) {
            case 1:
                pontuacao = pontuacao + 10;
                JOptionPane.showMessageDialog(null,"Você escolheu agir com precaução. Menos alunos ficaram sabendo do seu empreendimento, \nporém você não enfrentou nenhum problema com a administração da faculdade.\nVocê ganhou 10 pontos! Sua pontuação é: " + pontuacao);
                break;
            case 2:
                pontuacao = pontuacao + 30;
                JOptionPane.showMessageDialog(null,"Você escolheu divulgar o seu negócio para o maior número de alunos. \nAo final do dia, a administração já estava ciente do seu negócio, e você ganhou uma advertência permanente no seu histórico, \nmas isso não afetou suas vendas. Você ganhou 30 pontos!\nSua pontuação é: " + pontuacao);
                break;
        }

        do {
            op1 = Integer.parseInt(JOptionPane.showInputDialog("Você decide pedir identificação para vender apenas para maiores de idade, ou oferece para todos a bebida? \n"
                    + "1. Decide pedir identificação.\n"
                    + "2. Decide vender para todos."));
        } while (op1 <= 0 || op1 > 2);

        switch (op1) {
            case 1:
                pontuacao = pontuacao + 15;
                JOptionPane.showMessageDialog(null,"Você escolheu pedir identificação. Ao final do dia sua consciência estava limpa, \nporém você perdeu uma grande quantidade de vendas. Você ganhou 15 pontos!\nSua pontuação é: " + pontuacao);
                break;
            case 2:
                pontuacao = pontuacao + 20;
                JOptionPane.showMessageDialog(null,"Você decide vender para todos os alunos. Conseguiu um maior número de clientes \nsem nenhuma repercussão negativa. Moralmente errado, mas financeiramente positivo.\nVocê ganhou 20 pontos! Sua pontuação é: " + pontuacao);
                break;
        }

        do {
            op1 = Integer.parseInt(JOptionPane.showInputDialog("Quanto você decide cobrar por copo?\n"
                    + "1. $5\n"
                    + "2. $10"));
        } while (op1 <= 0 || op1 > 2);

        switch (op1) {
            case 1:
                pontuacao = pontuacao + 20;
                JOptionPane.showMessageDialog(null,"Você escolheu cobrar 5$ por copo. Apesar do valor menor, \nisso atraía mais pessoas e ocasionou um maior fluxo de vendas. Você ganhou 20 pontos!\nSua pontuação é: " + pontuacao);
                break;
            case 2:
                pontuacao = pontuacao - 10;
                JOptionPane.showMessageDialog(null,"Você escolheu cobrar 10$ por copo. O lucro era maior por venda, \nporém menos alunos compravam e menos pessoas divulgavam o seu negócio.\nVocê perdeu 10 pontos! Sua pontuação é: " + pontuacao);
                break;
        }

        do {
            op1 = Integer.parseInt(JOptionPane.showInputDialog("Qual promoção você escolhe fazer?\n"
                    + "1. Traga dois amigos para consumir e ganhe uma bebida grátis.\n"
                    + "2. Se beber 5 copos ganhe um Uber para casa."));
        } while (op1 <= 0 || op1 > 2);

        switch (op1) {
            case 1:
                pontuacao = pontuacao + 50;
                JOptionPane.showMessageDialog(null,"Você escolheu a primeira promoção. Ela foi bem aceita e rapidamente os alunos espalharam a notícia para os colegas. \nO seu negócio disparou e rapidamente você havia vendido todo o estoque. Você ganhou 50 pontos!\nSua pontuação é: " + pontuacao);
                break;
            case 2:
                pontuacao = pontuacao - 25;
                JOptionPane.showMessageDialog(null,"Você escolheu a segunda promoção. Você não considerou a distância da casa de todos os alunos, \ne apesar do maior número de vendas para cada cliente, por vezes o valor das corridas não compensava o lucro e você perdia dinheiro.\nVocê perdeu 25 pontos! Sua pontuação é: " + pontuacao);
                break;
        }

        if (pontuacao <= 0){
            JOptionPane.showMessageDialog(null,"Pontuação final: " + pontuacao + ". No final das contas, você não conseguiu lucrar com os limões. \nA professora decidiu não te ajudar e você ficou de DP na disciplina. Buuuu!!!");
            pontFinal = pontuacao;
            return pontFinal;
        } else {
            pontFinal = entregarOuMultiplicar(pontuacao);
            return pontFinal;
        }

    }


    public static void main(String[] args) {

        do {

            menu();

            // SWITCH CASE MENU
            switch (menu) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Ana é uma aluna do curso de Análise e Desenvolvimento de Sistemas. \nAo final do semestre, na disciplina de Fundamentos de Administração, faltavam 0,5 pontos para ela atingir a média de aprovação na disciplina. \nApós diálogo com a professora, ficou combinado o seguinte desafio: Ana recebeu uma porção de limões da professora e \ndeve aplicar todo o conhecimento adquirido na disciplina para transformar os limões em algo mais lucrativo. \nA sua missão é guiar Ana entre as difentes situações e terminar o jogo com a maior quantidade de retorno financeiro sobre os limões.");

                    // ESCOLHA INICIAL DE ANA, ENTRE VENDER, PLANTAR, ETC...
                    do {
                        op1 = Integer.parseInt(JOptionPane.showInputDialog("O que você escolhe fazer inicialmente com os limões? \n1. Vender \n2. Plantar \n3. Vender caipirinha na frente da faculdade \n4. Abrir uma barraquinha de limonada"));
                    } while (op1 <= 0 || op1 > 4);

                    switch (op1) {
                        case 1:
                            //ESCOLHA VENDER
                            vender();
                            voltarOuSair();
                            break;

                        case 2:
                            // ESCOLHA PLANTAR
                            plantar();
                            voltarOuSair();
                            break;

                        case 3:
                            // ESCOLHA CAIPIRINHA
                            caipirinha();
                            voltarOuSair();
                            break;
                        case 4:
                            // ESCOLHA BARRAQUINHA LIMONADA
                            break;
                    }
                    if (pontFinal>0){
                   // if (pedeRanking == true){
                    for (int i = 0; i < 5; i++) {
                        if (pontFinal >= ranking[i]) {
                            int l = 5;
                            int k;
                            for (k = 0; k<=i; k++){
                                l--;
                            }
                            k = i;
                            while (k <= 3) {
                                ranking[i + l] = ranking[i + l - 1];
                                rankingNome[i + l] = rankingNome[i + l - 1];
                                l--;
                                k++;
                            }
                            ranking[i] = pontFinal;
                            rankingNome[i] = JOptionPane.showInputDialog("Digite um nome para o Ranking: ");
                            break;
                        }
                    }
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Ana é uma aluna do curso de Análise e Desenvolvimento de Sistemas. \nAo final do semestre, na disciplina de Fundamentos de Administração, faltavam 0,5 pontos para ela atingir a média de aprovação na disciplina. \nApós diálogo com a professora, ficou combinado o seguinte desafio: Ana recebeu uma porção de limões da professora e deve aplicar \ntodo o conhecimento adquirido na disciplina para transformar os limões em algo mais lucrativo. \nA sua missão é guiar Ana entre as difentes situações e terminar o jogo com a maior quantidade de retorno financeiro sobre os limões.");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Maiores pontuações do jogo:");
                    for (int i = 0; i<5; i++){
                        if (ranking[i] != 0){
                            System.out.println(rankingNome[i] + ranking[i]);
                            contImprimir++;
                        } else if (ranking[i] == 0 ){
                            cont++;
                        }
                    }
                    switch (contImprimir){
                        case 1:
                            JOptionPane.showMessageDialog(null,rankingNome[0] + " - " + ranking[0] + " pontos.");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null,rankingNome[0] + " - " + ranking[0] + " pontos.\n"+ rankingNome[1] + " - " + ranking[1] + " pontos.");
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null,rankingNome[0] + " - " + ranking[0] + " pontos.\n"+ rankingNome[1] + " - " + ranking[1]+ " pontos.\n"+ rankingNome[2] + " - " + ranking[2] + " pontos.");
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null,rankingNome[0] + " - " + ranking[0] + " pontos.\n"+ rankingNome[1] + " - " + ranking[1]+ " pontos.\n"+ rankingNome[2] + " - " + ranking[2] + " pontos.\n" + rankingNome[3] + " - " + ranking[3] + " pontos.");
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null,rankingNome[0] + " - " + ranking[0] + " pontos.\n"+ rankingNome[1] + " - " + ranking[1]+ " pontos.\n"+ rankingNome[2] + " - " + ranking[2] + " pontos.\n" + rankingNome[3] + " - " + ranking[3] + " pontos.\n"+ rankingNome[4] + " - " + ranking[4] + " pontos.");
                            break;
                    }
                    if (cont==5) {
                    JOptionPane.showMessageDialog(null,"Nenhuma pontuação registrada.");
                    cont=0;
                }
                    contImprimir=0;
                    break;
                case 4:
                    jogar = false;
            }

        } while (jogar == true);

    }


}
