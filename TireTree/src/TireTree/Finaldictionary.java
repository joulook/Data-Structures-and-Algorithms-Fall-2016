
package TireTree;

import java.util.Scanner;


public class Finaldictionary {

   
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        trie t = new trie();
        t.Library();
        for(int i =0 ; i<=4 ; i++){
        System.out.print("Enter your word to find the meaning : ");
        String word = cin.next();
        t.search(word);
        }
        t.whoBuildThis();
    }
    
}
