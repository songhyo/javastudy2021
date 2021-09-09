class polymorphism_A{
	public String x() {return "x";}
}

class polymorphism_B extends polymorphism_A{
	public String y() {return "y";}
}
public class polymorphism {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphism_A a1=new polymorphism_B();
		a1.x();
			//									a1.y();
		polymorphism_B b1 = new polymorphism_B();
		b1.x();
		b1.y();
		
	}

}
