package JAVA_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		A a1 = new B();
		//B b1 = new A(); 오류 발생 지금 B는 A를 상속 받고 있다. A는 상위 B는 하위라는 왈
		// 8번쨰 줄 같은 경우 상위 클래스에서 하위 클래스를 불러오는건 가능하다
		//하지만 사직클래스에서 상위클래스를 가져오기 위해서 캐스팅이라는 작업을 거쳐 가져 올수있기떄문에 cast를 해준다
		B b2 = (B) new A();
	}

}
