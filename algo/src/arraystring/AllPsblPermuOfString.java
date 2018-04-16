package arraystring;

public class AllPsblPermuOfString {

	
	public static void permutate(String s) {
		if(s == null || s.length() == 0) {
			return;
		}
		permutate(s.toCharArray(), 0);
	}
	private static void permutate(char[] str, int start) {
		if(start >= str.length) {
			System.out.println(new String(str));
			return;
		}
		for(int i = start; i < str.length; i++) {
			swap(str, i, start);
			permutate(str, start+1);
			swap(str, i, start);
		}
	}
	private static void swap(char[] input, int i, int j) {
		char c = input[i];
		input[i] = input[j];
		input[j] = c;
	}
	
	public static void main (String args[]){
		permutate("1234");
	}
}




