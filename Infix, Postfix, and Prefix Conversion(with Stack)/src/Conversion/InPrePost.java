
package Conversion;

import java.util.Scanner;


public class InPrePost {


    public static void main(String[] args) {
        InPost ipo = new InPost();
        InPre  ipr = new InPre();
        PostIn poi = new PostIn();
        PreIn  pri = new PreIn();
        PostPre ppr = new PostPre();
        PrePost prp = new PrePost();
        check che = new check();
          ipo.convertInToPost();
          ipr.convertInToPre();
          poi.convertPostToIn();
          pri.convertPreToIn();
          prp.convertPreToPost();  
          ppr.convertPostToPre();
          che.whoBuildThis();
    }
}
