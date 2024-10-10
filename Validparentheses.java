import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Validparentheses
 */
public class Validparentheses {

    public static void main(String[] args) 
    {
        String s="(){(()()(){}[]{}{}())}";
        System.out.println("The string is valid : "+isValid(s));


    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char c : s.toCharArray()) 
        {
            if (map.containsValue(c)) 
            {
                stack.push(c);
            } 
            else if (map.containsKey(c)) 
            {
                if (stack.isEmpty() || map.get(c) != stack.pop())
                 {
                    return false;
                }
            }
        }

        return stack.isEmpty();        
    }
}
