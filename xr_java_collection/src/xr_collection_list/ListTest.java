package xr_collection_list;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List�Ĺ��Է���
 * 
 * 
 * */
public class ListTest {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("demo1");
		al.add("demo2");
		al.add("demo3");
		al.add("demo4");
		al.add("demo5");
		System.out.println("ԭ�����ϣ�" + al);

		al.remove(1);
		System.out.println("ɾ����ļ��ϣ�" + al);

		al.set(2, "demo6");
		System.out.println("������ļ��ϣ�" + al);

		System.out.print("�õ�����Ԫ�أ�");
		for (int x = 0; x < al.size(); x++) {
			System.out.println("size(" + x + ") = " + al.get(x) + " ");
		}

		System.out.print("�������õ�����Ԫ�أ�");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.print(" " + it.next());
		}

	}

}
