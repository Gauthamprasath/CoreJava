
package corejava;

public class CustomExceptionSalary {
    
    public static void main(String args[]) throws SalException{
          
        double salary = 15000;
        
        String category = "A";
        
        if( (salary>=10000) && (category == "B" ) ){
            
            System.out.println("Successful");
            
        }
        
        else{
            
            System.out.println("Failed");
            
            throw new SalException();
            
        }
                             
    System.out.println("Done!");

    }
}

class SalException extends Exception{
    
}
