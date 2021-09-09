package conditional;

import java.util.Scanner;

public class loop_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		// 조건문에 경우 기본적인 내용을 알고 있다고 생각함 백준과 서칭을 통한 간단 기본 문제를 통해 공부해볼 생각
		//if -1 정수를 하나 입력받고 홀수인지 짝수인지 확인하여 출력하는 프로그램을 작성하세요.
		/*int a;
		
		System.out.println("숫자 입력 : ");
		a=sc.nextInt();
		if(a%2==0) {
			System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
		*/
		//if =2 2. 영문자를 입력받아서 소문자인지 판별하는 프로그램을 작성하시오.
	   // 만약 영문자가 아니라면 “영문자가 아닙니다”라고 출력하도록 작성하세요.
		/*char b;
		System.out.println("영문자를 하나 입력 해주시오: ");
		b=sc.next().charAt(0);;// 대문자 65~90 소문자 97~ 122
		if((b>=65 && b<=90)||(b>=97 && b<=122)) {
			if(b>=65 && b<=90) {
				System.out.println("대문자");
			}
			else if(b>=97 && b<=122) {
				System.out.println("소문자");
			}
		}
		else {
			System.out.println("대문자 또는 소문자가 아닙니다.");
		}
		
		*/
		
		// if-3시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		int c;
		
		System.out.println("점수 입력 : ");
		c=sc.nextInt();
		if(c>60) {
			if(c>=70 && c<80) {
				System.out.println("C");
			}
			else if(c>=80 && c<90) {
				System.out.println("B");
			}
			else if(c>=90 && c<100) {
				System.out.println("B");
			}
		}
		else {
			System.out.println("F");
		}
	}

}
