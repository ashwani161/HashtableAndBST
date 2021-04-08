package HashTableAndBST;

import java.util.ArrayList;

public class LinkedHashMap<K, V> {
	private final int numBuckets;
	ArrayList<LinkedlistMap<K,V>> bucketArray;
	
	public LinkedHashMap() {
		this.numBuckets = 10;
		this.bucketArray = new ArrayList<>(numBuckets);
		//create empty LinkedList
		for (int i = 0; i < numBuckets; i++)
			this.bucketArray.add(null);
	}
	
	//This implements hash function to find index for a key
	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		return index;
	}


	public V get(K key) {
		int index = this.getBucketIndex(key);
		LinkedlistMap<K,V> linkedList = this.bucketArray.get(index);
		if(linkedList == null) return null;
		MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.search(key);
		return (mapNode == null) ? null : mapNode.getValue();
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		LinkedlistMap<K,V> linkedList = this.bucketArray.get(index);
		if (linkedList == null)
			linkedList = new LinkedlistMap<K,V>();
		    this.bucketArray.set(index, linkedList);
	MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.search(key);
	if (mapNode == null) {
		mapNode = new MapNode<>(key, value);
		linkedList.append(mapNode);
	}else {
		mapNode.setValue(value);
	}
}
	
	@Override
	public String toString() {
		return "LinkedHashMap List{" + bucketArray + '}';
	}
}
