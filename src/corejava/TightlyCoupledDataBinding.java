
package corejava;

public class TightlyCoupledDataBinding {
    
    static int x;
    
    public static void main(String args[]){
        
        f1();
        
        f2();
        
    }
    
    public static void f1(){
        
        x = 100;
        
    }
    
    
    public static void f2(){
        
        System.out.println( x+ 200);
        
    }
    
    
    
}
