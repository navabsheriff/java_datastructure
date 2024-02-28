import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>
{
    Node head;
    class Node{
        T data;
        Node next;
        Node(T val){
            data=val;
            next=null;
        }
    }
    LinkedList(){
        head=null;
    }
    public void insertAtBegining(T val){
        Node newnode=new Node(val);
        //when list empty
        if(head==null)
            head=newnode;
        else
        {
            newnode.next=head;
            head=newnode;
        }

    }
    public  void display(){
        Node temp=head;

        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;

        }
    }
    public  void insertAtpos(int pos,T val){
        if(pos==0){
            insertAtBegining( val);
            return;
        }
        Node newnode=new Node(val);
        Node temp=head;
        for (int i = 1; i <=pos-1 ; i++) {
          temp=  temp.next;
          if(temp==null){
              throw  new IndexOutOfBoundsException("invalid pos "+ pos);
          }


        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void deleteatpos(int pos){
        if(head==null){
            throw new IndexOutOfBoundsException(" list is empty");
        }
        if (pos==0){
            head=head.next;
            return;
        }
        Node temp=head;
        Node prev=null;
        // jump till node delete
        for (int i = 1; i <=pos ; i++) {
            prev= temp;
            temp=temp.next;

        }
        prev.next=temp.next;

    }
    public  Iterator<T> iterator(){
        return new Iterator<T>() {
            Node temp=head;
            @Override
            public boolean hasNext() {
                return temp!=null;
            }

            @Override
            public T next() {
                T val=temp.data;
                temp=temp.next;
                return val;
            }
        };
    }
    public void reverse(){
        Node prev=null;
        Node current=head;
        Node next=head.next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;



        }
        head=prev;
    }
}
