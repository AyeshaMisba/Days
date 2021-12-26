import java.util.Scanner;
class Program4
{
   	 public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input values:");
		for (int i=0;i<3;i++)
		{ 
			String s=sc.next();
			int x=sc.nextInt();
			if(s.length()<=10 && x>=0 && x<=999)
				System.out.printf("%-15s%03d\n",s,x);
			else
				System.out.println("Wrong format");
		}	
		sc.close();
  	 }
}