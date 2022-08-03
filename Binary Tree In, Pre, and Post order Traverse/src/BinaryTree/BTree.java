
package BinaryTree;


public class BTree {

    
    public static void main(String[] args) {
        
        tree t1 = new tree();
        t1.addNode(50, "A");
        t1.addNode(25, "B");
        t1.addNode(15, "C");
        t1.addNode(30, "D");
        t1.addNode(75, "E");
        t1.addNode(85, "F");
        
        
        System.out.println("InOrder Travers :");
        t1.inOrderTraverseTree(t1.root);
        
        
        System.out.println("\n");
        
        
        System.out.println("PreOrder Traverse :");
        t1.preOrderTraverseTree(t1.root);
        
        
        System.out.println("\n");
        
        
        System.out.println("postOrder Traverse :");
        t1.postOrderTraverseTree(t1.root);
        
        System.out.println("\n");
        
        System.out.println("Search for 30");
        System.out.println(t1.findNode(30));
        
        
        System.out.println("\n");
        
        t1.remove(25);
        t1.preOrderTraverseTree(t1.root);
        
        
        System.out.println("\n");
        
        
        t1.whoBuildThis();
    }
    
}
