package EstruturaDeDados;

import java.util.*;

public class ExercicioSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> lista = new HashSet<Integer>();

		Scanner leia = new Scanner(System.in);

		lista.add(2);
		lista.add(5);
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(9);
		lista.add(7);
		lista.add(8);
		lista.add(10);
		lista.add(6);

		System.out.println("\nEntre com um múmero inteiro: ");
		int num = leia.nextInt();

		if (lista.contains(num)) {
			System.out.println("\nO número " + num + " foi encontrado!!");
		} else {
			System.out.println("\nO número " + num + " não foi encontrado.");
		}
	}

}
