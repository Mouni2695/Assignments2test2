package test2;

public class ReplaceCharacters2 {

	public static void main(String[] args) {
		String s = "The weather is veryy cool here";
		System.out.println(s);
		String s1 = s.replace("yy", "@");
		String s2 = s1.replace("oo", "@");
		System.out.println(s2);
	}
}
