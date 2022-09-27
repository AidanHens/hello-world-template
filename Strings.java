
/**
 * Write a description of class Strings here.
 *
 * @author Aidan Henss
 * @version 9/26/22
 */
public class Strings
{
    public static void main(String[] args) {
        int i;
        double f = 2.5;
        boolean flag= true;
        i=10;
        f=i+f;
        flag=false;
        i++;

        System.out.println("-----------------");
        //System.out.println(Integer.toString(i));
        //System.out.println(Double.toString(f));
        //System.out.println(Boolean.toString(flag));

        String str1 = "I am a string";
        String str2 = str1;
        String str3 = "I am also a string";
        Boolean stringsEqual = str1.compareTo(str3) == 0;
        Boolean stringsEqual2 = str1 == str3;
        
        System.out.println("stringsEqual = " + Boolean.toString(stringsEqual));
        System.out.println("stringsEqual2 = " + Boolean.toString(stringsEqual2));
        
    }
}