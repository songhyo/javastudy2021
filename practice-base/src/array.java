import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//num�迭���� �ִ밪�� ����ϴ� ���α׷��� �����Ͻÿ�.
		int[] array = {6,3,2,9,10};
		int a = 0;
		for(int i=0	;i<array.length;i++) {
			if(a<array[i]) {
			a=array[i];
			}
		}
		System.out.println(a);

	

	//num�迭�� �հ�� ����� ���ϴ� ���α׷��� �����Ͻÿ�.
	
	int[] num = {2,15,23,90};
	int result = 0;
	for(int i=0;i<4;i++) {
		result +=num[i];
	}
	System.out.println(result);
	System.out.println(result/num.length);
	
	
	//�迭�� ����� ����� ������ŭ ���ڸ� ����ϴ� ���α׷��� �����Ͻÿ�.
	int[] count =  {2,1,27,3};
	for(int i=0;i<count.length;i++) {
		for(int j=0; j<i;j++) {
			System.out.print("a");
		}
		System.out.println();
	}
	
	//���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����غ���.
	Scanner sc = new Scanner(System.in);
	int[] number =new int[10];
	for(int i=0; i<10;i++) {
		System.out.print("���� �Է� : ");
		number[i] = sc.nextInt();
	}
	for(int i=0; i<10;i++) {
		if(number[i]%3==0) {
			System.out.println(number[i]);
		}
	}

	
	}
	
}
