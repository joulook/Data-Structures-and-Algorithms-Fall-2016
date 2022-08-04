
package Conversion;


public class PostPre {
    public void convertPostToPre(){
        PostIn poi = new PostIn();
        InPre ipr = new InPre();
        String s = poi.subConvertPostToIn();
        char []ch = s.toCharArray();
        ipr.subConvertInToPre(ch);
    }
}
