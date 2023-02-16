

import java.io.*;

class RepeatNMiss {

	static void printTwoElements(int arr[], int size)
	{
		int i;
		System.out.print("The repeating element is ");

		for (i = 0; i < size; i++) {
			int abs_val = Math.abs(arr[i]);
			if (arr[abs_val - 1] > 0)
				arr[abs_val - 1] = -arr[abs_val - 1];
			else
				System.out.println(abs_val);
		}

		System.out.print("and the missing element is ");
		for (i = 0; i < size; i++) {
			if (arr[i] > 0)
				System.out.println(i + 1);
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr[] = { 1,6,2,5,3,5,7 };
		int n = arr.length;
		printTwoElements(arr, n);
	}
}


