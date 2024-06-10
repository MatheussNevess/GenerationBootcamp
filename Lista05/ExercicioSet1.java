package EstruturaDeDados;

import java.util.*;

public class ExercicioSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Set<Integer> listaNumeros = new HashSet<Integer>();
	        Scanner leia = new Scanner(System.in);

	        for (int x = 0; x < 10; x++) {
	            System.out.print("Digite um número: ");
	            int num = leia.nextInt();
	            listaNumeros.add(num); 
	        }

	        System.out.println("\nListar dados do Set: ");
	        Iterator<Integer> lista = listaNumeros.iterator();
	        while (lista.hasNext()) {
	            System.out.println(lista.next());
		}
	}

}
