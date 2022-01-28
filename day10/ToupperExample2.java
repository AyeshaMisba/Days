import java.util.Locale;  
public class ToupperExample2 {  
    public static void main(String[] args) {  
        String s = "welcome toi javai";    
        String turkish = s.toUpperCase(Locale.forLanguageTag("tr"));  
        String english = s.toUpperCase(Locale.forLanguageTag("en"));  
        System.out.println(turkish);
        System.out.println(english);  
    }  
}  