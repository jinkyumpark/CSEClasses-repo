package Lab12;
import Lab12.Lab12_1;
import java.util.Scanner;

public class Lab12_1 {
	public static void displayPattern(int n) {
		int space = n;
		for(int i = 1; i <= n; i++) {
			for(int j = space; j > i; j--) {
				System.out.print("   ");
			}
			for(int k = i; k <= i && k > 0; k--) {
				System.out.print(k + "  ");
			}
			//System.out.print(i);
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int patternInt = stdin.nextInt();
		displayPattern(patternInt);
	} 
}
