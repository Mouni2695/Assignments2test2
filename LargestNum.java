package test2;

public class LargestNum {

	public static void main(String[] args) {
		int[] a = { 10, 50, 60, 80, 5, 100 };
		// largest num
		// System.out.println(a);
		int ln = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > ln) {
				ln = a[i];
			}
		}
		System.out.println("The largest num is : " + ln);
		// smallest num
		int sn = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < sn) {
				sn = a[i];
			}
		}
		System.out.println("The smallest num is : " + sn);
	}

}
