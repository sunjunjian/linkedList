public class BalancedParentheses
{
	/*		check if 2 chars are matching
	 *			return true if matching
	 *			return false otherwise
	 */
	public boolean areMatching(char ch1, char ch2) {
		if(ch1 == '(' && ch2 == ')')
			return true;
		else if(ch1 == '{' && ch2 == '}')
			return true;
		else if(ch1 == '[' && ch2 == ']')
			return true;
		else if(ch1 == '<' && ch2 == '>')
			return true;		
		else
			return false;
	}
	
	public boolean checkBalance(char[]	exp) {
		int	i=0;
		int	len = exp.length;
		
		// declare a stack by using LinkedList
		LinkedList	list = new LinkedList();
		
		while (i < len) {
			// push the starting parenthesis into the stack 
			if (exp[i] == '(' || exp[i] == '[' || exp[i] == '<' || exp[i] == '{')
				list.pushBack(exp[i]);
			
			// for ending parenthesis
			if (exp[i] == ')' || exp[i] == ']' || exp[i] == '>' || exp[i] == '}') {
				if (list.length() == 0)
					// Oops, stack is empty when some starting parenthesis is expecting
					return	false;
				else {
					Object	ob = list.popBack();
					char	ch = ob.toString().charAt(0);
					if (! areMatching(ch, exp[i]))
						// Oops, mismatching
						return	false;
				}
			}
			++i;
		}
		
		if (list.length() != 0)
			// there is some starting parenthesis left in the stack
			return	false;
		else
			return	true;
	}
	
	
	public static void main(String[] args)
	{
		String	exp = "{[(())]<>[{}()]}";
		BalancedParentheses	myTest = new BalancedParentheses();
		
		if (myTest.checkBalance(exp.toCharArray()))
			System.out.println(exp + " is balanced.");
		else
			System.out.println(exp + " is NOT balanced.");
	}
}