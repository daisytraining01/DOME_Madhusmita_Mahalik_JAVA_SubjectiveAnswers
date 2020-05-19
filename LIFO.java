import java.util.*;

public class LIFO
{
	public static void main(String[] args) 
	{
		Stack<Character> st = new Stack<Character>();
		st.push('A');
		st.push('X');
		st.push('B');
		st.push('D');
		st.push('B');
		System.out.println(st);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st);
		System.out.println(st.search('X'));
		
	}
}