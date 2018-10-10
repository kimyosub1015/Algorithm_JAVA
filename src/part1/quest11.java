package part1;
import java.util.Scanner;

class quest11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("양의 정수값 자릿수 구하기");

		int n;
		do {
			System.out.print("정수를 입력하세요.：");
			n = stdIn.nextInt();
		} while (n <= 0);
		int nums = 0;
		while (n > 0) {
			n /= 10;
			nums++;
		}
		System.out.println(nums + "자리수");
	}
}