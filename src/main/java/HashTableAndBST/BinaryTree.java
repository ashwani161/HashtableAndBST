package HashTableAndBST;

public class BinaryTree<K extends Comparable<K>> {
	
	private BinaryNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
		if (current == null)
		return new BinaryNode<>(key);
		int compareResult = key.compareTo(current.key  );
		if (compareResult == 0) return current;
		if (compareResult <0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}
	
	public int getSize() {
		return this.getSizeRecursive(root);
	}
	
	private int getSizeRecursive(BinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
		                               + this.getSizeRecursive(current.right);
	}
	
	public void search(K key) {
		this.root = this.searchRecursively(root, key);
	}
	private BinaryNode<K> searchRecursively(BinaryNode<K> current, K key) {
	    if (current == null) {
	    	return new BinaryNode<>(key);	    } 
	    if (key.compareTo(current.key)==0) {
	    	return current;	    } 
	    return key.compareTo(current.key)<0
	    		? searchRecursively(current.left, key) 
	    	    : searchRecursively(current.right, key);
	}
	
	public BinaryNode<K> getNode() {
		return this.root;
	}
	private int getNodeRecursive(BinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
		                               + this.getSizeRecursive(current.right);
	}
}