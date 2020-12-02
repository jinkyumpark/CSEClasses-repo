package Lab17;
import Lab17.Lab17_2;
import java.util.Scanner;

public class Lab17_2 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a 3-by-3 matrix row by row: ");
		double[][] m = new double[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				m[i][j] = stdin.nextDouble();
			}
		}
		boolean isMarkov = isMarkovMatrix(m);
		if(isMarkov == true) {
			System.out.println("It is a Markov matrix");
		}else {
			System.out.println("It is not a Markov matrix");
		}
	}
	
	public static boolean isMarkovMatrix(double[][] m) {
		//check whether each element is positive
		boolean count = true;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				if(m[i][j] <= 0) {
					count = false;
				}
			}
		}
		//check whether each column is summed up to 1
		for(int i = 0; i < m.length; i++) {
			double sum = 0;
			for(int j = 0; j < m[0].length; j++) {
				sum += m[j][i];
			}
			if(sum != sum) {
				count = false;
			}
		}
		
		return count;
	}
}
