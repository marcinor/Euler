/**
 * 
 * @author Marcin Or³owski "marcinor"
 *
 */
public class Main {

	public static void main(String[] args) {
		int divisors = 0;
		long number = 0;
		int maks = 0;
		for(int i = 1; divisors<=500; i++) {			
			number+=i;
			divisors = countDivisors(number);
			if(divisors>maks) {
				maks = divisors;
				System.out.println(number+" "+divisors);
			}
		}
	}
	
	public static int countDivisors(long n) {
		int l = 0;
		for(int i = 1; i<Math.sqrt(n); i++) {
			if(n%i == 0)
				l+=2;
		}
		if((int)Math.sqrt(n)*(int)Math.sqrt(n)==n) {
			l++;
		}
		return l;
	}
}
