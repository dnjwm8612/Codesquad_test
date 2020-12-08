package codesquad_test;

public class WordShift {
	public void reverse(char arr[], int start, int end) {
		char temp;
		end = end - 1;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public void shiftRight(char arr[], int d, int n) {
		if (d > n) {
			d = d - n;
		}
		reverse(arr, 0, n - d);
		reverse(arr, n - d, n);
		reverse(arr, 0, n);
	}

	public void shiftLeft(char arr[], int d, int n) {
		if (d > n) {
			d = d - n;
		}
		reverse(arr, 0, d);
		reverse(arr, d, n);
		reverse(arr, 0, n);
	}

	public boolean isRange(int number) {
		boolean result = false;
		if ((-100 <= number) && (number <= 100)) {
			result = true;
		}
		return result;
	}

	public int isShift(int num, String direction) {
		if (direction.equals("r"))
			num *= 1;
		else
			num *= -1;
		return num;
	}
}
