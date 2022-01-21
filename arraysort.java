package javaassignment2;

public class arraysort {

	public static void main(String[] args) {
		int arr[]= {6,3,5,4,3,5,32};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;i<arr.length;i++) {
				if(arr[j]>arr[i]) {
					int a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
				
			}
		}
		for(int i:arr) {System.out.println(i);}
		// TODO Auto-generated method stub

	}

}
