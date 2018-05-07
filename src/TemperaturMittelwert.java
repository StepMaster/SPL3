
public class TemperaturMittelwert {

	public static void main(String[] args) {

		int[] temp = new int[1000];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (int) (Math.random() * 41);

		}

		int unter10Grad = 0;
		int zwischen10und20 = 0;
		int groesser20 = 0;
		

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] < 10) {
				unter10Grad++;
			}
			if (temp[i] >= 10 && temp[i] < 20) {
				zwischen10und20++;
			}
			if (temp[i] >= 20 ) {
				groesser20++;
			}
		}
		
		
		System.out.println(unter10Grad + " Werte < 10 Grad.");
		System.out.println(zwischen10und20 + " Werte zwischen 10 und 20 Grad.");
		System.out.println(groesser20 + " Werte >= 20 Grad.");
		
		

	}
}
