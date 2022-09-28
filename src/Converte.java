import java.util.HashMap;

import java.util.Map;

public class Converte {

    public static String Converte1(String i) {
        i = i.toUpperCase();
        Map<String, String> convert = new HashMap<String, String>();

        convert.put("I", "1");
        convert.put("V", "5");
        convert.put("X", "10");
        convert.put("L", "50");
        convert.put("C", "100");
        convert.put("D", "500");
        convert.put("M", "1000");

        int num = 0;

        for (int j = 0; j < i.length(); j++) {

            if (j > 0 && Integer.parseInt(convert.get(String.valueOf(i.charAt(j)))) >


            Integer.parseInt(convert.get(String.valueOf(i.charAt(j - 1))))) {
                num += Integer.parseInt(convert.get(String.valueOf(i.charAt(j)))) - 2 * Integer.parseInt(convert.get(String.valueOf(i.charAt(j - 1))));
            }else{
                num += Integer.parseInt(convert.get(String.valueOf(i.charAt(j))));

            }

            
        }
        i = String.valueOf(num).toUpperCase();
        return i;

    }
}
