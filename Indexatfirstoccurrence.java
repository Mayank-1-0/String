import java.util.Scanner;

/**
 * Indexatfirstoccurrence
 */
public class Indexatfirstoccurrence {
public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in))
    {
        String s=sc.nextLine();
        String n=sc.nextLine();
        System.out.println(strStr(s,n));
    }

}
    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0) {
           return 0;
       }
       if(haystack.length() < needle.length()) {
           return -1;
       }
       for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
           if(haystack.charAt(i) == needle.charAt(0)){
               if(haystack.substring(i, needle.length() + i).equals(needle)){
                   return i;
               }
           }
       }
       return -1;
   }
   
}