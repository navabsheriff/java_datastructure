public class Arraystack <T>{
   static   final int MAX_SIZE=30;
    T[] arr=(T[])new  Object[MAX_SIZE];
    int top;
    Arraystack(){
        top=-1;
    }
    public  void push( T val){
        if(top==MAX_SIZE-1){
            throw  new ArrayIndexOutOfBoundsException("list is full");
        }
        arr[++top]=val;

    }
    public  T pop(){
        if(top==-1){
            throw  new ArrayIndexOutOfBoundsException("Stsck is empty");
        }
        return arr[top--];

    }
    public  T peek(){
        return arr[top];
    }
}
