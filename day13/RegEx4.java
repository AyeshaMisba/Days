import java.util.*;
import java.util.regex.*;
import java.io.*;

class RegEx4 {
    public static void main(String[] args) {
        final String REGEX_PATTERN = "^[0-9]{2}$";
        Pattern r = Pattern.compile(REGEX_PATTERN);
        try {
            FileReader fr = new FileReader("C:\\Days\\day13\\data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                Matcher m = r.matcher(line);
                if (m.find()) {
                    System.out.println(line);
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}