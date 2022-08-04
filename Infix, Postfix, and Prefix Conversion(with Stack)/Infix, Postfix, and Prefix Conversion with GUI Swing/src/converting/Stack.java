
package converting;

public class Stack {
    
        Node top;
    int number = 0;
    
    public Stack(){
        top = null;
    }
    
    public void push (char c){
        Node n = new Node (c);
        n.Next = top;
        top = n;
        number ++;
    }
    public char pop(){
        if (number == 0){
            System.out.println("the Stack is Empty");
            System.out.println();
        }else{
            char p = top.c;
            top = top.Next;
            number--;
            return p;
        }
        return 'e';
    }
    
}
