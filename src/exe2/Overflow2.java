package exe2;

import java.util.Scanner;

public class Overflow2 {
	public static void main(String[] args) {
		int[] tests = new int[10];
		int test;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		boolean integerAcceptable = false;
		while(integerAcceptable == false){
			System.out.print("How many numbers? ");
			try {
				count = scan.nextInt();
				if(count > 0 && count <= 10)
					integerAcceptable = true;
				else System.out.println("Voce deve digitar um numero inteiro positivo menor ou igual a 10");
			} catch (Exception e) {System.out.println("Voce deve digitar um numero inteiro positivo menor ou igual a 10"); scan.next();}
		}
		integerAcceptable = false;

		for (int i = 0; i < count; i++) {
			
			while(integerAcceptable == false){
				System.out.print("Please type a number: ");
				try {
					test = scan.nextInt();
					tests[i] = test;
					integerAcceptable = true;
				} catch (Exception e) {System.out.println("ERRO: Voce nao digitou um inteiro ou o modulo do inteiro digitado eh maior do que 2147483647\n"); scan.next();}
			}
			integerAcceptable = false;
			
		}
	}
}