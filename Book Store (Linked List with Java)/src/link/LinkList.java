
package link;


public class LinkList {
    public Node firstLink;
    public static int size = 0;
         LinkList() {
             firstLink = null;
                     ;
        }
        
         public boolean isEmty(){
             return(firstLink == null);
         }
         public void insertFirstLink(String bookName ,int MillionsSold){
             Node newLink = new Node(bookName, MillionsSold);
             
             newLink.next=firstLink;
             firstLink=newLink;
             size++;
         }
         public Node removeFirst(){
             Node linkReference = firstLink;
             if(!isEmty()){
                 firstLink=firstLink.next;
             } else {
                 System.out.println("Empty LinedList");
             }
             return linkReference;
         }
         public void display(){
             Node theLink = firstLink;
             while(theLink != null){
                 theLink.display();
                 System.out.println("Next Link: " + theLink.next );
                 theLink = theLink.next;
             }
         }
         public Node find(String bookName){
             Node theLink = firstLink;
             if(!isEmty()){
                 while(theLink.bookName != bookName){
                     if(theLink.next == null){
                         return null;
                     } else {
                         theLink = theLink.next;
                     }
                 }
             } else {
             System.out.println("Empty LinedList");
         }
       return theLink;
    }
         public void insert(String bookName ,int  millionsSold, int index){
             if(index==1)
                 insertFirstLink(bookName, millionsSold);
             else{
                 Node theLink = firstLink;
                 for(int i =1 ; i<index ; i++){
                     theLink=theLink.next;
                 }
                 
                 Node q = new Node(bookName,millionsSold);
                 q.next = theLink.next;
                 theLink.next = q;
                 size++;
             }
                 
         }
        
         public Node removeLink(String bookName){
             Node currentLink = firstLink;
             Node previousLink = firstLink;
                 while(currentLink.bookName != bookName){
                     if(currentLink.next ==null){
                    return null;
                     } else {
                         previousLink = currentLink;
                         
                         currentLink = currentLink.next;
                     }
             }
                 if(currentLink == firstLink){
                     firstLink = firstLink.next;
                 } else {
                     
                     previousLink.next = currentLink.next;
                     
                 }
                 return currentLink;
         }  
}
