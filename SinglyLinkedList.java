/*
Created by Arazoo Hoseyni on 11/25/2018
 */

package priorityqueue;

public class SinglyLinkedList<T extends Comparable<T>> {

	// head of the list
	private Node<T> head;

	public SinglyLinkedList() {
		this.head = new Node<T>();
	}

    /**
     * add an element to the priority queue
     * @param T data
     * @return
     */
	public void add(T data) {
		Node<T> node = head;
		Node<T> insNode = new Node<T>();
		insNode.data = data;
		while (null != node && null != node.next) {
			if (node.next.lower(insNode)) {
				insNode.next = node.next;
				node.next = insNode;
				break;
			}
			node = node.next;
		}
		if (null != node && null == node.next) {
			if (null == node.next) {
				node.next = insNode;
			}
		}
	}

    /**
     * delete the element with minimum priority
     * @param
     * @return
     */
	public void deleteMin() {
		Node<T> node = head;
		while (null != node && null != node.next) {
			if (node.next.next != null) {
				node = node.next;
			} else {
				node.next = null;
				break;
			}
		}
	}

    /**
     * get size of the priority queue
     * @param
     * @return int
     */
	public int size() {
		int length = 0;
		if (null != head) {
			Node<T> node = head;
			while (null != node.next) {
				length++;
				node = node.next;
			}
		}
		return length;
	}

    /**
     * Scan all of the list and print datas
     * @param
     * @return
     */
	public void printData() {
		Node<T> node = this.head;
		while (null != node.next) {
			System.out.print(node.next.data + "-->");
			node = node.next;
		}
		System.out.println();
	}
}