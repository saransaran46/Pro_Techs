import java.util.*;

public class OcuurenceOfEachCharInArray {

        

    public static void main(String[] args) {
        String str = "hellooo";
        ArrayList<String> arr = new ArrayList<>();
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            char n = str.charAt(i + 1);

            if (c == n)
            {
                count++;
            } 
            else 
            {
                if(count>1){
                    arr.add(count + String.valueOf(c));
                    count = 1;
                }
                else
                {
                     arr.add(String.valueOf(c));
                }
            }
        }

        char l = str.charAt(str.length() - 1);
        if(count>1)
        {
            arr.add(count + String.valueOf(l));
        }
        else
        {
            arr.add(String.valueOf(l));
        }
        System.out.println(arr);
        StringBuilder result = new StringBuilder();
        for (String str1 : arr) {
            result.append(str1);
        }
        
        System.out.println(result);
    }
}