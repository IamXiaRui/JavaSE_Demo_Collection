package xr_collection_collections;

/*
 * 集合中的工具类  Collections的使用方式
 * 
 * 两种排序方式 ，一种加入比较器 一种没有加入比较器
 * 
 *返回集合中的指定最大或者最小元素
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSortTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("asd");
		list.add("fgafg");
		list.add("afvcxzv");
		list.add("sthhgn");
		list.add("ghahfn");

		sop("排序前 ：");
		sop(list);

		// 直接调用其静态方法
		Collections.sort(list);
		sop("排序后 ：");
		sop(list);

		// 返回最大元素
		String max_one = Collections.max(list);
		sop("最大元素为 ： " + max_one);

		// 加入比较器的静态方法
		Collections.sort(list, new CollectionsCom());
		sop("按照字符串长度排序后 ：");
		sop(list);

		// 返回带比较器的最大元素
		String max_two = Collections.max(list, new CollectionsCom());
		sop("最大长度元素为 ： " + max_two);

	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}

}

// 按照字符串长度的比较器
class CollectionsCom implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return 1;
		} else if (s1.length() < s2.length()) {
			return -1;
		}
		return s1.compareTo(s2);
	}
}