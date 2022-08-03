
package stacklearn;

import java.util.Arrays;

public class TheStack {
    private int[] stackArray ;
    private int stackSize ;
    private int topOfStack =-1;

    public TheStack(int size) {
    
        stackSize = size;
        stackArray = new int[size];
        Arrays.fill(stackArray, -1);
        
    }
    public void push(int input) {
        
        if(topOfStack + 1 < stackSize){
            topOfStack++;
            stackArray[topOfStack] = input ;
            
        } else
            System.out.println("Sorry But the Stack is Full");
        displayTheStack();
        
        System.out.println("PUSH " + input + " Was Added to the Stack ");
    }
    public int pop(){
        if(topOfStack >= 0){
            int top = 0;
            top = stackArray[topOfStack] ;
            
            stackArray[topOfStack] = -1 ;
            
            displayTheStack();
            
            System.out.println("POP " + top + " Was Removed From the Stack\n");
            return stackArray[topOfStack];
        }else{
           displayTheStack();
            
            System.out.println("Sorry But the Stack is Empty");
            
            return -1;
        }
    }
    public int top() {
        displayTheStack();
        
        System.out.println("TOP " + stackArray[topOfStack] + " Is at the Top of Stack\n");
        
        return stackArray[topOfStack];
    }
    public void displayTheStack(){
         for(int i=0 ; i<stackSize+1 ; i++)
            System.out.print("- - ");
        System.out.println("");
        for(int i = 0 ; i<stackSize+1 ; i++)
            System.out.print("| "+i+" ");
        System.out.println("");
        for(int i=0 ; i<stackSize+1 ; i++)
            System.out.print("- - ");
        System.out.println("");
        for(int i=0 ; i<stackSize ; i++){
            int n=0;
            int c=0;
            if(stackArray[i]!=-1){
               n=stackArray[i];
               while(n>0){
                   n=n/10;
                   c++;
               }
               if(c==2)
                System.out.print("| "+stackArray[i]);
               else
                System.out.print("| "+stackArray[i]+" ");
            }else
            System.out.print("| "+" "+" ");
            
        }
        System.out.print("| "+" "+" ");
        System.out.println("");
        for(int i=0 ; i<stackSize+1 ; i++)
            System.out.print("- - ");
        System.out.println("");
    }
    public void WhoBuildThis(){
        System.out.println("Developed by : JR.Y\nDe.coder();");
    }
}
