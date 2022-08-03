
package stackswithlinkedlist;

public class StacksWithLinkedList {

   
    public static void main(String[] args) {
        Stacks s = new Stacks();
        s.push(10);
        s.push(13);
        s.push(9);
        s.push(87);
        s.push(21);
        s.push(2);
        s.push(38);
        System.out.println("");
        System.out.println("Top "+ s.top());
        System.out.println("");
        while (!s.isEmpty()) {            
            int value = s.pop();
            
        }
        System.out.println("");
        s.WhoBuildThis();
    }
    
}
