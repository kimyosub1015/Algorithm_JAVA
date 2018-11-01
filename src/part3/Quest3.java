package part3;

import java.util.Scanner;

public class Quest3 {
	static int seqSearchSen(int[] a, int n, int key, int[] idx) {
		int p = 0;
		a[n] = key;

		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				idx[p] = i;
				p++;
			}
		}
		
		return p == n ? -1 : p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		System.out.println("검색할 값 : ");
		int ky = stdIn.nextInt();
		int idxf[] = new int[num];
		int idx = seqSearchSen(x, num, ky, idxf);

		if (idx == -1)
			System.out.println("요소가 없습니다.");
		else {
			for(int z = 0;z<idx;z++) {
				System.out.print(idxf[z]);
				if(z != idx-1) {
					System.out.print(", ");
				}
				}
			System.out.println("번 요소에 총" + idx + "개가 있습니다.");
			
		}
	}
}