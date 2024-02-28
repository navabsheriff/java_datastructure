public class binarysearch {
    class Node{
        int key;
        Node left;
        Node right;
        Node(int val){
            key=val;
            right=null;
            left=null;
        }
    }
    Node root;
    binarysearch(int val){
        root=new Node(val);
    }
    public  void insert(int val){
        insert(root,val);
    }
    public Node insert(Node root,int val) {
        if(root==null){
            return new Node(val);
        }
        if(root.key>val){
            root.left=insert(root.left,val);
        }
        else
        {
            root.right=insert(root.right,val);
        }
        return root;
    }
    public  void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key + " ");
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
