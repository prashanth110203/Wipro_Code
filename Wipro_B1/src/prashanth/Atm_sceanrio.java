package prashanth;

import java.util.Scanner;

public class Atm_sceanrio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int OGpin= 2020;
		
		try {
			System.out.println("Enter the right pin:");
			int pin= sc.nextInt();
			if(pin != OGpin) {
				System.out.println("Wrong PIN");
			}else {
				System.out.println("Correct PIN");
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
