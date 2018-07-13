
package corejava;

public class StringDemo {
    
    public static void main(String[] str) {
        
        String st = "welcome";
        
        System.out.println(st.charAt(5));
        
        System.out.println(st.concat(" world "));
        
        System.out.println(st.equals("welcome"));
        
        System.out.println(st.equalsIgnoreCase("WELCOME"));
        
        byte[] by = st.getBytes();
        
        for(int i=0;i<by.length;i++) {
            
            System.out.println(by[i]);
        }
        
        System.out.println(st.length());
        
        System.out.println(st.replace('e', 'E'));
        
        String st1 = "welcome to java";
        
        String[] sp = st1.split(" ");
        
        for(int i=0;i<sp.length;i++) {
            
            System.out.println(sp[i]);
        }
        
        System.out.println(st.substring(2, 4));
        
        char[] ch = st.toCharArray();
        
        for(int i=0;i<ch.length;i++) {
            
            System.out.println(ch[i]);
        }
        
        System.out.println(st.toUpperCase());
    }
    
}
