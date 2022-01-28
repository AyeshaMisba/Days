public class SubstringExample2
{  
public boolean SubstringExample2(String str)  
{  
int size = str.length();  
if(size == 0 || size == 1)  
{  
return true;  
}  
String f = str.substring(0, 1);  
String l = str.substring(size - 1);  
if(l.equals(f))  
{  
return SubstringExample2(str.substring(1, size - 1));  
}  
return false;  
}  
public static void main(String argvs[])  
{  
SubstringExample2 obj = new SubstringExample2();  
String str[] =  
{  
"java",
"hello",
"mam"
};  
int size = str.length;  
  
for(int j = 0; j < size; j++)  
{  
if(obj.SubstringExample2(str[j]))  
{  
System.out.println(str[j] + " is a palindrome.");  
}  
else  
{  
System.out.println(str[j] + " is not a palindrome.");  
}  
}  
}  
}  