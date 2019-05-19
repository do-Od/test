import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();	//integer타입으로 stack생성
		Scanner sc = new Scanner(System.in);	//스캐너
		
		int num=sc.nextInt();	//입력받을 명령어 갯수
		
		if(num >= 10000 || num < 1)
		{
			System.out.println("주어진 조건에 맞는 명령어 갯수를 입력하세요(1<num<10000)");
			num=sc.nextInt();
		}else
		{
			for (int i = 0; i < num; i++) {
				String com=sc.next();	//입력받을 명령어
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