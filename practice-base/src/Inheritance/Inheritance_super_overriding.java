package Inheritance;
class cal2{
	int left,right;
	public cal2() {}
	
	public cal2(int left,int right) {
		this.left=left;
		this.right=right;
	}
	
	public void setoprands(int left,int right,int third) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public int avg() {
		return ((this.left+this.right)/2);
	}
}

class substract_able_cal2 extends cal2{
	public substract_able_cal2(int left,int right) {
		super(left,right);
		//상위클래스의 초기화가 되어야지만 하위클래스의 초가화가 이루어질수있다
	}
	
	public void sum() { // 오버라이딩이란 재정의 라는 뜻이며 상위 클래스를 상속받은 sum()아니라 하위 클ㅐ스의 sum()을 이용 했응때를 오버라이딩이라고 한다
		
		System.out.println("실행 결과는" +(this.left+this.right)+"입니다.");
	}
	public void substract() {
		System.out.println(this.left - this.right);
	}
	
	public int avg() {//public int avg()  오류가 난 이유 :  부모 메소드이 형식과 이름 매개변수가 같아야한다
		//return (this.left+this.right)/2;// 이렇게 하면 부모 클래스와 코드 중복이 일어남으로
										// super를 이용 하여 부모 클래스를 불러준다 super은 현재 클랫의 부모클래스를 의미한다
	return super.avg();
	}
}
public class Inheritance_super_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		substract_able_cal2 c1 = new substract_able_cal2(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}

}
