
package pack1;

import pack2.*;
import pack2.pack3.Sample3;

public class Packages {
    
    public static void main(String[] str) {
        
        Sample1 s1 = new Sample1();
        
        s1.disp1();
        
        Sample2 s2 = new Sample2();
        
        s2.disp2();
        
        Sample3 s3 = new Sample3();
        
        s3.disp3();
    }
}
