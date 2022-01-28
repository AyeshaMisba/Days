public class StringJoinExample1{  
    public static void main(String[] args) {          
        String date = String.join("/","08","11","2001");    
        System.out.print(date);    
        String time = String.join("/", "09","01","2022");  
        System.out.println(" to "+time);  
    }  
}  