package java_topic_part1;

import java.util.Arrays;

public class L7_StringTopic {
    public static void main(String[] args) {

        // store string variable
        String s = "bishnu";  // 1 object created
        String str = new String("bishnu"); // 2 objects created

        System.out.println(s == str); // false
        System.out.println(s.equals(str)); // true


        /*String st1 = "Xyz";
        st1.concat(" Pvt ltd.");
        System.out.println(st1);
*/
        String st1 = "Xyz";
        st1 = st1.concat(" Pvt ltd.");
        System.out.println(st1);


        String s1 = "preety";
        String s2 = "Preety";
        String s3 = "    preety   surname    ";
        String s4 = "hello preety";


        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(s1.length()-1));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s3.replaceAll(" ",""));
        System.out.println(s4.substring(0,5));
        System.out.println(s4.substring(6));

        char[] chArr = s1.toCharArray();
        System.out.println(Arrays.toString(chArr));

        String[] strArr = s4.split(" ");
        System.out.println(Arrays.toString(strArr));

        System.out.println(s1.indexOf('t'));

        String str2 = "Hi I am Hi there Hi how r Hi you ";
        System.out.println(str2.lastIndexOf("Hi"));

        System.out.println(s4.substring(s4.indexOf(" ")+1));

        // StringBuilder
        StringBuilder sb = new StringBuilder("bishnu");
        sb.append(" SDET Trainer");
        System.out.println(sb);

        StringBuilder st = new StringBuilder("preety");
        System.out.println(st.reverse());






    }
}
