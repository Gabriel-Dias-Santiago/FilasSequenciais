package exercicio3;

import java.util.Scanner;

import filas.FilaInt;

public class AtendeDuvidas {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		FilaInt fila = new FilaInt();
		fila.init();
		int op;
		do {
			System.out.println(" 1- Insere aluno na fila");
			System.out.println(" 2- Atende um aluno");
			System.out.println(" 3- Encerra atendimento");
			op = le.nextInt();
			switch (op) {
			case 1:
				System.out.print("RM do aluno a ser atendido: ");
				int rm = le.nextInt();
				fila.enqueue(rm);
				break;
			case 2:
				if (!fila.isEmpty()) {
					System.out.println("Aluno a ser atendido agora: " + fila.dequeue());
				} else {
					System.out.println("Nao ha alunos aguardando na fila");
				}
				break;
			case 3:
				if (fila.isEmpty())
					System.out.println("Encerrado o atendimento");
				else {
					System.out.println("Ainda ha alunos na fila");
					op = 0;
					}
				
				break;
			default:
				System.out.println("Opcao Invalida");
			}
		} while (op != 3);

		le.close();

	}
}
