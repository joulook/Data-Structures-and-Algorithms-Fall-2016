
package Conversion;


public class StackChar extends NodeChar{
    NodeChar head ;
    public StackChar(){
        super(' ');
        head=null;
    }
    public boolean push(char item){
        NodeChar p=new NodeChar(item);
        if(p==null)
            return false;
        p.next=head;
        head=p;
        return true;
    }
public boolean pop(Character item){
        if(head==null)
            return false;
        item.value=head.character;
        head=head.next;
        return true;
    }
}
