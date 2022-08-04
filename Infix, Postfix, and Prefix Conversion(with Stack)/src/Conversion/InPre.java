
package Conversion;

import java.util.Scanner;


public class InPre extends StackCh {
    public void convertInToPre(){
        check che = new check();
        char pop;
        System.out.print("Enter your infix expression : ");
        Scanner cin = new Scanner(System.in);
        char[]a=cin.next().toCharArray();
        char[]Expression = new char[a.length];
        int n = 0;
        for(int i = 0 ; i<a.length ;i++){
            Expression[i]=a[a.length-1-i];
            if(Expression[i]=='('||Expression[i]==')')
                n++;
        }
        char[]b=new char[a.length];
        StackCh stack = new StackCh();
        System.out.print("\nPrefix Expression : ");
        int j =0;
        for(int i = 0 ; i<Expression.length ; i++){
            if(che.checkOperand(Expression[i])){
                b[j]=Expression[i];
                j++;
            }
            else{
                if(Expression[i]==')')
                    stack.push(Expression[i]);
                else if (che.checkOperator(Expression[i])){
                    if(stack.head==null)
                        stack.push(Expression[i]);
                    else if (stack.head.character==')')
                        stack.push(Expression[i]);
                    else if (!che.priorityOperator2(stack.head.character,Expression[i]))
                        stack.push(Expression[i]);
                    else{
                        boolean wayOut = true;
                        int l =0;
                        int y =0;
                        while(che.priorityOperator2(stack.head.character, Expression[i])&&wayOut){
                        if(che.checkOperator(stack.head.character)){
                           pop = stack.pop();
                            b[j]=pop;
                            j++;
                            l++;
                            
                        }
                        
                        if(stack.head==null){
                        
                            stack.push(Expression[i]);
                            y++;
                            wayOut=false;
                        }
                        else if(stack.head.character==')'){
                            
                            stack.push(Expression[i]);
                            y++;
                            wayOut=false;
                        }
                     
                        
                    }
                        if(y==0&l>=1)
                            stack.push(Expression[i]);
                        
                    }
                }
                else if(Expression[i]=='('){
                    while(stack.head.character!=')'){
                       pop = stack.pop();
                        b[j]=pop;
                        j++;
                    }
                    pop = stack.pop();
                    pop=' ';
                }
            }
        }
        while(stack.head!=null){
            pop = stack.pop();
            b[j]=pop;
            j++;
        }
        for(int i=n ; i<b.length;i++)
            System.out.print(b[b.length-1-i]);
        System.out.println();
    }
    public void subConvertInToPre(char [] a){
        check che = new check();
        char pop;
        char[]Expression = new char[a.length];
        int n = 0;
        for(int i = 0 ; i<a.length ;i++){
            Expression[i]=a[a.length-1-i];
            if(Expression[i]=='('||Expression[i]==')')
                n++;
        }
        char[]b=new char[a.length];
        StackCh stack = new StackCh();
        System.out.print("\nPrefix Expression : ");
        int j =0;
        for(int i = 0 ; i<Expression.length ; i++){
            if(che.checkOperand(Expression[i])){
                b[j]=Expression[i];
                j++;
            }
            else{
                if(Expression[i]==')')
                    stack.push(Expression[i]);
                else if (che.checkOperator(Expression[i])){
                    if(stack.head==null)
                        stack.push(Expression[i]);
                    else if (stack.head.character==')')
                        stack.push(Expression[i]);
                    else if (!che.priorityOperator2(stack.head.character,Expression[i]))
                        stack.push(Expression[i]);
                    else{
                        boolean wayOut = true;
                        int l =0;
                        int y =0;
                        while(che.priorityOperator2(stack.head.character, Expression[i])&&wayOut){
                        if(che.checkOperator(stack.head.character)){
                           pop = stack.pop();
                            b[j]=pop;
                            j++;
                            l++;
                            
                        }
                        
                        if(stack.head==null){
                        
                            stack.push(Expression[i]);
                            y++;
                            wayOut=false;
                        }
                        else if(stack.head.character==')'){
                            
                            stack.push(Expression[i]);
                            y++;
                            wayOut=false;
                        }
                     
                        
                    }
                        if(y==0&l>=1)
                            stack.push(Expression[i]);
                        
                    }
                }
                else if(Expression[i]=='('){
                    while(stack.head.character!=')'){
                       pop = stack.pop();
                        b[j]=pop;
                        j++;
                    }
                    pop = stack.pop();
                    pop=' ';
                }
            }
        }
        while(stack.head!=null){
            pop = stack.pop();
            b[j]=pop;
            j++;
        }
        for(int i=n ; i<b.length;i++)
            System.out.print(b[b.length-1-i]);
        System.out.println();
    }
}
