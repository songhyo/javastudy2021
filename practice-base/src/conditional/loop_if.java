package conditional;

import java.util.Scanner;

public class loop_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		// ���ǹ��� ��� �⺻���� ������ �˰� �ִٰ� ������ ���ذ� ��Ī�� ���� ���� �⺻ ������ ���� �����غ� ����
		//if -1 ������ �ϳ� �Է¹ް� Ȧ������ ¦������ Ȯ���Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		/*int a;
		
		System.out.println("���� �Է� : ");
		a=sc.nextInt();
		if(a%2==0) {
			System.out.println("¦�� �Դϴ�.");
		}
		else {
			System.out.println("Ȧ�� �Դϴ�.");
		}
		*/
		//if =2 2. �����ڸ� �Է¹޾Ƽ� �ҹ������� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
	   // ���� �����ڰ� �ƴ϶�� �������ڰ� �ƴմϴ١���� ����ϵ��� �ۼ��ϼ���.
		/*char b;
		System.out.println("�����ڸ� �ϳ� �Է� ���ֽÿ�: ");
		b=sc.next().charAt(0);;// �빮�� 65~90 �ҹ��� 97~ 122
		if((b>=65 && b<=90)||(b>=97 && b<=122)) {
			if(b>=65 && b<=90) {
				System.out.println("�빮��");
			}
			else if(b>=97 && b<=122) {
				System.out.println("�ҹ���");
			}
		}
		else {
			System.out.println("�빮�� �Ǵ� �ҹ��ڰ� �ƴմϴ�.");
		}
		
		*/
		
		// if-3���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int c;
		
		System.out.println("���� �Է� : ");
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
