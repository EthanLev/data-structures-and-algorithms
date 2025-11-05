package examples;

import java.util.*;

/**
 * Demonstrates how to use a PriorityQueue in Java.
 * 
 * Key properties:
 * - Elements are ordered based on their natural ordering (or a custom Comparator).
 * - The head of the queue is the smallest (or highest priority) element.
 * - Not strictly FIFO — order depends on priority.
 * 
 * Common operations:
 * offer(E e):  Adds an element to the queue
 * poll():      Removes and returns the head (highest priority element)
 * peek():      Returns (but does not remove) the head element
 * isEmpty():   Checks if the queue is empty
 * size():      Returns the number of elements
 * contains():  Checks if an element exists in the queue
 * 
 * Real-world use cases:
 * - Task scheduling (higher priority tasks first)
 * - Pathfinding algorithms (like Dijkstra’s)
 * - Event-driven simulations
 */
public class PriorityQueues {

    public static void main(String[] args) {

        System.out.println("=== PriorityQueue Demonstration ===\n");

        // Create a PriorityQueue (natural ordering by default)
        Queue<Integer> queue = new PriorityQueue<>();

        // Add elements (not in sorted order)
        queue.offer(50);
        queue.offer(20);
        queue.offer(40);
        queue.offer(10);
        queue.offer(30);

        System.out.println("Initial queue: " + queue);
        System.out.println("Head of queue (peek): " + queue.peek());

        // Poll elements — always returns the smallest element first
        System.out.println("\nPolling elements in priority order:");
        while (!queue.isEmpty()) {
            System.out.println("Polled: " + queue.poll() + " | Remaining: " + queue);
        }

        // Example with custom priority (reverse order)
        Queue<String> nameQueue = new PriorityQueue<>((a, b) -> b.compareTo(a)); // or Collections.reverseOrder();
        nameQueue.offer("B");
        nameQueue.offer("A");
        nameQueue.offer("D");
        nameQueue.offer("C");

        System.out.println("\nPriorityQueue with custom comparator (reverse alphabetical): " + nameQueue);
        System.out.println("Peek: " + nameQueue.peek());

        System.out.println("\nPolling elements by custom priority:");
        while (!nameQueue.isEmpty()) {
            System.out.println("Polled: " + nameQueue.poll() + " | Remaining: " + nameQueue);
        }

        System.out.println("\nAll elements processed — queue is empty: " + nameQueue.isEmpty());
    }
}
