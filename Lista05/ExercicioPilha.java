package EstruturaDeDados;

import java.util.*;

public class ExercicioPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> pilha = new Stack<String>();

		Scanner leia = new Scanner(System.in);
		int op;

		do {

			System.out.println("\n\t Menu ");
			System.out.println("1 - Adicionar livro na pilha ");
			System.out.println("2 - Listar todos os livros ");
			System.out.println("3 - Retirar livro da pilha ");
			System.out.println("0 - Sair ");
			System.out.println("\nEntre com a opção desejada: ");

			try {
				op = leia.nextInt();
				leia.nextLine();

				switch (op) {
				case 1:
					System.out.println("\nDigite o nome do livro: ");
					String nome = leia.nextLine();
					pilha.push(nome);
					System.out.println("\nLivro adicionado!!");
					break;
				case 2:
					System.out.println("\nLista de livros: ");
					if (pilha.isEmpty()) {
						System.out.println("\nA pilha está vazia!! ");
					} else {
						for (String livro : pilha) {
							System.out.println(livro);
						}
					}
					break;
				case 3:
					if (pilha.isEmpty()) {
						System.out.println("\nA pilha está vazia!! ");
					} else {
						System.out.println("\nLivro retirado: " + pilha.pop());
						System.out.println("\nUm livro foi retirado da pilha!!");
					}
					break;
				default:
					if (op != 0) {
						System.out.println("\nOpção inválida!!");
					} else {
						System.out.println("\nPrograma finalizado!!");
					}
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("\nEntrada inválida! Por favor, insira um número.");
				leia.nextLine();
				op = -1;
			}
		} while (op != 0);
	}
}
