package exe7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner; /* Para teste */

public class ReadFileExample {
	static final int numberOfCaracteresRead = 5;
	
	private static final String FILENAME = "E:\\test\\filename.txt";

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in); /* Para teste */
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr, numberOfCaracteresRead);

			char [] auxBuffer = new char [numberOfCaracteresRead];

			while (br.read(auxBuffer, 0, numberOfCaracteresRead)!=-1) {
				String sCurrentLine = String.valueOf(auxBuffer);
				System.out.print(sCurrentLine);	
				//String s = scan.nextLine(); /* Para teste */
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}

