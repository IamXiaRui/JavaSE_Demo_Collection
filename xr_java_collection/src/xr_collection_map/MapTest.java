package xr_collection_map;

/*
 * 自定义类  用HashMap存储 
 * 要求  没有重复元素
 * 
 * */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		System.out.println("******第一种方式******");
		HashMap<Student, String> hm1 = new HashMap<Student, String>();

		hm1.put(new Student("xia", 1), "anhui");
		hm1.put(new Student("rui", 22), "hefei");
		// 添加相同元素 之前的元素会被覆盖
		hm1.put(new Student("rui", 22), "安庆");
		hm1.put(new Student("xiarui", 333), "anqing");
		hm1.put(new Student("iamxiarui", 4444), "luan");

		Set<Student> keySet = hm1.keySet();

		Iterator<Student> it1 = keySet.iterator();
		// 记得要强转类型
		while (it1.hasNext()) {
			Student stu = it1.next();
			String add = hm1.get(stu);
			System.out.println(stu.toSring() + "- add - " + add);
		}

		System.out.println("\n******第二种方式******");
		HashMap<Student, String> hm2 = new HashMap<Student, String>();

		hm2.put(new Student("xia", 1), "anhui");
		hm2.put(new Student("rui", 22), "hefei");
		// 添加相同元素 之前的元素会被覆盖
		hm2.put(new Student("rui", 22), "安庆");
		hm2.put(new Student("xiarui", 333), "anqing");
		hm2.put(new Student("iamxiarui", 4444), "luan");

		Set<Map.Entry<Student, String>> entrySet = hm2.entrySet();

		Iterator<Map.Entry<Student, String>> it2 = entrySet.iterator();

		while (it2.hasNext()) {
			// getKey 和 getValue 来得到键值
			Map.Entry<Student, String> map = it2.next();
			Student stu = map.getKey();
			String add = map.getValue();
			System.out.println(stu.toSring() + "~ add ~ " + add);
		}
	}

}

// 实现自定义比较接口
class Student implements Comparable<Student> {

	private String name;
	private int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 实现接口中的比较方法
	public int compareTo(Student stu) {

		// 先比较年龄的差距
		int num = new Integer(this.age).compareTo(new Integer(stu.age));

		// 如果年龄相等 比较姓名
		if (num == 0) {
			return this.name.compareTo(stu.name);
		}
		return num;
	}

	// 给定不同的hashCode
	public int hashCode() {
		return name.hashCode() + age;
	}

	// 判断相等方法
	public boolean equals(Object obj) {
		// 如果对象不是从Student强转而来 则抛出异常
		if (!(obj instanceof Student)) {
			throw new RuntimeException(" 类型不匹配");
		}

		Student stu = (Student) obj;
		return this.name.equals(stu.name) && this.age == stu.age;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toSring() {
		return name + " - " + age;
	}
}
