import java.util.ArrayList;
import java.util.List;
public class Main {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i ++) list.add(i);
		print(list);
		
		// sort
		list.sort((a, b) -> b - a);

		print(list.subList(10, 10));
		
		List<int[]> list2 = new ArrayList<>();
		list2.add(new int[] {123});
		
		int[][] tmp = list2.toArray(new int[0][]);
		System.out.println(tmp[0][0]);
	}
	
	private static void print(List<?> list) {
		System.out.println(list.toString());
	}
}
