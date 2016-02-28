package xr_collection_list;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * 用LinkedList 模仿堆栈 和 队列的数据结构
 * 
 * 堆栈 后进先出
 * 
 * 队列 先进先出
 * 
 * */
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();

		addList(li);
		System.out.println("原集合： " + li);

		System.out.print("堆栈： ");
		Iterator it = li.iterator();
		while (it.hasNext()) {
			stackList(li);
		}

		addList(li);
		System.out.print("\n原集合： " + li);

		System.out.print("\n队列： ");
		while (it.hasNext()) {
			queueList(li);
		}
	}

	public static void addList(LinkedList li) {
		li.addFirst("demo1");
		li.addFirst("demo2");
		li.addFirst("demo3");
		li.addFirst("demo4");
	}

	// 模仿堆栈 获取并移除此列表的第一个元素
	public static void stackList(LinkedList li) {
		System.out.print("  " + li.pollFirst());
	}

	// 模仿队列 获取并移除此列表的最后一个元素
	public static void queueList(LinkedList li) {
		System.out.print("  " + li.pollLast());
	}

}
