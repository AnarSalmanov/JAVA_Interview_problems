package Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareSameIndexesOfArray {
	public static void main(String[] args) {
		int[] a = { 3, 13, 6, 8 };
		int[] b = { 3, 4, 6, 8 };
		System.out.println(Arrays.toString(mathedValues(a, b)));
	}

	/**
	 * Compare 2 arrays elements in same index, if they are matching then create
	 * another array and add those values to that array Note: Arrays should be same
	 * length
	 */

	public static Object[] mathedValues(int[] a, int[] b) {
		ArrayList<Integer> matched = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				matched.add(a[i]);
			}
		}
		return matched.toArray();
	}

}
