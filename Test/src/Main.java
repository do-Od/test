import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Character> st=new Stack();
		Scanner sc= new Scanner(System.in);
		int result=0;	//�߸� �踷��Ⱑ �����
		String input=sc.next();	//"((()))()(()()"�踷��� �Է¹��� ��
		
		for (int i = 0; i < input.length();i++)
		{
			if(input.charAt(i)=='(')
			{
				st.push(input.charAt(i));
			}else if(input.charAt(i)==')')
			{
				st.pop();
				//System.out.println(i+"���� ������ "+st.size());
			
				if(input.charAt(i-1)=='(')
				{
					result+=st.size();
					//System.out.println("���� ���� ������ "+st.size());
				}else
				{
					result++;
				}
			}
		}
		
		System.out.println(result);
		
	}
}