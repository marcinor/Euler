
import pl.marcinor.MyMathLib.lib.*;
public class Problem23 {

	public static void main(String[] args) {
		int limit = 28124;
		boolean[] numbers = new boolean[limit];
		int sum = 0;
		
		System.out.println("Filling Array");
		fillArray(numbers);
		System.out.println("Array is full");
		System.out.println("Looking for abudant numbers");
		findAbudantNumbers(numbers);
		System.out.println("I found those bastards");
		
		System.out.println("Checking non abudant");
		
		for(int i=1; i<limit; i++) {
			if(!numbers[i]) {
				if(!isSumOfAbudant(i, numbers)) {
					sum += i;
				}
			}
		}
		
		System.out.println(sum);

	}
	
	private static boolean isSumOfAbudant(int n, boolean[] tab) {
		for(int i=n-1; i>0; i--) {
			if(tab[i]) {
				for(int j=1; j<i; j++) {
					if(tab[j]) {
						if(i+j == n)
							return true;
					}
				}
			}
		}
		return false;
	}

	private static void findAbudantNumbers(boolean[] tab) {
		
		for(int i=1; i<tab.length; i++) {
			if(tab[i]==false) {
				if(isAbudant(i)) {
					for(int j=1; j*i<tab.length; j++) {
						tab[i*j] = true;
					}
				}
			}
		}
	}

	private static boolean isAbudant(int n) {
		int a = MyMathLib.sumOfDividers(n);
		
		if(a>n) {
			return true;
		}
		return false;
	}

	private static void fillArray(boolean[] tab) {
		for(int i=0; i<tab.length; i++) {
			tab[i] = false;
		}
	}

}
