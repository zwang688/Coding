import java.util.*;
public class SegmentTree {
	int size;
	int[] tree, nums;
	
	public SegmentTree(int[] nums) {
		size = nums.length;
		tree = new int[size * 2 - 1];
		this.nums = nums;
		construct(nums, 0, size - 1, 0);
	}
	
	private int construct(int[] nums, int left, int right, int root) {
		if(left == right) {
			tree[root] = nums[left];
			return tree[root];
		}
		
		int mid = left + (right - left) / 2;
		tree[root] = construct(nums, left, mid, root * 2 + 1) +
				     construct(nums, mid + 1, right, root * 2 + 2);
		return tree[root];
	}
	
	public void update(int index, int value) {
		if(index >= size || index < 0) {
			System.out.println("Wrong index " + index + ", no updates.");
			return;
		}
		
		int diff = value - nums[index];
		if(diff != 0) {
			nums[index] = value;
			update(0, size - 1, index, diff, 0);
		}
	}
	
	public void update(int left, int right, int index, int change, int root) {
		while(left < right) {
			tree[root] += change;
			int mid = left + (right - left) / 2;
			if(index <= mid) {
				right = mid;
				root = root * 2 + 1;
			} else {
				left = mid + 1;
				root = root * 2 + 2;
			}
		}
		tree[root] += change;
		
	}
	
	public int query(int a, int b) {
		if(a < 0 || b >= size || a > b) {
			System.out.println("In valid query with (" + a + "," + b + ").");
			return -1;
		}
		return query(0, size - 1, a, b, 0);
	}
	
	private int query(int left, int right, int a, int b, int root) {
		if(a <= left && b >= right) return tree[root];
		
		if(a > right || b < left) return 0;
		
		int mid = left + (right - left) / 2;
		return query(left, mid, a, b, root * 2 + 1) +
				query(mid + 1, right, a, b, root * 2 + 2);
	}
	
	private void print() {
		int count  = 1, remain = count;
		for(int i = 0; i < tree.length; i ++) {
			System.out.print("\t" + tree[i]);
			remain --;
			if(remain == 0) {
				count *= 2;
				remain = count;
				System.out.println();
			}
		}

		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] tmp = {0, 1, 2, 3, 4, 5, 6};
		SegmentTree tree = new SegmentTree(tmp);
		tree.print();
		
		tree.update(0, 10);
		tree.print();
		

		for(int i = 0; i < tmp.length; i ++) {
			for(int j = i; j < tmp.length; j ++) {
				System.out.println(i + " " + j + ":" + tree.query(i, j));
			}
		}
	}
}
