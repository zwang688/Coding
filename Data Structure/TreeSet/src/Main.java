import java.util.*;
public class Main {
	public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(new Comparator<>() {
        	public int compare(Integer a, Integer b) {
        		return b - a;
        	}
        });
        set.add(1);
        set.add(2);
        System.out.println(set.lower(1));
        System.out.println(set.floor(1));
        print(set);
    }
    
    private static void print(Set<Integer> set) {
        for(int i: set) System.out.print(i + " ");
        System.out.println();
    }
}
