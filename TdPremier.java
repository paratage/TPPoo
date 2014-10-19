package premier;

import java.util.*;

public class TdPremier {
	int x, y;

	public TdPremier() {

	}

	public TdPremier(int x) {
		this.x = x;
	}

	public TdPremier(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void affichSixM() {

		int n = 1;
		while (n <= 6) {
			System.out.print(" " + n * this.getX());
			n++;
		}
	}

	public void affichMltpInf() {
		int n = 1;
		do {
			System.out.print(" " + this.getX() * (n + 1));
			n++;
		} while (n < this.getY());
	}

	public void affichMltpCtnu() {
		if (this.getX() < this.getY())
			System.out.println("aucun multiple");
		else {
			int n = (x - x % y) / y;
			while (n != 0) {
				System.out.print(" " + x * n);
				n--;
			}
		}
	}

	public int resoudEnigme() {
		int u = 0, d = 0;
		int n;
		boolean fin = false;
		for (d = 1; d <= 9; d++) {
			for (u = 0; u <= 9; u++) {
				n = d * 10 + u;
				if (n == (d + u) * (d + u)) {
					fin = true;
					break;
				}
			}
			if (fin == true) {
				break;
			}
		}

		return d * 10 + u;
	}

	public static void main(String[] a) {
		TdPremier ex1 = new TdPremier(4);
		TdPremier ex2 = new TdPremier(5, 6);
		TdPremier ex3 = new TdPremier(20, 4);
		TdPremier engm = new TdPremier();
		// /////////////////////////////////
		System.out.println("exo 1");
		ex1.affichSixM();
		System.out.println();
		// ///////////////////////////////////
		System.out.println("exo 2");

		ex2.affichMltpInf();
		System.out.println();
		// ////////////////////////////////
		System.out.println("exo 3");
		ex3.affichMltpCtnu();
		System.out.println();
		// ///////////////////////////////////////
		System.out.println("exo 4 solution de l'enigme");
		System.out.println(engm.resoudEnigme());

	}
}
