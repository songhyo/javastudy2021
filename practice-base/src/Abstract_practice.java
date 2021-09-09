

abstract class A{
	public abstract int b(); // 오버라이딩을 이용해서 사용해야만한다
	//b()메소드가 추상이기떄문에 자동으로 A클래스는 추상 클래스가 된다
	//public abstract int c(){System.out.println("c")}// 오류 발생
	public void d() { // 하지만 이렇게 사용할수도있따?
		System.out.println("world");
	}
}

class B extends A{
	public int b() {
		return 1;
	}
}
public class Abstract_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A ad = new A();
	}

}
