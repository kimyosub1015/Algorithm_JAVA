package part1;

import java.util.Scanner;

public class quest04 {
	
	static int med3(int a,int b,int c){
		if(a>=b)
			if(b>=c)
				return b;
			else if(a<=c)
				return a;
			else
				return c;
		else if(a>c)
			return a;
		else if(b>c)
			return c;
		else
			return b;
		
	}

	public static void main(String[] args) {
		System.out.println("중앙값 : "+med3(3,2,1));
		System.out.println("중앙값 : "+med3(3,2,2));
		System.out.println("중앙값 : "+med3(3,1,2));
		System.out.println("중앙값 : "+med3(3,2,3));
		System.out.println("중앙값 : "+med3(2,1,3));
		System.out.println("중앙값 : "+med3(3,3,2));
		System.out.println("중앙값 : "+med3(3,3,3));
		System.out.println("중앙값 : "+med3(2,2,3));
		System.out.println("중앙값 : "+med3(2,3,1));
		System.out.println("중앙값 : "+med3(2,3,2));
		System.out.println("중앙값 : "+med3(1,3,2));
		System.out.println("중앙값 : "+med3(2,3,3));
		System.out.println("중앙값 : "+med3(1,2,3));
		

	}

}