package HashTableAndBST;

public class HashMaps<K, V> {
	private LinkedlistMap<K,V> linkedList;
	
	public HashMaps() {
		this.linkedList= new LinkedlistMap<>();
	}

	public V get(K key) {
		MapNode<K, V> mapNode =  this.linkedList.search(key);
		return (mapNode == null) ? null : mapNode.getValue();
	}
	
	public void add(K key, V value) {
		MapNode<K,V> mapNode = this.linkedList.search(key);
		if (mapNode == null) {
			mapNode = new MapNode<>(key, value);
			this.linkedList.append(mapNode);
		}else {
			mapNode.setValue(value);
		}
	}
	
	@Override
	public String toString() {
		return "HashMapNodes{" + linkedList + '}';
	}

}
	
//	public static void main(String[] args) {
//		System.out.println("Welcome to HashTable and Binary Tree");
//	}

