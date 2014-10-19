package premier;

import java.util.*;

public class Decomp {
	static String decomp;

	public static void decomposeur(int nb) {
		int[] dev = { 50, 20, 10, 5, 2 };
		int j = 0;
		boolean affich = false;
		decomp = nb + " euros = ";
		while (j != 5) {
			int q = nb / dev[j];

			if (q >= 1) {
				if (affich == true)
					decomp = decomp + " + ";
				if (q != 1) {
					decomp = decomp + q + " * " + dev[j];
					affich = true;
					nb = nb - q * dev[j];
				} else {
					decomp = decomp + dev[j];
					affich = true;
					nb = nb - q * dev[j];
				}
				j++;

			} else {
				j++;
			}
		}
		if (nb % 2 != 0) {
			decomp = decomp + " + " + nb % 2;
		}

	}

	public static void main(String[] a) {
		// premiere partie remplissage de tableau à 30 élèments
		int[] P = new int[31];
		P[0] = 2;
		int lg = 1;
		int i = 3;

		for (int j = 0; j < lg; j++)
			if ((i % P[j]) == 0) {
				j = 0;
				i++;
			} else {
				if (P[j] == P[lg - 1]) {
					P[lg] = i;

					lg++;
					if (lg == 29)
						break;
				}
			}
		for (int j = 0; j < lg; j++) {
			System.out.print(" " + P[j] + " ");

		}
		System.out.println();
		// deuxieme partie demande d'un nombre sup a 2 avec vérification
		while(true){
		int k = 0;

		while (k < 2) {
			Scanner sc = new Scanner(System.in);
			System.out.println("donner un nombre sup a 2");
			k = sc.nextInt();
			if (k < 2) {
				System.out.println("le nombre doit etre sup a 2");

			}
		}
		System.out.println();
		// troisième partie decomposition de la somme d'argent

		Decomp.decomposeur(k);
		System.out.println(decomp);
		
		}

	}
}