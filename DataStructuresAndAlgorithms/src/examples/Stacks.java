package examples;

import java.util.Stack;

/**
 * Demonstrates how to use a Stack in Java.
 * 
 * Key properties:
 * - LIFO (Last-In, First-Out)
 * - Elements are added and removed from the top of the stack.
 * 
 * Common operations:
 * push(E e):    Adds an element to the top of the stack
 * pop():        Removes and returns the top element
 * peek():       Returns (but does not remove) the top element
 * empty():      Checks if the stack is empty
 * search(E e):  Returns 1-based position from the top (or -1 if not found)
 * 
 * Real-world use cases:
 * - Undo/Redo functionality
 * - Expression evaluation (infix → postfix)
 * - Backtracking algorithms (e.g., DFS)
 * - Browser navigation (back/forward history)
 */
public class Stacks {

    public static void main(String[] args) {

        System.out.println("=== Stack Demonstration ===\n");

        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack (top grows upward)
        stack.push("Minecraft");
        stack.push("Overwatch");
        stack.push("Battlefield");
        stack.push("Borderlands");

        System.out.println("Initial stack: " + stack);
        System.out.println("Top of stack (peek): " + stack.peek());

        // Search for an element
        int position = stack.search("Minecraft");
        System.out.println("\nPosition of 'Minecraft' from top: " + position);

        // Pop removes elements from the top (LIFO)
        System.out.println("\nPopping elements...");
        System.out.println("Removed: " + stack.pop());
        System.out.println("Stack after one pop: " + stack);

        System.out.println("Peek after pop: " + stack.peek());
        System.out.println("Is the stack empty? " + stack.empty());

        // Pop all elements to show stack behavior
        System.out.println("\nEmptying stack...");
        while (!stack.empty()) {
            System.out.println("Popped: " + stack.pop() + " | Remaining: " + stack);
        }

        System.out.println("\nStack is empty: " + stack.empty());
    }
}
