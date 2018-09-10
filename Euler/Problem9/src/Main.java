
public class Main {

	public static void main(String[] args) {
		int i=0,j=0;
		double c=0;
		int sum = 1000;
		
		for(int a=1; a<sum; a++) {
			for(int b=a+1; b<sum; b++) {
				if((sum*a)+(sum*b)-(a*b) == (sum*sum)/2) {
					i = a;
					j = b;
					c = Math.sqrt(a*a+b*b);
					System.out.println("a: "+a+", b: "+b+", c: "+(int)c);
					break;
				}
			}
		}
		System.out.println(i*j*(int)c);
	}

}
