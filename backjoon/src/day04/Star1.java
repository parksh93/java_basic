package day04;

import java.util.Scanner;

public class Star1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int starNum = sc.nextInt();
		
		for (int i = 0; i < starNum; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}