package HashTableAndBST;

public class MapNode<K, V> implements INode<K> {
	K key;
	V value;
	MapNode<K, V> next;

	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override	
	public MapNode<K,V> getNext() {
		return next;
	}
	
	public V getValue() {
		return this.value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	
	public void setNext(MapNode<K,V> next) {
		this.next =  next;
	}

	@Override
	public String toString() {
		StringBuilder mapNodeString = new StringBuilder();
		mapNodeString.append("MapNode{" +"K=").append(key)
		.append(" V=").append(value).append('}');
		if(next != null)
		mapNodeString.append("->").append(next);
		return mapNodeString.toString();
}

	@Override
	public void setNext(INode<K> next) {
		// TODO Auto-generated method stub
		
	}
}
