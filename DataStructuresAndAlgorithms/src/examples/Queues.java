package examples;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Demonstrates how to use a Queue in Java.
 * 
 * Key properties:
 * - FIFO (First-In, First-Out)
 * - Elements are added to the rear and removed from the front.
 * 
 * Common operations:
 * offer(E e):  Adds an element to the end of the queue (enqueue)
 * poll():      Removes and returns the head of the queue (dequeue)
 * peek():      Returns the head without removing it
 * isEmpty():   Checks if the queue is empty
 * size():      Returns the number of elements in the queue
 * contains():  Checks if an element exists in the queue
 * 
 * Real-world use cases:
 * - Keyboard buffer (characters typed in order)
 * - Printer queue (print jobs processed in order)
 * - Breadth-First Search (BFS) traversal in graphs
 */
public class Queues {

    public static void main(String[] args) {

        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        System.out.println("=== Queue Demonstration ===\n");

        // Enqueue elements (add to rear)
        queue.offer("Ethan");
        queue.offer("Maggie");
        queue.offer("Crew");
        queue.offer("Pierce");

        System.out.println("Initial queue: " + queue);

        // Peek at the front element
        System.out.println("Peek (front of queue): " + queue.peek());

        // Dequeue two elements (remove from front)
        System.out.println("\nPolling elements...");
        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());

        System.out.println("\nQueue after polling two elements: " + queue);
        System.out.println("Next element at front (peek): " + queue.peek());

        // Check if queue contains a specific element
        System.out.println("\nDoes the queue contain 'Crew'? " + queue.contains("Crew"));
        System.out.println("Does the queue contain 'Ethan'? " + queue.contains("Ethan"));

        // Display size
        System.out.println("\nCurrent queue size: " + queue.size());

        // Empty the queue completely
        while (!queue.isEmpty()) {
            System.out.println("Dequeuing: " + queue.poll());
        }

        System.out.println("\nQueue is empty: " + queue.isEmpty());
    }
}
