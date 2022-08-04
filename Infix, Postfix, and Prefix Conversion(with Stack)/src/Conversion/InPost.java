
package Conversion;

import java.util.Scanner;


public class InPost extends StackCh{
    public void convertInToPost(){
        check che = new check();
        char pop;
        System.out.print("Enter your infix expression : ");
        Scanner cin = new Scanner(System.in);
        char[]Expression=cin.next().toCharArray();
        StackCh stack = new StackCh();
        System.out.print("\nPostfix Expression : ");
        
        for(int i = 0 ; i<Expression.length ; i++){
            if(che.checkOperand(Expression[i]))
                System.out.print(Expression[i]+"");
            else{
                if(Expression[i]=='(')
                    stack.push(Expression[i]);
                else if (che.checkOperator(Expression[i])){
                    if(stack.head==null)
                        stack.push(Expression[i]);
                    else if (stack.head.character=='(')
                        stack.push(Expression[i]);
                    else if (!che.priorityOperator(stack.head.character,Expression[i]))
                        stack.push(Expression[i]);
                    else{
                        boolean wayOut = true;
                        while(che.priorityOperator(stack.head.character, Expression[i])&&wayOut){
                        if(che.checkOperator(stack.head.character)){
                        pop = stack.pop();
                            System.out.print(pop);
                        }
                        if(stack.head==null){
                            stack.push(Expression[i]);
                            wayOut=false;
                        }
                        else if(stack.head.character=='('){
                            stack.push(Expression[i]);
                            wayOut=false;
                        }
                    }
                    }
                }
                else if(Expression[i]==')'){
                    while(stack.head.character!='('){
                        pop = stack.pop();
                        System.out.print(pop+"");
                    }
                    pop=stack.pop();
                    pop=' ';
                }
            }
        }
        while(stack.head!=null){
            pop = stack.pop();
            System.out.print(pop+"");
        }
        System.out.println();
    }
    public void subConvertInToPost(char[]Expression){
        StackCh stack = new StackCh();
        System.out.print("\nPostfix Expression : ");
        char pop;
        for(int i = 0 ; i<Expression.length ; i++){
            if(checkOperand(Expression[i]))
                System.out.print(Expression[i]+"");
            else{
                if(Expression[i]=='(')
                    stack.push(Expression[i]);
                else if (checkOperator(Expression[i])){
                    if(stack.head==null)
                        stack.push(Expression[i]);
                    else if (stack.head.character=='(')
                        stack.push(Expression[i]);
                    else if (!priorityOperator(stack.head.character,Expression[i]))
                        stack.push(Expression[i]);
                    else{
                        boolean wayOut = true;
                        while(priorityOperator(stack.head.character, Expression[i])&&wayOut){
                        if(checkOperator(stack.head.character)){
                            pop=stack.pop();
                            System.out.print(pop);
                        }
                        if(stack.head==null){
                            stack.push(Expression[i]);
                            wayOut=false;
                        }
                        else if(stack.head.character=='('){
                            stack.push(Expression[i]);
                            wayOut=false;
                        }
                    }
                    }
                }
                else if(Expression[i]==')'){
                    while(stack.head.character!='('){
                        pop=stack.pop();
                        System.out.print(pop+"");
                    }
                    pop=stack.pop();
                    pop=' ';
                }
            }
        }
        while(stack.head!=null){
            pop=stack.pop();
            System.out.print(pop+"");
        }
        System.out.println();
    }
}
