import java.util.Scanner;
class SolidRectangle{
public static void main(String args[]){
 int rows,columns;
 Scanner scan=new Scanner(System.in); 
 System.out.print("Enter the nunber of rows: ");
 rows=scan.nextInt();
 System.out.print("Enter the nunber of rows: ");
 columns=scan.nextInt();
 int i=1;
while( i<=rows){
    int j=1;
    while(j<=columns){
        System.out.print("*");
        j++;
    }
    System.out.print("\n");
    i++;
}
    
}
}