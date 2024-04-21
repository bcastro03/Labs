import java.util.Arrays;

public class Lab1 {

	static int[] findthesum(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}

			}
		}
		return new int[] { -1 };
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 8, 9};

		System.out.print(Arrays.toString(findthesum(arr, 17)));
	}

}
