package part1;

import java.util.Scanner;

public class quest15 {
	
	static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--)
				System.out.print("*");
			System.out.println("");
		}
	}
	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println("");
		}
	}
	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = n; k >= i ; k--) {
				System.out.print("*");
			}	
			System.out.println("");
		}
	}

	static void triangleRB
	(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i ; k++) {
				System.out.print("*");
			}	
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = 6;
		
		triangleLB(x);
		System.out.println("--------------");
		triangleLU(x);
		System.out.println("--------------");
		triangleRB(x);
		System.out.println("--------------");
		triangleRU(x);	
	}
}