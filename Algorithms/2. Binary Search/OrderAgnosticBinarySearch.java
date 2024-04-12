/*
 * Order agnostic binary search is a variation of the binary search algorithm that can be used to search for a target element in a sorted array, regardless of whether the array is sorted in ascending or descending order. 
 */

public class OrderAgnosticBinarySearch {

	public static int agnosticBS(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;

		boolean isAsc = false;
		if (arr[start] < arr[end]) {
			isAsc = true;
		}

		while (start <= end) {
			int mid = start + ((end - start) / 2);

			if (key == arr[mid]) {
				return mid;
			}

			if (isAsc) {
				if (key < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (key > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1; // Return -1 if key is not found
	}

	public static void main(String[] args) {
		int arr[] = { 11, 10, 9, 8, 7, 6, 5, 4, 4, 3, 2, 1}; // Array sorted in descending order
		int key = 5;

		int index = agnosticBS(arr, key);

		if (index != -1) {
			System.out.println(key + " found at index " + index);
		} else {
			System.out.println(key + " not found in the array.");
		}
	}

}
