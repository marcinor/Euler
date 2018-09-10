/**
 * @autor Marcin Or³owski "marcinor
 * To do:
 * put on GitHub
 * change array to ArrayList and then change to array to sort.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String fileName = "p022_names.txt";
		int size = 5163;
		
		String readedNames = "";
		String[] names = new String[size];
		
		long sum = 0;
		
		readedNames = readNamesFromFile(fileName);
		getNames(readedNames, names);
		Arrays.sort(names);
        
        for(int i = 0; i<size; i++) {
        	sum += countValue(names[i])*(i+1);
        	System.out.println((i+1)+" "+names[i]);
        }
        System.out.println(sum);
	}
	
	private static String readNamesFromFile(String fileName) {
		String readedNames = "";
		FileReader fileReader = null;
        BufferedReader reader = null;
        
        try {
            fileReader = new FileReader(fileName);
            reader = new BufferedReader(fileReader);
            String nextLine = null;
            
            while ((nextLine = reader.readLine()) != null) {
            	readedNames += nextLine;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        return readedNames;
	}
	
	private static void getNames(String readedNames, String[] names) {
		String name = "";
        int n = 0;
        char c ='a';
        
        for(int i=0; i<names.length; i++) {
        	try {
        		c = readedNames.charAt(n);
        	}catch(StringIndexOutOfBoundsException e) {
        		break;
        	}
        	name = "";
        	do {
        		try {
        			c = readedNames.charAt(n);
        		}catch(StringIndexOutOfBoundsException e) {
        			break;
        		}
        		if(c!='"' && c!=',') {
        			name+=c;
        		}
        		n++;
        		
        	} while(c!=',');
        	names[i] = name;
        }
	}

	private static int countValue(String name) {
		int value = 0;
		
		for(int i=0; i<name.length(); i++) {
			value += (int) name.charAt(i) - 64;
		}
		
		return value;
	}
}
