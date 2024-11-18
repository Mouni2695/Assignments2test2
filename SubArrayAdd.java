package test2;

public class SubArrayAdd {

	public static void main(String[] args) {
		int[] a = { 1, 5, 7, 3, 6, 8, 4 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] + a[j]) == 12)
					System.out.print(a[i] + "," + a[j] + "  ");
			}

		}

	}

}
