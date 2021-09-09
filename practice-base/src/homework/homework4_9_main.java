package homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework4_9_main {
	public static void main(String[] args) {
		int number[] = new int[10];
		for(int i=0;i<10;i++) {
			number[i]=(int) ((Math.random()*45+1));
		}
		System.out.println(Arrays.toString(number));
		
		for (int i = 0; i <number .length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] >number[j]) {
                    int tmep = number[i];
                    number[i] = number[j];
                    number[j] = tmep;
                }
            }
        }
		System.out.println(Arrays.toString(number));
		int count=0;
		int total=0;
		
		for(int i=0;i<9;i++) {
			for(int j=i+1; j<9;j++) {
				System.out.println(number[i] + " + " + number[j]);
				if(number[i]==number[j]) {
					count++;
				}
			}
			if(count>0) {
				total++;
			}
			count=0;
		}
		System.out.println(total);
		
	}
}
