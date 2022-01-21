package javaassignment2;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int a=2;
		int begin=0;
		int end=arr.length-1;
		  int mid = (begin + end)/2;  
		   while( begin <= end ){  
		      if ( arr[mid] < a ){  
		        begin = mid + 1;     
		      }else if ( arr[mid] == a ){  
		        System.out.println("found at " + mid);  
		        break;  
		      }else{  
		         end = mid - 1;  
		      }  
		      mid = (begin + end)/2;  
		   }  
		   if ( begin > end ){  
		      System.out.println("Element not found!");  
		   }  
		 }  

	}


