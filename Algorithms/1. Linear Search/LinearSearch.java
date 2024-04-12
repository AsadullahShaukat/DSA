/*
 * The time complexity of linear search is O(n).
 * and the space complexity is O(1).
 */

public class LinearSearch {

	public static int search(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 6, 8, 2, 4, 1, 5, 7, 9, 10, 11 };
		int key = 5;

		int index = search(arr, key);
		if (index != -1) {
			System.out.println(key + " found at index " + index);
		} else {
			System.out.println(key + " not found in the array.");
		}
	}

}
