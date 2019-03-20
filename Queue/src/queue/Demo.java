package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Demo {
	public static void main(String[] args) {
		Queue<User> q=new LinkedList<User>();
		//���Ԫ�� offer add
		q.offer(new User(1,"xi","ming"));
		q.offer(new User(2,"xi","ming"));
		q.offer(new User(3,"xi","ming"));
		q.add(new User(4,"xx","ss"));
		
		//��ȡͷԪ�� element peek
		System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println("=============");
		
		//ɾ��Ԫ�� poll remove
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		if(!q.isEmpty()){
			System.out.println(q.remove());
		}
		
		
	}
}
