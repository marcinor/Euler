import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Numbers.txt");
		Scanner sc;
		BigInteger sum = new BigInteger("0");
		BigInteger number;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				number = new BigInteger(sc.next());
				sum = sum.add(number);
				}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sum.toString().substring(0, 10));
	}

}
