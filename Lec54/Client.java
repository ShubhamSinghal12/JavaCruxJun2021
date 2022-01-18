package Lec54;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		t.insert("ram");
		t.insert("ravi");
		t.insert("apple");
		t.insert("app");
		t.insert("rahul");
		
		System.out.println(t.search("a"));
		System.out.println(t.noOfPrefix("ra"));

	}

}
