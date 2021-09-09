package conditional;

import java.util.Scanner;

public class loop_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		//과목 번호를 입력 받아 강의실 번호를 출력하는 프로그램을 만들어보자
		//과목은 1.수학 2.과학 3.영어 4.역사
		/*System.out.println(" 1.수학 2.과학 3.영어 4.역사");
		Scanner sc = new Scanner(System.in);
		System.out.println("과목 번호 입력 : ");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("101호 입니다.");
			break;

		case 2:
			System.out.println("201호 입니다.");
			break;

		case 3:
			System.out.println("301호 입니다.");
			break;
		case 4:
			System.out.println("401호 입니다.");
			break;

		default:
			System.out.println("강의실이 만들어 지지 않았습니다.");
			break;
		}
		*/
		//몇 월을 입력받아 해당 퀄의 일수를 출력하는 프로그램 작성
		// 31 29 31 30 31 30 31 31 30 31 30 31
		System.out.println("달 입력");
		int d;
		int month = sc.nextInt();
		switch (month) {
		case 2:
			d=28;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			d=30;
			break;

		default:
			d=31;
			break;
		}
		
		System.out.println(month + "월은 " + d+"일 까지 입니다.");
	}

}
