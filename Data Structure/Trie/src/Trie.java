
public class Trie {
	private class TrieNode {
		TrieNode[] children;
		boolean isEnd;
		char c;
		
		TrieNode() {
			children = new TrieNode[26];
		}
		
		public boolean isEnd() {
			return isEnd;
		}
		
		public TrieNode get(char c) {
			return children[c - 'a'];
		}
		
		public void set(char c, TrieNode node) {
			children[c - 'a'] = node;
		}
		
		public void setEnd() {
			isEnd = true;
		}
	}
	
	
	TrieNode root;
	Trie() {
		root = new TrieNode();
	}
	
	public void insert(String s) {
		TrieNode current = root;
		for(char c: s.toCharArray()) {
			if(current.get(c) == null) current.set(c, new TrieNode());
			current = current.get(c);
		}
		current.setEnd();
	}
	
	private TrieNode findNode(String s) {
		TrieNode current = root;
		for(char c: s.toCharArray()) {
			if(current.get(c) == null) return null;
			current = current.get(c);
		}
		return current;
	}
	
	public boolean search(String s) {
		TrieNode tmp = findNode(s);
		return tmp != null && tmp.isEnd();
	}
	
	public boolean prefix(String s) {
		return findNode(s) != null;
	}
	
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("apple");
		System.out.println(trie.search("apple") + " " + true);
		System.out.println(trie.prefix("app") + " " + true);
		System.out.println(trie.search("app") + " " + false);
		trie.insert("app");
		System.out.println(trie.search("apple") + " " + true);
		System.out.println(trie.prefix("app") + " " + true);
		System.out.println(trie.search("app") + " " + true);
		System.out.println(trie.prefix("bpp") + " " + false);
	}
}
