package EstruturaDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lista = new ArrayList<Integer>();
		int num;

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
		

		System.out.println("\nDigite um número inteiro: ");
		num = leia.nextInt();

		if (lista.contains(num)) {
            int posicao = lista.indexOf(num);
            System.out.println("\nO número " + num + " está localizado na posição " + posicao);
        } else {
            System.out.println("\nO número " + num + " não foi encontrado.");
        }
		

		
		
	}

}
