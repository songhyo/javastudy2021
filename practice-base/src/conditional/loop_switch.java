package conditional;

import java.util.Scanner;

public class loop_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		//���� ��ȣ�� �Է� �޾� ���ǽ� ��ȣ�� ����ϴ� ���α׷��� ������
		//������ 1.���� 2.���� 3.���� 4.����
		/*System.out.println(" 1.���� 2.���� 3.���� 4.����");
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��ȣ �Է� : ");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("101ȣ �Դϴ�.");
			break;

		case 2:
			System.out.println("201ȣ �Դϴ�.");
			break;

		case 3:
			System.out.println("301ȣ �Դϴ�.");
			break;
		case 4:
			System.out.println("401ȣ �Դϴ�.");
			break;

		default:
			System.out.println("���ǽ��� ����� ���� �ʾҽ��ϴ�.");
			break;
		}
		*/
		//�� ���� �Է¹޾� �ش� ���� �ϼ��� ����ϴ� ���α׷� �ۼ�
		// 31 29 31 30 31 30 31 31 30 31 30 31
		System.out.println("�� �Է�");
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
		
		System.out.println(month + "���� " + d+"�� ���� �Դϴ�.");
	}

}
