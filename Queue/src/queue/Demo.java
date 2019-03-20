package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Demo {
	public static void main(String[] args) {
		Queue<User> q=new LinkedList<User>();
		//添加元素 offer add
		q.offer(new User(1,"xi","ming"));
		q.offer(new User(2,"xi","ming"));
		q.offer(new User(3,"xi","ming"));
		q.add(new User(4,"xx","ss"));
		
		//获取头元素 element peek
		System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println("=============");
		
		//删除元素 poll remove
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		if(!q.isEmpty()){
			System.out.println(q.remove());
		}
		
		
	}
}
