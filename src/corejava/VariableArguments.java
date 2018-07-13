
package corejava;

public class VariableArguments {
    
    public static void main(String args[]){
        
        display(100);
        display(100,2000);
        
    }
    
    public static void display(int ...x){
    
        int y=0;
        for(int x1:x){
        
            y = y+x1;
        }
        System.out.println(y);
    
    }
}


