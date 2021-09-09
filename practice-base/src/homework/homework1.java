package homework;

public class homework1 {

	public static void main(String[] args) {
		int won=1000000;
	       double percent=0.05;
	       double total=0;
	       int year=3;
	       
	      total= calculate(year,total,won);
	       System.out.println(total);
	}
	static double calculate(int year,double total,int won) {
		 for(int i=0; i<year;i++){
	           total=(won*(1+0.05)+won)*(1+0.05);
	       }
		return total;
	}
	

}
