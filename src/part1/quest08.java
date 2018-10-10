package part1;

import java.util.Scanner;

public class quest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합");
		System.out.print("n을 입력하세요 : ");
		int n = stdIn.nextInt();
		int sum = 0;
		if (n % 2 != 0) {
			for (int i = 1; i <= n; i++) {
				sum += i;
				System.out.print(i);
				if (i == n)
					System.out.print("=");
				else
					System.out.print("+");
			}

			System.out.println(sum);
		}
		else
		{
			int pxn = (1+n)*(n/2);
			sum = pxn;
			System.out.println(sum);
		}
	}
}
