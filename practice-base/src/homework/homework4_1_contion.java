package homework;

public class homework4_1_contion {
	public int count(int[] number) {
		int count=0;
		for(int i=0; i<number.length;i++) {
			if(number[i]%2!=0) { // == 이나 != 보다는 초과 미만을 쓸것
				count++;
			}
		}
		return count;	
	}
	
	public double avg(int[] number) {
		int sum=0;
		for(int i=0; i<number.length;i++) {
			sum+=number[i];
		}
		double result = sum/number.length;
		return result;	
	}

}
