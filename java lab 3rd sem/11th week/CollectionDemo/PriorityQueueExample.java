import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(20);
        priorityQueue.add(15);
        priorityQueue.add(30);

        System.out.println("PriorityQueue before removing the highest priority element: " + priorityQueue);

        Integer highestPriorityElement = priorityQueue.poll();

        System.out.println("Removed the highest priority element: " + highestPriorityElement);

        System.out.println("PriorityQueue after removing the highest priority element: " + priorityQueue);
    }
}
