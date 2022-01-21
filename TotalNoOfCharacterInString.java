package javaassignment2;

public class TotalNoOfCharacterInString {

	public static void main(String[] args) {
		
		String s="hello world";
		
		System.out.println(s.length());        //using length function(counts white space)
		int count=0;
		for(int i = 0; i < s.length(); i++) {  
            if(s.charAt(i) != ' ')                    //with loop and charAt
                count++;  
        }  
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
