package homework6;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        String str = "My name is Bill Foster";

        //Using the class StringBuilder
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("String in reverse order: " + sb);


        //Using the char array
        char[] ch1 = str.toCharArray();  // Преобразуем строку str в массив символов (char)
        System.out.print("\n" + "String in reverse order: ");
        for (int i = ch1.length-1; i >= 0; i--) {
            System.out.print(ch1[i]);
        }

        //Using the class StringBuffer
        System.out.println("\n");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello my friend");
        System.out.println(stringBuffer.reverse());

    }
}
