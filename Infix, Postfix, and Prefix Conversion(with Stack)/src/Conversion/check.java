
package Conversion;


public class check {
    char []op={'+','-','*','/','^','(',')','~'};
    char []op1={'+','-','*','/','^','~'};
    char [][] op2 = new char [4][2];
    public boolean checkOperand(char item){
        for(int i=0 ; i<8 ; i++){
            if(item==op[i])
                return false;
        }
        return true;
    }
    public boolean checkOperator(char item){
        for(int i=0;i<6;i++){
            if(item == op1[i])
                return true;
        }
        return false;
    }
    public boolean priorityOperator(char operator1,char operator2){
        fill();
        int m=0,n=0,p=0,q=0;
        for(int i=0 ; i<4 ;i++){
            for(int j=0 ;j<2 ;j++){
                if(operator1==op2[i][j]){
                m=i;
                p=j;
                }
                if(operator2==op2[i][j]){
                n=i;
                q=j;
                }           
            }
        }
            if((n==m && p==q)||(n<m))
                return false;
            else
                return true;
            
    }
    public boolean priorityOperator2(char operator1,char operator2){
        fill();
        int m=0,n=0,p=0,q=0;
        for(int i=0 ; i<4 ;i++){
            for(int j=0 ;j<2 ;j++){
                if(operator1==op2[i][j]){
                m=i;
                p=j;
                }
                if(operator2==op2[i][j]){
                n=i;
                q=j;
            }
        }
        }
        if((n<m) || (n==m && p!=q))
            return false;
        else
            return true;
    }
    public void whoBuildThis(){
        System.out.println("Developed by : JR.Y");
        System.out.println("---> De.coder();");
    }    
    public void fill(){
    op2[0][0]='~';
    op2[0][1]=' ';
    op2[1][0]='^';
    op2[1][1]=' ';
    op2[2][0]='*';
    op2[2][1]='/';
    op2[3][0]='+';
    op2[3][1]='-';
    }
}
