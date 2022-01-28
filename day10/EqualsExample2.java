import java.util.ArrayList;  
class EqualsExample2{  
    public static void main(String[] args) {  
        String str1 = "JAVA";  
        ArrayList<String> list = new ArrayList<>();  
        list.add("JAVA");   
        list.add("PYTHON");  
        list.add("DBMS");  
        list.add("C");  
        for (String str : list) {  
            if (str.equals(str1)) {  
                System.out.println("Java is repeated.");  
            }  
        }  
    }  
}  