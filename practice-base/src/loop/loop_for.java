package loop;

import java.util.Scanner;

public class loop_for {
	public static void main(String[] args) {
		//1구구단 만들기-1 1단에서 9단까지 나열
		/*for(int i=1; i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println( i + "x" + j + "=" + i*j );
			}
		}
		*/
		//2구구단 만들기-2 숫자 입력 빋아 구구단 나열하기
		/*
		System.out.println("숫자 입력 :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1; i<10;i++) {
			System.out.println(a + "x" + i + " = " + a*i);
		}
		*/
		//3 1부터 입력 받은 값까지의 홀수 출력
		/*
		System.out.println("숫자 입력 :");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		for(int i=1;i<=b;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		*/
		
		//4 100 + 97 + ... +1=?
		/*
		int a=100,b,c=0;
		for(int i=0;i<=100;i++) {
			b=a-3;
			a=b;
			if(a>0) {	
				System.out.println(a);
				c+=a;
			}
			
		}
		System.out.println(c);
		*/
		
		//5 1부터 19 사이의 정수 값 두개를 입력 받아 n의m승을 구하시오
		/*System.out.println("숫자1 입력 :"); //n
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.println("숫자2 입력 :");//m
		int num2 = sc.nextInt();
			int result=1;
			for(int i=1;i<=num2;i++) {
				result=result*num1;
			}
			System.out.println(result);
		*/
		
		// 6 * 로 직각삼각형 만들기
		
		for(int i=1;i<=5;++i) {	//줄
			for(int j=1;j<=i;++j) { //별 수
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
