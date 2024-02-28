import java.util.Iterator;




    public class doublylinked<T> implements Iterable<T>
    {
        Node head;
        Node tail;
        class Node{
            T data;
            Node next;
            Node prev;
            Node(T val){
                data=val;
                next=null;
                prev=null;
            }
        }
        doublylinked(){
            head=null;
            tail=null;
        }
        public void insertAtBegining(T val){
            Node newnode=new Node(val);
            newnode.next=head;

            //when list empty
            if(head==null){
                head=newnode;
            tail=newnode;}

            else
            {
                head.prev=newnode;



            }
            head=newnode;


        }
        public  void display(){
            if (head == null) {

                System.out.println("list is empty");
            }
            Node temp=head;

            while (temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;

            }
        }
        public  void displayrev(){
            if (head == null) {

                System.out.println("list is empty");
            }
            Node temp=tail;

            while (temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.prev;

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
            newnode.prev=temp;
if(temp==tail){
    tail=newnode;
}
else {
            temp.next.prev=newnode;

            temp.next=newnode;}
        }
        public void deleteatpos(int pos){
            if(head==null){
                throw new IndexOutOfBoundsException(" list is empty");
            }
            if (pos==0){
                head=head.next;
                if(head==null)
                    tail=null;
                else
                head.prev=null;
                return;
            }
            Node temp=head;
            Node prev=null;
            // jump till node delete
            for (int i = 1; i <=pos ; i++) {
                prev= temp;
                temp=temp.next;
                if(temp==null)
                    throw new IndexOutOfBoundsException(" invalid");


            }
            prev.next=temp.next;
            if(temp.next==null)
                tail=prev;
            else
            temp.next.prev= prev;

        }
        public  void deleteAtbeg(){
            if(head==null){
                throw new IndexOutOfBoundsException(" list is empty");
            }
                head=head.next;
                if(head==null)
                    tail=null;
                else
                    head.prev=null;
                return;


        }
        public Iterator<T> iterator(){
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


