public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        binarysearch bts = new binarysearch(50);
        bts.insert(20);
        bts.insert(30);
        bts.insert(40);
        bts.insert(70);
        bts.insert(90);
        bts.inorder(bts.root);
        System.out.println(" next order");
        bts.preorder(bts.root);

        if (bts.search(bts.root, 40) == null) {
            System.out.println("not found");
        } else
            System.out.println("found");
        System.out.println(" **********");
        bts.delete(bts.root, 50);
        bts.preorder(bts.root);

    }
}