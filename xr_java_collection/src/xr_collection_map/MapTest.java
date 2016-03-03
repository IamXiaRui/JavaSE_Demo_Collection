package xr_collection_map;

/*
 * �Զ�����  ��HashMap�洢 
 * Ҫ��  û���ظ�Ԫ��
 * 
 * */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		System.out.println("******��һ�ַ�ʽ******");
		HashMap<Student, String> hm1 = new HashMap<Student, String>();

		hm1.put(new Student("xia", 1), "anhui");
		hm1.put(new Student("rui", 22), "hefei");
		// �����ͬԪ�� ֮ǰ��Ԫ�ػᱻ����
		hm1.put(new Student("rui", 22), "����");
		hm1.put(new Student("xiarui", 333), "anqing");
		hm1.put(new Student("iamxiarui", 4444), "luan");

		Set<Student> keySet = hm1.keySet();

		Iterator<Student> it1 = keySet.iterator();
		// �ǵ�Ҫǿת����
		while (it1.hasNext()) {
			Student stu = it1.next();
			String add = hm1.get(stu);
			System.out.println(stu.toSring() + "- add - " + add);
		}

		System.out.println("\n******�ڶ��ַ�ʽ******");
		HashMap<Student, String> hm2 = new HashMap<Student, String>();

		hm2.put(new Student("xia", 1), "anhui");
		hm2.put(new Student("rui", 22), "hefei");
		// �����ͬԪ�� ֮ǰ��Ԫ�ػᱻ����
		hm2.put(new Student("rui", 22), "����");
		hm2.put(new Student("xiarui", 333), "anqing");
		hm2.put(new Student("iamxiarui", 4444), "luan");

		Set<Map.Entry<Student, String>> entrySet = hm2.entrySet();

		Iterator<Map.Entry<Student, String>> it2 = entrySet.iterator();

		while (it2.hasNext()) {
			// getKey �� getValue ���õ���ֵ
			Map.Entry<Student, String> map = it2.next();
			Student stu = map.getKey();
			String add = map.getValue();
			System.out.println(stu.toSring() + "~ add ~ " + add);
		}
	}

}

// ʵ���Զ���ȽϽӿ�
class Student implements Comparable<Student> {

	private String name;
	private int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// ʵ�ֽӿ��еıȽϷ���
	public int compareTo(Student stu) {

		// �ȱȽ�����Ĳ��
		int num = new Integer(this.age).compareTo(new Integer(stu.age));

		// ���������� �Ƚ�����
		if (num == 0) {
			return this.name.compareTo(stu.name);
		}
		return num;
	}

	// ������ͬ��hashCode
	public int hashCode() {
		return name.hashCode() + age;
	}

	// �ж���ȷ���
	public boolean equals(Object obj) {
		// ��������Ǵ�Studentǿת���� ���׳��쳣
		if (!(obj instanceof Student)) {
			throw new RuntimeException(" ���Ͳ�ƥ��");
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
