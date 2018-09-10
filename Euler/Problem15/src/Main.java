/**
 * 
 * @author Marcin Or³owski "marcinor"
 *
 */
public class Main {

	public static void main(String[] args) {
		long size = 20;
		
		System.out.println(numberOfRoads(size));
	}

	public static long numberOfRoads(long n) {
		if(n!=1) {
			return (2*numberOfRoads(n-1)*(2*n-1))/n;
		}else
			return 2;
	}
}
