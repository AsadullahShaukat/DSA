import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choose = 0, num = 0;
		boolean b = false;
		Array arr = new Array();

		while (choose != -1) {
			System.out.println("Choose: ");
			System.out.println("Enter 1 to insert at last.");
			System.out.println("Enter 2 to delete at last.");
			System.out.println("Enter 3 to get peek element.");
			System.out.println("Enter 4 to check if array is empty ot not.");
			System.out.println("Enter 5 to print the array.");
			System.out.println("Enter -1 to quit.");
			choose = sc.nextInt();

			switch (choose) {
			case -1: {
				break;
			}
			case 1: {
				System.out.print("Enter number: ");
				num = sc.nextInt();
				arr.insert(num);
				System.out.println(num + " inserted.\n");
				break;
			}
			case 2: {
				num = arr.remove();
				if (num == -1) {
					System.out.println("Array is empty.\n");
				} else {
					System.out.println(num + " removed.\n");
				}
				break;
			}
			case 3: {
				num = arr.peek();
				if (num == -1) {
					System.out.println("Array is empty.\n");
				} else {
					System.out.println("Peak element: " + arr.peek() + "\n");
				}
				break;
			}
			case 4: {
				if (arr.isEmpty()) {
					System.out.println("Array is empty.\n");
				} else {
					System.out.println("Array is not empty.\n");
				}
				break;
			}
			case 5: {
				b = arr.print();
				if (!b) {
					System.out.println("Array is empty.\n");
				}
				break;
			}
			default:
				System.out.println("Invalid entry.\n");
				break;
			}
		}
		sc.close();
	}

}
