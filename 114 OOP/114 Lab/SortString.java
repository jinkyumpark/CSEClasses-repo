package Lab8;
import Lab8.Lab8_2;
import java.util.Scanner;
import java.util.Arrays;

public class Lab8_2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Enter three cities and we'll show them in asending order.");
		
		String f1City = stdIn.nextLine();
		String s2City = stdIn.nextLine();
		String t3City = stdIn.nextLine();
		
		char f1char = f1City.charAt(0);
		char s2char = s2City.charAt(0);
		char t3char = t3City.charAt(0);
		
		char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 
				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		char[] alphabet_lower = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
				'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int f1int = Arrays.binarySearch(alphabet, f1char);
		int s2int = Arrays.binarySearch(alphabet, s2char);
		int t3int = Arrays.binarySearch(alphabet, t3char);
		
		//Case where the alphabets are the same
		int i = 1;
		int j = 1;
		int k = 1;
		while(f1int == s2int) {
			f1int = Arrays.binarySearch(alphabet_lower, f1City.charAt(i));
			s2int = Arrays.binarySearch(alphabet_lower, s2City.charAt(i));
			i++;
		}
		while(f1int == t3int) {
			f1int = Arrays.binarySearch(alphabet_lower, f1City.charAt(j));
			t3int = Arrays.binarySearch(alphabet_lower, t3City.charAt(j));
			j++;
		}
		while(s2int == t3int) {
			s2int = Arrays.binarySearch(alphabet_lower, s2City.charAt(k));
			t3int = Arrays.binarySearch(alphabet_lower, t3City.charAt(k));
			k++;
		}
		
		//Sort Cities by order
		
		if(f1int > s2int && f1int > t3int) {
			if(s2int > t3int) {
				System.out.println(t3City + ", " + s2City + ", " + f1City);
			}else {
				System.out.println(s2City + ", " + t3City + ", " + f1City);
			}
		}else if(s2int > f1int && s2int > t3int) {
			if(f1int > t3int) {
				System.out.println(t3City + ", " + f1City + ", " + s2City);
			}else {
				System.out.println(f1City + ", " + t3City + ", " + s2City);
			}
		}else if(t3int > f1int && t3int > s2int){
			if(f1int > s2int) {
				System.out.println(s2City + ", " + f1City + ", " + t3City);
			}else {
				System.out.println(f1City + ", " + s2City + ", " + t3City);
			}
		}
	}
}
