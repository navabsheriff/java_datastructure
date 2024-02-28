import java.util.*;
public class dynamivArray {
    public static void main(String[] args) {
        int opt;
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
        switch (opt){
            case 1:
                System.out.println("enter the value");
                val=sc.nextInt();
                list.add(val);
                break;
            case 2:list.display();
            break;
            case 3:
                System.out.println("enter the pos");
                pos=sc.nextInt()
                        if(pos<0){
                            System.out.println("invalid positon");
                            break;
                        }
                System.out.println("enter the value");
                val=sc.nextInt();
               // list.insertAt(pos,val);
                break;
            case 4:System.out.println("enter the pos");
                pos=sc.nextInt()
                if(pos<0){
                    System.out.println("invalid positon");
                    break;}
               // list.deleteAt(pos);
                break;


        }
    }
}}
class dynamicArray{
   static  final int initialcapacity=16;
   private int arr[];
   private int size;
  private   int capacity;
    dynamicArray(){
        int arr=new int[initialcapacity];
        size=0;
        capacity=initialcapacity;
    }
    public void add(int val){
        if(size==capacity){
            expandArray();
        }
        arr[size++]=val;
    }
    expandArray(){
        capacity*=2;
        arr=java.util.Arrays.copyOf(arr,capacity);
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
    }


}
