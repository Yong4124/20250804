package sec01exam01;

import java.util.Scanner;

public class Exception1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int num = s.nextInt();
		
		try {
			int arr[] = new int[5];
			arr[num] = 10 / num;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e1) {
			System.out.println(e1.getMessage());
		}
		
	}


}
