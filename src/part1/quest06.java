package part1;

import java.util.Scanner;

public class quest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합");
		System.out.print("n을 입력하세요 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) {
			sum += i;
			i++;
		}
		System.out.println("합계 : "+sum);
		System.out.println("계산횟수 : "+i);

	}

}

