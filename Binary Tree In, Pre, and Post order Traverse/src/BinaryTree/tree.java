
package binary_tree;


public class tree extends Node{
 
    Node root ;
    
    public tree(){
        super(0,"");
    }

    public tree(int key, String name) {
        super(key, name);
    }
    public void addNode(int key , String name){
        Node newNode = new Node(key , name);
        if(root == null){
            root = newNode;
        } else {
            Node focusNode = root ;
            Node parent ;
            while(true){
                parent = focusNode;
                if(key < focusNode.key){
                    focusNode = focusNode.leftChild;
                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
        
    }
    public void inOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            inOrderTraverseTree(focusNode.leftChild);
            
            System.out.println(focusNode);
            
            inOrderTraverseTree(focusNode.rightChild);
        }  
    }
    public void preOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            System.out.println(focusNode);
            
            preOrderTraverseTree(focusNode.leftChild);
            
            preOrderTraverseTree(focusNode.rightChild);
        }  
    }
    public void postOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            
            postOrderTraverseTree(focusNode.leftChild);
            
            postOrderTraverseTree(focusNode.rightChild);
            
            System.out.println(focusNode);
        }  
    }
    
    public Node findNode(int key){
        Node focusNode = root;
        while(focusNode.key != key){
            
            if(key < focusNode.key) {
                
                focusNode = focusNode.leftChild;
            } else {
                
                focusNode = focusNode.rightChild;
            
            }
            
            if(focusNode == null )
                return null;
        }
        return focusNode ;
    }
    
    public boolean remove(int key){
        
        Node focusNode =root ;
        Node parent = root ;
        
        boolean isItAleftChild = true ;
        while(focusNode.key != key){
            parent = focusNode ;
            
            if( key < focusNode.key ){
                
                isItAleftChild = true ;
                focusNode = focusNode.leftChild;
            } else {
                isItAleftChild = false ;
                focusNode = focusNode.rightChild;
                
            }
            if(focusNode == null)
                return false ;
        }
        
        if(focusNode.leftChild == null && focusNode.rightChild == null) {
            if(focusNode == root){
                root = null;
            } else if(isItAleftChild){
                parent.leftChild = null;
            } else {
                parent.rightChild = null ;            }
        } else if(focusNode.rightChild == null) {
            if(focusNode ==root)
                root = focusNode.leftChild;
            else if (isItAleftChild)
                parent.leftChild = focusNode.leftChild; 
            else
                parent.rightChild = focusNode.leftChild;
        } else if (focusNode.leftChild == null){
            
            if(focusNode == root)
                root = focusNode.rightChild;
            else if (isItAleftChild)
                parent.leftChild = focusNode.rightChild;
            else
                parent.rightChild = focusNode.rightChild;
        } else {
            Node replacement = getReplacementNode(focusNode);
            
            if(focusNode == root)
                root = replacement;
            
            else if(isItAleftChild)
                parent.leftChild = replacement;
            
            else 
                parent.rightChild = replacement;
            
            replacement.leftChild = focusNode.leftChild;
        }
        
        return true;
    }
public Node getReplacementNode(Node replacedNode){
    Node replacementParent = replacedNode;
    Node replacement = replacedNode;
    
    Node focusNode = replacedNode.rightChild;
    
    while(focusNode != null){
        
        replacementParent = replacement ;
        
        replacement = focusNode;
        
        focusNode = focusNode.leftChild;
    }
    if(replacement != replacedNode.rightChild){
        
        replacementParent.leftChild = replacement.rightChild;
        replacement.rightChild = replacedNode.rightChild;
    }
    
    return replacement;
}    

public void whoBuildThis(){
    System.out.println("Developed by : JT.Y\nDe.coder();");
}
}
