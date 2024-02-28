public class Arrayqueue2 {
        int arr[];
        static  final int MAX_SIZE=30;
        int rear;
        Arrayqueue2(){
            arr=new int[MAX_SIZE];

            rear=-1;
        }
        public  void enqueue(int val){
            if(rear==MAX_SIZE-1){
                throw new ArrayIndexOutOfBoundsException("Queue is full");
            }


            arr[++rear]=val;

        }
        public  int dequeue(){
            if(rear==-1 ){
                throw  new IndexOutOfBoundsException("queue is empty");
            }
            int temp=arr[0];
            for(int i=0;i<=rear;i++){
                arr[i-1]=arr[i];
            }
            rear--;
            return temp;
        }
    }


