package Lab13;
import Lab13.Lab13_2;

public class Lab13_2 {
	public static boolean isPrime(int num) {
		if(num == 1) {
			return false;
		}else {
			for(int i = 2; i <= num/2; i++) {
				if(num%i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static int[][] twinPrime(int num){
		int[][] twinList = new int[num/2][2];
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(isPrime(i) == true && isPrime(i+2) == true) {
				twinList[count][0] = i;
				twinList[count][1] = i+2;
				count++;
			}
		}
		return twinList;
	}
	
	public static void main(String[] args) {
		int[][] twinPrimeList = twinPrime(1000);
		int count = 0;
		while(twinPrimeList[count][0] != 0) {
			System.out.println("(" + twinPrimeList[count][0] 
					+ "," + twinPrimeList[count][1] + ")");
			count++;
		}
	}
}
