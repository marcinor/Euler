/**
 * 
 * @author Marcin Or³owski "marcinor"
 *
 */
public class Main {

	public static void main(String[] args) {
		int numberOfLetters = 0;
		for(int i=1; i<=1000; i++) {
			//System.out.println(numberToString(i));
			numberOfLetters += numberToString(i).length();
		}
		System.out.println(numberOfLetters);
	}
	
	// changing to string without spaces and '-'
	public static String numberToString(int n) {
		String[] digits = {"","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		String hundred = "hundred";
		String thousend = "thousand";
		
		String number = "";
		int l = 0;
		
		// if number is *10 to *19
		if((n/10)%10==1) {
			number = teens[n%10];
			n = n/100;
			if(n>0) {
				number = digits[n%10] + hundred + "and" + number;
			}
		} else if(n==1000)
			number = digits[1] + thousend;
		
		else while(n>0){
				if(l==0)
					number = digits[n%10] + number;
				if(l==1)
					number = tens[n%10] + number;
				if(l==2) {
					if(!number.equals("")) number = "and" + number;
					number = digits[n%10] + hundred + number;
				}
				l++;
				n = n/10;
				}
		
		return number;
	}
}
