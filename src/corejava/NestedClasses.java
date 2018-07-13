
package corejava;

public class NestedClasses {
    
    public static void main(String args[]){
        
        OuterClass o = new OuterClass();
        
        OuterClass.InnerClass i = o.new InnerClass();
        
        i.disp();
    }
    
}

class OuterClass{
    
    
    class InnerClass{
        
        void disp(){
            
            System.out.println(100+500);
            
        }
        
    }
    
}
