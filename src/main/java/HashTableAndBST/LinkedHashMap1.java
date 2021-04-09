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
		return "LinkedHashMap{" + linkedList + '}';
	}

//	private final int numBuckets;
//	ArrayList<LinkedlistMap<K,V>> bucketArray;
//	private LinkedlistMap<K,V> linkedList;
//	
//	public LinkedHashMap() {
//		this.numBuckets = 10;
//		this.bucketArray = new ArrayList<>(numBuckets);
//		//create empty LinkedList
//		for (int i = 0; i < numBuckets; i++)
//			this.bucketArray.add(null);
//	}
	
	//This implements hash function to find index for a key
//	private int getBucketIndex(K key) {
//		int hashCode = Math.abs(key.hashCode());
//		int index = hashCode % numBuckets;
//		return index;
//	}
//
//
//	public V get(K key) {
//		int index = this.getBucketIndex(key);
//		LinkedlistMap<K,V> linkedList = this.bucketArray.get(index);
//		if(linkedList == null) return null;
//		MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.search(key);
//		return (mapNode == null) ? null : mapNode.getValue();
//	}
//
//	public void add(K key, V value) {
//		int index = this.getBucketIndex(key);
//		LinkedlistMap<K,V> linkedList = this.bucketArray.get(index);
//		if (linkedList == null)
//			linkedList = new LinkedlistMap<K,V>();
//		    this.bucketArray.set(index, linkedList);
//	MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.search(key);
//	if (mapNode == null) {
//		mapNode = new MapNode<>(key, value);
//		linkedList.append(mapNode);
//	}else {
//		mapNode.setValue(value);
//	}
//}
//	
//	public void remove(K key) {
//		MapNode<K,V> mapNode = this.linkedList.search(key);
//		if (mapNode == null) {
//			System.out.println("Element not found");
//		}else {
//			MapNode<K,V> temp = mapNode.getNext();
//			mapNode.setKey(temp.getKey());
//			mapNode.setValue(temp.getValue());
//			mapNode.setNext(temp.getNext());
//		}
//	}
//	public int getCount(K key) {
//		MapNode<K, V> mapNode =  this.linkedList.search(key);
//		return (int) ((mapNode == null) ? 0 : mapNode.getValue());
//	}
//
//	@Override
//	public String toString() {
//		return "LinkedHashMap List{" + bucketArray + '}';
//	}
}
