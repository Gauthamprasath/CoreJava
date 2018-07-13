
package corejava;

import java.util.Scanner;

public class LoopsDemo {

    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Name : ");
        String name = s.nextLine();
        for(int i=0;i<8;i++){
            System.out.println(name);
        }
        Integer t =0;
        while(t<10){
            System.out.print("*");
            t++;
        }
        Integer j=0;
        do{
            System.out.println("()");
            j++;
        }while(j<10);
        
    }
}
