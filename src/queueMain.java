import java.util.*;

public class queueMain {
    public static void main(String[] args){
        Queue<Integer> queueOne = new ArrayDeque<>();

        for(int i=1; i<10; i++){
            queueOne.add(i*6);
        }
        System.out.println("ArrayDeque is: "+ queueOne);
        System.out.println("peek of the array is: "+ queueOne.peek());
        System.out.println("poll of thr array is: "+ queueOne.poll());
        queueOne.offer(10);
        System.out.println("After offer the element to queue: "+ queueOne);
        System.out.println("Check is array is empty: "+ queueOne.isEmpty());
        System.out.println("Size of the array is: "+ queueOne.size());
        queueOne.toArray();
        System.out.println("queue to array change: " + queueOne);

        Queue<String> dequeOne = new PriorityQueue<>();
        dequeOne.add("lovely");
        dequeOne.add("lawgate");
        dequeOne.add("phagwara");
        dequeOne.add("jalandhar");
        dequeOne.add("Kapurtala");
        dequeOne.add("punjab");
        dequeOne.add("india");

        System.out.println("Priority queue is: "+ dequeOne);
        System.out.println("Size of the Priority queue is: "+dequeOne.size());
        System.out.print(dequeOne.isEmpty());
        dequeOne.offer("Asia");
        dequeOne.offer("telangana");
        System.out.println("Final priority queue is: "+ dequeOne);
    }
}
