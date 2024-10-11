import java.util.Stack;
import java.util.Scanner;

public class Longestvalidparentheses 
{
    public static void main(String[] args) 
    {
        try(Scanner sc=new Scanner(System.in))
        {
            String s=sc.nextLine();
            System.out.println("Length of longest substring with valid parenteses is : "+LVP(s));
        }

    }
    public static int LVP(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max_len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max_len = Math.max(max_len, i - stack.peek());
                }
            }
        }

        return max_len;        
    
}
    
}
