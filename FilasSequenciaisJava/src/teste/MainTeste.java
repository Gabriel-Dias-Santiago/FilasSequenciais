package teste;

import filas.FilaInt;

public class MainTeste {

	public static void main(String[] args) {
		FilaInt fila = new FilaInt();
		fila.init();
		fila.enqueue(23);
		fila.enqueue(44);
		fila.enqueue(12);
		
		while (!fila.isEmpty()) {
			System.out.println("Valor retirado: "+ fila.dequeue());
		}
	}

}
