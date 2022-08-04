
package linkedlist.generic;

public class GenericNode<T> {
    
    private T element;
    private GenericNode<T> next;
    
    public GenericNode(T element , GenericNode<T> next){
        this.element = element;
        this.next = next;
    }
    
    public void setnext (GenericNode<T> next){
        this.next = next;
    }
    public  GenericNode<T> getnext(){
        return next;
    }
    
    public void setelement (T element){
        this.element = element;
    }
    public T getelement(){
        return element;
    }
}

