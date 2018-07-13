
package corejava;

public class Threading {
    
    public static void main(String args[]){
    
        Ext1 t = new Ext1(100);
    
        t.start();
    
    }
    
    
}

class Ext1 extends Thread{
    
    int x;
    
    Ext1(int x1){
        
        x = x1;
        
    }
    
    public void run(){
        
        for(int i=0;i<5;i++){
            
            System.out.println(x+i);
            try{
                
                Thread.sleep(1000);
                
            }catch(Exception e){
                
                e.printStackTrace();
                
            }
            
        }
        
    }
    
}
