
package linkedlist.generic;

public class LinkedListGeneric {

    public static void main(String[] args) {
        LinkedList my = new LinkedList();
        my.AddFirst('A');
        my.AddLast(1);
        my.AddLast(1.5);
        my.insert( "(;", 2);
        ///my.delete(1);
        my.Print();
    }
    
}
