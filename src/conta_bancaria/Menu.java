package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {
	
	public static Scanner leia = new Scanner(System.in);
	private static final ContaController contaController = new ContaController();

	public static void main(String[] args) {

			int opcao;
			
			// Criar dados de teste
			criarContasteste();
			
			
			while (true) {
				
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND
						+ "*****************************************************");
				System.out.println("                                                     ");
				System.out.println("      ♻           BANCO NACIONAL             ♻     ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("            1 - Criar Conta                          ");
				System.out.println("            2 - Listar todas as Contas               ");
				System.out.println("            3 - Buscar Conta por Numero              ");
				System.out.println("            4 - Atualizar Dados da Conta             ");
				System.out.println("            5 - Apagar Conta                         ");
				System.out.println("            6 - Sacar                                ");
				System.out.println("            7 - Depositar                            ");
				System.out.println("            8 - Transferir valores entre Contas      ");
				System.out.println("            0 - Sair                                 ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção desejada:                          ");
				System.out.println("                                                     " + Cores.TEXT_RESET);

				opcao = leia.nextInt();

				if (opcao == 0) {
					System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + 
							"\nBanco Nacional - o banco do guarda-chuva.");
					sobre();
					leia.close();
					System.exit(0);
				}

				switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta\n\n");

					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
					
					listarContas();
					
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");

					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");

					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");

					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");

					break;
				case 7:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");

					break;
				case 8:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");

					break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
					break;
				}
			}
		}

		public static void sobre() {
			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + 
					"\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: João Pedro Duo ");
			System.out.println("LinkedIn - linkedin.com/in/joaopedroduo ");
			System.out.println("github.com/Joao-Pedro-Duo");
			System.out.println("*********************************************************");

	}
		
	public static void criarContasteste() {
		contaController.cadastrar(new ContaCorrente(contaController.gerarNumero(), 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
		
		contaController.cadastrar(new ContaPoupanca(contaController.gerarNumero(), 456, 2, "Marcia Condarco", 1000000.00f, 10));
	}
		
	public static void listarContas() {
		contaController.listarTodas();
	}

}
