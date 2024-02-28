public class Queuelink {
    class  Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    Node front,rear;
    Queuelink(){
        front=null;
        rear=null;
    }
    public  void enqueue(int val){
        Node newnode=new Node(val);
        if(front==null || rear==null){
            front=newnode;
            rear=newnode;
        }
        else{
            rear.next=newnode;
            rear=newnode;
        }
    }
    public  int dequeue(){
        if(front==null){
            throw  new ArrayIndexOutOfBoundsException("queue is empty");
        }
        int temp= front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }

        return temp;
    }
    public  boolean isempty(){
        return  front==null;
    }
    public  int peek(){
        if(front==null){
            throw  new ArrayIndexOutOfBoundsException("empty");
        }

        return front.data;
    }
}
