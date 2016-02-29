package xr_collection_set;

/*
 * HashSet 不含重复元素的实例
 * 
 * */
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add(new Person("name1", 10));
		hs.add(new Person("name2", 20));
		hs.add(new Person("name3", 30));
		hs.add(new Person("name1", 10)); // 相同元素

		Iterator it = hs.iterator();

		while (it.hasNext()) {
			// 强制转换类型
			Person p = (Person) it.next();
			sop(p.getName() + "----" + p.getAge());
		}
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}
}

class Person {
	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// 复写hashCode方法 给定相同的hashCode
	public int hashCode() {
		return 60;
	}

	// 复写equals方法 相同元素返回false
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			return false;
		}
		// 强制类型转换
		Person p = (Person) obj;
		return this.name.equals(p.name) && this.age == p.age;
	}
}
