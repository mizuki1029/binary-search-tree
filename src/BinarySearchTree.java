
public class BinarySearchTree {

	public static void main(String[] args) {
		int key = 21;
		Tree tree = new Tree();
		Node answer = tree.search(key);
		System.out.println(answer.getValue());
		System.out.println(tree.lookup(tree.getRoot(), key));
	}

}
