package print_and_type;

public class print_and_type {
	public static void main(String[] args) {
		/*
		// 자바 콘솔 출력문
		System.out.println("반가워요 저는 오늘부터 공부 하게 된 송효빈 이라고 해요");
		//변수 : 값을 저장 하는 공간
		// 변수에 값을 저장 하기 위해서 선언 및 초기화를 해주어야 한다
		//형=타입 : 변수 타입종류는 2가지 기번형과 참조형
		// 기본형
		int a=1; //정수형
		float b=0.01F; // 실수형
		double c=0.01;// 실수형
		char d='a';// 문자형
		boolean e=true; // 논리형
		byte f=125;// 정수형
		short g=111;// 정수형
		long h=123;// 정수형
		// 이 외것은 전부 참조형이라고 할 수있다
		// String은 형이 아니라 객체라고 한더라 ㅎ
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
	    int k = j;      // char -> int 타입으로 자동 변환.
	    double l = i; // int -> double 타입으로 자동 변환. 
	    System.out.println("int타입 변수 j의 값 : "+k);
	    System.out.println("double타입 변수 d의 값: "+l);
		
		*/
		
		// 연산자 : 여러종류의 연산을 수행 하기 위해 자바에서 제공 해주는것
		// 산술 대입 증감 비교 논리 비트 삼항
		int num1=4;
		int num2=6; int num3=8;
		// 산술 연산자
		System.out.println("+ 연산자 예시 : " + (num1+num2));
		System.out.println("- 연산자 예시 : " + (num1-num2));
		System.out.println("* 연산자 예시 : " + (num1*num2));
		System.out.println("/ 연산자 예시 : " + (num1/num2));
		System.out.println("% 연산자 예시 : " + (num1%num2));
		//나머지와 몫의 경우 캐스트 또는 또다른 변수에 저장 하여 자리수 및 형을 지정하여 사용할수있디
		// 산술 연산자의 경우 우선 순위를 가지는데 기본적으로 우리가 아는 사칙 연산을 이용하는 것이다
		//1. 괄호 먼저 2.곱,나누기 -> 더하기,뺴기이며 이 외의 것은 외우지 말고 http://tcpschool.com/java/java_operator_arithmetic 여기 사이트 이용해서 사용하도록 하자
		
		//대입 연산자 : 변수에 값을 대입할 떄 사용하는 이항 연산자이며, 피연산자들의 결합 방향은 오 -> 왼
		//= += -= *= /= %= &= |= ^= <<= >>= >>>=
		int num4 = 7, num5 = 7, num6 = 7;
		num4 = num4 - 3;
		num5 -= 3;
		num6 =- 3;
		System.out.println("num1 = num1-3 : " + num4 );
		System.out.println("num2 -= 3 : " + num5);
		System.out.println("num3 =- 3 : " + num6);
		// 62번 63번쨰 줄을 봤을때 연산자표기에 따라 값이 달라진다 이것은 복합 대입 연사자에서 연산자의 순서는 매우 중요 하다는 것을 알수있다
		
		//증감연산자 : 증가 또는 감소 연산자 특이 사항 :  피연산자가 한개뿐인 단항 연산자
		int num7 = 7, num8 = 7;
		int result1, result2;
		result1 = --num7 + 4;
		result2 = num8-- + 4;
		System.out.println("--n 일떄 : " +result1+", "+ num7);
		System.out.println("n-- 일떄 : " + result2+", "+ num8);
		//특히 증감 연산자의 경우 연산 순서에서 가장 처음으로 풀어야 함으로 이부분에 주의 해서 문제 풀어보자
		
		// 비교 연산자 : 상대적인 크기 판단 연산자 이다 (결과는 boolean) 방향은 왼 -> 오
		//== != > >= < <=
		char ch1 = 'a', ch2 = 'A';
		System.out.println("== 연산자에 의한 결과 : "+ (ch1 == ch2));
		System.out.println("> 연산자에 의한 결과 : "+ (ch1 > ch2));
		// 14일 치에서 봤다 시피 a은 아스키 값으로 97 이며 A는 65 이다 
		
		//논리 연산자 :  참과 거짓으로 결정하는 연산자
		// 		&& || !
		// t t->t  t f
		// t f->f  t f
		// f t->f  t t
		// f f->f  f t
		char ch3 = 'b', ch4 = 'B';
		boolean result3, result4;
		result3 = (ch1 > 'a') && (ch1 < 'z') ;
		result4 = (ch2 < 'A') || (ch2 < 'Z') ;
		System.out.println("&& 연산자에 의한 결과 : "+ result3);
		System.out.println("|| 연산자에 의한 결과 : "+ result4);
		System.out.println("! 연산자에 의한 결과 : "+ !result4);
		
		// 비트 연산자: 비트 단위로 논리 단위 연산을 할 떄 사용 하는 연산자
		//& and / | or / ^ xor / ~ not / << left shift연산 / >> right shift연산/ >>> 0
		int num9=8, num10=-8;
		System.out.println("~ 연산자에 의한 결과 : "+ ~num1);
		System.out.println("<< 연산자에 의한 결과 : "+ (num1 << 2));
		System.out.println(">> 연산자에 의한 결과 : "+ (num2 >> 2));
		System.out.println(">>> 연산자에 의한 결과 : "+ (num1 >>> 2));
		System.out.println(">>> 연산자에 의한 결과 : "+ (num2 >>> 2));
		
		//삼항연산자 : 조건식? 값1(true) : 값2(false)
		int num11 = 5, num12 = 7;
		int result5;
		result5= (num1 - num2>0) ? num1 : num2;

		System.out.println("더 큰 수는 " + result5 + "입니다.");
		
	}
}
