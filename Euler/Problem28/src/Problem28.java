/**
 * 
 * @author Marcin Or³owski "marcinor"
 * 
 * Solution works for every odd number n.
 */
public class Problem28 {

	public static void main(String[] args) {
		long sum = 1;
		int n = 1001;
		int k = n;
		
		while(k>1){
			for(int i=0; i<4; i++) {
				sum += k*k - ((k-1)*i);
			}
			k -= 2;
		}
		
		System.out.println(n + ": " + sum);

	}

}
