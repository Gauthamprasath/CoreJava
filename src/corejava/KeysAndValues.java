
package corejava;

import java.util.*;

public class KeysAndValues {
    
    public static void main(String args[]){
        
        Map m = new HashMap();
        
        m.put(0, 01);
        m.put(1, "GAUTHAM");
        m.put("2", "9500722566");
        
        Set t = m.keySet();
        
        Iterator ite = t.iterator();
        
        while(ite.hasNext()){
            
            System.out.println(ite.next());
            
            Object k = ite.next();
            
            System.out.println(m.get(k));
            
        }
        
        
        
    }
    
}
