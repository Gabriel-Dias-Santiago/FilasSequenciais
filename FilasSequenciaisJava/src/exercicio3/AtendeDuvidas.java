package exercicio3;

import java.util.Scanner;

import filas.FilaInt;


public class AtendeDuvidas {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		FilaInt fila = new FilaInt();
		fila.init();
		int opcao;
		do {
			System.out.println(" 1 - Inserir aluno na fila");
			System.out.println(" 2 - Atender um aluno");
			System.out.println(" 3 - Encerrar atendimento");
			opcao = le.nextInt();
			switch (opcao) {
			case 1:
				System.out.print(" RM: ");
				int rm = le.nextInt();
				fila.enqueue(rm);
				break;
			case 2:
				if (fila.isEmpty())
					System.out.println("Nao ha alunos na fila");
				else
					System.out.println("Aluno que sera atendido agora: " + fila.dequeue());
				break;
			case 3:
				if (fila.isEmpty())
					System.out.println("Atendimento encerrado");
				else {
					System.out.println("Ainda ha aluno(s) na fila");
					opcao = 0;
				}
				break;
			default:
				System.out.println("Opcao Invalida");
			}
		} while (opcao != 3);

		le.close();

	}

}
