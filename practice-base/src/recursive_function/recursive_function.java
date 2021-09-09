package recursive_function;

public class recursive_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 4; // 4!
		System.out.println(fact(input));

	}

	private static int fact(int n) {
		if (n <= 1)
			return n;
		else 
			return fact(n-1) * n;

	}

}
