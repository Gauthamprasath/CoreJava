
package corejava;

public class Polymorphism {
    
    public static void main(String args[]){
        
        poly2 obj = new poly2();
        obj.calc(2000);
        
    }
    
}

class poly1{
    
    public void calc(int x){
        
        System.out.println(1000+x);
        
    }
    
}


class poly2 extends poly1{
    //overriding
    public void calc(int x){
        
        System.out.println(500+x);
        
    }
    
}
