public class circular<T> {
    Node last;
    class Node{
        Node next;
        T data;
        Node(T val)
        {
            data=val;
            next=null;
        }    }

    circular(){
        last=null;
    }
   public void insertAtBegining(T val){
        Node newnode=new Node(val);
        if(last==null){
            newnode.next=newnode;
            last=newnode;
        }
        else{
            newnode.next=last.next;
            last.next=newnode;
        }
    }
    public void insertAtEnd(T val){
        Node newnode=new Node(val);
        if(last==null){
            newnode.next=newnode;
            last=newnode;
        }
        else{
            newnode.next=last.next;
            last.next=newnode;
            last=newnode;
        }
    }
    public  void display(){
        Node temp=last.next;
        do{
            System.out.println(temp.data + " ");
            temp=temp.next;
        }while(temp!=last.next);
    }
    public T deleteAtbeg(){
        T temp= last.next.data;
        if (last == null) {
            throw new IndexOutOfBoundsException("list is empty");
        }
        if(last.next==last){
            last=null;
        }
        else{
            last.next=last.next.next;
        }
        return  temp;
    }
    public T deleteAtend(){
        T temp= last.next.data;
        if (last == null) {
            throw new IndexOutOfBoundsException("list is empty");
        }
        if(last.next==last){
            last=null;
        }
        else{
            Node temp1=last.next;
            while(temp1.next!=last){
                temp1=temp1.next;
            }
            temp1.next=last.next;
            last=temp1;


        }
        return  temp;
    }
}
