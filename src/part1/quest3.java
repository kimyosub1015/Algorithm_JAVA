package part1;


public class quest3 {
	static int min4(int a,int b,int c,int d) {
		int min = a;
		if(b<min)
			min = b;
		if(c<min)
			min = c;
		if(d<min)
			min = d;
		return min;
		
	}

	public static void main(String[] args) {
		System.out.println("최소값 : "+min4(33,40,38,59));
	
	}

}
