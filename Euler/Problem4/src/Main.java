/**
 * 
 * @author Marcin Or³owski "marcinor"
 *
 */
public class Main {
	public static void main(String[] args) {
		int palindromicNumber = 0;
		boolean check = false;
		for(int i=999; i>99; i--) {
			for(int j=999; j>=i; j--) {
				check = isPalindrome(String.valueOf(i*j));
				if(check == true) {
					if(i*j>palindromicNumber) {
						palindromicNumber = i*j;
						break;
					}
				}
			}
		}
		System.out.println(palindromicNumber);

	}
	
	public static boolean isPalindrome(String s) {
		if(s.equals(reverse(s)))
			return true;
		return false;
	}

	public static String reverse(String s) {
		String r ="";
		for(int i=s.length()-1; i>=0; i--) {
			r+=s.charAt(i);
		}
		return r;
	}
}
