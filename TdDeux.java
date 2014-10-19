package premier;

import java.util.*;

public class TdDeux {
	public static void main(String[] a) {
		int en = -1;

		while (en < 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("donner un nombre positif");
			en = sc.nextInt();
			if (en < 0) {
				System.out.println("le nombre doit etre positif");

			}
		}
		boolean premier = false;
		if (en > 2) {
			for (int j = 2; j < en; j++) {
				if ((en % j) == 0) {
					premier = false;
					break;

				} else {
					premier = true;
				}
			}
		} else {
			System.out.println("nombre non premier");
		}

		if (premier == true) {
			System.out.println("nombre premier");
		} else {
			System.out.println("nombre non premier");
		}

	}

}
