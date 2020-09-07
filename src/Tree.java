
public class Tree {
	private Node root;
	private Node node2;
	private Node node3;
	private Node node4;
	private Node node5;
	public Tree() {
		
		this.node3 = new Node(null, null, 21, "node3");
		this.node4 = new Node(null, null, 2, "node4");
		this.node5 = new Node(null, null, 7, "node5");
		this.node2 = new Node(node4, node5, 5, "node2");
		this.root = new Node(node2, node3, 13, "root");
	}
	
	public Node getRoot() {
		return this.root;
	}
	
	public Node search(int key) {
		Node node = this.root;
		System.out.println("rootのkeyは"+node.key);
		while(node!=null) {
			if(key == node.key) {
				System.out.println("見つかった");
				return node;
			}else if(key<node.key) {
				System.out.println("keyの方が小さい．左のNode:"+node.left);
				node = node.left;
			}else {
				System.out.println("keyの方が大きい．右のNode:"+node.right);
				node = node.right;
			}
		}
		return null;
	}
	
	public boolean lookup(Node node, int data) {
		if(node == null) return false;
		if(node.key == data) {
			return true;
		}else if(data<node.key) {
			return lookup(node.left, data);
		}else {
			return lookup(node.right, data);
		}
	}
}
