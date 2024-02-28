public class avl {
    class Node{
        int key;
        Node left;
        Node right;
        int height;
        public Node(int val){
            key=val;
            right=null;
            left=null;
            height=0;
        }
    }
    public  int getheight(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public int max(int a,int b){
        return a>b?a:b;
    }
    Node root;
     public  avl(int val){
        root=new Node(val);
    }
    public avl(){
         root=null;
    }
    public void insert(int val){
       root= insert(root,val);
    }
    public Node insert(Node node,int val) {
        if(node==null){
            return new Node(val);
        }
        if(node.key>val){
            node.left=insert(node.left,val);
        }
        else if(node.key<val)
        {
            node.right=insert(node.right,val);
        }
        else
        return node;
        node.height=1+max(getheight(node.left),getheight(node.right));
        if(val==40){
            System.out.println("the hiegth of " + node.key + "is update as " + node.height);
        }
        int balFactor =getbalance( node);
        //ll case
        if(balFactor>1 && val<node.left.key){
            return  rightrotate(node);

        }
        //lr case
        if(balFactor>1 && val>node.left.key){
             node.left= leftrotate(node.left);
             return rightrotate(node);


        }
        //rr case
        if(balFactor<-1 && val>node.right.key) {
            return  leftrotate(node);

        }
        //rl cae
        if(balFactor<-1 && val<node.right.key) {
            node.right=rightrotate(node.right);
            return  leftrotate(node);


        }
            return  node;
    }
    private int getbalance(Node node){
         if(node==null)
             return 0;
         return getheight(node.left)-getheight(node.right);
    }
    private Node rightrotate(Node z){
         Node y=z.left;
         Node t3=y.right;
         y.right=z;
         z.left=t3;
         z.height=1+max(getheight(z.left),getheight(z.right));
        y.height=1+max(getheight(z.left),getheight(z.right));
        return y;

    }
    private Node leftrotate(Node z){
        Node y=z.right;
        Node t3=y.left;
        y.left=z;
        z.right=t3;
        z.height=1+max(getheight(z.left),getheight(z.right));
        y.height=1+max(getheight(z.left),getheight(z.right));
        return y;

    }

    public  void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.key + " height is " + root.height);
            inorder(root.right);
        }
    }
    public  void preorder(Node root){
        if(root!=null){
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public Node search(Node root,int val) {
        if(root==null || root.key==val)
            return root;
        if(root.key< val)
            return search(root.left,val);
        return search(root.right,val);
    }
    public  void  delete(int val){
        root=delete(root,val);
    }
    public Node delete(Node root,int val){
        if(root==null)
            return root ;
        if(root.key< val)
            root.right= delete(root.right,val);
        else if(root.key >val)
            root.left=   delete(root.left,val);
        else{
            if(root.left==null)
                return root.right;
            else if (root.right==null)
                return  root.left;
            root.key=min(root.right);
            root.right=delete(root.right,root.key);
        }
        return  root;
    }
    public  int min(Node root){
        int minval=root.key;
        while(root.left!=null){
            minval=root.left.key;
            root=root.left;
        }
        return  minval;
    }
}
