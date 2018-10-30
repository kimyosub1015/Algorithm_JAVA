package part3;

import java.util.Scanner;

public class Quest2 {
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		System.out.print("  | ");
		for (int x = 0; x < n; x++) {
			System.out.print(x + " ");
		}
		System.out.println("");
		System.out.print("--+");
		for (int x = 0; x < n; x++) {
			System.out.print("--");
		}
		System.out.println("--");
		while (true) {
			//System.out.println(a[i] + "가 인덱스");
			System.out.print("  | ");;
			for (int x = 1; x < i+1; x++) {
				System.out.print("  ");
			}
			System.out.println("*");
			System.out.print(" "+i+"|");
			for (int y = 0;y<n;y++) {
				System.out.print(" "+a[y]);
			}System.out.println("");
			if (i == n)
				return -1;
			if (a[i] == key)
				return i;
			i++;
			System.out.println("  |");

		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		System.out.print("검색할 값 : ");
		int ky = stdIn.nextInt();

		int idx = seqSearch(x, num, ky);
		if (idx == -1)
			System.out.println("없었습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있었는데요?");
	}
}
