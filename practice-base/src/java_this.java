
class c{
	int v=10;
	void m() {
		int v=20;
		System.out.println(v);
		
		System.out.println(this.v); // th is = 전역의 의미를 가짐
	}
}
public class java_this {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c c1 = new c();
		c1.m();
	}

}
 