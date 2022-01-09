//program to get the characters at odd places in the string
class CharAtExample2{  
    public static void main(String[] args) {  
        String str = "Java is a popular programming language";          
        for (int i=0; i<=str.length()-1; i++) {  
            if(i%2!=0) {  
                System.out.println("Char at "+i+" place "+str.charAt(i));  
            }  
        }  
    }  
}  
/*Char at 1 place a
Char at 3 place a
Char at 5 place i
Char at 7 place
Char at 9 place
Char at 11 place o
Char at 13 place u
Char at 15 place a
Char at 17 place
Char at 19 place r
Char at 21 place g
Char at 23 place a
Char at 25 place m
Char at 27 place n
Char at 29 place
Char at 31 place a
Char at 33 place g
Char at 35 place a
Char at 37 place e */