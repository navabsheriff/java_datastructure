import java.util.*;
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.insertAtBegining(1);
        list.insertAtBegining(2);
        list.insertAtpos(2,3);
        list.deleteatpos(2);
        list.reverse();

        list.display();
        for (int a:list
             ) {
            System.out.println(a +" ");
        }
        Iterator<Integer> it= list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}