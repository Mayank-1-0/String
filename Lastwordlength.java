import java.util.Scanner;
public class Lastwordlength {
    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in)){
        String s=sc.nextLine();
        int n=lengthOfLastWord(s);
        System.out.println("THe length of the last word of the string is ; "+n);
        }
    }
    public static int lengthOfLastWord(String s) {
        int count=0;
        int st=s.length()-1;
        while(s.charAt(st)==' ')
        {
         st--;
        }
        for(int i=st;i>=0;i--)
        {
            
            if(s.charAt(i)==' '){
               break;
            }
            else
            {
                count++;
            }
            
        }
        return count;
        
    }
}
