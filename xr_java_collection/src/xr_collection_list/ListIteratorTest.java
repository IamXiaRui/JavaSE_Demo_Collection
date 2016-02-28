package xr_collection_list;

/*
 * 列表迭代的使用方法
 * ListIterator
 * 
 * */
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		// 增加元素
		al.add("demo1");
		al.add("demo2");
		al.add("demo3");
		al.add("demo4");
		System.out.println("原来集合：" + al);

		System.out.print("遍历过程中修改元素：");

		// 必须使用这个列表迭代器
		ListIterator li = al.listIterator();
		while (li.hasNext()) {
			Object obj = li.next();
			if (obj.equals("demo3")) {
				li.set("demo5");
			}
		}
		System.out.print("  " + al);
	}

}
