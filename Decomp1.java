package premier;

import java.util.*;

public class Decomp1 {
	int montant;
	static boolean affich = false;

	public Decomp1(int montant) {
		this.montant = montant;
	}

	public void affichFact(int deviseur) {
		int q = montant / deviseur;

		if (q >= 1) {
			if (affich == true)
				System.out.print("+");
			if (q == 1) {
				System.out.print(deviseur);
				affich = true;
			} else {
				System.out.print(q + "*" + deviseur);
				affich = true;
			}
		}
		montant = montant - q * deviseur;

	}

	public static void main(String[] a) {

		System.out.println("entrer montant");
		Scanner sc = new Scanner(System.in);
		Decomp1 d1 = new Decomp1(sc.nextInt());
		d1.affichFact(50);

		d1.affichFact(20);

		d1.affichFact(10);

		d1.affichFact(5);

		d1.affichFact(2);

	}
}
