import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindPath {
	private int[][] tab;

	public int[][] getTab() {
			return tab;
	}

	public void setTab(int[][] tab) {
		this.tab = tab;
	}
	
	public FindPath(File file) {
		String length = "";
		int n = 0;
		
		try(Scanner sc = new Scanner(file)){
			while(sc.hasNextLine()) {
				length = sc.nextLine();
			}
			sc.close();
			
			for(int i=0; i<length.length();i++) {
				if(length.charAt(i)==' ') {
					n++;
				}
			}
			
			tab = new int[n+1][n+1];
			
			try(Scanner sc2 = new Scanner(file)) {
				for(int i = 0; i<n+1; i++) {
					for(int j = 0; j<=i; j++) {
						tab[i][j] = sc2.nextInt();
					}
				}
				sc2.close();
			} catch (FileNotFoundException e) { 
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		}
	}
	
	public FindPath(int[][] tab) {
		setTab(tab);
	}
	
	public int findMaxSum() {
		int[][] maks = tab;
		
		for(int i = tab.length-1; i>=0; i--) {
			for(int j = 0; j<=i; j++) {
				maks[i][j] = maxSumOfAdjacent(i,j);
			}
		}
		
		return maks[0][0];
	}
	
	private int maxSumOfAdjacent(int a, int b) {
		int sum = tab[a][b];
		int max = tab[a][b];
		
		if(a+1>=tab.length) {
			return sum;
		} else {
			sum = tab[a][b] + tab[a+1][b];
			if(sum>max)
				max = sum;
			
			/*if(b-1>=0) {
				sum = tab[a][b] + tab[a+1][b-1];
				if(sum>max)
					max = sum;
			}*/
				
			if(b+1<tab.length) {
				sum = tab[a][b] + tab[a+1][b+1];
				if(sum>max)
					max = sum;
			}
		}
		return max;
	}

	@Override
	public String toString() {
		String string = "";
		for(int[] t: tab) {
			for(int x: t) {
				string += x + " ";
			}
			string += "\n";
		}
		return string;
	}

}
