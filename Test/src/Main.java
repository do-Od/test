import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();	//integerŸ������ stack����
		Scanner sc = new Scanner(System.in);	//��ĳ��
		
		int num=sc.nextInt();	//�Է¹��� ��ɾ� ����
		
		if(num >= 10000 || num < 1)
		{
			System.out.println("�־��� ���ǿ� �´� ��ɾ� ������ �Է��ϼ���(1<num<10000)");
			num=sc.nextInt();
		}else
		{
			for (int i = 0; i < num; i++) {
				String com=sc.next();	//�Է¹��� ��ɾ�
				if(com.equals("push"))
				{
					st.push(sc.nextInt());
				}else if(com.equals("pop"))
				{
					System.out.println(st.isEmpty()?-1:st.pop());
				}else if(com.equals("size"))
				{
					System.out.println(st.size());
				}else if(com.equals("empty"))
				{
					System.out.println(st.isEmpty()?1:0);
				}else if(com.equals("top"))
				{
					System.out.println(st.isEmpty()?-1:st.peek());
				}
			}
		}
	}
}