package HashTableAndBST;


public class LinkedHashMap1<K, V> {
	private LinkedlistMap<K,V> linkedList;
	
	public LinkedHashMap1() {
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
	public void remove(K key) {
		MapNode<K,V> mapNode = this.linkedList.search(key);
		if (mapNode == null) {
			System.out.println("Element not found");
		}else {
			MapNode<K,V> temp = mapNode.getNext();
			mapNode.setKey(temp.getKey());
			mapNode.setValue(temp.getValue());
			mapNode.setNext(temp.getNext());
		}
	}
	public int getCount(K key) {
		MapNode<K, V> mapNode =  this.linkedList.search(key);
		return (int) ((mapNode == null) ? 0 : mapNode.getValue());
	}
	@Override
	public String toString() {
		return "LinkedHashMap1{" + linkedList + '}';
	}
}
	