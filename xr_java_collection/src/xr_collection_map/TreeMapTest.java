package xr_collection_map;

/*
 * 
 * 用TreeMap进行元素的排序
 * 
 * 并按照姓名排序
 * */
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<Student, String>(new StudentCom());

		tm.put(new Student("xia", 1), "anhui");
		tm.put(new Student("rui", 22), "hefei");
		// 添加相同元素 之前的元素会被覆盖
		tm.put(new Student("rui", 22), "安庆");
		tm.put(new Student("xiarui", 333), "anqing");
		tm.put(new Student("iamxiarui", 4444), "luan");

		Set<Map.Entry<Student, String>> entrySet = tm.entrySet();

		Iterator<Map.Entry<Student, String>> it = entrySet.iterator();
		// 记得要强转类型
		while (it.hasNext()) {
			Map.Entry<Student, String> me = it.next();
			Student stu = me.getKey();
			String add = me.getValue();
			System.out.println(stu.toSring() + "- add - " + add);
		}

	}
}

// 添加自定义比较器

class StudentCom implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// 按照姓名排序
		int num = s1.getName().compareTo(s2.getName());

		if (num == 0) {
			return new Integer(s1.getAge()).compareTo(s2.getAge());
		}
		return num;
	}

}