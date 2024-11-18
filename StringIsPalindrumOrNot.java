package test2;

public class StringIsPalindrumOrNot {

	public static void main(String[] args) {
		String s = "noon";
		System.out.println(s);
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--)
			s1 = s1 + s.charAt(i);
		System.out.println(s + s1 + "\n");
		if (s1.equals(s))
			System.out.println("This is a polindrom");
		else
			System.out.println("This is not a polindrom");

	}

}
