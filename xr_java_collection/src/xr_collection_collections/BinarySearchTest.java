package xr_collection_collections;

/*
 * 利用二分法查找元素的位置角标
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("a");
		list.add("bb");
		list.add("abcd");
		list.add("xxx");
		list.add("kkkk");

		// 加入比较器的静态方法
		Collections.sort(list, new CollectionsCom_two());
		sop("按照字符串长度排序后 ：");
		sop(list);

		// 二分法查找元素
		int index = getBinarySearch(list, "xxx", new CollectionsCom_two());
		sop("查找元素的角标为 ： ");
		sop(index);

	}

	// 加入比较器的二分查找
	public static int getBinarySearch(List<String> list, String key, Comparator<String> com) {
		int max, mid, min;
		max = list.size() - 1; // 元素的最大长度
		min = 0;

		while (min <= max) {
			mid = (max + min) >> 1; // >>1 相当于 /2

			String str = list.get(mid);

			int num = com.compare(str, key);
			if (num > 0) {
				max = mid - 1; // 中间值大于需要找的值 左移最大值
			} else if (num < 0) {
				min = mid + 1; // 中间值小于需要找的值 右移最小值
			} else
				return mid; // 中间位置直接找到

		}
		return -min - 1; // 返回 (-(插入点) - 1)。插入点 ：即第一个大于此键的元素索引；
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}

}

// 按照字符串长度的比较器
class CollectionsCom_two implements Comparator<String> {

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