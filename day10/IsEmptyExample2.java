class IsEmptyExample2 
{    
public static void main(String argvs[])  
{    
String str = "";  
int size = str.length();  
if(size == 0)  
{  
System.out.println("The string is empty. \n");  
}  
else if(size > 0 && str.trim().isEmpty())  
{  
System.out.println("The string is blank. \n");  
}  
else  
{  
System.out.println("The string is not blank. \n");  
}  
  
str = "JAVA";  
size = str.length();  
if(size == 0)  
{  
System.out.println("The string is empty. \n");  
}  
if(size > 0 && str.trim().isEmpty())  
{  
System.out.println("The string is blank. \n");  
}  
else  
{  
System.out.println("The string is not blank. \n");  
}  
}  
}  