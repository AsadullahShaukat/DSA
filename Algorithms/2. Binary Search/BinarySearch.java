/*
 * The time complexity of binary search is O(n).
 * and the space complexity is O(1).
 */

import java.util.Arrays;

public class BinarySearch {

	public static int simpleBS(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + ((end - start) / 2);

			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1; // Return -1 if key is not found
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 6, 8, 2, 4, 1, 5, 7, 9, 11, 10 };
		int key = 5;

		Arrays.sort(arr); // // Sort array for binary search
		// Sorted array:  [1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11]
		
		System.out.println("Sorted array: " + Arrays.toString(arr));

		int index = simpleBS(arr, key);

		if (index != -1) {
			System.out.println(key + " found at index " + index);
		} else {
			System.out.println(key + " not found in the array.");
		}
	}

}
