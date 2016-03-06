package xr_collection_map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * 利用集合判断字符串中字母出现的次数
 * 
 * */
public class TreeMapCountTest {

	public static void main(String[] args) {
		String s = StringCount("absdbfjbasbf");
		System.out.println(s);
	}

	public static String StringCount(String str) {
		// 将字符串存入字符数组
		char[] ch = str.toCharArray();

		// 注意集合中存入的数据类型必须为引用类型，不能为基本数据类型
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		// 第一种方法
		// for (int i = 0; i < ch.length; i++) {
		// Integer value = tm.get(ch[i]);
		// if (value == null) {
		// tm.put(ch[i], 1);
		// } else {
		// value = value + 1;
		// tm.put(ch[i], value);
		// }
		// }

		// 第二种方法
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			Integer value = tm.get(ch[i]);
			if (value != null) {
				count = value;
			}
			count++;
			tm.put(ch[i], count);
			count = 0;
		}

		StringBuilder sb = new StringBuilder();

		Set<Map.Entry<Character, Integer>> entrySet = tm.entrySet();

		Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator();

		// 遍历集合
		while (it.hasNext()) {
			Map.Entry<Character, Integer> me = it.next();

			Character cha = me.getKey();

			Integer in = me.getValue();

			sb.append(cha + " - " + in + " , ");
		}
		return sb.toString();
	}
}
