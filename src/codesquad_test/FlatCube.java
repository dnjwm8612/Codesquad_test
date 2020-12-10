package codesquad_test;

public class FlatCube {
	Cube cube;
	char cubeArray[][];

	public FlatCube() {
		cube = new Cube();
		this.cubeArray = cube.getCube();
	}

	public void reverse(int firstElement, int start, int end) {
		char temp;
		end = end - 1;
		while (start < end) {
			temp = cubeArray[firstElement][start];
			cubeArray[firstElement][start] = cubeArray[firstElement][end];
			cubeArray[firstElement][end] = temp;
			start++;
			end--;
		}
	}

	public void shiftRight(int firstElement, int start, int end) {
		/*
		 * if (num > length) { num = num - length; }
		 */

		reverse(firstElement, start, end - 1);
		reverse(firstElement, start, end);
	}

	public void shiftLeft(int firstElement, int start, int end) {
		/*
		 * if (num > length) { num = num - length; }
		 */

		reverse(firstElement, start + 1, end);
		reverse(firstElement, start, end);
	}

	public void cubePrint() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 2) {
					System.out.println(cubeArray[i][j]);
				} else {
					System.out.print(cubeArray[i][j] + " ");
				}
			}
		}
	}

	public char[][] elementExtraction(int element) { // 1차원 배열로 구현시 좌측 세로 라인은 %2 =0, 우측 세로 라인은 %2 = 2
		char temp[][] = new char[1][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == element) {
					temp[0][i] = cubeArray[i][j];
				}
			}
		}
		return temp;
	}

}
