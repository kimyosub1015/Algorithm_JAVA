package part1;

import java.util.Scanner;

public class quest05 {
	
	static int med3(int a,int b,int c) {
		if ((b >= a && c <= a)||(b <= a && c >= a))
			return a;
		else if ((a > b && c < b)||(a < b && c > b))
			return b;
		else
			return c;
	}
	public static void main(String[] args) {
		Scanner ipint = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값 구하기");
		System.out.print("a : ");
		int a = ipint.nextInt();
		System.out.print("b : ");
		int b = ipint.nextInt();
		System.out.print("c : ");
		int c = ipint.nextInt();
		System.out.println("중앙값 : "+med3(a,b,c));
	}
}
