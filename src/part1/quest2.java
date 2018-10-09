package part1;


public class quest2 {
	static int min3(int a,int b,int c) {
		int min = a;
		if(b<min)
			min = b;
		if(c<min)
			min = c;
		return min;
		
	}

	public static void main(String[] args) {
		System.out.println("최소값 : "+min3(11,40,38));
	
	}

}
