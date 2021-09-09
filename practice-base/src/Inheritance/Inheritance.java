package Inheritance;
class cal{
	int left,right;
	
	public void setoprands(int left,int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class substract_able_cal extends cal{
	public void substract() {
		System.out.println(this.left - this.right);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		substract_able_cal c1 = new substract_able_cal();
		c1.setoprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract(); //substract_able_cal이 cal을 상속 받았기 떄문에 sum과 avg가 사용 가능하다
			// 객체에 메소드를 추가 하기 어려운 경우
			//1. 객체를 자신이 만들지 않았을 경우
			//2. 객체에 다양한 곳에서 활요되고 있는데 메소드를 추가하면 다른 곳에서는 불필요한 기능이 포함 될수있다
			// 즉 기존의 객체를 그대로 유지하면서 어떤 기능을 추가 하는 방법을 상속이라고 한다
	}

}
