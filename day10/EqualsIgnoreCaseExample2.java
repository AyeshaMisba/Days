import java.util.ArrayList;
class EqualsIgnoreCaseExample2 {  
    public static void main(String[] args) {  
        String str1 = "Java";  
        ArrayList<String> list = new ArrayList<>();  
        list.add("JaVa");   
        list.add("pyhton");  
        list.add("dbms");    
        for (String str : list) {  
            if (str.equalsIgnoreCase(str1)) {  
                System.out.println("java got repeated");  
            }  
        }  
    }  
}  