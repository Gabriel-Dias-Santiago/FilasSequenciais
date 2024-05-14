package exercicio4;

import java.util.Scanner;

import filas.FilaInt;


public class Processador {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		FilaInt fila = new FilaInt();
		fila.init();
		int opcao;
		do {
			System.out.println(" 1 - Submeter processo");
			System.out.println(" 2 - Executar processo (ocupar tempo do processador)");
			System.out.println(" 3 - Shutdown");
			opcao = le.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("PID: ");
				int pid = le.nextInt();
				fila.enqueue(pid);
				break;
			case 2:
				if (!fila.isEmpty()) {
					pid = fila.dequeue();
					System.out.println("Processo que esta ocupando processador agora: "+ pid);
					System.out.print("Processo "+pid+" concluiu? (1-sim): ");
					int resp = le.nextInt();
					if (resp==1)
						System.out.println("Processo concluido");
					else {
						System.out.println("Processo "+pid+ " voltou final da fila");
						fila.enqueue(pid);
					}
				}
				else
					System.out.println("Nao ha processos na fila");
				break;
			case 3:
				if (!fila.isEmpty()) {
					System.out.println("Ainda ha processos na fila");
					System.out.print("Deseja encerrar todos os processos? (1-sim): ");
					int resp = le.nextInt();
					if (resp == 1) {
						while (!fila.isEmpty()) {
							System.out.println("Processo "+ fila.dequeue() + "foi encerrado");
						}
					}
					else
						opcao = 0;
				}
				break;
			default:
				System.out.println("Opcao Invalida");
			}
		} while (opcao != 3);
		System.out.println("Shutdown...");

		le.close();

	}

}
