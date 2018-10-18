package part2;

import java.util.Scanner;

public class Quest02 {

	static void swap(int[] a, int idx1, int idx2) {
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
			System.out.println();
		System.out.println("a["+idx1+"] 하고 a["+idx2+"]를 교환합니다.");
		int t = a[idx1]; // 임시저장공간 생성
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	static void reverse(int[] a) {
		for(int i = 0; i<a.length/2;i++){
			swap(a,i,a.length-i-1);
		}
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
			System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inInt = new Scanner(System.in);
		System.out.print("1차원 배열 갯수 : ");
		int num = inInt.nextInt();
		int[]x = new int[num];
		for(int i = 0;i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i] = inInt.nextInt();
		}		
		reverse(x);
		System.out.println("역순 정렬 완료");
	}
}