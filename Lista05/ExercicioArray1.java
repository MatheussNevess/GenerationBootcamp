package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listaCores  = new ArrayList<String>();
		String cor = "";
		int x;
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<5;x++) {
		System.out.println("\nDigite a "+(x + 1)+" cor: ");
		cor = leia.nextLine();
		listaCores.add(cor);
		}
		System.out.println(listaCores);
		
		Collections.sort(listaCores);
		System.out.println("\nLista depois de ordenada...");
		System.out.println(listaCores);
		
	}
}
