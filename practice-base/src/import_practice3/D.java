package import_practice3;
import import_practice2.*;
import import_practice1.A;
public class D {
	//코드에 올리면 복잡 해질것같아서 
	// 막간의 설명 : import_practice1패키지는 A와 B라는 클래스가 있고 
	//import_practice2에는 B,C라는 클래스가 있다 
	public static void main(String[] args) {
		B b = new B(); // 오류가 난 이유 : 같은 패캐지 안에 있는 자바 파일이 아니기떄문에 2추가 해주가
		
		A a = new A(); // 만약 import_practice1의 A파일을 가져 오고 싶다면 3추가
	}
}
