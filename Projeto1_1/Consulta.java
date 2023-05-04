package Projeto1_1;

import java.util.*;

public class Consulta {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		ArrayList<Paciente> usuario = new ArrayList<Paciente>();

		boolean run = true;

		while (run) {

			System.out.println(" _________________________________________________ ");
			System.out.println("|                                                 |");
			System.out.println("|************* Cadastro de Pacientes *************|");
			System.out.println("|                                                 |");
			System.out.println("|             1- Marcar uma Consulta              |");
			System.out.println("|             2- Consultas Marcadas               |");
			System.out.println("|             3- Buscar sua Consulta              |");
			System.out.println("|             4- Atualizar dados da Consulta      |");
			System.out.println("|             5- Desmarcar Consulta               |");
			System.out.println("|             6- Sair                             |");
			System.out.println("|                                                 |");
			System.out.println("|*************************************************|");
			System.out.println("|                                                 |");
			System.out.println("|_________________________________________________|");
			System.out.println("                                                   ");
			System.out.println("Digite sua Opção:                                  ");

			int especialidade;
			int op = ler.nextInt();
			ler.nextLine();

			switch (op) {
			case 1: {
				System.out.println("\n********** Marcar Consulta **********");
				System.out.println("\nDigite seu Nome: ");
				String nome = ler.nextLine();
				System.out.println("\nDigite sua Idade: ");
				String idade = ler.nextLine();
				System.out.println("\nDigite seu CPF: ");
				String cpf = ler.nextLine();
				System.out.println("\nDigite seu E-mail: ");
				String email = ler.nextLine();
				String esp = "";
				do {
					System.out.println("\nDigite qual especialidade você está buscando na clínica: ");
					System.out.println("\nDigite 1 para = Ginecologista, Profissional Ana Vitória Alves");
					System.out.println("\nDigite 2 para= Ginecologista Obstetra, Profissional  Laura Rossi Macena");
					System.out.println("\nDigite 3 para= Fisioterapeuta, Profissional Jorge Mendes Gonçalves");
					System.out.println("\nDigite 4 para= Psicologo, Profisional Marcela Oliveira Ramos");
					System.out.println("\nDigite 5 para= Nutricionista, Profissional Juliana Vitoria Meireles");
					System.out.println(
							"\nDigite 6 para= Consultora de Amamentação, Profissional Jandira Rodrigues Carvalho");
					especialidade = ler.nextInt();

					switch (especialidade) {
					case 1:
						esp = "Ginecologista, Profissional Ana Vitória Alves";
						break;

					case 2:
						esp = "Ginecologista Obstetra, Profissional  Laura Rossi Macena";
						break;

					case 3:
						esp = "Fisioterapeuta, Profissional Jorge Mendes Gonçalves";
						break;

					case 4:
						esp = "Psicologo, Profisional Marcela Oliveira Ramos";
						break;

					case 5:
						esp = "Nutricionista, Profissional Juliana Vitoria Meireles";
						break;

					case 6:
						esp = "Consultora de Amamentação, Profissional Jandira Rodrigues Carvalho";
						break;

					default:
						System.out.println("Opção inválida!!!");
						break;
					}
				} while (especialidade < 1 || especialidade > 6);

				Paciente u = new Paciente();
				u.setNome(nome);
				u.setIdade(idade);
				u.setCpf(cpf);
				u.setEmail(email);
				u.setEspecialidade(esp);

				usuario.add(u);
				System.out.println("\nConsulta Cadastrada!!!");

				break;

			}
			case 2: {
				System.out.println("\n*** Listar Consultas Marcadas  ***");
				for (int i = 0; i < usuario.size(); i++) {

					System.out.println("\nPaciente " + (i));
					System.out.println("\tNome: " + usuario.get(i).getNome());
					System.out.println("\tIdade: " + usuario.get(i).getIdade());
					System.out.println("\tCPF: " + usuario.get(i).getCpf());
					System.out.println("\tEmail: " + usuario.get(i).getEmail());
					System.out.println("\tEspecialidade: " + usuario.get(i).getEspecialidade());
				}

				break;
			}
			case 3: {
				System.out.println("\n****** Buscar sua consulta ******");
				System.out.println("\nDigite seu CPF: ");
				String cpf = ler.nextLine();

				boolean encontrado = false;
				for (int i = 0; i < usuario.size(); i++) {

					Paciente uTemp = usuario.get(i);
					if (cpf.equals(uTemp.getCpf())) {
						System.out.println("Consulta encontrada...");
						System.out.println("\n\tNome: " + uTemp.getNome());
						System.out.println("\tIdade: " + uTemp.getIdade());
						System.out.println("\tCPF: " + uTemp.getCpf());
						System.out.println("\tEmail: " + uTemp.getEmail());
						System.out.println("\tEspecialidade: " + uTemp.getEspecialidade());
						encontrado = true;
						break;
					}

					// Aqui está rodando essa opção mesmo encontrando
					if (encontrado == false) {
						System.out.println("\nUsuario com esse CPF, não foi encontrado!!!");
					}
				}
				break;
			}
			case 4: {
				System.out.println("\n****** Atualizar dados da Consulta ******");
				for (int i = 0; i < usuario.size(); i++) {
					Paciente uTemp = usuario.get(i);
					System.out.println(+(i) + uTemp.getNome());
				}

				System.out.println("\nDigite a posição da sua consulta...");
				int posicao = ler.nextInt();
				ler.nextLine();

				System.out.println("\nDigite novo Nome: ");
				String newNome = ler.nextLine();
				System.out.println("\nDigite nova Idade: ");
				String newIdade = ler.nextLine();
				System.out.println("\nDigite novo CPF: ");
				String newCpf = ler.nextLine();
				System.out.println("\nDigite novo E-mail: ");
				String newEmail = ler.nextLine();
				System.out.println("\nDigite uma nova especialidade que deseja atendimento: ");
				String newEspecialidade = ler.nextLine();

				Paciente u = usuario.get(posicao);
				u.setNome(newNome);
				u.setIdade(newIdade);
				u.setCpf(newCpf);
				u.setEmail(newEmail);
				u.setEspecialidade(newEspecialidade);

				break;
			}
			case 5: {

				System.out.println("\n****** Desmarcar Consulta ******");
				for (int i = 0; i < usuario.size(); i++) {
					Paciente uTemp = usuario.get(i);
					System.out.println(+(i) + uTemp.getNome());
				}

				System.out.println("\nDigite a posição da sua consulta...");
				int posicao = ler.nextInt();
				ler.nextLine();

				usuario.remove(posicao);

				break;
			}
			case 6: {
				run = false;
				{
					System.out.println("\n******* Obrigado, volte sempre!!! *******");
				}
				break;
			}

			}

		}

	}

}