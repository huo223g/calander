package calander;

import java.util.Scanner;

public class practic {

	
	
	public static void main(String[] args) {
		
		System.out.println("두 개의 값을 입력하여 주십시오.");
		int a;
		int b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		
		s1=scanner.next();
		s2=scanner.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.printf("두 수는 %d와 %d의 합은 %d입니다.",a, b, a+b);
		scanner.close();
		
		
		
		
		
	}
}
