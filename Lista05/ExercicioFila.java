package EstruturaDeDados;

import java.util.*;

public class ExercicioFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> fila = new LinkedList<String>();

		Scanner leia = new Scanner(System.in);
		int op;

		do {

			System.out.println("\n\t Menu ");
			System.out.println("1 - Adicionar clientes na fila ");
			System.out.println("2 - Listar todos os clientes ");
			System.out.println("3 - Retirar clientes da fila ");
			System.out.println("0 - Sair ");
			System.out.println("\nEntre com a opção desejada: ");
		

			try {
				op = leia.nextInt();
				leia.nextLine();

			switch (op) {
			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				String nome = leia.nextLine();
				fila.offer(nome);
				System.out.println("\nCliente adicionado(a)!");
				break;
			case 2:
				System.out.println("\nClientes na fila: ");
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					System.out.println("\nCliente chamado: " + fila.poll());
				}
				break;
			default:
				if (op != 0) {
					System.out.println("\nOpção inválida!");
				} else {
					System.out.println("\nPrograma finalizado!");
				}
				break;
			} 
			}catch (InputMismatchException e) {
                System.out.println("\nEntrada inválida! Por favor, insira um número.");
                leia.nextLine(); 
                op = -1;
			}
		}while (op != 0);
	}
}

