import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        // Using LinkedList as a Queue
        Queue<Integer> linkedListQueue = new LinkedList<>();

        // Adding elements to the queue
        linkedListQueue.add(1);    // Inserts 1 into the queue
        linkedListQueue.add(2);    // Inserts 2 into the queue
        linkedListQueue.add(3);    // Inserts 3 into the queue

        // Display the queue
        System.out.println("LinkedList Queue: " + linkedListQueue);

        // Peek - retrieves but does not remove the head of the queue
        System.out.println("Peek: " + linkedListQueue.peek()); // Output: 1

        // Poll - retrieves and removes the head of the queue
        System.out.println("Poll: " + linkedListQueue.poll()); // Output: 1
        System.out.println("Queue after poll: " + linkedListQueue);

        // Offer - inserts an element into the queue, returns true if successful
        System.out.println("Offer 4: " + linkedListQueue.offer(4)); // Output: true
        System.out.println("Queue after offer: " + linkedListQueue);

        // Remove - removes the head of the queue
        System.out.println("Remove: " + linkedListQueue.remove()); // Output: 2
        System.out.println("Queue after remove: " + linkedListQueue);

        // Using PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the priority queue
        priorityQueue.add(3);    // Inserts 3 into the priority queue
        priorityQueue.add(1);    // Inserts 1 into the priority queue
        priorityQueue.add(2);    // Inserts 2 into the priority queue

        // Display the priority queue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Peek - retrieves but does not remove the head of the queue
        System.out.println("PriorityQueue Peek: " + priorityQueue.peek()); // Output: 1

        // Poll - retrieves and removes the head of the queue
        System.out.println("PriorityQueue Poll: " + priorityQueue.poll()); // Output: 1
        System.out.println("PriorityQueue after poll: " + priorityQueue);

        // Offer - inserts an element into the queue, returns true if successful
        System.out.println("PriorityQueue Offer 4: " + priorityQueue.offer(4)); // Output: true
        System.out.println("PriorityQueue after offer: " + priorityQueue);

        // Remove - removes the head of the queue
        System.out.println("PriorityQueue Remove: " + priorityQueue.remove()); // Output: 2
        System.out.println("PriorityQueue after remove: " + priorityQueue);
    }
}
