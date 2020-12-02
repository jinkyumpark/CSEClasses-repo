package Lab16;
import Lab16.Lab16_2;
import java.util.Scanner;
import java.util.Arrays;

public class Lab16_2 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		String inStr = stdin.nextLine();
		int[] inNum = acceptInput(inStr);
		int[][] outNum = occurences(inNum);
		for(int i = 0; i < outNum.length; i++) {
			System.out.println(outNum[i][0] + " occurs "+ outNum[i][1] + " times");
		}
		stdin.close();
	}
	
	public static int[] acceptInput(String inStr) {
		inStr += '1';
		int count = 0;
		int inNum = 0;
		while(inStr.charAt(count) != '0' || inStr.charAt(count+1) != '1') {
			if(inStr.charAt(count) == ' ') {
				inNum++;
			}
			count++;
		}
		int[] outList = new int[inNum];
		count = 0;
		
		for(int i = 0; i < inNum; i++) {
			String numStr = "";
			while(inStr.charAt(count) != ' ') {
				numStr += inStr.charAt(count);
				count++;
			}
			outList[i] = Integer.parseInt(numStr);
			count++;
		}
		return outList;
	}
	
	public static int[][] occurences(int[] inList) {
		//find non-duplicate occurence ->
		//create 2-D array to store non-duplicate and occurences ->
		//store non-duplicate occurence
		//store occurences
		
		int numOccurs = 0;
		int[] numOccursArr = new int[inList.length];
		int numOccursCount = 0;
		for(int i = 0; i < inList.length; i++) {
			int count = 0;
			for(int j = 0; j < inList.length; j++) {
				if(inList[i] == numOccursArr[j]) {
					count++;
				}
			}
			if(count == 0) {
				numOccursArr[numOccursCount] = inList[i];
				numOccursCount++;
			}
		}
		Arrays.sort(numOccursArr);
		
		int[][] outList = new int[numOccursCount][2];
		
		for(int i = 0; i < numOccursArr.length; i++) {
			outList[i][0] = numOccursArr[i];
		}
		
		for(int i = 0; i < numOccursArr.length; i++) {
			int count = 0;
			//for(int j = 0; j < inList.length; j++) {
			//	if(numOccursArr[0][i] == inList[j]) {
			//		count++;
			//	
			//}
			outList[i][1] = count;
		}
		return outList;
	}
}
