import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=1;i<=n;i++) {
            for(j=1;j<=i;j++) {
                System.out.print((char)(j+64));
            }
            System.out.println(" ");
        }
    }
}
/*
A 
AB
ABC
ABCD
ABCDE
*/
