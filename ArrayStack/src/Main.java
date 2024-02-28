public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Arraystack<Integer> arraystack=new Arraystack();
        arraystack.push(4);
        arraystack.push(4);
        arraystack.push(4);

        System.out.println(  arraystack.pop());
        System.out.println(arraystack.peek());
        arraystack.peek();
    }
}