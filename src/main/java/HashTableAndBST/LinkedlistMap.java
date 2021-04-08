package HashTableAndBST;

public class LinkedlistMap<K,V> {
	public MapNode<K,V> head;
	public MapNode<K,V> tail;

	public LinkedlistMap() {
		this.head = null;
		this.tail = null;
	}

	public void add(MapNode<K,V> newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}else {
			MapNode<K,V> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
		
	}
	
	public void append(MapNode<K,V> node) {
		if(this.head == null) {
			this.head = node;
		}
		if(this.tail == null) {
			this.tail = node;
		}else {
			this.tail.setNext(node);
			this.tail = node;
		}
	}
	
	public MapNode<K,V> pop() {
		MapNode<K,V> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	
	public MapNode<K,V> search(K key) {
		MapNode<K,V>  tempNode = this.head;
		while (tempNode !=null && tempNode.getNext() !=null) {
			if(tempNode.getKey().equals(key))
				return tempNode;
			tempNode = tempNode.getNext();
	}
				return null;
	}
	
	public void printNodes() {
		System.out.println("Nodes: " + head);
	}

	@Override
	public String toString() {
		return "LinkedListNodes{" + head + '}';
	}
}

