import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("Path.txt");
		FindPath fp = new FindPath(file);
		
		System.out.println(fp.findMaxSum());
		System.out.println(fp);
	}

}
