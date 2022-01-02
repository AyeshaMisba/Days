import java.util.*;
class Program4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s=Integer.toString(n);
System.out.println(s);
if(n>=-100 && n<=100)
{
System.out.println("Good job");
}
else 
{
System.out.println("Wrong answer");
}
}
}
