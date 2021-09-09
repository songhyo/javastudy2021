package variable;

public class variable {
	static int i=5; // 전벽 변수
	
	static void a() {
		int i=10; // 지역 변수
		b();
	}
	
	static void b() {//b()안에서만 일어나는 (자기자신)  변수이거나 전역 변수를 정적인 유효번위라고 하며
		//b()에서 a()의 지역 변수가 출력 된다고 하면 그것을 동적인 유효번위라고 한다
		System.out.println(i);
		int i=30;
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		a();
	}
	// 

}
