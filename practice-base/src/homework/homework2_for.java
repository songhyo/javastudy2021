package homework;

import java.util.Random;

public class homework2_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] a = new int[10];
		for(int i=0;i<10;i++) {
			a[i]=random.nextInt(100);
			System.out.println(a[i]);
		}
		int max=0;
		int min=0;
		System.out.println();
		
		max=max(a);
		System.out.println(max);
		
		
		max = max_to_other(a);
		System.out.println(max);
		
		min=min(a);
		System.out.println(min);
		
		min_to_array(a);
		
		max_to_array(a);
		
	}
	
	static int max(int[] a) {
		int a2=a[0];
		for(int i=0;i<10;i++) {
			if(a[0]<a[i]) {
				a2=a[i];
			}
		}
		return a2;
		
	}
	
	static int max_to_other(int[] a) {
		int a2=a[0];
		for(int i=0;i<10;i++) {
			if(a2<a[i]) {
				a2=a[i];
			 }
		}
		return a2;
		
	}
	
	
	static int min(int[] a) {
		int a2=a[0];
		for(int i=0;i<10;i++) {
			if(a[0]>a[i]) {
				a2=a[i];
			}
		}
		return a2;
			
	}
	

	static int[] min_to_array(int[] a) {
		 for (int i = 0; i < a.length; i++) {
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[i] > a[j]) {
	                    int tmep = a[i];
	                    a[i] = a[j];
	                    a[j] = tmep;
	                }
	            }
	        }
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	     System.out.println();  
		return a;
		
	}
	
	static int[] max_to_array(int[] a) {
		 for (int i = 0; i < a.length; i++) {
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[i] < a[j]) {
	                    int tmep = a[i];
	                    a[i] = a[j];
	                    a[j] = tmep;
	                }
	            }
	        }
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	        
		return a;
		
	}

}
