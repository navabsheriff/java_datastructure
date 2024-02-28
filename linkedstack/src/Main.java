public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkStack<Integer> linkStack=new LinkStack<>();
    linkStack.push(4);
        linkStack.push(3);
        linkStack.push(2);
        System.out.println(linkStack.pop());
        System.out.println(linkStack.peek());



    }
}