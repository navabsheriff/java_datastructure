public class Main {
    public static void main(String[] args) {

            //System.out.println("Hello world!");
            circular<String> list=new circular<>();
            list.insertAtBegining("ram");
            list.insertAtBegining("asd");
            list.insertAtBegining("bgh");
        list.deleteAtbeg();
        list.deleteAtend();

        list.display();

           /* list.insertAtBegining(8);

            list.insertAtpos(2,10);
            //list.deleteatpos(1);
            // list.reverse();

            list.display();
            System.out.println(" ");
            list.displayrev();
            list.deleteatpos(4);
            System.out.println(" ");
            list.display();
            System.out.println(" ");
            list.displayrev();*/



        /*for (int a:list
        ) {
            System.out.println(a +" ");
        }
        Iterator<Integer> it= list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/
        }
    }
