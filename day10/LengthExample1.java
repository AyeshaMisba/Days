//program to get reverse of string using str.length() method
class LengthExample1   
{  
public static void main(String argvs[])  
{  
String str = "Java is a popular programming language";  
int size = str.length();  
  
System.out.println("Reverse of the string: " + "'" + str + "'" + " is");  
  
for(int i = 0; i < size; i++)  
{  
System.out.print(str.charAt(str.length() - i - 1));  
}  
  
}  
}  
/* Reverse of the string:  Java is a popular programming language  is
egaugnal gnimmargorp ralupop a si avaJ */