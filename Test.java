/*
Created by Arazoo Hoseyni on 11/25/2018
 */

package priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

@SuppressWarnings("unused")
public class Test {
    /**
     * main method for output test
     * @param
     * @return
     */
	public static void main(String args[])
	{
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
        for (int i = 1; i < 6; i++) {
            singlyLinkedList.add(i);
        }
        singlyLinkedList.printData();
        for (int i = 7; i < 13; i++) {
            singlyLinkedList.add(i);
        }
        singlyLinkedList.printData();
        singlyLinkedList.printData();
        singlyLinkedList.add(22);
        singlyLinkedList.printData();
        singlyLinkedList.add(21);
        singlyLinkedList.printData();
        System.out.println(singlyLinkedList.size());
        singlyLinkedList.deleteMin();
        singlyLinkedList.printData();
        System.out.println(singlyLinkedList.size());

	}
}
