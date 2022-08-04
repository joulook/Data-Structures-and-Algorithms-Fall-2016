
package Conversion;

import java.util.Scanner;


public class PostIn {
    public static void   convertPostToIn(){
     System.out.print("Enter your postfix expression : ");
        Scanner cin = new Scanner(System.in);
        check che = new check();
        char pop;
        char[]a=cin.next().toCharArray();
        char[]Expression = new char[a.length];
        for(int i = 0 ; i<a.length ;i++){
            Expression[i]=a[a.length-1-i];
        }
        StackCh stack = new StackCh();
        StackStr ss = new StackStr();
        String state;
        for(int i = 0 ; i<Expression.length ; i++)
            stack.push(Expression[i]);
        System.out.print("\nInfix Expression : ");
        for(int i =0 ; i<Expression.length;i++){
           pop = stack.pop();
            if(che.checkOperand(pop)){
                state =""+pop;
                ss.push(state);
           } else{
                if(pop=='~'){
                   String s4;
                   s4=ss.pop();
                   String s5 ="("+"~"+s4+")";
                   ss.push(s5);
                }else{
                   String s1;
                   s1=ss.pop();
                   String s2;
                   s2=ss.pop();
                   String s3= "("+s2+pop+s1+")";
                   ss.push(s3);
                }
            }
        }
        String s6;
        s6=ss.pop();
        System.out.print(s6);
        System.out.println("");
    }
    public static String subConvertPostToIn(){
        System.out.print("Enter your postfix expression : ");
        Scanner cin = new Scanner(System.in);
        check che = new check();
        char pop;
        char[]a=cin.next().toCharArray();
        char[]Expression = new char[a.length];
        for(int i = 0 ; i<a.length ;i++){
            Expression[i]=a[a.length-1-i];
        }
        StackCh stack = new StackCh();
        StackStr ss = new StackStr();
        String state;
        for(int i = 0 ; i<Expression.length ; i++)
            stack.push(Expression[i]);
        for(int i =0 ; i<Expression.length;i++){
           pop = stack.pop();
            if(che.checkOperand(pop)){
                state =""+pop;
                ss.push(state);
           } else{
                if(pop=='~'){
                   String s4;
                   s4=ss.pop();
                   String s5 ="("+"~"+s4+")";
                   ss.push(s5);
                }else{
                   String s1;
                   s1=ss.pop();
                   String s2;
                   s2=ss.pop();
                   String s3= "("+s2+pop+s1+")";
                   ss.push(s3);
                }
            }
        }
        String s6;
        s6=ss.pop();
        return s6;  
    }
}
