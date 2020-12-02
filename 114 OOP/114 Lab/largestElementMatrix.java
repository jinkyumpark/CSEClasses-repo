package Lab21;
import Lab21.Lab21_1;

public class Lab21_1 {
	public static void main(String[] args) {
		int[][] randomMatrix = createMatrix(4, 4);
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(randomMatrix[i][j]);
				if(j == 3) {
					System.out.println();
				}
			}
		}
		int largestRow = findLargest(true, randomMatrix);
		int largestCol = findLargest(false, randomMatrix);
		System.out.println("The largest row index: " + largestRow);
		System.out.println("The largest column index: " + largestCol);
	}
	
	public static int[][] createMatrix(int row, int col){
		int[][] outMatrix = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				outMatrix[i][j] = (int)(Math.random() * 2);
			}
		}
		return outMatrix;
	}

	public static int findLargest(boolean isRaw, int[][] targetMatrix) {
		//col(row), num of 1s
		int[] largest = {0, 0};
		if(isRaw == true) {
			for(int i = 0; i < targetMatrix.length; i++) {
				int count = 0;
				for(int j = 0; j < targetMatrix[0].length; j++) {
					if(targetMatrix[i][j] == 1) {
						count++;
					}
				}
				if(largest[1] < count) {
					largest[0] = i;
					largest[1] = count;
				}
			}
		}else {
			for(int j = 0; j < targetMatrix.length; j++) {
				int count = 0;
				for(int i = 0; i < targetMatrix[0].length; i++) {
					if(targetMatrix[i][j] == 1) {
						count++;
					}
				}
				if(largest[1] < count) {
					largest[0] = j;
					largest[1] = count;
				}
			}

		}
		return largest[0];
	}
}
