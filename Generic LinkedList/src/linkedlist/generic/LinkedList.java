
package linkedlist.generic;

public class LinkedList<T> {
    protected GenericNode<T> First;
    protected GenericNode<T> Last;
    int Size;
    
    public LinkedList(){
        First = null;
        Last = null;
    }
    
    public boolean isEmpty(){
        if (Size == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public int getSize(){
        return Size;
    }
    
    public void AddFirst(T e){
        if (isEmpty()){
            First=Last=new GenericNode(e,null);
        }else{
            First=new GenericNode(e,First);
        }
        Size++;
    }
    public void RemoveFirst(){
        if (isEmpty()){
            System.out.println("Empty");
        }else{
            if (First == Last){
                First = Last = null;
            }else{
                First = First.getnext();
            }
            Size--;
        }
    }
    
    public void AddLast(T e){
        if (isEmpty()){
            AddFirst(e);
        }else{
            Last.setnext(new GenericNode(e,null));
            Last = Last.getnext();
            Size++;
        }
    }
    
    public void RemoveLast(){
        if (isEmpty()){
            System.out.println("Empty");
        }else{
            if(First == Last){
                First = Last = null;
            }else{
                GenericNode<T> temp = First;
                while(temp.getnext() != Last){
                    temp = temp.getnext();
                }
                Last = temp;
                temp.setnext(null);
            }
            Size--;
        }
    }
    
    public GenericNode<T> get (int x){
        GenericNode<T> h = First;
        for (int i=0 ; i<x-1 ; i++){
            h=h.getnext();
        }
        return h;
    }
    
    public void insert (T e , int x){ 
        if (x == 1){
            AddFirst(e);
        }else{
        GenericNode<T> h = new GenericNode(e , get(x));
        get(x-1).setnext(h);
        Size++;
        }
    }
    public void delete (int x){
        if (x == 1){
            RemoveFirst();
        }else{
            get(x-1).setnext(get(x).getnext());
            Size--;
        }
    }
    public void Print(){
        GenericNode<T> temp = First;
        while(temp.getnext() != null){
            System.out.println("This : " + temp.getelement());
            System.out.println("Next : " + temp.getnext().getelement());
            System.out.println("");
            temp = temp.getnext();
        }
        System.out.println("This : " + temp.getelement());
        System.out.println("Next : " + temp.getnext());
        System.out.println("\n");
        System.out.println("De.coder();");
        System.out.println("Jr.Y");
        
    }
}
