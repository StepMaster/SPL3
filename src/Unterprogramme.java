
public class Unterprogramme {

	public static void main(String[] args) {

		String text = "Heute ist ein sch�ner Tag";

		char[] z = text.toCharArray();
		zeichenZaehlen(z, 'e');
		zeichenZaehlen(z, 'i');
		zeichenZaehlen(z, 'h');
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
