package part1;

import java.util.Scanner;

public class quest9 {
	static void sumof(int a,int b) {
		int sum = 0;
		for(int i = a;i<=b;i++) {
			sum += i;
			System.out.print(i);
			if(i == b)
				System.out.print("=");
			else
				System.out.print("+");
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a부터 b까지의 합");
		System.out.print("a을 입력하세요 : ");
		int a = stdIn.nextInt();
		System.out.print("b을 입력하세요 : ");
		int b = stdIn.nextInt();
		sumof(a,b);
	}

}
