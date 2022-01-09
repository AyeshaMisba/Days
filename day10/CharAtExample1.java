//program to get first and last character in the string
class CharAtExample1{  
    public static void main(String[] args) {  
    String str = "Java is a popular programming language";      
    int strLength = str.length();      
    System.out.println("Character at 0 index is: "+ str.charAt(0));      
    System.out.println("Character at last index is: "+ str.charAt(strLength-1));      
    }  
}  
/*Character at 0 index is: J
Character at last index is: e */