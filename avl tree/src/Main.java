public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        avl al=new avl(50);
        al.insert(20);
        al.insert(60);
        al.insert(10);
        al.insert(30);
        al.insert(40);
        al.inorder(al.root);

    }
}