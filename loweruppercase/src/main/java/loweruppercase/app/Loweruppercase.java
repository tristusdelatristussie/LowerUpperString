package loweruppercase.app;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 * Created by a on 27/02/17.
 */
public class Loweruppercase {


        public String Loweruppercase(String str) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (isLowerCase(str.charAt(i))) result += toUpperCase(str.charAt(i));
                else if(isUpperCase(str.charAt(i))) result += toLowerCase(str.charAt(i));
                else if(str.charAt(i)==  ' ') result += ' ';
            }
            System.out.println(result);
            return result;
        }

    }
