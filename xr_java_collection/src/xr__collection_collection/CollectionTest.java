package xr__collection_collection;

/*
 * 集合Collection的共性方法
 * */
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		// 添加元素
		ArrayList al_one = new ArrayList();
		al_one.add("demo1");
		al_one.add("demo2");
		al_one.add("demo3");
		al_one.add("demo4");
		System.out.println("第一个集合：" + al_one);

		ArrayList al_two = new ArrayList();
		al_two.add("demo1");
		al_two.add("demo2");
		al_two.add("demo5");
		al_two.add("demo6");
		System.out.println("第二个集合：" + al_two);

		// 取交集
		al_one.retainAll(al_two);
		System.out.println("合并后的集合" + al_one);

		System.out.print("迭代器遍历集合：");
		// 迭代器 使用for循环 循环结束 迭代器对象销毁 节省内存
		for (Iterator it = al_two.iterator(); it.hasNext();) {
			System.out.print(" " + it.next());
		}

	}

}
