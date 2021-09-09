package homework;

import java.util.Scanner;

public class homework4_1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<number.length;i++)
		{
			System.out.print("숫자 5개 입력 :");
			number[i]=sc.nextInt();
		}
		//문자나 0이 입력 될 경우도 예외를 잡아줄것
		//입력문에 대해 클래스 생성을 요함
		//private를 사용 할 것
		
		homework4_1_contion condition = new homework4_1_contion();
		
		
		
		System.out.println("홀수 : "+condition.count(number)); // 변수에 저장한후 사용하는게 좋음
		System.out.println("짝수 : "+(5-condition.count(number)));
		System.out.println("평균" + condition.avg(number));
	}

}
