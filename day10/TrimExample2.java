public class TrimExample2{    
    public static void main(String[] args) {    
        String s1 ="  java world  ";    
        System.out.println(s1.length());    
        System.out.println(s1); 
        String tr = s1.trim();    
        System.out.println(tr.length());    
        System.out.println(tr); 
    }    
}    