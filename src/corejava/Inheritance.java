
package corejava;

import java.util.Scanner;

public class Inheritance {
    
       
    public static void main(String args[]){
        
        inhet2 obj = new inhet2();
        
        obj.display1(100);
        
        obj.display2(100, 200);
        
        
    }
    
}

class inhet1{
    
    public void display1(int x){
        
        System.out.println(100+x);
        
    }
           
}


class inhet2 extends inhet1{
    
    public void display2(int x, int y){
        
        System.out.println(x+y);
    }
    
}