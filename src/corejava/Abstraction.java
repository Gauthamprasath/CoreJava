
package corejava;

public class Abstraction {
    
    public static void main(String args []){
        
       abs2 obj = new abs2();
       obj.display(100, 5000);
        
    }
    
}


abstract class abs1{
    
    abstract public void display(int x , int y);
    
}


class abs2{
    
    public void display(int x , int y){
        
        System.out.println(x+y);
        
    }
    
}