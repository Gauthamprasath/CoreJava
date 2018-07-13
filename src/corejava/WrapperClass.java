
package corejava;

public class WrapperClass {
    
    public static void main(String args[]){
        
        Character c = new Character('G');
        
        int y = c.charValue();
        
        String ch = c.toString();
        
        System.out.println(ch.toLowerCase());
        
        System.out.println(y);
        
    }
    
}
