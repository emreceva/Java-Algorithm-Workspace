import java.util.LinkedList;

public class ReverseLinkedList {

    public LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list){
        LinkedList<Integer> reverseList = new LinkedList<>();

        list.descendingIterator().forEachRemaining(reverseList::add);

        return reverseList;
    }
}
