class Cal{
	int left,right;
	public Cal(int left,int right) {
		this.left = left;
		this.right=right;
	}
	
	public void sum() {
		System.out.println(left + right);
	}
	
	public void avg() {
		System.out.println((left +  right)/2);
	}
}
public class java_this2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c1 = new Cal(10, 20);
		c1.sum();
		c1.avg();
		
		Cal c2= new Cal(20, 40);
		c2.sum();
		c2.avg();
	}

}
