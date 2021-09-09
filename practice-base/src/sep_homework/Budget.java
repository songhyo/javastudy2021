package sep_homework;

import java.util.Arrays;

public class Budget {
	public static int count(int[] a, int budget) {
		int sum=0;
		int result = 0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			if(sum<=budget) {
				result++;
				System.out.println(sum);	
			}
			else {
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random=(int)(Math.random() * 100)+1;
		int[] a = new int[random]; // 부서별 신청금액
		
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random() * 99999)+1;
		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int budget=(int)(Math.random() * 9999999)+1;
		System.out.println(budget);
		System.out.println("예산안에서 가장 많이 신청 할수있는 부서 개수 : " + count(a,budget));
	}	

}
