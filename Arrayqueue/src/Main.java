public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Arrayqueue arrayqueue=new Arrayqueue();
        Arrayqueue arrayqueue2=new Arrayqueue();

        arrayqueue2.enqueue(5);
        arrayqueue.enqueue(6);
        arrayqueue.enqueue(7);
        System.out.println(arrayqueue.dequeue());

    }
}