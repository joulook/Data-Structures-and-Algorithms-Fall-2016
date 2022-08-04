
package Conversion;

import java.util.Scanner;


public class PreIn {
    public void convertPreToIn(){
        check che = new check();
     System.out.print("Enter your prefix expression : ");
        Scanner cin = new Scanner(System.in);
        char[]Expression=cin.next().toCharArray();
        StackCh stack = new StackCh();
        StackStr ss = new StackStr();
        char pop;
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
                   s4 = ss.pop();
                   String s5 ="("+"~"+s4+")";
                   ss.push(s5);
                }else{
                   String s1; 
                   s1 = ss.pop();
                   String s2;
                   s2 = ss.pop();
                   String s3= "("+s1+pop+s2+")";
                   ss.push(s3);
                }
            }
        }
        String s6;
        s6 = ss.pop();
        System.out.print(s6);
        System.out.println("");
    }   
    public String subConvertPreToIn(){
        System.out.print("Enter your prefix expression : ");
        check che = new check();
        Scanner cin = new Scanner(System.in);
        char[]Expression=cin.next().toCharArray();
        StackCh stack = new StackCh();
        StackStr ss = new StackStr();
        char pop;
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
                   s4 = ss.pop();
                   String s5 ="("+"~"+s4+")";
                   ss.push(s5);
                }else{
                   String s1; 
                   s1 = ss.pop();
                   String s2;
                   s2 = ss.pop();
                   String s3= "("+s1+pop+s2+")";
                   ss.push(s3);
                }
            }
        }
        String s6;
        s6 = ss.pop();
        return s6; 
    } 
}
