package xr_collection_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 * HashMap的排序功能
 * 
 * @author iamxiarui
 *
 */
public class SortByHashMap {

	/**
	 * 主函数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer, Person> personMap = new HashMap<Integer, Person>();
		personMap.put(1, new Person("张三", 21));
		personMap.put(4, new Person("钱六", 24));
		personMap.put(3, new Person("李四", 23));
		personMap.put(2, new Person("王五", 22));

		System.out.println(personMap);
		HashMap<Integer, Person> sortHashMap = sortHashMap(personMap);
		System.out.println(sortHashMap);
	}

	/**
	 * 给HashMap排序
	 * 
	 * @param personMap
	 * @return
	 */
	private static HashMap<Integer, Person> sortHashMap(HashMap<Integer, Person> personMap) {

		// 首先拿到map 的键值对集合
		Set<Entry<Integer, Person>> entrySet = personMap.entrySet();
		// 将set 集合转为List集合，为什么，为了使用工具类的排序方法
		List<Entry<Integer, Person>> list = new ArrayList<Entry<Integer, Person>>(entrySet);
		
		Collections.sort(list, new Comparator<Entry<Integer, Person>>() {
			@Override
			public int compare(Entry<Integer, Person> o1, Entry<Integer, Person> o2) {
				// 按照要求根据User的age 的倒序进行排
				return o2.getValue().getAge() - o1.getValue().getAge();
			}
		});
		
		// 创建一个新的有序的HashMap子类的集合
		LinkedHashMap<Integer, Person> linkedHashMap = new LinkedHashMap<Integer, Person>();
		// 将List中的数据存储在LinkedHashMap中
		for (Entry<Integer, Person> entry : list) {
			linkedHashMap.put(entry.getKey(), entry.getValue());
		}
		// 返回结果
		return linkedHashMap;
	}
}

/**
 * 自定义Person类
 * 
 * @author iamxiarui
 *
 */
class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
