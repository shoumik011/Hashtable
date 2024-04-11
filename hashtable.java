class HashTable {
	private static final int T_SIZE = 10000019;
	private Node[] table;

	private class Node {
		long keys;
		long[] values;
		Node next;

		Node(long key, long[] values) {
			this.keys = key;
			this.values = values;
			this.next = null;
		}
	}

	public HashTable() {
		table = new Node[T_SIZE];
	}

	private int hash(long key) {
		int hashV = (int) (key % T_SIZE);
		return hashV < 0 ? hashV + T_SIZE : hashV;
	}

	public void insert(long key, long[] values) {
		int hashVal = hash(key);
		Node newNode = new Node(key, values);
		if (table[hashVal] == null) {
			table[hashVal] = newNode;
		} else {
			Node current = table[hashVal];
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public long[] lookup(long key) {
		int hashVal = hash(key);
		Node current = table[hashVal];
		while (current != null) {
			if (current.keys == key) {
				return current.values;
			}
			current = current.next;
		}
		return null;
	}
}

// TODO: implement your own HashTable class

public class A3Q2 {

	private static final int R = 50;
	private static final int T_SIZE = 10301;

	public static long solve(int A, int B, int C, int D, int E, int S) {

		HashTable T = new HashTable(T_SIZE);

		for (int x1 = -R; x1 <= R; x1++) {
			for (int x2 = -R; x2 <= R; x2++) {
				int sum = A * x1 + B * (int) Math.pow(x2, 2);
				T.put(sum, T.getOrDefault(sum, 0) + 1);
			}
		}

		long count = 0;
		for (int x3 = -R; x3 <= R; x3++) {
			for (int x4 = -R; x4 <= R; x4++) {
				for (int x5 = -R; x5 <= R; x5++) {
					int sum = C * (int) Math.pow(x3, 3) + D * (int) Math.pow(x4, 4) + E * (int) Math.pow(x5, 5);
					count += T.getOrDefault(S - sum, 0);
				}
			}
		}

		return count;
	}

	private static class HashTable {
		private final Node[] nodes;

		public HashTable(int size) {
			nodes = new Node[size];
		}

		public void put(int key, int value) {
			int index = getIndex(key);
			for (Node node = nodes[index]; node != null; node = node.next) {
				if (node.key == key) {
					node.value = value;
					return;
				}
			}
			nodes[index] = new Node(key, value, nodes[index]);
		}

		public int getOrDefault(int key, int defaultValue) {
			int index = getIndex(key);
			for (Node node = nodes[index]; node != null; node = node.next) {
				if (node.key == key) {
					return node.value;
				}
			}
			return defaultValue;
		}

		private int getIndex(int key) {
			return (key % nodes.length + nodes.length) % nodes.length;
		}

		private static class Node {
			int key;
			int value;
			Node next;

			Node(int key, int value, Node next) {
				this.key = key;
				this.value = value;
				this.next = next;
			}
		}
	}

	public static void main(String[] args) {

		// Below are a few test cases.
		// Printing "true" means the return value is correct.
		// Each call to solve() must take less than 5 seconds.

		System.out.println(340 == solve(12, 34, 56, 78, 9, 10));
		System.out.println(16665 == solve(20, -11, -2, 0, 11, -2011));
		System.out.println(10510100501L == solve(0, 0, 0, 0, 0, 0));
	}
}
