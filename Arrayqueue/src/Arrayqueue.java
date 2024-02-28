public class Arrayqueue {
    int arr[];
    static  final int MAX_SIZE=30;
    int front,rear;
    Arrayqueue(){
        arr=new int[MAX_SIZE];
        front=-1;
        rear=-1;
    }
    public  void enqueue(int val){
        if(rear==MAX_SIZE-1){
            throw new ArrayIndexOutOfBoundsException("Queue is full");
        }
        if(front==-1 )
            front++;
            arr[++rear]=val;

    }
    public  int dequeue(){
        if(front==-1 || front>rear){
            throw  new IndexOutOfBoundsException("queue is empty");
        }
        return arr[front++];
    }
}
