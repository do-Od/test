import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Character> st=new Stack();
		Scanner sc= new Scanner(System.in);
		int result=0;	//잘린 쇠막대기가 몇개인지
		String input=sc.next();	//"((()))()(()()"쇠막대기 입력받을 곳
		
		for (int i = 0; i < input.length();i++)
		{
			if(input.charAt(i)=='(')
			{
				st.push(input.charAt(i));
			}else if(input.charAt(i)==')')
			{
				st.pop();
				//System.out.println(i+"스택 사이즈 "+st.size());
			
				if(input.charAt(i-1)=='(')
				{
					result+=st.size();
					//System.out.println("누적 스택 사이즈 "+st.size());
				}else
				{
					result++;
				}
			}
		}
		
		System.out.println(result);
		
	}
}