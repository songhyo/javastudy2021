package sep_homework;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("num : ");
		int num = sc.nextInt();
		
		while(num>8000000)
		{
			System.out.print("num : ");
			num = sc.nextInt();
		}	
		
		while(num>1) {
			if(count>500) {
				System.out.println("-1");
				break;
			}
			else {
				if(num%2==0) {
					num=num/2;
				}
				else {
					num=num*3+1;
				}
				count++;
				System.out.println(count+"번쨰 : " + num);
			}
			
		}
	}
}

