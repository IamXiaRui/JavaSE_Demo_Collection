package xr_collection_map;
/*
 * Map集合中的扩展使用
 * 
 * 多重集合的使用方法
 * 
 * 注意：一般加入对象 使用List集合  此例中的顺序是无序的。
 * */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DoubleTreeMapTest {

	public static void main(String[] args) {
		// 第一个小集合
		HashMap<Integer, String> hm_one = new HashMap<Integer, String>();
		hm_one.put(01, "xia");
		hm_one.put(02, "rui");

		// 第二个小集合
		HashMap<Integer, String> hm_two = new HashMap<Integer, String>();
		hm_two.put(01, "xiarui");
		hm_two.put(02, "iamxiarui");

		// 两个集合的大集合
		HashMap<String, HashMap<Integer, String>> hm = new HashMap<String, HashMap<Integer, String>>();
		hm.put("物联网一班", hm_one);
		hm.put("物联网二班", hm_two);

		// 遍历大集合
		Set<Map.Entry<String, HashMap<Integer, String>>> entrySet = hm.entrySet();
		Iterator<Map.Entry<String, HashMap<Integer, String>>> it = entrySet.iterator();

		while (it.hasNext()) {
			Map.Entry<String, HashMap<Integer, String>> me = it.next();
			String str = me.getKey();
			HashMap<Integer, String> hmap = me.getValue();
			System.out.println("班级： " + str);
			// 循环得到每一个小集合中的元素
			getHashMap(hmap);
		}

	}

	// 遍历小集合的方法
	public static void getHashMap(HashMap<Integer, String> hashMap) {
		Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, String> me = it.next();
			Integer in = me.getKey();
			String str = me.getValue();
			System.out.println("学号 ： " + in + " 姓名： " + str);
		}
	}

}
