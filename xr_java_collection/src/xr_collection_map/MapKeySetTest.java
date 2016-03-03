package xr_collection_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map 中特有的keySet方法的使用
 * 
 * */
public class MapKeySetTest {

	public static void main(String[] args) {
		// new出子类对象
		Map<String, String> map = new HashMap<String, String>();

		// 添加元素 注意 不是add方法
		map.put("1", "xia");
		map.put("22", "rui");
		map.put("333", "xiarui");
		map.put("4444", "iamxiarui");

		// 先获取所有键的Set集合
		Set<String> keySet = map.keySet();

		// 得到Set集合的迭代器
		Iterator<String> it = keySet.iterator();

		// 通过迭代器 获取到所有的键的值
		while (it.hasNext()) {
			String keyStr = it.next();
			// 通过键的值获取到所有的键值
			String nameStr = map.get(keyStr);
			System.out.println("key --- " + keyStr + " name --- " + nameStr);

		}
	}

}
