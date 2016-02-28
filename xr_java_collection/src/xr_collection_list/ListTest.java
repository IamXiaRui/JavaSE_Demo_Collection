package xr_collection_list;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List的共性方法
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
		System.out.println("原来集合：" + al);

		al.remove(1);
		System.out.println("删减后的集合：" + al);

		al.set(2, "demo6");
		System.out.println("改正后的集合：" + al);

		System.out.print("得到集合元素：");
		for (int x = 0; x < al.size(); x++) {
			System.out.println("size(" + x + ") = " + al.get(x) + " ");
		}

		System.out.print("迭代器得到集合元素：");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.print(" " + it.next());
		}

	}

}
