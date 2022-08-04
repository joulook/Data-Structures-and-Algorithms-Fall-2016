
package Dictionary;

public class Node {
    
        
    public String mean;
    public Node [] trie;
    public boolean flag = false;
    
    public Node (){
        trie = new Node[26];
    }
    
}
