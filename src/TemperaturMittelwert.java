
public class TemperaturMittelwert {

	public static void main(String[] args) {

		int x = 0;
		int unter10Grad = 0;
		int zwischen10und20 = 0;
		int groesser20 = 0;
		
		int[] temp = new int[1000];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (int) (Math.random() * 41);
			
			x = Counter(temp[i], temp.length);
			
			if(x == 1) {
				unter10Grad++;
			}
			else if(x == 2) {
				zwischen10und20++;
			}
			else if(x == 3) {
				groesser20++;
			}
			
		}
		
		System.out.println(unter10Grad + " Werte < 10 Grad.");
		System.out.println(zwischen10und20 + " Werte zwischen 10 und 20 Grad.");
		System.out.println(groesser20 + " Werte >= 20 Grad.");
		

	}
	
	public static int Counter(int temp, int len) {
		

		int counter=0;
		
		for (int i = 0; i <len; i++) {
			if (temp < 10) {
				counter=1;
				return counter;
			}
			else if (temp >= 10 && temp < 20) {
				counter=2;
				return counter;
			}
			else if (temp >= 20 ) {
				counter=3;
				return counter;
			}
		}
		return counter;

	}
}
