
public class Node {
	int key;
	String value;
	Node left;
	Node right;
	
	public Node() {
		this.left = null;
		this.right = null;
		this.key = 0;
		this.value = "0";
	}
	public Node(Node left, Node right, int key, String value) {
		this.left = left;
		this.right = right;
		this.key = key;
		this.value = value;
	}
	public int getKey() {
		return this.key;
	}
	public String getValue() {
		return this.value;
	}
	public Node getLeft() {
		return this.left;
	}
	public Node getRight() {
		return this.right;
	}
}
