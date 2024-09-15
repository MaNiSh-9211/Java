import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements onto the stack
        stack.push(1);  // Pushes 1 onto the stack
        stack.push(2);  // Pushes 2 onto the stack
        stack.push(3);  // Pushes 3 onto the stack

        System.out.println("Initial Stack: " + stack);  // Output: [1, 2, 3]

        // Peek at the top element of the stack
        System.out.println("Peek: " + stack.peek());  // Output: 3

        // Pop the top element from the stack
        System.out.println("Pop: " + stack.pop());  // Output: 3
        System.out.println("Stack after pop: " + stack);  // Output: [1, 2]

        // Check if the stack contains a specific element
        System.out.println("Contains 2: " + stack.contains(2));  // Output: true
        System.out.println("Contains 3: " + stack.contains(3));  // Output: false

        // Search for an element's position in the stack (1-based index)
        System.out.println("Position of 1: " + stack.search(1));  // Output: 1 (top position is 1)
        System.out.println("Position of 2: " + stack.search(2));  // Output: 2

        // Check if the stack is empty
        System.out.println("Is empty: " + stack.isEmpty());  // Output: false

        // Get the size of the stack
        System.out.println("Size: " + stack.size());  // Output: 2

        // Clear all elements from the stack
        stack.clear();  // Removes all elements from the stack
        System.out.println("Stack after clear: " + stack);  // Output: []

        // Push new elements onto the cleared stack
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("Stack after pushing new elements: " + stack);  // Output: [4, 5, 6]
        
        // Copy the stack
        Stack<Integer> stackCopy = (Stack<Integer>) stack.clone();
        System.out.println("Copied Stack: " + stackCopy);  // Output: [4, 5, 6]
    }
}
