package homework;

import java.util.Arrays;
import java.util.Random;

public class homework2_formula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] a = new int[10];
		for(int i=0;i<10;i++) {
			a[i]=random.nextInt(100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		array_formula(a);
		int max=max_formula(a);
		System.out.println(max);
		int min=min_formula(a);
		System.out.println(min);
	}
	
	static int max_formula(int[] a) {
		Arrays.sort(a);
		return a[a.length-1];
	}

	static int min_formula(int[] a) {
		Arrays.sort(a);
		return a[0];
	}
	
	static int array_formula(int[] a) {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		return 0;
	}


}
