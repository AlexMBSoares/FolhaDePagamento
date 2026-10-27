package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Colaborador> colaboradores = new ArrayList<>();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            printMenu();
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1" -> cadastrarColaborador();
                case "2" -> cadastrarColaboradorComissionado();
                case "3" -> cadastrarColaboradorProducao();
                case "4" -> gerarFolhaPagamento();
                case "0" -> {
                    System.out.println("Saindo do programa, até logo!");
                    continuar = false;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
    private static void printMenu() {
        System.out.println("\n---------- Folha de Pagamento ----------");
        System.out.println("1. Cadastrar Colaborador Padrão");
        System.out.println("2. Cadastrar Colaborador Comissionado");
        System.out.println("3. Cadastrar Colaborador de Produção");
        System.out.println("4. Gerar Folha de Pagamento");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    private static void cadastrarColaborador() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Matricula: ");
        String matricula = scanner.nextLine();

        colaboradores.add(new ColaboradorPadrao(nome, matricula));
        System.out.println("Colaborador cadastrado com sucesso!");
    }

    private static void cadastrarColaboradorComissionado() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Matricula: ");
        String matricula = scanner.nextLine();
        
        System.out.print("Total vendas: ");
        double vendas = Double.parseDouble(scanner.nextLine());
        System.out.print("Comissão: ");
        double comissao = Double.parseDouble(scanner.nextLine());

        colaboradores.add(new ColaboradorComissionado(nome, matricula, vendas, comissao));
        System.out.println("Colaborador comissionado cadastrado com sucesso!");
    }

    private static void cadastrarColaboradorProducao() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Matricula: ");
        String matricula = scanner.nextLine();
        System.out.print("Peças Produzidas: ");
        int pecas = Integer.parseInt(scanner.nextLine());
        System.out.print("Valor por Peça: ");
        double valorPorPeca = Double.parseDouble(scanner.nextLine());

        colaboradores.add(new ColaboradorProducao(nome, matricula, valorPorPeca, pecas));
        System.out.println("Colaborador de produção cadastrado com sucesso!");
    }

    private static void gerarFolhaPagamento() {
        System.out.println("\n---------- Folha de Pagamento ----------");
        if (colaboradores.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado.");
            return;    
        }

        for (Colaborador colaborador : colaboradores) {
            System.out.printf("Colaborador: %s, Salário: R$ %.2f%n", colaborador.getNome(), colaborador.calcularSalario());
        }
        System.out.println("----------------------------------------");
    }
}