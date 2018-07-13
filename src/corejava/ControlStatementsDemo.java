
package corejava;
import java.util.*;

public class ControlStatementsDemo {
    
    public static void main(String args []){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Name : ");
        String name = s.nextLine();
        System.out.println("Enter the Mark1 : ");
        Double mark1 = s.nextDouble();
        System.out.println("Enter the Mark2 : ");
        Double mark2 = s.nextDouble();
        System.out.println("Enter the Mark3 : ");
        Double mark3 = s.nextDouble();
        Double total = mark1+mark2+mark3;
        Double avg = total/3;
        String classpos = new String();
        if(avg>=90){
            System.out.println("Grade = A");
            classpos="1st";
        }
        else if(avg>=80&&avg<90){
            System.out.println("Grade = B");
            classpos="2nd";
        }
        else if(avg>=60&&avg<80){
            System.out.println("Grade = C");
            classpos="3rd";
        }
        else{
            System.out.println("Grade = D");
            classpos="4th";
        }
        System.out.println("Total = "+total);
        System.out.println("Average = "+avg);
        System.out.println("Position = "+classpos);
    }
}
