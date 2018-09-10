import java.math.BigInteger;

public class Problem25 {

	public static void main(String[] args) {
		BigInteger F1 = new BigInteger ("1");
		BigInteger F2 = new BigInteger ("1");
		BigInteger F = new BigInteger ("1");
		
		int licznik = 2;
		
		while(F2.toString().length()!=1000) {
			F = F1.add(F2);
			F1 = F2;
			F2 = F;
			licznik++;
		}
		
		System.out.println(F1.toString().length());
		System.out.println(licznik + " " + F2.toString().length());
	}

}
