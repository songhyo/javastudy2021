package print_and_type;

public class print_and_type {
	public static void main(String[] args) {
		/*
		// �ڹ� �ܼ� ��¹�
		System.out.println("�ݰ����� ���� ���ú��� ���� �ϰ� �� ��ȿ�� �̶�� �ؿ�");
		//���� : ���� ���� �ϴ� ����
		// ������ ���� ���� �ϱ� ���ؼ� ���� �� �ʱ�ȭ�� ���־�� �Ѵ�
		//��=Ÿ�� : ���� Ÿ�������� 2���� ������� ������
		// �⺻��
		int a=1; //������
		float b=0.01F; // �Ǽ���
		double c=0.01;// �Ǽ���
		char d='a';// ������
		boolean e=true; // ����
		byte f=125;// ������
		short g=111;// ������
		long h=123;// ������
		// �� �ܰ��� ���� �������̶�� �� ���ִ�
		// String�� ���� �ƴ϶� ��ü��� �Ѵ��� ��
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		System.out.println("=====================");
		int i = 100;
		char j = 'a';
	    int k = j;      // char -> int Ÿ������ �ڵ� ��ȯ.
	    double l = i; // int -> double Ÿ������ �ڵ� ��ȯ. 
	    System.out.println("intŸ�� ���� j�� �� : "+k);
	    System.out.println("doubleŸ�� ���� d�� ��: "+l);
		
		*/
		
		// ������ : ���������� ������ ���� �ϱ� ���� �ڹٿ��� ���� ���ִ°�
		// ��� ���� ���� �� �� ��Ʈ ����
		int num1=4;
		int num2=6; int num3=8;
		// ��� ������
		System.out.println("+ ������ ���� : " + (num1+num2));
		System.out.println("- ������ ���� : " + (num1-num2));
		System.out.println("* ������ ���� : " + (num1*num2));
		System.out.println("/ ������ ���� : " + (num1/num2));
		System.out.println("% ������ ���� : " + (num1%num2));
		//�������� ���� ��� ĳ��Ʈ �Ǵ� �Ǵٸ� ������ ���� �Ͽ� �ڸ��� �� ���� �����Ͽ� ����Ҽ��ֵ�
		// ��� �������� ��� �켱 ������ �����µ� �⺻������ �츮�� �ƴ� ��Ģ ������ �̿��ϴ� ���̴�
		//1. ��ȣ ���� 2.��,������ -> ���ϱ�,�����̸� �� ���� ���� �ܿ��� ���� http://tcpschool.com/java/java_operator_arithmetic ���� ����Ʈ �̿��ؼ� ����ϵ��� ����
		
		//���� ������ : ������ ���� ������ �� ����ϴ� ���� �������̸�, �ǿ����ڵ��� ���� ������ �� -> ��
		//= += -= *= /= %= &= |= ^= <<= >>= >>>=
		int num4 = 7, num5 = 7, num6 = 7;
		num4 = num4 - 3;
		num5 -= 3;
		num6 =- 3;
		System.out.println("num1 = num1-3 : " + num4 );
		System.out.println("num2 -= 3 : " + num5);
		System.out.println("num3 =- 3 : " + num6);
		// 62�� 63���� ���� ������ ������ǥ�⿡ ���� ���� �޶����� �̰��� ���� ���� �����ڿ��� �������� ������ �ſ� �߿� �ϴٴ� ���� �˼��ִ�
		
		//���������� : ���� �Ǵ� ���� ������ Ư�� ���� :  �ǿ����ڰ� �Ѱ����� ���� ������
		int num7 = 7, num8 = 7;
		int result1, result2;
		result1 = --num7 + 4;
		result2 = num8-- + 4;
		System.out.println("--n �ϋ� : " +result1+", "+ num7);
		System.out.println("n-- �ϋ� : " + result2+", "+ num8);
		//Ư�� ���� �������� ��� ���� �������� ���� ó������ Ǯ��� ������ �̺κп� ���� �ؼ� ���� Ǯ���
		
		// �� ������ : ������� ũ�� �Ǵ� ������ �̴� (����� boolean) ������ �� -> ��
		//== != > >= < <=
		char ch1 = 'a', ch2 = 'A';
		System.out.println("== �����ڿ� ���� ��� : "+ (ch1 == ch2));
		System.out.println("> �����ڿ� ���� ��� : "+ (ch1 > ch2));
		// 14�� ġ���� �ô� ���� a�� �ƽ�Ű ������ 97 �̸� A�� 65 �̴� 
		
		//�� ������ :  ���� �������� �����ϴ� ������
		// 		&& || !
		// t t->t  t f
		// t f->f  t f
		// f t->f  t t
		// f f->f  f t
		char ch3 = 'b', ch4 = 'B';
		boolean result3, result4;
		result3 = (ch1 > 'a') && (ch1 < 'z') ;
		result4 = (ch2 < 'A') || (ch2 < 'Z') ;
		System.out.println("&& �����ڿ� ���� ��� : "+ result3);
		System.out.println("|| �����ڿ� ���� ��� : "+ result4);
		System.out.println("! �����ڿ� ���� ��� : "+ !result4);
		
		// ��Ʈ ������: ��Ʈ ������ �� ���� ������ �� �� ��� �ϴ� ������
		//& and / | or / ^ xor / ~ not / << left shift���� / >> right shift����/ >>> 0
		int num9=8, num10=-8;
		System.out.println("~ �����ڿ� ���� ��� : "+ ~num1);
		System.out.println("<< �����ڿ� ���� ��� : "+ (num1 << 2));
		System.out.println(">> �����ڿ� ���� ��� : "+ (num2 >> 2));
		System.out.println(">>> �����ڿ� ���� ��� : "+ (num1 >>> 2));
		System.out.println(">>> �����ڿ� ���� ��� : "+ (num2 >>> 2));
		
		//���׿����� : ���ǽ�? ��1(true) : ��2(false)
		int num11 = 5, num12 = 7;
		int result5;
		result5= (num1 - num2>0) ? num1 : num2;

		System.out.println("�� ū ���� " + result5 + "�Դϴ�.");
		
	}
}
