import java.util.LinkedList;

public class ReverseALinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedlist = new LinkedList<>();

        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);

        System.out.print(linkedlist);

        LinkedList<Integer> reversedlinkedlist = new LinkedList<>();

        linkedlist.descendingIterator().forEachRemaining(reversedlinkedlist::add);

        System.out.print(" to ");
        System.out.println(reversedlinkedlist);


    }

}