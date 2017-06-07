package com.fanniemae.day3;

import java.util.LinkedList;
import java.util.Queue;

public class ListEx4 {

	public static void main(String[] args) {
		
		Queue<String> q;
		q = new LinkedList<String>();
		
		q.offer("first");
		q.offer("Second");
		q.offer("Third");
		q.offer("Fourth");
		
		System.out.println(q);
		q.poll();
		q.poll();
		System.out.println(q);
		
		System.out.println(q.peek());
		System.out.println(q.peek());
		System.out.println(q.peek());
		System.out.println(q.peek());
		
		System.out.println(q);
		q.offer("FIFTH");
		q.poll();
		//q.clear();
		System.out.println(q);
		
		
		
	}
}
