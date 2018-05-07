import javax.swing.JOptionPane;

public class Wörterraten {

	public static void main(String[] args) {
		String Wort = JOptionPane.showInputDialog("Gib ein Wort ein!");
		char[] wort = Wort.toCharArray();
		System.out.println(anzahlZeichen(wort) + " Buchstaben hat das Wort");
		
		boolean h = true;
		while (h == true) {

			String Rate = JOptionPane.showInputDialog("Bitte gib einen Buchstaben ein");
			char[] rate = Rate.toCharArray();
			char x = rate[0];
			Raten(wort, x);
		}
	}

	public static int anzahlZeichen(char[] wort) {
		int counter = 0;
		for (int i = 0; i < wort.length; i++) {
			counter++;
		}
		return counter;
	}

	public static void Raten(char[] wort, char x) {
		
		for (int i = 0; i < wort.length; i++) {
			if (wort[i] == x) {
				System.out.println(x + " kommt vor");
			}

		}

	}
}
