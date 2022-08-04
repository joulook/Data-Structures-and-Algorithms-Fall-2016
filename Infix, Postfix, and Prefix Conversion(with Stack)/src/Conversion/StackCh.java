
package Conversion;


public class StackCh extends NodeCh{
    NodeCh head;
    public StackCh() {
        super(' ');
        head=null;
    }
    public void push(char item){
        NodeCh p=new NodeCh(item);
        p.next=head;
        head=p;
    }
    public char pop(){
        if(head!=null){
        char c=head.character;
        head=head.next;
        return c;
    }else
        return ' ';
    }
}
