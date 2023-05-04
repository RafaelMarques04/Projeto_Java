package ProjetoPrincipal;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Plataforma_ConsultaAtualizada {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome, cpf, rg, Planosaude = null, especialidade = null, mes;
		int idade, x = 0, op, esp, data;
		String celular;

		ConsultaInfo[] lista = new ConsultaInfo[31];

		do {
			System.out.println(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println(" _________________________________________________________  ");
			System.out.println(" |*******************************************************|  ");
			System.out.println(" |               __________________________              |  ");
			System.out.println(" |               | Clinica Flor do Ventre |              |  ");
			System.out.println(" |                                                       |  ");
			System.out.println(" |*******************************************************|  ");
			System.out.println(" |                       ________                        |  ");
			System.out.println(" |                       | Menu |                        |  ");
			System.out.println(" |                                                       |  ");
			System.out.println(" |               1 - Marcar Consulta                     |  ");
			System.out.println(" |               2 - Desmarcar Consulta                  |  ");
			System.out.println(" |               3 - Ver Especialidades da Clínica       |  ");
			System.out.println(" |               4 - Rever Dados Da Consulta             |  ");
			System.out.println(" |               0 - Sair                                |  ");
			System.out.println(" |                                                       |  ");
			System.out.println(" |*******************************************************|  ");
			System.out.println(" |                                                       |  ");
			System.out.println(" |                   Digite sua Opção:                   |  ");
			System.out.println(" |_______________________________________________________|  ");

			try {
				op = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite uma Opção Disponivel!!! ");
				leia.nextInt();
				op = 0;

			}

			if (op == 9) {
				System.out.println("\nClinica Flor Do Ventre ");
				leia.close();
				System.exit(0);
			}

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nInsira seu nome: ");
				nome = leia.nextLine();
				System.out.println("\nInsira sua idade: ");
				idade = leia.nextInt();
				rg = leia.nextLine();
				System.out.println("\nInsira sua identidade: ");
				rg = leia.nextLine();
				System.out.println("\nInsira seu CPF: ");
				cpf = leia.nextLine();
				System.out.println("\nVai dar entrada com o Plano de Saúde ou Particular?");
				Planosaude = leia.nextLine();
				System.out.println(
						"\nCaso a sua consulta seja particular, informamos que o valor da mesma deverá ser verificado presencialmente na clínica. ");
				System.out.println("\nInsira um telefone para contato: ");
				celular = leia.nextLine();

				System.out.println("\n*****************************************************\n");

				do {
					System.out.println("\n");
					System.out.println("\nDigite qual especialidade está buscando na clínica: ");
					System.out.println("\nDigite 1 para = Ginecologista, Profissional Ana Vitória Alves ");
					System.out.println("\nDigite 2 para = Ginecologista Obstetra, Profissional  Laura Rossi Macena ");
					System.out.println("\nDigite 3 para = Fisioterapeuta, Profissional Jorge Mendes Gonçalves ");
					System.out.println("\nDigite 4 para = Psicologo, Profisional Marcela Oliveira Ramos ");
					System.out.println("\nDigite 5 para = Nutricionista, Profissional Juliana Vitoria Meireles ");
					System.out.println(
							"\nDigite 6 para = Consultora de Amamentação, Profissional Jandira Rodrigues Carvalho ");
					esp = leia.nextInt();

					switch (esp) {
					case 1:
						especialidade = "Ginecologista, Profissional Ana Vitória Alves ";
						break;

					case 2:
						especialidade = "Ginecologista Obstetra, Profissional Laura Rossi Macena ";
						break;

					case 3:
						especialidade = "Fisioterapeuta, Profissional Jorge Mendes Gonçalves ";
						break;

					case 4:
						especialidade = "Psicólogo, Profissional Marcela Oliveira Ramos ";
						break;

					case 5:
						especialidade = "Nutricionista, Profissional Juliana Vitoria Meireles ";
						break;

					case 6:
						especialidade = "Consultoria de Amamentação, Profissional Jandira Rodrigues Carvalho ";
						break;

					default:
						System.out.println("Opção inválida!!! ");
						break;
					}
				} while (esp < 1 || esp > 6);

				mes = leia.nextLine();
				System.out.println("\nEscreva o nome do mês que busca atendimento: ");
				mes = leia.nextLine();
				System.out.println("\nColoque o dia que busca atendimento: ");
				data = leia.nextInt();

				lista[x] = new ConsultaInfo(nome, idade, rg, cpf, Planosaude, celular, data, mes, especialidade);
				
				System.out.println(" _____________________________________________________  ");
				System.out.println("|*****************************************************| ");
				System.out.println("|                                                     | ");
				System.out.println("|       Sua Consulta foi Agendada com Sucesso!!!      | ");
				System.out.println("|                                                     | ");
				System.out.println("|*****************************************************| ");
				System.out.println("|                                                     | ");
				System.out.println("|          Atendimento por Ordem de Chegada.          | ");
				System.out.println("|                                                     | ");
				System.out.println("|*****************************************************| ");
				System.out.println("|_____________________________________________________| ");

				lista[x].imprimir();

				System.out.println("\n\tSeu código de consulta é: " + x);
				if (x == 30) {
					System.out.println("\n\tAgenda lotada!");
					break;
				}

				x = x + 1;
				keyPress();
				break;

			case 2:
				leia.nextLine();
				System.out.println("\n\tPara desmarcar sua consulta, por favor, informe seu código de consulta: ");
				x = leia.nextInt();
				if (lista[x] != null) {

					lista[x] = null;
					System.out.println("\n\tConsulta desmarcada com sucesso!");
				} else {
					lista[x] = null;
					System.out.println("\n\tConsulta não encontrada, tente com um código válido!");
				}

				keyPress();
				break;

			case 3:
				System.out.println(" _________________________________________________________  ");
				System.out.println(" |*******************************************************|  ");
				System.out.println(" |                                                       |  ");
				System.out.println(" |                NOSSAS ESPECIALIDADES:                 |  ");
				System.out.println(" |                                                       |  ");
				System.out.println(" |*******************************************************|  ");
				System.out.println(" |                                                       |  ");
				System.out.println(" |               1 - Ginecologia                         |  ");
				System.out.println(" |               2 - Ginecologia Obstetra                |  ");
				System.out.println(" |               3 - Fisioterapia                        |  ");
				System.out.println(" |               4 - Psicologia                          |  ");
				System.out.println(" |               5 - Nutricionista                       |  ");
				System.out.println(" |               6 - Consultoria de Amementação          |  ");
				System.out.println(" |                                                       |  ");
				System.out.println(" |*******************************************************|  ");
				System.out.println(" |_______________________________________________________|  ");
				keyPress();
				break;

			case 4:
				leia.nextLine();
				System.out.println("\n\tInsira o código da consulta: ");
				x = leia.nextInt();
				if (lista[x] != null) {
					lista[x].imprimir();

				} else {
					System.out.println("\n\tEste código de consulta é inválido! ");
				}
				keyPress();
				break;

			case 0:
				System.out.println("\n\tObrigado por procurar a Clínica Flor do Ventre, Volte sempre! :D");
				break;

			default:
				System.out.println("\n\tOpção Inválida! Tente Novamente... \n");
				keyPress();
				break;
			}

		} while (op != 0);
	}

	public static void keyPress() {

		try {

			System.out.println("\n\tPressione Enter para Continuar... ");
			System.in.read();

		} catch (IOException e) {

			System.out.println("\n\tVocê pressionou uma tecla diferente de Enter! Clique Novamente... ");
		}
	}

}