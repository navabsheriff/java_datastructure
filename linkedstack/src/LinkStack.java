public class LinkStack<T> {
    Node top;
    class Node{
        T data;
        Node next;
        Node(T val){
            data=val;
            next=null;

        }

    }
    public  void  push(T val){
        Node newnode=new Node(val);
        newnode.next=top;
        top=newnode;
    }
    public T pop(){
        if(top==null){
            throw  new ArrayIndexOutOfBoundsException("stack is empty");
        }
        T temp=top.data;
        top=top.next;

        return temp;
    }
    public  boolean isEmpty(){
        return  top==null;
    }
    public T peek(){
        return top.data;
    }
}
