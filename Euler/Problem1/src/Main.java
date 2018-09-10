/**
 * 
 * @author Marcin Or³owski "marcinor"
 *
 */
public class Main {

	public static void main(String[] args) {
		int limit = 999;
		int m1 =3, m2= 5, m3= 15;
		
		System.out.println(sumOfArithmeticProgression(limit, m1)
				+ sumOfArithmeticProgression(limit, m2) - sumOfArithmeticProgression(limit, m3));
	}
	
	public static int sumOfArithmeticProgression(int l, int a) {
		return((a+((l/a)*a))*(l/a))/2;
	}

}
