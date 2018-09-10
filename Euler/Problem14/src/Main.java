
public class Main {

	public static void main(String[] args) {
		int maks =0;
		int maksChain =0;
		int chainLenght=0;
		for(int i=1; i<1000000; i++) {
			if(i%100==0) System.out.println("Min¹³em: "+i+" Maks: "+maksChain);
			
			chainLenght=collatzSequencesLenght(i);
			if(chainLenght>maksChain) {
				maksChain = chainLenght;
				maks = i;
			}
		}
		System.out.println(maks);
	}
	
	public static int collatzSequencesLenght(long number) {
		int l=1;
		while(number!=1) {
			number = (number%2==0)?(number/2):(number*3+1);
			l++;
			
			if(number<1) {
				System.out.println("ERROR");
				break;
			}
		}
		return l;
	}

}
