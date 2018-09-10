import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Marcin Or³owski "marcinor"
 *
 */
public class Main {
    public static final int size = 20;
	public static void main(String[] args) {
		
		File file = new File("Grid.txt");
		int[][] grid = new int[size][size];
		Scanner sc;
		
		//read grid from file and put it into the array
		try {
			sc = new Scanner(file);
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					grid[i][j] = sc.nextInt();
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(findProductSBS(grid));
	}
	// "Step by step" method
	public static int findProductSBS(int[][] a) {
		int product =0;
		int maks =0;
		
		//horizontally
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-3; j++) {
				product = a[i][j]*a[i][j+1]*a[i][j+2]*a[i][j+3];
				if(product>maks)
					maks = product;
			}
		}
		
		// vertically
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-3; j++) {
				product = a[j][i]*a[j+1][i]*a[j+2][i]*a[j+3][i];
				if(product>maks)
					maks = product;
			}
		}
		
		// diagonally to the right
		for(int i=0; i<size-3; i++) {
			for(int j=0; j<size-3; j++) {
				product = a[i][j]*a[i+1][j+1]*a[i+2][j+2]*a[i+3][j+3];
				if(product>maks)
					maks = product;
			}
		}
		
		// diagonally to the left
		for(int i=0; i<size-3; i++) {
			for(int j=3; j<size; j++) {
				product = a[i][j]*a[i+1][j-1]*a[i+2][j-2]*a[i+3][j-3];
				if(product>maks)
					maks = product;
			}
		}
		return maks;
	}
	// "Plus one, minus one" method

}
