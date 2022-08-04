
package converting;

public class Stack1 {
    
        
     Node1 top;
    int number = 0;
    int num = 0;
    
    public Stack1(){
        top = null;
    }
    
    public void push (String s){
        Node1 n = new Node1 (s);
        n.Next = top;
        top = n;
        number ++;
    }
    public String pop(){
        if (number == 0){
            System.out.println("the Stack is Empty");
            System.out.println();
        }else{
            String p = top.s;
            top = top.Next;
            number--;
            num++;
            return p;
        }
        return null;
    }
    
}
