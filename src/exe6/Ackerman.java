package exe6;

import java.lang.System;
import java.util.Scanner;


class Ackerman {
	public static void main(String[] args) {
		long ackValue = 1;
		long exp = 0;
		
		Scanner scan = new Scanner(System.in);

		boolean integerAcceptable = false;
		while(integerAcceptable == false){
			System.out.print("Type a positive integer number bigger than 1 and lower than 4: ");
			try {
				exp = scan.nextInt();
				if(exp > 1 && exp < 4)
					integerAcceptable = true;
				else System.out.println("Voce deve digitar um inteiro positivo maior do que 1 e menor do que 4");
			} catch (Exception e) {System.out.println("Voce deve digitar um inteiro positivo maior do que 1 e menor do que 4"); scan.next();}
		}

		
		if (exp > 1) {
			ackValue = exp;
			int numLoops = (int) exp;
			for (int i = 1; i < numLoops; i++) {
				exp = ackValue;
				for (int j = 1; j < numLoops; j++) {
					ackValue = ackValue * exp;
					System.out.println("current value is " + ackValue);
				}
			}
			System.out.println("Ackerman vlue: " + ackValue);
		}
	}
}