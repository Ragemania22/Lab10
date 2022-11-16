import java.util.Stack;

public class MainClass {
	
	public static Boolean isBalanced(String expression) {
		
		char[] exp = expression.toCharArray();
		Stack<Character> stack = new Stack();
		
		for(int i = 0; i<exp.length; i++) {
			if(exp[i] == '(') {
				stack.push('(');
			}
			if(exp[i] == ')') {
				if(stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) {
			return true;
		}
		
		return false;
	}

}
