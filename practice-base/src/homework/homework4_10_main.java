package homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework4_10_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr= {"1. 1번 문제의 답은 ?","2. 2번 문제의 답은 ?"
				,"3. 3번 문제의 답은 ?","4. 4번 문제의 답은 ?"
				,"5. 5번 문제의 답은 ?","6. 6번 문제의 답은 ?"
				,"7. 7번 문제의 답은 ?","8. 8번 문제의 답은 ?"
				,"9. 9번 문제의 답은 ?","10. 10번 문제의 답은 ?"};
		int[] input = new int[10];
		int[] correct= {1,2,3,4,5,6,7,8,9,10};
		int[] score= {3,3,3,2,2,2,1,1,4,5};
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
			input[i]=sc.nextInt();
		}
		int myscore = 0;
		for(int i=0; i<arr.length;i++) {
			if( input[i]==correct[i]) {
				myscore = myscore + score[i];
			}
		}
		System.out.println(myscore);
	}
}
