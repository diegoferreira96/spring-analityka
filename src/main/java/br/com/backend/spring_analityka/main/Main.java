package br.com.backend.spring_analityka.main;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    private final Scanner leitura = new Scanner(System.in);

    public void menu() {
        String menuPrincipal = """
                \n=== Menu Principal ===
                1 - Dashboard Principal
                2 - Módulo de Ações (B3)
                3 - Módulo de Fundos (FIIs e Fundos de Investimento)
                4 - Renda Fixa & simulador
                5 - Comparador de Ativos
                6 - Assistente de Investimentos com IA
                
                0 - sair
                """;

        var opcao = -1;
        while (opcao != 0) {
            System.out.println(menuPrincipal);
            System.out.print("Escolha uma opção: ");

            if (leitura.hasNextInt()) {
                opcao = leitura.nextInt();
                leitura.nextLine();

                switch (opcao) {
                    case 1 -> menuDashboard();
                    case 2 -> menuModuloAcoes();
                    case 3 -> menuModuloFundos();
                    case 4 -> menuRendaFixaSimulador();
                    case 5 -> menuComparadorAtivos();
                    case 6 -> menuAssistenteInvestimentosIA();
                    case 0 -> System.out.println("Encerrando o sistema. Até logo!");
                    default -> System.out.println("Opção inválida no Menu Principal.");
                }
            } else {
                System.out.println("Por favor, digite apenas números!");
                leitura.nextLine();
            }
        }
    }

    // --- MÉTODOS DOS SUBMENUS ---
    private void menuDashboard() {
        int opcaoSub = -1;
        String menu = """
                \n--- Dashboard Principal ---
                1 - Cotações em Tempo Real
                2 - Termômetro de Mercado
                3 - Watchlist Preview
                
                0 - Voltar ao Menu Principal
                """;

        while (opcaoSub != 0) {
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            opcaoSub = lerOpcao();

            switch (opcaoSub) {
                case 1 -> System.out.println("[Executando] Cotações em Tempo Real...");
                case 2 -> System.out.println("[Executando] Termômetro de Mercado...");
                case 3 -> System.out.println("[Executando] Watchlist Preview...");
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private void menuModuloAcoes() {
        int opcaoSub = -1;
        String menu = """
                \n--- Módulo de Ações (B3)---
                1 - Busca por Ticker
                2 - Indicadores Fundamentalistas
                3 - Score de Qualidade Automático
                4 - Análise Fundamentalista com IA
                
                0 - Voltar ao Menu Principal
                """;

        while (opcaoSub != 0) {
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            opcaoSub = lerOpcao();

            switch (opcaoSub) {
                case 1 -> System.out.println("[Executando] Busca por Ticker...");
                case 2 -> System.out.println("[Executando] Indicadores Fundamentalistas...");
                case 3 -> System.out.println("[Executando] Score de Qualidade...");
                case 4 -> System.out.println("[Executando] Análise IA...");
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private void menuModuloFundos() {
        int opcaoSub = -1;
        String menu = """
                \n--- Módulo de Fundos (FIIs e Fundos de Investimento)---
                1 - Fundos Imobiliários
                2 - Fundos Multimercado
                3 - Fundos Renda Fixa
                
                
                0 - Voltar ao Menu Principal
                """;

        while (opcaoSub != 0) {
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            opcaoSub = lerOpcao();

            switch (opcaoSub) {
                case 1 -> System.out.println("[Executando] Fundos Imobiliários...");
                case 2 -> System.out.println("[Executando] Fundos Multimercado..");
                case 3 -> System.out.println("[Executando] Fundos Renda Fixa..");
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida.");
            }
        }
    }
    private void menuRendaFixaSimulador() {
        int opcaoSub = -1;
        String menu = """
                \n--- Módulo Renda Fixa & simulador---
                1 - Vitrine de Ativos
                2 - Simulador Inteligente
                
                0 - Voltar ao Menu Principal
                """;

        while (opcaoSub != 0) {
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            opcaoSub = lerOpcao();

            switch (opcaoSub) {
                case 1 -> System.out.println("[Executando] Vitrine de Ativos...");
                case 2 -> System.out.println("[Executando] Simulador Inteligente...");
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida.");
            }
        }
    }
    private void menuComparadorAtivos() {
        int opcaoSub = -1;
        String menu = """
                \n--- Módulo Comparador de Ativos ---
                1 - Análise Lado a Lado
                2 - Matriz de Fundamentos
                
                0 - Voltar ao Menu Principal
                """;

        while (opcaoSub != 0) {
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            opcaoSub = lerOpcao();

            switch (opcaoSub) {
                case 1 -> System.out.println("[Executando] Análise Lado a Lado...");
                case 2 -> System.out.println("[Executando] Matriz de Fundamentos...");
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida.");
            }
        }
    }
    private void menuAssistenteInvestimentosIA() {
        int opcaoSub = -1;
        String menu = """
                \n--- Módulo Assistente de Investimentos com IA ---
                1 - Chat Especializado
                2 - Prompts de Atalho
                
                0 - Voltar ao Menu Principal
                """;

        while (opcaoSub != 0) {
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            opcaoSub = lerOpcao();

            switch (opcaoSub) {
                case 1 -> System.out.println("[Executando] Chat Especializado...");
                case 2 -> System.out.println("[Executando] Prompts de Atalho...");
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida.");
            }
        }
    }

//     Método utilitário para ler inteiros com segurança nos submenus
    private int lerOpcao() {
        if (leitura.hasNextInt()) {
            int op = leitura.nextInt();
            leitura.nextLine();
            return op;
        }
        leitura.nextLine();
        return -1;
    }
}
