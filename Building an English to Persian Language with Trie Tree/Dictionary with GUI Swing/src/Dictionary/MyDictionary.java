
package Dictionary;

public class MyDictionary {
    
    public MyDictionary(){
        insert("Name" , "نام");
        insert("hello", "سلام");
        insert("data", "داده");
        insert("structure" , "ساختمان");
        insert("university","دانشگاه");
        insert("teacher", "معلم");
        insert("decoder" , "رمز گشا");
        
                }
    Node First = new Node();
    
    public void insert (String word , String meaning){
        Node n = First;
        String Word = word.toUpperCase();
        for(int i = 0 ; i< word.length(); i++){
        int val = Word.charAt(i) - 65;
        if (n.trie[val] == null){
            n.trie[val] = new Node();
            n = n.trie[val];
        }else{
            n = n.trie[val] = n;
        }
        }
            n.flag = true;
            n.mean = meaning;
    }
    public String search(String word){
       Node n = First;
        String Word = word.toUpperCase();
        for(int i = 0 ;i<word.length();i++){
        int val = Word.charAt(i) - 65;
        if (n.trie[val] != null && Word.length()>1){
            n = n.trie[val];
        }
        }if (n.flag == true){
            return n.mean;
        }else{
            return null;
        }
    }
    
}
