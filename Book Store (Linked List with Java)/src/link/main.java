package link;
public class main {
    public static void main(String[] args) {
        LinkList theLinkedList = new LinkList();
        theLinkedList.insertFirstLink("A",5);
        theLinkedList.insertFirstLink("B",4);
        theLinkedList.insertFirstLink("C",3);
        theLinkedList.insertFirstLink("D",8);
        theLinkedList.display();
        System.out.println();
        System.out.println();
        theLinkedList.removeFirst();
        theLinkedList.display();
        System.out.println();
        System.out.println();
        System.out.println("do we have any E book ?");
        if(theLinkedList.find("E")==null)
        System.out.println("no");
        else
        System.out.println("yes");    
        System.out.println();
        System.out.println();
        theLinkedList.insert("F", 5, 2);
        theLinkedList.display();    
        System.out.println();
        System.out.println();
        System.out.println("Developed By : M. H. Khoshechin");
    }
}

