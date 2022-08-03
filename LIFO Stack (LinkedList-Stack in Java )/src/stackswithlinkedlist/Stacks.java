
package stackswithlinkedlist;

public class Stacks extends Node{
    
   
   Node head ;
   int top = -1;
  public int stackSize=0;

    public Stacks() {
   super();
        head=null;
    }
   
   public boolean isEmpty(){
       return (top == -1);
   } 
   
   public void push(int value) {
       Node temp = new Node();
       temp.data=value;
       temp.next = head ;
       head = temp ;
       top++;
       stackSize++;
       System.out.println("PUSH " + value + " Was Added to the Stack ");
   }
   
   public int pop() {
       if(head != null){
           int peek;
           peek=head.data;
           Node temp = head;
           head = head.next;
           top--;
           stackSize--;
            System.out.println("POP " + peek + " Was Removed From the Stack");
           return temp.data;
       }else{
           System.out.println("No Item In Stack");
           return -1;
       }
   }
   
   public int top(){
       return head.data;
   }
   public void displayTheStack(){
         for(int i=0 ; i<stackSize ; i++)
            System.out.print("- - ");
         System.out.print("-");
        System.out.println("");
        for(int i = 0 ; i<stackSize ; i++)
            System.out.print("| "+(i+1)+" ");
        System.out.print("|");
        System.out.println("");
        for(int i=0 ; i<stackSize ; i++)
            System.out.print("- - ");
        System.out.print("-");
        System.out.println("");
        for(int i=0 ; i<stackSize ; i++){
            int n=0;
            int c=0;
               n=head.data;
               while(n>0){
                   n=n/10;
                   c++;
               }
               if(c==2)
                System.out.print("| "+head.data);
               else
                System.out.print("| "+head.data+" ");
            
            head=head.next;
        }
        System.out.print("| "+" "+" ");
        System.out.println("");
        for(int i=0 ; i<stackSize ; i++)
            System.out.print("- - ");
        System.out.print("-");
        System.out.println("");
    }
    public void WhoBuildThis(){
        System.out.println("Developed by : JR.Y\nDe.coder();");
    }

    
}
