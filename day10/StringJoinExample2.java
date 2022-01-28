/*If the elements that have to be attached with the delimiter have some strings,
 in which a few of them are null, then the null elements are treated as a normal string, and we do not get any exception or error.
In the case of using null as a delimiter, we get the null pointer exception.*/
 class StringJoinExample2
{  
public static void main(String argvs[])  
{  
String str = null;  
str = String.join("-", null, "DBMS", "PYTHON", "JAVA");  
System.out.println(str);  
}  
}  