import javax.swing.JOptionPane;

public class Schaltjahr {

	public static void main(String[] args) {

		int jahr = 0;
		String x = JOptionPane.showInputDialog("Gib ein Jahr ein!");
		jahr = Integer.parseInt(x);
		Schaltjahr(jahr);

	}

	public static void Schaltjahr(int jahr) {
		if (jahr % 4 == 0) {
			if (jahr % 100 != 0 || jahr % 400 == 0) {
				System.out.println(jahr + " ist ein Schaltjahr");
			} 
		} else {
			System.out.println(jahr + " ist kein Schaltjahr");

		}
	}

}
