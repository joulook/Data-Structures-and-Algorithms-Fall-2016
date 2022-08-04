
package Conversion;


public class PrePost {
    public void convertPreToPost(){
        PreIn pri = new PreIn();
        InPost ipo = new InPost();
        String s = pri.subConvertPreToIn();
        char []ch = s.toCharArray();
        ipo.subConvertInToPost(ch);
    }  
}
