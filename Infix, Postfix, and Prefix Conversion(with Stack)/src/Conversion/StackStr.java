
package Conversion;


public class StackStr extends NodeStr{
    NodeStr head;
    public StackStr() {
        super("");
        head=null;
    }
    public void push(String item){
        NodeStr p=new NodeStr(item);
        p.next=head;
        head=p;
    }
    public String pop(){
        if(head!=null){
        String s=head.phrase;
        head=head.next;
        return s;
    }else
        return "";
    }
}
