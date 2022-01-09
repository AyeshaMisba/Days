//program to calculate white spaces
class LengthExample2
{  
public static void main(String args[])  
{  
String str = "Java is a popular programming language";  
int sizeWithWhiteSpaces = str.length();  
  
System.out.println("In the string: " + "'" + str + "'");  
  
str = str.replace(" ", "");  
int sizeWithoutWhiteSpaces = str.length();  
int noOfWhieSpaces = sizeWithWhiteSpaces - sizeWithoutWhiteSpaces;  
  
System.out.print("Total number of whitespaces present are: " + noOfWhieSpaces);  
}  
}  
/* In the string: 'Java is a popular programming language'
Total number of whitespaces present are: 5 */