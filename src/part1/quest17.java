package part1;

public class quest17 {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}

			for (int j = 1; j < i; j++)
				System.out.print(i);
			System.out.println("");
		}
	}

}
