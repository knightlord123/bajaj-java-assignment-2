package javaassignment2;

public class reverse6digit {

	public static void main(String[] args) {
		int number=123456;
		int reverse=0;
		while(number>0) {
			int temp=number%10;
			
			reverse=reverse*10+temp;
			number=number/10;
		}
		System.out.println(reverse);
		// TODO Auto-generated method stub

	}

}
