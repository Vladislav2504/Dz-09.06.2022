package MainTask1;

import java.util.Locale;

public class Methods extends Strings {

    public Methods(String str) {
        super(str);
    }

    public String number1(){
        return getStr().substring(0,5)+getStr().substring(9,13);
    }

    public static String number2(){
        return getStr().replace("abc", "***").replace("def", "***");
    }

    public static String number3(){
        return getStr().substring(5,8)+"/"+getStr().substring(14,17)+"/"+getStr().substring(19,20)+"/"
                +getStr().substring(21,22);
    }

    public static String number4(){
        return getStr().substring(5,8)+"/"+getStr().substring(14,17)+"/"
                +getStr().substring(19,20)+"/"+getStr().substring(21,22);
    }

    public static String number5(){
        String abc = "ABC";
        if (getStr().toUpperCase(Locale.forLanguageTag(abc)).contains(abc)) {
            return String.valueOf(getStr().toUpperCase(Locale.forLanguageTag(abc)).contains(abc));
        } else try {
            throw new ABCException();
        } catch (ABCException e) {
            throw new RuntimeException(e);
        }
    }

    public static String number6(){
        if (getStr().startsWith("555",0)) {
            return String.valueOf(getStr().startsWith("555", 0));
        } else try {
            throw new FivesException();
        } catch (FivesException e) {
            throw new RuntimeException(e);
        }
    }

    public static String number7(){
        if (getStr().endsWith("1a2b")) {
            return String.valueOf(getStr().endsWith("1a2b"));
        } else try {
            throw new EndsWithException();
        } catch (EndsWithException e) {
            throw new RuntimeException(e);
        }

    }

}
