package test2;

public class CompareStrings {

	public static void main(String[] args) {
        
		String s1="Java";
		String s2="Developer";
		String s3="Java";
		
		System.out.println("S1 : "+s1);
		System.out.println("S2 : "+s2);
		System.out.println(s1.equals(s2));
		
		if(s1==s3)
			System.out.println("These two strings are equal");
		else
			System.out.println("These two strings are not equal");
	      
	}

}
