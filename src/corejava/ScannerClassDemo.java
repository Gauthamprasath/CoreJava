
package corejava;

import java.util.*;

public class ScannerClassDemo {
    
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name=s.nextLine();
        System.out.println("Enter the mark : ");
        Double mark=s.nextDouble();
        System.out.println("Enter the Grade : ");
        String grade=s.next();
        System.out.println("Enter the rank : ");
        Integer rank=s.nextInt();
        System.out.println(name+"\n"+mark);
        System.out.println(mark);
        System.out.println(grade);
        System.out.println(rank);
        
    }
}
