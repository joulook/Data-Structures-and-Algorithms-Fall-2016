package Conversion;
import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        System.out.println("|||||||||||||||||||||||||||||||||||");
        System.out.println("***Converting Infix to Postfix***\n");
        convertInToPost();
        System.out.println("\n|||||||||||||||||||||||||||||||||||");
        System.out.println("***Converting Infix to Prefix***\n");
        convertInToPre();
        System.out.println("\n|||||||||||||||||||||||||||||||||||");
        System.out.println("***Converting Postfix to Infix***\n");
        convertPostToIn();
        System.out.println("\n|||||||||||||||||||||||||||||||||||");
        System.out.println("***Converting Prefix to Infix***\n");
        convertPreToIn();
        System.out.println("\n|||||||||||||||||||||||||||||||||||");
        System.out.println("***Converting Postfix to Prefix***\n");
        convertPostToPre();
        System.out.println("\n|||||||||||||||||||||||||||||||||||");
        System.out.println("***Converting Prefix to Postfix***\n");
        convertPreToPost();
        System.out.println("\n|||||||||||||||||||||||||||||||||||");
        System.out.println("Developed By : JR.Y\nDe.coder();");
    }
    
    public static void    convertInToPost(){
        System.out.print("Enter your infix expression : ");
        Scanner cin = new Scanner(System.in);
        char[]Expression=cin.next().toCharArray();
        StackChar stack = new StackChar();
        Character operator = new Character();
        System.out.print("\nPostfix Expression : ");
        
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
                            stack.pop(operator);
                            System.out.print(operator.value);
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
                        stack.pop(operator);
                        System.out.print(operator.value+"");
                    }
                    stack.pop(operator);
                    operator.value=' ';
                }
            }
        }
        while(stack.head!=null){
            stack.pop(operator);
            System.out.print(operator.value+"");
        }
        System.out.println();
    }
    public static void    convertInToPre(){
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
        StackChar stack = new StackChar();
        Character operator = new Character();
        System.out.print("\nPrefix Expression : ");
        int j =0;
        for(int i = 0 ; i<Expression.length ; i++){
            if(checkOperand(Expression[i])){
                b[j]=Expression[i];
                j++;
            }
            else{
                if(Expression[i]==')')
                    stack.push(Expression[i]);
                else if (checkOperator(Expression[i])){
                    if(stack.head==null)
                        stack.push(Expression[i]);
                    else if (stack.head.character==')')
                        stack.push(Expression[i]);
                    else if (!priorityOperator2(stack.head.character,Expression[i]))
                        stack.push(Expression[i]);
                    else{
                        boolean wayOut = true;
                        int l =0;
                        int y =0;
                        while(priorityOperator2(stack.head.character, Expression[i])&&wayOut){
                        if(checkOperator(stack.head.character)){
                            stack.pop(operator);
                            b[j]=operator.value;
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
                        stack.pop(operator);
                        b[j]=operator.value;
                        j++;
                    }
                    stack.pop(operator);
                    operator.value=' ';
                }
            }
        }
        while(stack.head!=null){
            stack.pop(operator);
            b[j]=operator.value;
            j++;
        }
        for(int i=n ; i<b.length;i++)
            System.out.print(b[b.length-1-i]);
        System.out.println();
    }
    public static void    convertPostToIn(){
     System.out.print("Enter your postfix expression : ");
        Scanner cin = new Scanner(System.in);
        char[]a=cin.next().toCharArray();
        char[]Expression = new char[a.length];
        for(int i = 0 ; i<a.length ;i++){
            Expression[i]=a[a.length-1-i];
        }
        StackChar stack = new StackChar();
        StackString ss = new StackString();
        Character operator = new Character();
        Strings phrase = new Strings();
        String state;
        for(int i = 0 ; i<Expression.length ; i++)
            stack.push(Expression[i]);
        System.out.print("\nInfix Expression : ");
        for(int i =0 ; i<Expression.length;i++){
            stack.pop(operator);
            if(checkOperand(operator.value)){
                state =""+operator.value;
                ss.push(state);
           } else{
                if(operator.value=='~'){
                    ss.pop(phrase);
                   String s4=phrase.value;
                   String s5 ="("+"~"+s4+")";
                   ss.push(s5);
                }else{
                   ss.pop(phrase);
                   String s1=phrase.value;
                   ss.pop(phrase);
                   String s2=phrase.value;
                   String s3= "("+s2+operator.value+s1+")";
                   ss.push(s3);
                }
            }
        }
        ss.pop(phrase);
        String s6=phrase.value;
        System.out.print(s6);
        System.out.println("");
    }
    public static void    convertPreToIn(){
     System.out.print("Enter your prefix expression : ");
        Scanner cin = new Scanner(System.in);
        char[]Expression=cin.next().toCharArray();
        StackChar stack = new StackChar();
        StackString ss = new StackString();
        Character operator = new Character();
        Strings phrase = new Strings();
        String state;
        for(int i = 0 ; i<Expression.length ; i++)
            stack.push(Expression[i]);
        System.out.print("\nInfix Expression : ");
        for(int i =0 ; i<Expression.length;i++){
            stack.pop(operator);
            if(checkOperand(operator.value)){
                state =""+operator.value;
                ss.push(state);
           } else{
                if(operator.value=='~'){
                    ss.pop(phrase);
                   String s4=phrase.value;
                   String s5 ="("+"~"+s4+")";
                   ss.push(s5);
                }else{
                   ss.pop(phrase);
                   String s1=phrase.value;
                   ss.pop(phrase);
                   String s2=phrase.value;
                   String s3= "("+s1+operator.value+s2+")";
                   ss.push(s3);
                }
            }
        }
        ss.pop(phrase);
        String s6=phrase.value;
        System.out.print(s6);
        System.out.println("");
    }
    public static void    convertPostToPre(){
        String s = subConvertPostToIn();
        char []ch = s.toCharArray();
        subConvertInToPre(ch);
    }
    public static void    convertPreToPost(){
        String s = subConvertPreToIn();
        char []ch = s.toCharArray();
        subConvertInToPost(ch);
    }  
    
    public static boolean checkOperand(char item){
        if(item=='+' || item=='-' || item=='*' || item=='/' || item=='^' || item=='(' || item==')' || item=='~')
            return false;
        return true;
    }
    public static boolean checkOperator(char item){
        return (item=='^' || item=='*' || item=='/' || item=='+' || item=='-' || item=='~');
    }
    public static boolean priorityOperator(char operator1,char operator2){
        if(operator2=='~')
            return false;
        if(operator1!='~'&&operator2=='^')
            return false;
        if((operator1=='+'||operator1=='-')&&(operator2=='*')||(operator2=='/'))
            return false;
        if(operator1=='~')
            return true;
        if((operator1=='^'||operator1=='*'||operator1=='/')&&(operator2!='~'||operator2!='^'))
            return true;
        if((operator1=='+'||operator1=='-')&&(operator2=='-')||(operator2=='+'))
            return true;
        return (checkOperator(operator2));
    }
    public static boolean priorityOperator2(char operator1,char operator2){
        if(operator2=='~')
            return false;
        if(operator1=='^'&&operator2!='~')
            return true;
        if((operator1=='~'||operator1=='^')&&(operator2=='*'||operator2=='/'))
            return true;
        if((operator1!='~'&&operator1!='^')&&operator2=='^')
            return false;
        if((operator1!='~'&&operator1!='^')&&(operator2=='*')||(operator2=='/'))
            return false;
        if(operator1=='~')
            return true;
        if((operator1=='+'||operator1=='-')&&(operator2=='-')||(operator2=='+'))
            return false;
        return (checkOperator(operator2));
    }
    public static String  subConvertPostToIn(){
     System.out.print("Enter your postfix expression : ");
        Scanner cin = new Scanner(System.in);
        char[]a=cin.next().toCharArray();
        char[]Expression = new char[a.length];
        for(int i = 0 ; i<a.length ;i++){
            Expression[i]=a[a.length-1-i];
        }
        StackChar stack = new StackChar();
        StackString ss = new StackString();
        Character operator = new Character();
        Strings phrase = new Strings();
        String state;
        for(int i = 0 ; i<Expression.length ; i++)
            stack.push(Expression[i]);
        for(int i =0 ; i<Expression.length;i++){
            stack.pop(operator);
            if(checkOperand(operator.value)){
                state =""+operator.value;
                ss.push(state);
           } else{
                if(operator.value=='~'){
                    ss.pop(phrase);
                   String s4=phrase.value;
                   String s5 ="("+"~"+s4+")";
                   ss.push(s5);
                }else{
                   ss.pop(phrase);
                   String s1=phrase.value;
                   ss.pop(phrase);
                   String s2=phrase.value;
                   String s3= "("+s2+operator.value+s1+")";
                   ss.push(s3);
                }
            }
        }
        ss.pop(phrase);
        String s6=phrase.value;
        return s6;
    }
    public static void    subConvertInToPre(char [] a){
        char[]Expression = new char[a.length];
        int n = 0;
        for(int i = 0 ; i<a.length ;i++){
            Expression[i]=a[a.length-1-i];
            if(Expression[i]=='('||Expression[i]==')')
                n++;
        }
        char[]b=new char[a.length];
        StackChar stack = new StackChar();
        Character operator = new Character();
        System.out.print("\nPrefix Expression : ");
        int j =0;
        for(int i = 0 ; i<Expression.length ; i++){
            if(checkOperand(Expression[i])){
                b[j]=Expression[i];
                j++;
            }
            else{
                if(Expression[i]==')')
                    stack.push(Expression[i]);
                else if (checkOperator(Expression[i])){
                    if(stack.head==null)
                        stack.push(Expression[i]);
                    else if (stack.head.character==')')
                        stack.push(Expression[i]);
                    else if (!priorityOperator2(stack.head.character,Expression[i]))
                        stack.push(Expression[i]);
                    else{
                        boolean wayOut = true;
                        int l =0;
                        int y =0;
                        while(priorityOperator2(stack.head.character, Expression[i])&&wayOut){
                        if(checkOperator(stack.head.character)){
                            stack.pop(operator);
                            b[j]=operator.value;
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
                        stack.pop(operator);
                        b[j]=operator.value;
                        j++;
                    }
                    stack.pop(operator);
                    operator.value=' ';
                }
            }
        }
        while(stack.head!=null){
            stack.pop(operator);
            b[j]=operator.value;
            j++;
        }
        for(int i=n ; i<b.length;i++)
            System.out.print(b[b.length-1-i]);
        System.out.println();
    }
    public static String  subConvertPreToIn(){
     System.out.print("Enter your prefix expression : ");
        Scanner cin = new Scanner(System.in);
        char[]Expression=cin.next().toCharArray();
        StackChar stack = new StackChar();
        StackString ss = new StackString();
        Character operator = new Character();
        Strings phrase = new Strings();
        String state;
        for(int i = 0 ; i<Expression.length ; i++)
            stack.push(Expression[i]);
        for(int i =0 ; i<Expression.length;i++){
            stack.pop(operator);
            if(checkOperand(operator.value)){
                state =""+operator.value;
                ss.push(state);
           } else{
                if(operator.value=='~'){
                    ss.pop(phrase);
                   String s4=phrase.value;
                   String s5 ="("+"~"+s4+")";
                   ss.push(s5);
                }else{
                   ss.pop(phrase);
                   String s1=phrase.value;
                   ss.pop(phrase);
                   String s2=phrase.value;
                   String s3= "("+s1+operator.value+s2+")";
                   ss.push(s3);
                }
            }
        }
        ss.pop(phrase);
        String s6=phrase.value;
        return s6;
    }
    public static void    subConvertInToPost(char[]Expression){
        StackChar stack = new StackChar();
        Character operator = new Character();
        System.out.print("\nPostfix Expression : ");
        
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
                            stack.pop(operator);
                            System.out.print(operator.value);
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
                        stack.pop(operator);
                        System.out.print(operator.value+"");
                    }
                    stack.pop(operator);
                    operator.value=' ';
                }
            }
        }
        while(stack.head!=null){
            stack.pop(operator);
            System.out.print(operator.value+"");
        }
        System.out.println();
    }
}
    

