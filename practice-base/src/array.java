import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//num배열에서 최대값을 출력하는 프로그램을 구현하시오.
		int[] array = {6,3,2,9,10};
		int a = 0;
		for(int i=0	;i<array.length;i++) {
			if(a<array[i]) {
			a=array[i];
			}
		}
		System.out.println(a);

	

	//num배열의 합계와 평균을 구하는 프로그램을 구현하시오.
	
	int[] num = {2,15,23,90};
	int result = 0;
	for(int i=0;i<4;i++) {
		result +=num[i];
	}
	System.out.println(result);
	System.out.println(result/num.length);
	
	
	//배열에 저장된 요소의 갯수만큼 문자를 출력하는 프로그램을 구현하시오.
	int[] count =  {2,1,27,3};
	for(int i=0;i<count.length;i++) {
		for(int j=0; j<i;j++) {
			System.out.print("a");
		}
		System.out.println();
	}
	
	//양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
	Scanner sc = new Scanner(System.in);
	int[] number =new int[10];
	for(int i=0; i<10;i++) {
		System.out.print("정수 입력 : ");
		number[i] = sc.nextInt();
	}
	for(int i=0; i<10;i++) {
		if(number[i]%3==0) {
			System.out.println(number[i]);
		}
	}

	
	}
	
}
