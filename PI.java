package pi;

import java.util.Scanner;

public class PI {

    static int pontuacao = 0;

    static void gameover() {
        System.out.println("Game over! Você escolheu as opções erradas. Tente novamente.");
        System.out.println("Sua pontuacao final é: " + pontuacao);
    }

    public static void main(String[] args) {
        boolean jogar = true;
        Scanner entrada = new Scanner(System.in);

        int menu, op1;
        int certa = 10;
        do {
            System.out.println("Menu: \n 1. Novo jogo \n 2. História \n 3. Pontuação \n 4. Sair");
            menu = entrada.nextInt();

            // SWITCH CASE MENU
            switch (menu) {
                case 1:
                    System.out.println("Ana é uma aluna do curso de Análise e Desenvolvimento de Sistemas. Ao final do semestre, na disciplina de Fundamentos de Administração, faltavam 0,5 pontos para ela atingir a média de aprovação na disciplina. \nApós diálogo com a professora, ficou combinado o seguinte desafio: Ana recebeu uma porção de limões da professora e deve aplicar todo o conhecimento adquirido na disciplina para transformar os limões em algo mais lucrativo. \nA sua missão é guiar Ana entre as difentes situações e terminar o jogo com a maior quantidade de retorno financeiro sobre os limões.");

                    // ESCOLHA INICIAL DE ANA, ENTRE VENDER, PLANTAR, ETC...
                    System.out.println("O que você escolhe fazer inicialmente com os limões? \n1. Vender \n2. Plantar \n3. Vender caipirinha na frente da faculdade \n4. Abrir uma barraquinha de limonada");
                    op1 = entrada.nextInt();

                    switch (op1) {
                        case 1:
                            // ESCOLHA VENDER
                            for (int i = 0; i < 2; i++) {
                                System.out.println("Vender para o mercadinho da esquina. \n2. Vender na faculdade para os colegas. \n3. Vender no semáforo dizendo se tratar de trote da faculdade. \n4. Vender para os parentes.");
                                op1 = entrada.nextInt();

                                switch (op1) {
                                    case 1:
                                        System.out.println("Você escolheu vender para o mercadinho da esquina. Seu Takashi, proprietário do local, ofereceu 10 centavos por unidade. Você tentou negociar o valor, mas ele estava irredutível.");
                                        pontuacao++;
                                        certa = certa - 3;
                                        System.out.println("Sua pontuação é: " + pontuacao);
                                        break;
                                    case 2:
                                        System.out.println("Você tentou vender os limões na faculdade. Recebeu uma porção de olhares desconfiados e quase foi expulso pelos seguranças.");
                                        pontuacao++;
                                        certa = certa - 3;
                                        System.out.println("Sua pontuação é: " + pontuacao);
                                        break;
                                    case 3:
                                        System.out.println("A ideia funcionaria, caso não fosse novembro. Não conseguiu dinheiro de nenhum motorista, e a maioria passou buzinando e xingando a sua mãe.");
                                        pontuacao++;
                                        certa = certa - 3;
                                        System.out.println("Sua pontuação é: " + pontuacao);
                                        break;
                                    case 4:
                                        System.out.println("Uma das suas tias trocou os limões por uma máquina de imprimir estampas em camiseta. Agora você pode começar um novo negócio. Boa troca!");
                                        pontuacao = pontuacao + certa;
                                        System.out.println("Sua pontuação é: " + pontuacao);

                                        //PRIMEIRA OPCAO CERTA - VENDER
                                        
                                        System.out.println("O que você escolhe fazer com a máquina?");
                                        op1 = entrada.nextInt();

                                        switch (op1) {

                                        }
                                        break;
                                }
                                if (i == 0) {
                                    System.out.println("Tente novamente!");
                                }
                                break;
                            }
                        case 2:
                            // ESCOLHA PLANTAR
                            break;
                        case 3:
                            // ESCOLHA CAIPIRINHA
                            break;
                        case 4:
                            // ESCOLHA BARRAQUINHA LIMONADA
                            break;

                    }
                    gameover();
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
