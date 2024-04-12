package dataStructures;

public class Array {
	private int[] arr;
	private int last;

	public Array() {
		last = 0;
		arr = new int[10];
	}

	public boolean isEmpty() {
		return last == 0;
	}

	public int peek() {
		if (isEmpty())
			return -1;
		return arr[last - 1];
	}

	public void insert(int num) {
		arr[last++] = num;
		if (last == arr.length) { // size increment of the array
			int[] temp = new int[last + 10];
			for (int i = 0; i < last; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
		}
	}

	public int remove() {
		if (!isEmpty()) {
			last--;
			return arr[last];
		}
		return -1;
	}

	public boolean print() {
		if (!isEmpty()) {
			System.out.print("Array: ");
			for (int i = 0; i < last; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("\n");
			return true;
		}
		return false;
	}

}
