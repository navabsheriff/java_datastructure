import java.util.*;
public class Main {
    public static void main(String[] args) {

        int val,pos;
        dynamicArray list=new dynamicArray();

        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println(".....menu.....");
            System.out.println("1.insert at end");
            System.out.println("2.display");
            System.out.println("3.insert at specified pos");
            System.out.println("4.delete at specified pos");
            System.out.println("5.exit");
            System.out.println("enter your choice");
            int choice =sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter the value");
                    val=sc.nextInt();
                    list.add(val);
                    break;
                case 2:list.display();
                    break;
                case 3:
                    System.out.println("enter the pos");
                    pos=sc.nextInt();
                    if(pos<0){
                        System.out.println("invalid positon");
                        break;
                    }
                    System.out.println("enter the value");
                    val=sc.nextInt();
                     list.insertAt(pos,val);
                    break;
                case 4:System.out.println("enter the pos");
                    pos=sc.nextInt();
                    if(pos<0){
                        System.out.println("invalid positon");
                        break;}
                     list.deleteAt(pos);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("enter valid no");


            }
        }
    }}
class dynamicArray{
    static  final int initialcapacity=4;
    private int arr[];
    private int size;
    private   int capacity;
    dynamicArray(){
        arr=new int[initialcapacity];
        size=0;
        capacity=initialcapacity;
    }
    public void add(int val){
        if(size==capacity){
            expandArray();
        }
        arr[size++]=val;
    }
    public void expandArray(){
        capacity*=2;
        arr=java.util.Arrays.copyOf(arr,capacity);
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
    }
    public  void insertAt(int pos,int val){
        if(size==capacity){
            expandArray();
        }
        for (int i = size-1; i >=pos ; i--) {
            arr[i]=arr[i+1];


        }
        arr[pos]=val;
        size++;
    }
    public void deleteAt(int pos){
        for (int i=pos+1;i<size-1;i++){
            arr[i-1]=arr[i];
            size--;
            if(capacity>initialcapacity && capacity>3*size)
                shrinkArray();
        }
    }
    public void shrinkArray(){
        capacity/=2;
        arr=java.util.Arrays.copyOf(arr,capacity);
    }


}
