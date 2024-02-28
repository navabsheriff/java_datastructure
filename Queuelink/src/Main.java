public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Queuelink queuelink=new Queuelink();
        queuelink.enqueue(1);
        queuelink.enqueue(2);
        queuelink.enqueue(3);
        queuelink.enqueue(1);
        System.out.println( queuelink.dequeue());
        System.out.println( queuelink.dequeue());
        System.out.println( queuelink.dequeue());
       // System.out.println( queuelink.dequeue());
       // System.out.println( queuelink.dequeue());
        System.out.println(queuelink.peek());


    }
}