package homework;

import java.util.Scanner;

public class homework4_7_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100사시에 숫자 입력 : ");
		// 예외 처리 꼭 할 것
		int num = sc.nextInt();
		homework4_7_Cal cal = new homework4_7_Cal();
		System.out.println(cal.muti2(num));
		
	}
}
