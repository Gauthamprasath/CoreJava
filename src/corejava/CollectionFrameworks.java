
package corejava;

import java.util.*;


public class CollectionFrameworks {
    
    public static void main(String args[]){
        
        ArrayList ar = new ArrayList();
        
        ar.add(100);
        
        ar.add("Welcome");
        
        ar.add(15.0023);
        
        ar.add(1,5);
        
        student st = new student();
        
        ar.add(st);
        
        Iterator ite = ar.iterator();
        
        while(ite.hasNext()){
            
            System.out.println(ite.next());
            
        }
        ArrayList ar1 = (ArrayList) ar.clone();
        
        ar1.add(0,"GAUTHAM");
        
        Boolean val = ar1.contains("GAUTHAM");
        
        ar1.add(val);
        
        ar1.remove(0);
              
       
        for(Object t:ar1){
            
           System.out.println(t);
            
        }
        
    }
      
        
}
