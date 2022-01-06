public class Program1{
static void expandString(String strin)
    {
        String temp = "";
        int j;
 
        for (int i = 0; i < strin.length(); i++) {
            if (strin.charAt(i) >= 0) {
                int num = strin.charAt(i) - '0';
                if (strin.charAt(i + 1) == '(') {
                    for (j = i + 1; strin.charAt(j) != ')'; j++) {
                        if ((strin.charAt(j) >= 'a'
                             && strin.charAt(j) <= 'z')
                            || (strin.charAt(j) >= 'A'
                                && strin.charAt(j) <= 'Z')) {
                            temp += strin.charAt(j);
                        }
                    }
 
                    for (int k = 1; k <= num; k++) {
                        System.out.print(temp);
                    }
                    num = 0;
                    temp = "";
 
                    if (j < strin.length()) {
                        i = j;
                    }
                }
            }
        }
    }
    public static void main(String args[])
    {
        String strin = "5(mi)5(sba)";
        expandString(strin);
    }
}