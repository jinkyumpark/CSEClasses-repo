import java.util.ArrayList;
import java.util.Scanner;

public class TwinPrime{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		int twinPrimeTill = stdin.nextInt();

		int[][] twinPrime = twinPrime(twinPrimeTill);

		for(int i = 0; i < twinPrime.length; i++){
			System.out.println("(" + twinPrime[i][0] + ", " + twinPrime[i][1] + ")");
		}
		stdin.close();
	}

	public static boolean isPrime(int num){
		int numHalf = num/2;
		for(int i = 2; i < numHalf; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}

	public static int[][] twinPrime(int num){
		int count = 0;
		int[][] twinPrime = new int[num][2];
		ArrayList<Integer> prime = new ArrayList<>();
		for(int i = 1; i < num; i++){
			if(isPrime(i) == true){
				prime.add(i);
			}
		}
		for(int i = 0; i < prime.size(); i++){
			if(prime.get(i)+2 == prime.get(i+1)){
				twinPrime[count][0] = prime.get(i);
				twinPrime[count][1] = prine.get(i+1);
				count++;
			}
		}
		return twinPrime;
	}
}
