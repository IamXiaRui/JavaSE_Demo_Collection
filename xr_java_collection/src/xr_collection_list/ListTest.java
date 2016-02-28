package xr_collection_list;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List的所有特有方法 参数均带有角标
 * 
 * 
 * */
public class ListTest {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		// 增加元素
		al.add("demo1");
		al.add("demo2");
		al.add("demo3");
		al.add("demo4");
		al.add("demo5");
		System.out.println("原来集合：" + al);

		// 删除元素
		al.remove(1);
		System.out.println("删减后的集合：" + al);

		// 修改元素
		al.set(2, "demo6");
		System.out.println("改正后的集合：" + al);

		// 返回集合中一小段的元素
		System.out.println("集合区域的元素：" + al.subList(1, 3));

		// 返回元素位置
		System.out.println("集合元素位置：" + al.indexOf("demo3"));

		// 返回元素内容
		System.out.print("得到集合元素：");
		for (int x = 0; x < al.size(); x++) {
			System.out.println("size(" + x + ") = " + al.get(x) + " ");
		}

		// 迭代器得到集合元素
		System.out.print("迭代器得到集合元素：");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.print(" " + it.next());
		}
	}
}
