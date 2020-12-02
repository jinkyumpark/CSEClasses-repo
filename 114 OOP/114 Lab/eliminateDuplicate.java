package Lab14;
import Lab14.Lab14_2;
import java.util.Scanner;

public class Lab14_2 {
	public static void main(String[] args) {
		int inputSize = 10;
		int[] intNum = new int[inputSize];
		int[] sortedNum = new int[inputSize];
		System.out.printf("Enter %d numbers: ", inputSize);
		intNum = inputOneline(inputSize);
		sortedNum = eliminateDuplicate(intNum);
		System.out.print("The distinct numbers are: ");
		for(int i = 0; i < sortedNum.length; i++) {
			System.out.print(sortedNum[i] + " ");
		}
	}

	public static int[] eliminateDuplicate(int[] list) {
		//scan for the duplicate for each num, and create a new array without that num in it.
		int count = 0;
		while(count < list.length) {
			int targetNum = list[count];
			for(int i = count+1; i < list.length; i++) {
				int found = 0;
				int[] newList = new int[list.length];
				if(targetNum == list[i]) {
					outerloop:
					for(int j = 0; j < list.length; j++) {
						if(j == i) {
							found = j;
							break outerloop;
						}
						newList[j] = list[j];
					}
					for(int k = found; k < list.length; k++) {
						newList[k-1] = list[k];
					}
				}
				
				list = newList;
			}
			count++;
		}
		return list;
	}
	public static int[] inputOneline(int inputSize) {
		Scanner stdin = new Scanner(System.in);
		
		String inStr = stdin.nextLine();
		int x[] = new int[inputSize];
		
		char inChar = '0';
		String inNum = "";
		int count = 0;
		
		for(int i = 0; i < inStr.length(); i++) {
			inChar = inStr.charAt(i);
			if(inChar == ' ') {
				x[count] = Integer.parseInt(inNum);
				count++;
				inNum = "";
				continue;
			}
			inNum += inChar;
			if(i == inStr.length()-1) {
				x[count] = Integer.parseInt(inNum);
				break;
			}
		}
		return x;
	}
}
