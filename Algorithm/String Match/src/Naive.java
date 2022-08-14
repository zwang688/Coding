import java.util.*;
public class Naive {
	// Implementation of naive string matching
	// Check possible match at each position
	// Time complexity is O((n - m + 1) m)
	private static List<Integer> naive(String text, String pattern) {
		List<Integer> res = new ArrayList<>();
		for(int i = 0; i < text.length() - pattern.length() + 1; i ++) {
			boolean check = true;
			for(int j = 0; j < pattern.length() && check; j ++) {
				check = check && text.charAt(i + j) == pattern.charAt(j);
			}
			if(check) res.add(i);
		}
		return res;
	}
	
	private static void print(List<Integer> list) {
		if(list.isEmpty()) System.out.println("Empty list");
		else {
			for(int i: list) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String[] text = {"AAAAAAAAAA","AAAAAAAAAA", "ABCDABCD"}, pattern = {"AAA", "ABC", "ABCD"};
		for(int i = 0; i < text.length; i ++) {
			System.out.println(text[i] + " " + pattern[i]);
			print(naive(text[i], pattern[i]));
		}
	}
}
