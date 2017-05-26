package exe01;

import java.util.Scanner;

public class Programa1 {

	static final int INPUT_SIZE = 10;
	static int tam = 0;

	public static void main(String[] args) {
		char[] vals = new char[INPUT_SIZE];

		Scanner scan = new Scanner(System.in);
		String s1 = getString(scan);

		copyVals(s1, vals);

		String sub = getSubstring(scan, vals);
		System.out.println("sub string: " + sub);
	}

	public static String getString(Scanner scan) {
		String s = "";
		boolean size = false;
		while(!size){
			System.out.print("Please type a string with at least one caractere and with no more than " + INPUT_SIZE + " caracteres: ");
			s = scan.nextLine();
			if(s.length() > 0 && s.length() <= INPUT_SIZE)
				size = true;
		}
		tam = s.length();
		return s;
	}

	public static void copyVals(String s, char[] vals) {
		for (int i = 0; i < s.length(); i++) {
			vals[i] = s.charAt(i);
		}
	}

	public static String getSubstring(Scanner scan, char[] vals) {
		int start = 0;
		boolean point = false;
		while(point == false){
			System.out.print("Starting point: ");
			try {
				start = scan.nextInt();
				if(start >= 0 && start < tam)
					point = true;
				else System.out.println("Voce deve digitar um inteiro nao negativo menor do que " +tam);
			} catch (Exception e) {System.out.println("Voce deve digitar um inteiro nao negativo menor do que " +tam); scan.next();}
		}
		int end = 0;
		point = false;
		while(point == false){
			System.out.print("Ending point: ");
			try {
				end = scan.nextInt();
				if(end > start && end <= tam)
					point = true;
				else System.out.println("Voce deve digitar um inteiro maior ou igual a " + start + " e menor ou igual a " + tam);
			} catch (Exception e) {System.out.println("Voce deve digitar um inteiro maior ou igual a " + start + " e menor ou igual a " + tam); scan.next();}
		}

		char[] newChars = getChars(start, end, vals);
		return new String(newChars);
	}

	public static char[] getChars(int start, int end, char[] vals) {

		int sz = end - start;
		char[] result = new char[sz];
		for (int i = 0; i < sz; i++) {
			result[i] = vals[start + i];
		}
		return result;
	}

}
