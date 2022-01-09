class FormatExample1{  
    public static void main(String[] args) {  
        String str1 = String.format("%d", -78954);          // Integer value  
        String str2 = String.format("%s", "JAVA 100"); // String value  
        String str3 = String.format("%f", 101.00452);       // Float value  
        String str4 = String.format("%x", 1010014);          // Hexadecimal value  
        String str5 = String.format("%c", 'A');          // Char value  
        System.out.println(str1);  
        System.out.println(str2);  
        System.out.println(str3);  
        System.out.println(str4);  
        System.out.println(str5);  
    }  
  
}  