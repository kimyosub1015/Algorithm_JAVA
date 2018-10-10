package part1;

import java.util.Scanner;

public class quest14 {

	public static void main(String[] args) {
		int inp;
		Scanner ip = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수 : ");
		inp = ip.nextInt();
		for (int i = 1;i<=inp;i++) {
			for(int j = 1; j<=inp;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
