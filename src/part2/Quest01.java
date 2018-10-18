package part2;

import java.util.Random;
import java.util.Scanner;

public class Quest01 {
	// 난수를 사용해서 배열의 요소의 값 설정
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1;i<a.length;i++)
			if(a[i]>max)
				max = a[i];
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = rand.nextInt(10);
		System.out.println(num);
		
		int[] height = new int[num];
		System.out.println("키값은?");
		for(int i = 0;i<num;i++) {
			height[i] = 100+rand.nextInt(90);
			System.out.println("height["+(i+1)+"] : "+height[i]+"cm");
		}
		System.out.println("가장 큰 키는? - "+maxOf(height)+"cm");
		
	}
}
