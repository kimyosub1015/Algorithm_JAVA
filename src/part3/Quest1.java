package part3;

import java.util.Scanner;

public class Quest1 {
	static int seqSearchSen(int[] a,int n,int key) {
		int i = 0;
		a[n] = key;
		
		for(i=0;i<n;i++) {
			if(a[i] == key)
				break;
		}
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num+1];

		for (int i = 0; i < num; i++) {
				System.out.print("x[" + i + "] : ");
				x[i] = stdIn.nextInt();
		}
		System.out.println("검색할 값 : ");
		int ky = stdIn.nextInt();

		int idx = seqSearchSen(x, num, ky);

		if (idx == -1)
			System.out.println("요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "] 에 있습니다.");

	}
}