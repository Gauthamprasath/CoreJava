
package corejava;
import java.util.*;

public class ArrayDemo {
    
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        int [] y = new int [5];
        for(int i=0;i<5;i++){
            y[i] = s.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(y[i]);
        }
    }

    
}
