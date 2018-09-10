package pl.marcinor.MyMathLib.lib;

import java.math.BigInteger;
import java.util.ArrayList;
/**
 * 
 * @author Marcin Or³owski "marcinor"
 * 
 * A couple of static methods to solve a mathematical problems with are not in java.math
 * or in BigInteger class.
 *
 */
public class MyMathLib {
	/**
	 * 
	 * @param n - BigInteger number
	 * @return - factorial
	 */
	public static BigInteger factorial(BigInteger n) {
		BigInteger f = new BigInteger("1");
		BigInteger c = new BigInteger("1");
		n=n.add(BigInteger.ONE);
		while(!c.equals(n)) {
			f = f.multiply(c);
			c = c.add(BigInteger.ONE);
		}
		return f;
	}
	
	/**
	 *  Numbers a and b are amicable when d(a) = b, d(b) = a and a != b.
	 *  d(n) - sum of proper divisors of n (numbers less than n which divide evenly into n). 
	 * @param a
	 * @return
	 */
	public static boolean isAmicable(int a) {
		int sumA = sumOfDividers(a);
		int sumB = sumOfDividers(sumA);
		
		if(sumB == a && sumA != a)
			return true;
		else
			return false;
	}
	
	/**
	 * @param a
	 * @return
	 */
	public static int sumOfDividers(int a) {
		ArrayList<Integer> dividers = findDividers(a);
		int sumOfDividers = 0;
		
		for(int i=0; i<dividers.size(); i++) {
			sumOfDividers += dividers.get(i);
		}
		return sumOfDividers;
	}
	
	/**
	 * Returns not sorted dividers.
	 * @param n
	 * @return
	 */
	public static ArrayList<Integer> findDividers(int n) {
		ArrayList<Integer> d = new ArrayList<>();
		d.add(1);
		
		for(int i=2; i*i<n; i++) {
			if(n%i == 0) {
				d.add(i);
				d.add(n/i);
			}
		}
		return d;
	}
	
	
}
