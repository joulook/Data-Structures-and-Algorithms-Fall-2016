
package TireTree;

public class trie extends trieNode{
    
    public trieNode root;
    public String s;
    
    public trie() {
 
    }
    public void insert(String word,String sen){
        trieNode r= root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            int aski=c - 'a';
            if(r.leaf[aski] == null){
                trieNode free=new trieNode();
                r.leaf[aski]=free;
                r=free;
            }
            else
                r = r.leaf[aski];
            if(i == word.length()-1)
                r.sense=sen;           
        }
        r.End = true;
    }
    
    public trieNode check(String w){
        trieNode r = root;
        for(int i=0; i<w.length() ;i++){
            char c = w.charAt(i);
            int aski = c-'a';
            if(r.leaf[aski] != null)
                r = r.leaf[aski];
            else
                return null;
        }
        if(r == root)
            return null;
        return r;
    }
    
    public boolean search(String word){
        trieNode r = check(word);
        if(r == null){
            System.out.println("sorry this word is not in library");
            System.out.println("");
            return false ;
        }
        else{
            if(r.End){
                r=root;
                for(int i=0; i<word.length(); i++){
                    char c = word.charAt(i);
                    int aski = c - 'a';
                    if(r.leaf[aski] != null)
                        r = r.leaf[aski];
                    if(i == word.length()-1)
                        s = r.sense;
                }
                System.out.println("the meanin of " + word +" is : " + s);
                System.out.println("");
                return true;
            }
        }
        System.out.println("sorry this word is not in library");
        System.out.println("");
        return false;
    }
    public void Library(){
        root = new trieNode();
        insert("book", "کتاب");
        insert("boy","پسر");
        insert("bed","تخت خواب");
        insert("school","مدرسه");
        insert("unit","واحد");
        insert("tiny","کوچک");
        insert("math","ریاضی");
        insert("desk","میز");
        insert("shoes","کفش");
        insert("owl","جغد");
    }
    public void whoBuildThis(){
        System.out.println("Developed By : JR.Y");
        System.out.println("---->De.coder();");
    }
}
    
 
