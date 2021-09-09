package homework;

import java.util.Arrays;

public class homework4_7_Cal {
	public int muti(int a) {
		int[] arr =new int[] {};
		int sum=0;
		int value=0;
		
		for(int i=0;i<100;i++) {
			value=a*i;
			arr[i]=value;
			if(value>=100) {
				break;
			}
			value=0;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	
	public int muti2(int a) {
		int sum=0;
		//
		for(int i=1;i<=100;i++) {
			sum=sum+(a*i);
			System.out.println(sum);
			if((a*i)>=100) {
				break;
			}
		}
		
		return sum;
	}
}
