package Part1;

public class quest1 {
	static int max4(int a,int b,int c,int d) {
		int max = a;
		if(b>max)
			max = b;
		if(c>max)
			max = c;
		if(d>max)
			max = d;
		
		return max;
		
	}

	public static void main(String[] args) {
		System.out.println("최대값 : "+max4(1,4,3,5));
	
	}
}
