package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.util.Cores;

public class Menu {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

			int opcao;
			
			/* Instanciar Obejtos da Classe Conta */
			
			/*Conta c1 = new Conta(1, 123, 1, "Isabella", 200000.00f);
			c1.visualizar();

			Conta c2 = new Conta(2, 123, 2, "Thiago", 100000.00f);
			c2.visualizar();
			
			/* Alteração do Saldo*/                     
			/*c1.setSaldo(300000.00f);
			c1.visualizar();
			
			/**
			 * Saque na conta C2
			 * if ternário
			 * 
			 * condição ? ação se for verdadeiro : ação se for falso
			 */
			/*System.out.println("\nSacar R$ 1.000,00 da conta C2: " + (c2.sacar(1000.00f) ? 
					"Saque efetuado com sucesso!" : "Saldo Insuficiente")); 
			
			System.out.println("\nSacar R$ 300.000,00 da conta C2: " + (c2.sacar(300000.00f) ? 
					"Saque efetuado com sucesso!" : "Saldo Insuficiente"));
			
			c2.visualizar();
			
			/* Depósito na Conta c2*/
			/*c2.depositar(50000.00f);
			c2.visualizar();
			
			/* Instanciar Objetos da Classe ContaCorrente */
			
			ContaCorrente cc1 = new ContaCorrente(3, 789, 1, "Raquel", 200000.00f, 2000.00f);
			cc1.visualizar();
			
			System.out.println("\nSacar R$ 202.000,00 da conta cc1: " + (cc1.sacar(202000.00f) ? 
					"Saque efetuado com sucesso! | Saldo: " + cc1.getSaldo() : "Saldo Insuficiente | Saldo: " + cc1.getSaldo())); 
			
			System.out.println("\nSacar R$ 203.000,00 da conta cc1: " + (cc1.sacar(203000.00f) ? 
					"Saque efetuado com sucesso! Saldo: " + cc1.getSaldo() : "Saldo Insuficiente | Saldo: " + cc1.getSaldo())); 
			
			cc1.depositar(2000.00f);
			cc1.visualizar();
			
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

}
