public class IndexExample2{
    public static void main(String args[])
        {
            String Str = new String("Welcome to Java");
            String subst = new String("Java");
            System.out.print("Found Java(after 10th index)starting at position : ");
            System.out.print(Str.indexOf(subst, 10));
        }
    }