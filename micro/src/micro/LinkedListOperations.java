package micro;

import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {
	public static void main(String[] args) {
		/*List<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		System.out.println(ll);

		ll.remove(3);
		System.out.println(ll);*/
		LinkedListOperations obj = new LinkedListOperations();
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		System.out.println(ll.get(0));
		obj.Delete(ll.get(0));
	}

	// 0, 1, 2, 3, 4, 5 = 6
	// 1, 2, 3, 4, 5, 6
	// remove position 4
	// 1, 2, 3, 5, 6
	Node Delete(Node head) {
		
	}
}
