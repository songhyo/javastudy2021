package JAVA_class;

public class class01 {
	static int a=2;
	
	public static int class01() {
		return 0;
	}
	
	public int A() {
		return 0;
	}
	
	public static int B() {
		return 0;
	}
	public static void main(String[] args) {
		//A();//함수에 static이 포함 되어 있을 경우만 : 자신이 속해있는 클래스의 함수를 불러오는것은 객체 생성이 필요없다
		new class01();// 이 또한 같은 클래스 안에 들어 있기 떄문에 클래스 이름을 적어줄 필욘 없다 
		class01 a01 = new class01();
		class02 b01 = new class02();
		
		
		
	}
	
}
