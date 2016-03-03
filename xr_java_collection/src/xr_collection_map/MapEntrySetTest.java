package xr_collection_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map中获取键值的另一种方式
 * 
 * 
 * */
public class MapEntrySetTest {

	public static void main(String[] args) {
		// new出子类对象
		Map<String, String> map = new HashMap<String, String>();

		// 添加元素 注意 不是add方法
		map.put("1", "xia");
		map.put("22", "rui");
		map.put("333", "xiarui");
		map.put("4444", "iamxiarui");

		// 先获取所有键值映射的关系的Set集合
		Set<Map.Entry<String, String>> entrySet = map.entrySet();

		// 得到Set集合的迭代器
		Iterator<Map.Entry<String, String>> it = entrySet.iterator();

		// 通过迭代器 获取到所有的键值关系
		while (it.hasNext()) {
			Map.Entry<String, String> mapStr = it.next();
			// 通过键值关系集合的方法 获取到所有的键 和 值
			String numStr = mapStr.getKey();
			String nameStr = mapStr.getValue();
			System.out.println("key --- " + numStr + " name --- " + nameStr);
		}
	}
}

/*// Map.Entry的结构
interface Map {
	public static interface Entry {
		public abstract Object getKey();

		public abstract Object getValue();
	}
}*/
