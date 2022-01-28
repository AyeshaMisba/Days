import java.util.Locale;
class TolowerExample2{
    public static void main(String args[])
    {
        String s = "welcome TO JAVA YOI!!";
        Locale TURKISH = Locale.forLanguageTag("tr");
        Locale ENGLISH = Locale.forLanguageTag("en");
        String str1 = s.toLowerCase(TURKISH);
        String str2 = s.toLowerCase(ENGLISH);
        System.out.println(str1);
        System.out.println(str2);
    }
}