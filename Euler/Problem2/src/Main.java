
public class Main {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		int c=0;
		int sum=0;
		
		while( a<= 4000000 && b<= 4000000 && c<= 4000000) {
			sum+=c;
			a = b+c;
			b = a+c;
			c = a+b;
			System.out.println(a+", "+b+", "+c);
		}
		System.out.println("Suma: "+sum);
	}

}
