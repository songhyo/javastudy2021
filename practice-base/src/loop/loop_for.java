package loop;

import java.util.Scanner;

public class loop_for {
	public static void main(String[] args) {
		//1������ �����-1 1�ܿ��� 9�ܱ��� ����
		/*for(int i=1; i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println( i + "x" + j + "=" + i*j );
			}
		}
		*/
		//2������ �����-2 ���� �Է� ���� ������ �����ϱ�
		/*
		System.out.println("���� �Է� :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1; i<10;i++) {
			System.out.println(a + "x" + i + " = " + a*i);
		}
		*/
		//3 1���� �Է� ���� �������� Ȧ�� ���
		/*
		System.out.println("���� �Է� :");
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
		
		//5 1���� 19 ������ ���� �� �ΰ��� �Է� �޾� n��m���� ���Ͻÿ�
		/*System.out.println("����1 �Է� :"); //n
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.println("����2 �Է� :");//m
		int num2 = sc.nextInt();
			int result=1;
			for(int i=1;i<=num2;i++) {
				result=result*num1;
			}
			System.out.println(result);
		*/
		
		// 6 * �� �����ﰢ�� �����
		
		for(int i=1;i<=5;++i) {	//��
			for(int j=1;j<=i;++j) { //�� ��
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
