package Inheritance;

class cal3{
	int left,right;
	int third=0;
	public void seteprands(int left,int right) {
		System.out.println("int left,int right");
		this.left=left;
		this.right=right;
	}
	
	public void seteprands(int left,int right,int third) {
		System.out.println("int left,int right int third");
		this.left=left;
		this.right=right;
		this.third = third;
	}
	
	public void sum() {
		System.out.println((this.left+this.right));
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal3 c1 =new cal3();
		c1.seteprands(10, 20);
		c1.sum();
		c1.avg();
		
		cal3 c2 =new cal3(); // 매개변수는 다르게 사용하는것이지만 리턴 타입은 같아야 한다 메소드 이름은 같아야 한다 
		c2.seteprands(10, 20,30);
		c2.sum();
		c2.avg();
	}

}
