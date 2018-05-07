
public class Unterprogramme {

	public static void main(String[] args) {

		String text = "Heute ist ein schöner Tag";

		char[] z = text.toCharArray();
		zeichenZaehlen(z, 'e');
		zeichenZaehlen(z, 'i');
	}

	public static void zeichenZaehlen(char[] z, char x) {
		int counter = 0;
		for (int i = 0; i < z.length; i++) {
			if (z[i] == x) {
				counter++;
			}
		}
		System.out.println("Anzahl " + x + "'s im Text: " + counter);
	}

}
