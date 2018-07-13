
package corejava;


public class MessagePassing {
    
    public static void main(String args[]){
        
        stud st = new stud();
        
        st.allocate(100);
        
        DisplayData d = new DisplayData();
        
        d.disp(st);
        
        
    }

}

class stud{
    
    int x1;
    
    void allocate(int x){
        
        x1 = x;
        
    }
    
    int returnval(){
        
        return x1;
        
    }
    
    
}


class DisplayData{
    
    void disp(stud st){
    
    int val = st.returnval();
    
    System.out.println(val);
    
}
    
}