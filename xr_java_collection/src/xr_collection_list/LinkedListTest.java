package xr_collection_list;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * ��LinkedList ģ�¶�ջ �� ���е����ݽṹ
 * 
 * ��ջ ����ȳ�
 * 
 * ���� �Ƚ��ȳ�
 * 
 * */
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();

		addList(li);
		System.out.println("ԭ���ϣ� " + li);

		System.out.print("��ջ�� ");
		Iterator it = li.iterator();
		while (it.hasNext()) {
			stackList(li);
		}

		addList(li);
		System.out.print("\nԭ���ϣ� " + li);

		System.out.print("\n���У� ");
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

	// ģ�¶�ջ ��ȡ���Ƴ����б�ĵ�һ��Ԫ��
	public static void stackList(LinkedList li) {
		System.out.print("  " + li.pollFirst());
	}

	// ģ�¶��� ��ȡ���Ƴ����б�����һ��Ԫ��
	public static void queueList(LinkedList li) {
		System.out.print("  " + li.pollLast());
	}

}
