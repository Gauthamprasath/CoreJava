
package corejava;

public class ClassInsideMethod {

    public static void main(String args[]){
        
        OuterMethod o = new OuterMethod();
        
        o.display();
        
    }
    

}

class OuterMethod{

    public void display(){
        
        class InnerMethod{
            
            void d(){
                
                System.out.println(100+600);
                
            }
            
        }
        
        InnerMethod i = new InnerMethod();
        
        i.d();
        
    }
    

}



