
package corejava;

import java.util.Scanner;

public class ClassArray {
    
    
    public static void main(String args[]){
        
        String name1;
        Integer roll1;
    
        student []  st = new student[3];
        
        Scanner s = new Scanner(System.in);
        
        for(int i=0;i<3;i++){
        
            System.out.print("Enter the name : ");
            name1 = s.next();
            st[i].name = name1;
            System.out.print("Enter the roll : ");
            roll1 = s.nextInt();
            st[i].roll = roll1;
                               
        }
        
        for(int i=0;i<3;i++){
            
            st[i].display(st[i].name,st[i].roll);
            
            
        }
        
    }
    
    
    
}

