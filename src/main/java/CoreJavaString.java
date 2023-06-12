

public class CoreJavaString {
    public static void main(String[] args) {
        //string is an object
        String s1 = "Something nice"; // string literal

        //new
        String s2 = new String("Hello my name is Valentina");

        String s = "I dont what to write";
        String[] splittedSpring = s.split(" ");
        System.out.println(splittedSpring[0]);

        for(int i =0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }

    }
}
