package examples;

import java.util.LinkedList;

/**
 * Demonstrates how to use a LinkedList in Java.
 * 
 * Stores nodes in 2 parts (data + address)
 * Elements are linked using pointers
 * 
 * 					    Singly Linked List
 * 			 Node			    Node			    Node
 * 		[data | address] -> [data | address] -> [data | address]
 * 
 * 	    			    Doubly Linked List
 * 			       Node			                  Node
 * 		[address | data | address] <-> [address | data | address]
 * 
 * Key properties:
 * - Doubly-linked list implementation of List and Deque interfaces.
 * - Allows fast insertions and deletions at both ends.
 * - Can act as a Stack or Queue because it supports push(), pop(), offer(), poll().
 * 
 * Common operations:
 * add(E e):         Adds an element to the end of the list
 * addFirst(E e):    Adds an element to the beginning
 * addLast(E e):     Adds an element to the end
 * remove():         Removes the first element
 * removeLast():     Removes the last element
 * getFirst():       Returns (but does not remove) the first element
 * getLast():        Returns (but does not remove) the last element
 * indexOf(Object o):Returns index of an element
 * 
 * Real-world use cases:
 * - Playlist navigation (previous/next song)
 * - Undo/Redo systems
 * - Implementing stacks, queues, and deques
 */
public class LinkedLists {

    public static void main(String[] args) {

        System.out.println("=== LinkedList Demonstration ===\n");

        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements (acts like a queue by default — FIFO)
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        list.offer("F");

        System.out.println("Initial LinkedList: " + list);
        System.out.println("First element (peek): " + list.peek());

        // Remove from front (FIFO behavior)
        System.out.println("\nPolling (removing from front): " + list.poll());
        System.out.println("List after poll: " + list);

        // Add element at specific index
        list.add(4, "E");
        System.out.println("\nAdded 'E' at index 4: " + list);

        // Remove specific element
        list.remove("E");
        System.out.println("Removed 'E': " + list);

        // Get index of an element
        System.out.println("\nIndex of 'C': " + list.indexOf("C"));

        // Demonstrate stack-like behavior (LIFO)
        System.out.println("\n--- Using LinkedList as a Stack ---");
        list.push("X");
        list.push("Y");
        System.out.println("After pushing X and Y: " + list);

        System.out.println("Popped element: " + list.pop());
        System.out.println("List after pop 1: " + list);
        
        System.out.println("Popped element: " + list.pop());
        System.out.println("List after pop 2: " + list);

        System.out.println("\nFinal LinkedList: " + list);
    }
}
