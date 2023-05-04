package Projeto1;

import java.util.*;

public class Projeto1Teste {
	public Projeto1Teste(String nome, int idade, String rg, String cpf, boolean planosaude, boolean particular,
			float celular) {
		
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome, cpf, rg;
		int idade, x = 0, op;
		float celular;
		boolean Particular, Planosaude, Confirmação;

		Projeto1Teste[] lista = new Projeto1Teste[31];

		do {
			System.out.println("Clinica José Marcondes");
			System.out.println("Menu");
			System.out.println("1- Marcar consulta");
			System.out.println("2- Desmarcar consulta ");
			System.out.println("3- Ver especialidades da Clínica");
			System.out.println("0- Sair");
			System.out.println("\n");
			System.out.println("Digite sua opção: ");
			op = leia.nextInt();
			System.out.println("\n");

			switch (op) {
			case 1:
				System.out.println("Insira seu nome: ");
				nome = leia.nextLine();
				System.out.println("Insira sua idade: ");
				idade = leia.nextInt();
				System.out.println("Insira sua identidade: ");
				rg = leia.nextLine();
				System.out.println("Insira seu CPF: ");
				cpf = leia.nextLine();
				System.out.println("Vai dar entrada com o plano de saúde? \n(true para sim e false para não) ");
				Planosaude = leia.hasNext();
				System.out.println("Vai dar entrada com atendimento particular? \n(true para sim e false para não) ");
				Particular = leia.hasNext();
				System.out.println("Insira um telefone para contato: ");
				celular = leia.nextInt();
				System.out.println("\n");

				lista[x] = new Projeto1Teste(nome, idade, rg, cpf, Planosaude, Particular, celular);
				break;
			}
		} while (op != 0);
	}
} 