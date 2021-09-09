package homework;

import java.util.Scanner;

public class homework4_8_main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		prime_number(a);
	}
	
	public static void prime_number(int a) {
		int count=0;
		for(int i=2; i<=a;i++) {
			for(int j=2; j<i;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
				
			}
			count=0;
			
		}
	}
}
