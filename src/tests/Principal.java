package tests;

import java.util.Scanner;
import enums.JogoGenre;
import enums.JogoClassificacao;
import models.Jogo;
import java.util.ArrayList;


public class Principal {
    public static void main (String[] args) {
        ArrayList<Jogo> listaJogos = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);


        while (true) {
            System.out.println("Menu" +
                    "\n0- Sair" +
                    "\n1- Cadastrar" +
                    "\n2- Listar" +
                    "\n3- Consultar por Título" +
                    "\n4- Consultar por Classificação Etária" +
                    "\n5- Alterar" +
                    "\n6- Excluir" +
                    "\nDigite a operação desejada: ");
            int opcao = leitor.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            } else if (opcao == 1) {
                System.out.println("Título do Jogo = ");
                String titulo = leitor.nextLine();

                System.out.println("Ano de Lançamento = ");
                String anoLancamento = leitor.nextLine();

                JogoGenre GameGenre = null;
                while (GameGenre == null) {
                    System.out.println("Gêneros: \n(RPG), \n(ACTION), \n(STRATEGY), \n(ADVENTURE), \n(SIMULATION), \n(SPORTS), \n(RACING), \n(JRPG), \n(MMORPG), \n(FPS)FIRST_PERSON_SHOOTER, \n(TPS)THIRD_PERSON_SHOOTER, \n(SURVIVAL), \n(FIGHTING), \n(STEALTH)");
                    String opcaoGameGenre = leitor.nextLine().toUpperCase();

                    switch (opcaoGameGenre) {
                        case "RPG":
                            GameGenre = JogoGenre.RPG;
                            break;
                        case "ACTION":
                            GameGenre = JogoGenre.ACTION;
                            break;
                        case "STRATEGY":
                            GameGenre = JogoGenre.STRATEGY;
                            break;
                        case "ADVENTURE":
                            GameGenre = JogoGenre.ADVENTURE;
                            break;
                        case "SIMULATION":
                            GameGenre = JogoGenre.SIMULATION;
                            break;
                        case "SPORTS":
                            GameGenre = JogoGenre.SPORTS;
                            break;
                        case "RACING":
                            GameGenre = JogoGenre.RACING;
                            break;
                        case "JRPG":
                            GameGenre = JogoGenre.JRPG;
                            break;
                        case "MMORPG":
                            GameGenre = JogoGenre.MMORPG;
                            break;
                        case "FPS":
                            GameGenre = JogoGenre.FIRST_PERSON_SHOOTER;
                            break;
                        case "TPS":
                            GameGenre = JogoGenre.THIRD_PERSON_SHOOTER;
                            break;
                        case "SURVIVAL":
                            GameGenre = JogoGenre.SURVIVAL;
                            break;
                        case "FIGHTING":
                            GameGenre = JogoGenre.FIGHTING;
                            break;
                        case "STEALTH":
                            GameGenre = JogoGenre.STEALTH;
                            break;

                        default:
                            System.out.println("Opção Inválida.");
                            break;
                    }
                }
                System.out.println("Desenvolvedor = ");
                String desenvolvedor = leitor.nextLine();

                System.out.println("Publicadora = ");
                String publisher = leitor.nextLine();

                JogoClassificacao ClassificacaoJogo = null;
                while (ClassificacaoJogo == null) {
                    System.out.println("Classíficação Etária: \n(DEZOITO) \n(DEZESSEIS) \n(CATORZE) \n(DOZE)");
                    String opcaoClassificacaoJogo = leitor.nextLine().toUpperCase();

                    switch (opcaoClassificacaoJogo) {
                        case "DEZOITO":
                            ClassificacaoJogo = JogoClassificacao.DEZOITO;
                            break;
                        case "DEZESSEIS":
                            ClassificacaoJogo = JogoClassificacao.DEZESSEIS;
                            break;
                        case "CATORZE":
                            ClassificacaoJogo = JogoClassificacao.CATORZE;
                            break;
                        case "DOZE":
                            ClassificacaoJogo = JogoClassificacao.DOZE;
                            break;
                        default:
                            System.out.println("Opção Inválida");
                            break;
                        }
                    }


                Jogo jogo = new Jogo(titulo, anoLancamento, GameGenre, desenvolvedor, publisher, ClassificacaoJogo);
                listaJogos.add(jogo);
                System.out.println("Jogo cadastrado.");
            } else if (opcao == 2) {
                System.out.println("Jogos:\n");
                for (Jogo jogo : listaJogos) {
                    System.out.println(jogo.getTitulo() + "/" +jogo.getAnoLancamento() + "/" + jogo.getGameGenre() + "/" + jogo.getDesenvolvedor() + "/" + jogo.getPublisher() + "/" + jogo.getClassificacaoJogo());
                    System.out.println("<------------------------->");
                }
            }else if (opcao ==3) {
                System.out.println("Qual o jogo que gostaria de procurar por? Pesquise pelo Título.");
                String titulo = leitor.nextLine().toLowerCase();
                boolean encontrado = false;
                for (Jogo jogo : listaJogos) {
                    if (jogo.getTitulo().toLowerCase().equals(titulo)) {
                        System.out.println(jogo.getTitulo() + "/" +jogo.getAnoLancamento() + "/" + jogo.getGameGenre() + "/" + jogo.getDesenvolvedor() + "/" + jogo.getPublisher() + "/" + jogo.getClassificacaoJogo());
                        System.out.println("<------------------------->");
                        encontrado=true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Esse jogo não existe.");
                }
            }else if (opcao ==4) {
                JogoClassificacao ClassificacaoJogo = null;
                while (ClassificacaoJogo==null) {
                    System.out.println("Classíficação Etária: \n(DEZOITO) \n(DEZESSEIS) \n(CATORZE) \n(DOZE)");
                    String opcaoClassificacaoJogo = leitor.nextLine().toUpperCase();

                    switch (opcaoClassificacaoJogo) {
                        case "DEZOITO":
                            ClassificacaoJogo = JogoClassificacao.DEZOITO;
                            break;
                        case "DEZESSEIS":
                            ClassificacaoJogo = JogoClassificacao.DEZESSEIS;
                            break;
                        case "CATORZE":
                            ClassificacaoJogo = JogoClassificacao.CATORZE;
                            break;
                        case "DOZE":
                            ClassificacaoJogo = JogoClassificacao.DOZE;
                            break;
                        default:
                            System.out.println("Opção Inválida");
                            break;
                    }
                }
                boolean encontrado = false;
                for (Jogo jogo : listaJogos) {
                    if(jogo.getClassificacaoJogo() == ClassificacaoJogo) {
                        System.out.println(jogo.getTitulo() + "/" +jogo.getAnoLancamento() + "/" + jogo.getGameGenre() + "/" + jogo.getDesenvolvedor() + "/" + jogo.getPublisher() + "/" + jogo.getClassificacaoJogo());
                        System.out.println("<------------------------->");
                        encontrado=true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Jogos para está faixa etária não existem.");
                }
            } else if (opcao == 5) {
                System.out.println("Qual Jogo gostaria de modificar? Insira o Titulo.");
                String titulo = leitor.nextLine().toLowerCase();
                boolean encontrado = false;
                for (Jogo jogo : listaJogos) {
                    if (jogo.getTitulo().toLowerCase().equals(titulo)) {
                        System.out.println(jogo.getTitulo() + "/" +jogo.getAnoLancamento() + "/" + jogo.getGameGenre() + "/" + jogo.getDesenvolvedor() + "/" + jogo.getPublisher() + "/" + jogo.getClassificacaoJogo());
                        System.out.println("<------------------------->");
                        listaJogos.remove(jogo);
                        System.out.println("Qual o Título?");
                        String tituloNovo = leitor.nextLine();
                        System.out.println("Ano de Lançamento = ");
                        String anoLancamentoNovo = leitor.nextLine();

                        JogoGenre GameGenreNovo = null;
                        while (GameGenreNovo == null) {
                            System.out.println("Gêneros: \n(RPG), \n(ACTION), \n(STRATEGY), \n(ADVENTURE), \n(SIMULATION), \n(SPORTS), \n(RACING), \n(JRPG), \n(MMORPG), \n(FPS)FIRST_PERSON_SHOOTER, \n(TPS)THIRD_PERSON_SHOOTER, \n(SURVIVAL), \n(FIGHTING), \n(STEALTH)");
                            String opcaoGameGenre = leitor.nextLine().toUpperCase();

                            switch (opcaoGameGenre) {
                                case "RPG":
                                    GameGenreNovo = JogoGenre.RPG;
                                    break;
                                case "ACTION":
                                    GameGenreNovo = JogoGenre.ACTION;
                                    break;
                                case "STRATEGY":
                                    GameGenreNovo = JogoGenre.STRATEGY;
                                    break;
                                case "ADVENTURE":
                                    GameGenreNovo = JogoGenre.ADVENTURE;
                                    break;
                                case "SIMULATION":
                                    GameGenreNovo = JogoGenre.SIMULATION;
                                    break;
                                case "SPORTS":
                                    GameGenreNovo = JogoGenre.SPORTS;
                                    break;
                                case "RACING":
                                    GameGenreNovo = JogoGenre.RACING;
                                    break;
                                case "JRPG":
                                    GameGenreNovo = JogoGenre.JRPG;
                                    break;
                                case "MMORPG":
                                    GameGenreNovo = JogoGenre.MMORPG;
                                    break;
                                case "FPS":
                                    GameGenreNovo = JogoGenre.FIRST_PERSON_SHOOTER;
                                    break;
                                case "TPS":
                                    GameGenreNovo = JogoGenre.THIRD_PERSON_SHOOTER;
                                    break;
                                case "SURVIVAL":
                                    GameGenreNovo = JogoGenre.SURVIVAL;
                                    break;
                                case "FIGHTING":
                                    GameGenreNovo = JogoGenre.FIGHTING;
                                    break;
                                case "STEALTH":
                                    GameGenreNovo = JogoGenre.STEALTH;
                                    break;

                                default:
                                    System.out.println("Opção Inválida.");
                                    break;
                            }
                        }
                        System.out.println("Desenvolvedor = ");
                        String desenvolvedorNovo = leitor.nextLine();

                        System.out.println("Publicadora = ");
                        String publisherNovo = leitor.nextLine();

                        JogoClassificacao ClassificacaoJogoNovo = null;
                        while (ClassificacaoJogoNovo == null) {
                            System.out.println("Classíficação Etária: \n(DEZOITO) \n(DEZESSEIS) \n(CATORZE) \n(DOZE)");
                            String opcaoClassificacaoJogo = leitor.nextLine().toUpperCase();

                            switch (opcaoClassificacaoJogo) {
                                case "DEZOITO":
                                    ClassificacaoJogoNovo = JogoClassificacao.DEZOITO;
                                    break;
                                case "DEZESSEIS":
                                    ClassificacaoJogoNovo = JogoClassificacao.DEZESSEIS;
                                    break;
                                case "CATORZE":
                                    ClassificacaoJogoNovo = JogoClassificacao.CATORZE;
                                    break;
                                case "DOZE":
                                    ClassificacaoJogoNovo = JogoClassificacao.DOZE;
                                    break;
                                default:
                                    System.out.println("Opção Inválida");
                                    break;
                            }
                        }
                        Jogo jogoAlterado = new Jogo(tituloNovo, anoLancamentoNovo, GameGenreNovo, desenvolvedorNovo, publisherNovo, ClassificacaoJogoNovo);
                        listaJogos.add(jogoAlterado);
                        encontrado=true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Jogo não existe.");
                }
            }else if (opcao==6) {
                System.out.println("Qual Jogo gostaria de excluir?");
                String titulo = leitor.nextLine().toLowerCase();
                boolean encontrado = false;
                for (Jogo jogo : listaJogos) {
                    if (jogo.getTitulo().toLowerCase().equals(titulo)) {
                        listaJogos.remove(jogo);
                        System.out.println("Jogo excluido.");
                        encontrado=true;
                        break;
                    }
                }if (!encontrado) {
                    System.out.println("Jogo não existe.");
            }

            } else {
                System.out.println("Número Inválido.");

        }
        }


        }

}
