package Lab18;
import Lab18.Lab18_1;

public class Lab18_1 {
	public static void main(String[] args) {
		System.out.println("Generating radom numbers between 0-9...");
		int[] randomInt100 = generateRandomInt(100);
		int[] countInt = countInt(randomInt100, 10);
		for(int i = 0; i < 10; i++) {
			System.out.print(i + ": " + countInt[i]);
			if(i != 9) {
				System.out.print(", ");
			}
		}
	}
	
	public static int[] generateRandomInt(int numInt) {
		int[] outArr = new int[numInt];
		for(int i = 0; i < numInt; i++) {
			outArr[i] = (int)(Math.random()*10);
		}
		return outArr;
 	}
	
	public static int[] countInt(int[] inArr, int numTill) {
		//initialize return array to 0
		int[] outArr = new int[numTill];
		for(int i = 0; i < numTill; i++) {
			outArr[i] = 0;
		}
		
		//store count for each numbers
		for(int i = 0; i < inArr.length; i++) {
			for(int j = 0; j < numTill; j++) {
				if(inArr[i] == j) {
					outArr[j] += 1;
				}
			}
		}
		return outArr;
	}
}
