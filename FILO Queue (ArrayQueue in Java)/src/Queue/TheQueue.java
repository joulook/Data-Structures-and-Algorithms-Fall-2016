
package Queue;

import java.util.Arrays;


public class TheQueue {
    private int[] queueArray;
    private int queueSize;
    public int front,rear,nu,numberOfItems=0;

    public TheQueue(int size) {
       queueSize = size;
       queueArray = new int[size];
       Arrays.fill(queueArray,-1);
    }
    
    public void insert(int input){
        if(numberOfItems + 1<= queueSize){
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            System.out.println("INSERT " + input + " Was Added To the Queue");
        }else{
            System.out.println("Sorry But The Queue Is Full");
        }
    }
    public void remove(){
        if(numberOfItems>0){
            System.out.println("REMOVE "+ queueArray[front]+" Was Removed ");
            queueArray[front]=-1;
            front++;
            numberOfItems--;
            
        }else{
            System.out.println("Sorry But Queue is Empty");
        }
    }
    public void peek(){
        if(queueArray[front]>0)
        System.out.println("The First Element is "+ queueArray[front]);
        else
            System.out.println("No Elements ");    
    }
    public void WhoBuildThis(){
        System.out.println("Developed by : JR.Y\nDe.coder();");
    }
    public int displayTheQueue(){
        for(int i=0 ; i<queueSize+1 ; i++)
            System.out.print("- - ");
        System.out.println("");
        for(int i = 0 ; i<queueSize+1 ; i++)
            System.out.print("| "+i+" ");
        System.out.println("");
        for(int i=0 ; i<queueSize+1 ; i++)
            System.out.print("- - ");
        System.out.println("");
        for(int i=0 ; i<queueSize ; i++){
            int n=0;
            int c=0;
            if(queueArray[i]!=-1){
               n=queueArray[i];
               while(n>0){
                   n=n/10;
                   c++;
               }
               if(c==2)
                System.out.print("| "+queueArray[i]);
               else
                System.out.print("| "+queueArray[i]+" ");
            }else
            System.out.print("| "+" "+" ");
            
        }
        System.out.print("| "+" "+" ");
        System.out.println("");
        for(int i=0 ; i<queueSize+1 ; i++)
            System.out.print("- - ");
        System.out.println("");
        if(queueArray[front]==queueArray[rear]){
                  System.out.println("  "+"f"+" ");
                  System.out.println("  "+"r"+" ");
                  return 0;            
               }
        int i;
        for(i=0 ; i<queueSize ; i++){
            if(queueArray[i]==queueArray[front]){
                System.out.print("  "+"f"+" ");
               break;
            }else
                System.out.print("  "+" "+" ");
        }
            for(int j=i+1 ; j<queueSize+1 ; j++){
           if (queueArray[j]==queueArray[rear]){
                System.out.print("  "+"r"+" ");
                System.out.println("");
                 break;
           }
            else
                System.out.print("  "+" "+" ");
        
    }    
   return 0;
}
}
