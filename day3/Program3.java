import java.util.*;
class Program3{
    static boolean flag;
    static int B,H;
    
    static{
        Scanner io = new Scanner(System.in);
        B = io.nextInt();
        H = io.nextInt();
        if(B>0 && H>0)
        {
            flag = true;
        }
        else
        {
            System.out.println("Breadth and height invalid");
        }
    }
    
    
    public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.println(area);
            }
            
        }
    
    }
    