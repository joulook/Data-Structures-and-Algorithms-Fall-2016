using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TrieDictionary
{
    class trie 
    {
        public trieNode root;
    public String s;
    public void insert(String word,String sen){
        trieNode r= root;
        for(int i=0; i<word.Length; i++){
            char c = word.ElementAt(i);
            int aski=c - 'a';
            if(r.leaf[aski] == null){
                trieNode free=new trieNode();
                r.leaf[aski]=free;
                r=free;
            }
            else
                r = r.leaf[aski];
            if(i == (word.Length)-1)
                r.mng=sen;           
        }
        r.End = true;
    }
    
    public trieNode check(String w){
        trieNode r = root;
        for(int i=0; i<w.Length ;i++){
            char c = w.ElementAt(i);
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
    
    public string search(String word){
        trieNode r = check(word);
        if(r == null){
            //Console.WriteLine("sorry this word is not in library");
            //Console.WriteLine("");
            return "" ;
        }
        else{
            if(r.End){
                r=root;
                for(int i=0; i<word.Length; i++){
                    char c = word.ElementAt(i);
                    int aski = c - 'a';
                    if(r.leaf[aski] != null)
                        r = r.leaf[aski];
                    if(i == (word.Length)-1)
                        s = r.mng;
                }
               // Console.WriteLine("the meanin of " + word +" is : " + s);
               // Console.WriteLine("");
                return s;
            }
        }
      //  Console.WriteLine("sorry this word is not in library");
      //  Console.WriteLine("");
        return "";
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
        Console.WriteLine("Developed By : JR.Y");
        Console.WriteLine("---->De.coder();");
    }
    }
}
