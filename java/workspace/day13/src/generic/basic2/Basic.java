package generic.basic2;

public class Basic <K, V>{
	private K key;
	private V value;
	
	public void put(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public V get(K key) {
		return value;
	}
	
	@Override
	public String toString() {
		return "{" + key + "," + value + "}";
	}
}
