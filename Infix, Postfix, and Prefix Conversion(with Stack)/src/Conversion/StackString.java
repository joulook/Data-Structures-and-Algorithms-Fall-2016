
package Conversion;


public class StackString extends NodeString {
    NodeString head ;
    public StackString(){
        super("");
        head=null;
    }
    public boolean push(String item){
        NodeString p=new NodeString(item);
        if(p==null)
            return false;
        p.next=head;
        head=p;
        return true;
    }
public boolean pop(Strings item){
        if(head==null)
            return false;
        item.value=head.phrase;
        head=head.next;
        return true;
    }
}
