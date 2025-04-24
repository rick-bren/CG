
package SQH;
import java.util.*;

public class QueueUsingStacks {
    private Stack<Integer> stackEnqueue;
    private Stack<Integer> stackDequeue;

    public QueueUsingStacks() {
        stackEnqueue = new Stack<>();
        stackDequeue = new Stack<>();
    }

    public void enqueue(int x) {
        stackEnqueue.push(x);
    }

    public int dequeue() {
        shiftStacks();
        if (stackDequeue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackDequeue.pop();
    }

    public int peek() {
        shiftStacks();
        if (stackDequeue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackDequeue.peek();
    }

    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }

    private void shiftStacks() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks obj = new QueueUsingStacks();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        System.out.println(obj.dequeue()); // 10
        System.out.println(obj.peek());    // 20
        obj.enqueue(40);
        System.out.println(obj.dequeue()); // 20
    }
}

