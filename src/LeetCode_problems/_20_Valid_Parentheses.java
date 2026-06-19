package LeetCode_problems;
import java.util.*;
public class _20_Valid_Parentheses {
	 
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String s = sc.nextLine();

	        Stack<Character> stack = new Stack<>();

	        for(char ch : s.toCharArray()) {

	            if(ch == '(' || ch == '{' || ch == '[') {
	                stack.push(ch);
	            }
	            else {

	                if(stack.isEmpty()) {
	                    System.out.println(false);
	                    return;
	                }

	                char top = stack.pop();

	                if((ch == ')' && top != '(') ||
	                   (ch == '}' && top != '{') ||
	                   (ch == ']' && top != '[')) {

	                    System.out.println(false);
	                    return;
	                }
	            }
	        }

	        System.out.println(stack.isEmpty());
	    }
	}